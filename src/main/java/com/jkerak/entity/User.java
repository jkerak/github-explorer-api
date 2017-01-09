package com.jkerak.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@ToString
public class User {

    @Id
    @Column(name = "GithubUserID")
    @GeneratedValue
    private Long id;

    private String userName = null;
    private java.sql.Timestamp timestamp;
    private String status;

    @OneToMany
    @JoinColumn(name = "GithubUserID")
    private List<UserCollection> collections;
}
