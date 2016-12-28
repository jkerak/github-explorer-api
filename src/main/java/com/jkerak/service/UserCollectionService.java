package com.jkerak.service;

import com.jkerak.dao.UserCollectionDao;
import com.jkerak.dao.UserCollectionRepositoryDao;
import com.jkerak.dbrecord.UserCollectionRecord;
import com.jkerak.dbrecord.UserCollectionRepositoryRecord;
import com.jkerak.dto.UserCollectionDto;
import com.jkerak.model.UserCollection;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserCollectionService {

    @Autowired
    private UserCollectionRepositoryDao userCollectionRepositoryDao;

    @Autowired
    private UserCollectionDao userCollectionDao;

    @Autowired
    private ModelMapper modelMapper;

    public void ignoreRepository(Long repositoryId, Long collectionId) {
        UserCollectionRepositoryRecord repositoryRecord = new UserCollectionRepositoryRecord();
        repositoryRecord.setUserCollectionId(collectionId);
        repositoryRecord.setRepositoryId(repositoryId);
        repositoryRecord.setStatus("I");
        userCollectionRepositoryDao.insert(repositoryRecord);
    }

    public void saveRepository(Long repositoryId, Long collectionId){
        UserCollectionRepositoryRecord repositoryRecord = new UserCollectionRepositoryRecord();
        repositoryRecord.setUserCollectionId(collectionId);
        repositoryRecord.setRepositoryId(repositoryId);
        repositoryRecord.setStatus("S");
        userCollectionRepositoryDao.insert(repositoryRecord);
    }


    public UserCollection getUserCollection(Long id) {
        List<UserCollectionRepositoryRecord> savedOrIgnoredRepos
                = userCollectionRepositoryDao.getSavedOrIgnoredRepositories(id);

        UserCollectionRecord collectionRecord = userCollectionDao.findById(id);

        UserCollection collection = modelMapper.map(collectionRecord,UserCollection.class);

        List<String> savedRepos = savedOrIgnoredRepos.stream()
                .filter(r -> r.getStatus().equalsIgnoreCase("S"))
                .map(UserCollectionRepositoryRecord::getRepositoryName)
                .collect(Collectors.toList());

        List<String> ignoredRepos = savedOrIgnoredRepos.stream()
                .filter(r -> r.getStatus().equalsIgnoreCase("I"))
                .map(UserCollectionRepositoryRecord::getRepositoryName)
                .collect(Collectors.toList());

        collection.setSavedRepos(savedRepos);
        collection.setIgnoredRepos(ignoredRepos);
        collection.setModified(collectionRecord.getTimestamp().toLocalDateTime().toString());

        return collection;
    }

    public void updateUserCollection(Long id, UserCollectionDto userCollectionDto) {

        UserCollectionRecord userCollection = userCollectionDao.findById(id);

        if(userCollectionDto.getLanguage() != null) {
            userCollection.setLanguage(userCollectionDto.getLanguage());
        }
        if(userCollectionDto.getMinimumSize() != null) {
            userCollection.setMinimumSize(String.valueOf(userCollectionDto.getMinimumSize()));
        }
        if(userCollectionDto.getMinimumStars() != null) {
            userCollection.setMinimumStars(String.valueOf(userCollectionDto.getMinimumSize()));
        }
        if(userCollectionDto.getTitle() != null) {
            userCollection.setTitle(String.valueOf(userCollectionDto.getTitle()));
        }

        userCollectionDao.update(userCollection);


    }
}
