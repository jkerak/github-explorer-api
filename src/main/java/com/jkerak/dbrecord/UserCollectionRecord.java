package com.jkerak.dbrecord;

import java.sql.Timestamp;

public class UserCollectionRecord {
    
    private Long userCollectionId;
    private Long githubUserId;
    private String title;
    private String minimumStars;
    private String minimumSize;
    private String language;
    private java.sql.Timestamp timestamp;
    private String status;

    public Long getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(Long userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    public Long getGithubUserId() {
        return githubUserId;
    }

    public void setGithubUserId(Long githubUserId) {
        this.githubUserId = githubUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMinimumStars() {
        return minimumStars;
    }

    public void setMinimumStars(String minimumStars) {
        this.minimumStars = minimumStars;
    }

    public String getMinimumSize() {
        return minimumSize;
    }

    public void setMinimumSize(String minimumSize) {
        this.minimumSize = minimumSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
