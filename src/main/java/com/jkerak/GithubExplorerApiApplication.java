package com.jkerak;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.client.RestTemplate;
import org.sql2o.Sql2o;

import javax.sql.DataSource;

@SpringBootApplication
public class GithubExplorerApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(GithubExplorerApiApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    @Primary
    public Sql2o getSql2o(@Autowired DataSource dataSource){
        return new Sql2o(dataSource);
    }

}


