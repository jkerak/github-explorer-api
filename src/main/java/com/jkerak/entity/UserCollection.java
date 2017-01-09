package com.jkerak.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
public class UserCollection {

    @Id
    @Column(name = "UserCollectionID")
    @GeneratedValue
    private Long id;

    private String title;
    private String minimumStars;
    private String minimumSize;
    private String language;

    private java.sql.Timestamp timestamp;
    private String status;

    @OneToMany
    @JoinColumn(name = "UserCollectionID")
    private List<Repository> repositories;

}
