package com.jkerak.config;

import com.jkerak.api.RepositoriesApiImpl;
import com.jkerak.api.RepositorySearchApiImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(RepositoriesApiImpl.class);
        register(RepositorySearchApiImpl.class);

    }
}
