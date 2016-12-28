package com.jkerak.model;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {
    private Long id = null;
    private String title = null;
    private String created = null;
    private String modified = null;
    private List<String> savedRepos = new ArrayList<>();
    private List<String> ignoredRepos = new ArrayList<>();
    private Integer minimumStars = null;
    private Integer minimumSize = null;
    private String language = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public List<String> getSavedRepos() {
        return savedRepos;
    }

    public void setSavedRepos(List<String> savedRepos) {
        this.savedRepos = savedRepos;
    }

    public List<String> getIgnoredRepos() {
        return ignoredRepos;
    }

    public void setIgnoredRepos(List<String> ignoredRepos) {
        this.ignoredRepos = ignoredRepos;
    }

    public Integer getMinimumStars() {
        return minimumStars;
    }

    public void setMinimumStars(Integer minimumStars) {
        this.minimumStars = minimumStars;
    }

    public Integer getMinimumSize() {
        return minimumSize;
    }

    public void setMinimumSize(Integer minimumSize) {
        this.minimumSize = minimumSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
