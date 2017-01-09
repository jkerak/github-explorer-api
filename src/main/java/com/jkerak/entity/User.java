package com.jkerak.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
@Table(name = "githubuser")
public class User {

    @Id
    @Column(name = "githubuserid")
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String userName = null;
    private java.sql.Timestamp timestamp;
    private String status;

    @OneToMany
    @JoinColumn(name = "githubuserid")
    //@JsonManagedReference
    private List<UserCollection> collections;
}
