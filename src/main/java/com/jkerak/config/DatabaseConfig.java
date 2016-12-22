package com.jkerak.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.sql2o.Sql2o;

import javax.sql.DataSource;

@Configuration
@Profile({"mysql-cloud"})
public class DatabaseConfig extends AbstractCloudConfig {

    @Bean
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }

    @Bean
    @Primary
    public Sql2o getSql2o(){
        return new Sql2o(dataSource());
    }
}
