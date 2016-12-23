package com.jkerak.model;

public class RepositorySearchQuery {

    private Long githubUserId = null;
    private Long collectionId = null;
    private String size = null;
    private String stars = null;
    private String language = null;

    public Long getGithubUserId() {
        return githubUserId;
    }

    public void setGithubUserId(Long githubUserId) {
        this.githubUserId = githubUserId;
    }

    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
