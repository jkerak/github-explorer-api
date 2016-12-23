package com.jkerak.service;

import com.jkerak.dao.UserCollectionRepositoryDao;
import com.jkerak.model.RepositorySearchQuery;
import com.jkerak.model.RepositorySearchResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.List;

@Component
public class RepositoryService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserCollectionRepositoryDao userCollectionRepositoryDao;

    public RepositorySearchResults searchRepositories(RepositorySearchQuery query) throws IOException {

        // get list of already-seen or ignored repositories to exclude from github API query
        List<String> repositoriesToIgnoreInQuery =
                userCollectionRepositoryDao.getSavedOrIgnoredRepositories(query.getCollectionId());

        // search github api and git list of search results, excluding ignored and saved repositories in query
        RepositorySearchResults searchResults
                = restTemplate.getForObject("https://api.github.com/search/repositories?q=kerak", RepositorySearchResults.class);

        // return results
        return searchResults;
    }

}
