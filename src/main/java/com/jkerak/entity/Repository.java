package com.jkerak.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usercollectionrepository")
@ToString
public class Repository {

    @Id
    @Column(name = "usercollectionrepositoryid")
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(name = "repositoryid")
    private Long repositoryId;

    @Column(name = "repositoryname")
    private String repositoryName;

    private String notes;
    private java.sql.Timestamp timestamp;
    private String status;

}
