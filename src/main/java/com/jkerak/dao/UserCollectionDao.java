package com.jkerak.dao;

import com.jkerak.dbrecord.UserCollectionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

@Component
public class UserCollectionDao {

    @Autowired
    private Sql2o sql2o;


    public void insert(UserCollectionRecord record) {
        try (Connection con = sql2o.open()) {
            con.createQuery(insertSql)
                    .bind(record)
                    .executeUpdate();
        }
    }

    static final String insertSql =
            "INSERT INTO UserCollection (\n" +
                    "  GithubUserID, \n" +
                    "  Title, \n" +
                    "  Status) \n" +
                    "VALUES(\n" +
                    "  :githubUserId,\n" +
                    "  :title,\n" +
                    "  :status\n" +
                    ") ";

    public UserCollectionRecord findById(Long id){
        try (Connection con = sql2o.open()) {
            return  con.createQuery(findByIdSql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(UserCollectionRecord.class);
        }

    }
    static final String findByIdSql =
            "SELECT  UserCollectionID, \n" +
                    "GithubUserID, \n" +
                    "Title,\n" +
                    "minimumStars,\n" +
                    "minimumSize,\n" +
                    "language,\n" +
                    "timestamp,\n" +
                    "Status\n" +
                    "FROM usercollection\n" +
                    "WHERE UserCollectionID = :id";

    public void update(UserCollectionRecord userCollection) {
        try (Connection con = sql2o.open()) {
            con.createQuery(updateSql)
                    .bind(userCollection)
                    .executeUpdate();
        }
    }
    static final String updateSql =
            "UPDATE UserCollection \n" +
            "SET Title = :title,\n" +
            "   GithubUserID = :githubUserId,\n" +
            "  minimumSize = :minimumSize,\n" +
            "  minimumStars = :minimumStars,\n" +
            "  language = :language\n" +
            "WHERE UserCollectionID = :userCollectionId";
}
