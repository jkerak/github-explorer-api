package com.jkerak.service;

import com.jkerak.dao.UserCollectionRepositoryDao;
import com.jkerak.model.RepositorySearchQuery;
import com.jkerak.model.RepositorySearchResult;
import org.eclipse.egit.github.core.SearchRepository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GithubRepositoryService {


    @Autowired
    private UserCollectionRepositoryDao userCollectionRepositoryDao;

    public List<RepositorySearchResult> searchRepositories(RepositorySearchQuery query) throws IOException {

        // get list of already-seen or ignored repositories to exclude from github API query
        List<String> repositoriesToIgnoreInQuery = userCollectionRepositoryDao.getSavedOrIgnoredRepositories(query.getGithubUserID());

        // search github api and git list of search results, excluding ignored and saved repositories in query
        GitHubClient client = new GitHubClient();
        client.setCredentials("jkerak","Paragon1!");

        RepositoryService githubRepositoryService = new org.eclipse.egit.github.core.service.RepositoryService(client);

        Map<String,String> searchQuery = new HashMap<>();
        List<SearchRepository> apiSearchResults = githubRepositoryService.searchRepositories(searchQuery);


        // map search results to internal repository search result

        // return results


        return new ArrayList<>();
    }

}
