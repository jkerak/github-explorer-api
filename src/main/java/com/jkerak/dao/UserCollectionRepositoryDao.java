package com.jkerak.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Component
public class UserCollectionRepositoryDao {

    @Autowired
    private Sql2o sql2o;

    public List<String> getSavedOrIgnoredRepositories(Long collectionId) {
        try (Connection con = sql2o.open()){
            return con.createQuery(getSavedOrIgnoredRepositoriesSql)
                    .addParameter("collectionId", collectionId)
                    .executeAndFetch(String.class);
        }
    }

    static final String getSavedOrIgnoredRepositoriesSql =
            "SELECT  r.FullName\n" +
                    "FROM    UserCollectionRepository ucr\n" +
                    "        INNER JOIN Repository r\n" +
                    "          ON ucr.RepositoryID = r.RepositoryID\n" +
                    "WHERE   ucr.UserCollectionID = :collectionId\n" +
                    "    AND ucr.Status IN ('S','I')";
}
