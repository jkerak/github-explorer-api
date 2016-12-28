package com.jkerak.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.sql2o.Sql2o;

import javax.sql.DataSource;

@Configuration
@Profile({"cloud"})
public class DataSourceCloudConfig extends AbstractCloudConfig {

    @Bean
    @Primary
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }

    @Bean
    @Primary
    public Sql2o getSql2oForPcf(@Autowired DataSource dataSource){
        return new Sql2o(dataSource);
    }
}
