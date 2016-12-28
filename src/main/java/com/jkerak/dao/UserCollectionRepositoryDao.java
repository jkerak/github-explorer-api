package com.jkerak.dao;

import com.jkerak.dbrecord.UserCollectionRepositoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Component
public class UserCollectionRepositoryDao {

    @Autowired
    private Sql2o sql2o;

    public List<UserCollectionRepositoryRecord> getSavedOrIgnoredRepositories(Long collectionId) {
        try (Connection con = sql2o.open()){
            return con.createQuery(getSavedOrIgnoredRepositoriesSql)
                    .addParameter("collectionId", collectionId)
                    .executeAndFetch(UserCollectionRepositoryRecord.class);
        }
    }

    static final String getSavedOrIgnoredRepositoriesSql =
            "SELECT  RepositoryID,\n" +
                    "        RepositoryName,\n" +
                    "        Notes,\n" +
                    "        `timestamp`,\n" +
                    "        Status\n" +
                    "FROM    UserCollectionRepository \n" +
                    "WHERE   UserCollectionID = :collectionId\n" +
                    "    AND Status IN ('S','I')";

    public void insert(UserCollectionRepositoryRecord repositoryRecord) {
        try (Connection con = sql2o.open()) {
            con.createQuery(insertSql)
                    .bind(repositoryRecord)
                    .executeUpdate();
        }

    }

    static final String insertSql =
            "";
}
