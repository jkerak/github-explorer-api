package com.jkerak.dbrecord;

import java.sql.Timestamp;

public class UserCollectionRepositoryRecord {

    private Long userCollectionRepositoryId;
    private Long userCollectionId;
    private Long repositoryId;
    private String repositoryName;
    private String notes;
    private java.sql.Timestamp timestamp;
    private String status;

    public Long getUserCollectionRepositoryId() {
        return userCollectionRepositoryId;
    }

    public void setUserCollectionRepositoryId(Long userCollectionRepositoryId) {
        this.userCollectionRepositoryId = userCollectionRepositoryId;
    }

    public Long getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(Long userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
