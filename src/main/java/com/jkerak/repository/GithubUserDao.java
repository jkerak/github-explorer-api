package com.jkerak.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Sql2o;

@Component
public class GithubUserDao {

    @Autowired
    private Sql2o sql2o;

}
