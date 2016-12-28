package com.jkerak.dbrecord;

import java.sql.Timestamp;

public class GithubUserRecord {

    private Long githubUserID;
    private String userName = null;
    private java.sql.Timestamp timestamp;
    private String status;

    public Long getGithubUserID() {
        return githubUserID;
    }

    public void setGithubUserID(Long githubUserID) {
        this.githubUserID = githubUserID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
