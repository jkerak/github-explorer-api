package com.jkerak.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class UserCollectionRepositoryDao {

    @Autowired
    private Sql2o sql2o;

    public List<String> getSavedOrIgnoredRepositories(Long githubUserID) {
        try (Connection con = sql2o.open()){
            return con.createQuery(getSavedOrIgnoredRepositoriesSql)
                    .addParameter("githubUserID", githubUserID)
                    .executeAndFetch(String.class);
        }
    }

    static final String getSavedOrIgnoredRepositoriesSql
            = "";
}
