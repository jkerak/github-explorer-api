package com.jkerak.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositorySearchResults {

    @JsonProperty("total_count")
    private Integer totalCount = null;

    @JsonProperty("incomplete_results")
    private Boolean incompleteResults = null;
    private List<RepositorySearchResultItem> items = new ArrayList<>();

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public List<RepositorySearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<RepositorySearchResultItem> items) {
        this.items = items;
    }
}
