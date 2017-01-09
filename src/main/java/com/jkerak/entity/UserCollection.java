package com.jkerak.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
@Table(name = "usercollection")
public class UserCollection {

    @Id
    @Column(name = "usercollectionid")
    @GeneratedValue
    private Long id;

    private String title;

    @Column(name = "minimumstars")
    private String minimumStars;

    @Column(name = "minimumsize")
    private String minimumSize;

    private String language;
    private java.sql.Timestamp timestamp;
    private String status;

    @OneToMany
    @JoinColumn(name = "usercollectionid")
    //@JsonManagedReference
    private List<Repository> repositories;

}
