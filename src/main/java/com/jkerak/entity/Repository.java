package com.jkerak.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "UserCollectionRepository")
@ToString
public class Repository {

    @Id
    @Column(name = "UserCollectionRepositoryId")
    @GeneratedValue
    private Long id;

    private Long repositoryId;
    private String repositoryName;
    private String notes;
    private java.sql.Timestamp timestamp;
    private String status;

}
