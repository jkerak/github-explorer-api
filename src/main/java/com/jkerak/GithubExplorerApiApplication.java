package com.jkerak;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
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
    @Profile({"default"})
    public Sql2o getSql2o(){
        return new Sql2o("jdbc:mysql://127.0.0.1:3306/dbo","root", "password");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}


