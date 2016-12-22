package com.jkerak.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RepositorySearchResult {

    private Date createdAt;
    private Date pushedAt;
    private String description;
    private String homepage;
    private String language;
    private String name;
    private String owner;
    private String url;
    private int forks;
    private int openIssues;
    private int size;
    private int watchers;


    id:
    type: integer
    format: int64
    fullName:
    type: string
    description:
    type: string
    url:
    type: string
    stars:
    type: integer
    format: int32
}
