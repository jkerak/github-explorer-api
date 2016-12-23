package com.jkerak.service;

import com.jkerak.dao.UserCollectionRepositoryDao;
import com.jkerak.model.RepositorySearchQuery;
import com.jkerak.model.RepositorySearchResults;
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

@Component
public class RepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserCollectionRepositoryDao userCollectionRepositoryDao;

    public RepositorySearchResults searchRepositories(RepositorySearchQuery query) throws IOException {

        String url = "https://api.github.com/search/repositories";

         //get list of already-seen or ignored repositories to exclude from github API query
        List<String> repositoriesToIgnoreInQuery =
                userCollectionRepositoryDao.getSavedOrIgnoredRepositories(query.getCollectionId());

        String q = "";

        if(!repositoriesToIgnoreInQuery.isEmpty()){
            for(String r : repositoriesToIgnoreInQuery){
                q += "-repo:"+r+"+";
            }
        }
        if(query.getSize() != null) {
            q += "size:>"+query.getSize()+"+";
        }
        else {
            q += "size:>100+";
        }

        if(query.getStars() != null){
            q += "stars:>"+query.getStars();
        }
        else {
            q += "stars:>10";
        }

        if(query.getLanguage() != null){
            q += "+language:"+query.getLanguage();
        }

        URI uri = UriComponentsBuilder.fromUriString(url).queryParam("q",q).build().toUri();

        RepositorySearchResults searchResults
                = restTemplate.getForObject(uri, RepositorySearchResults.class);

        // return results
        return searchResults;
    }

}
