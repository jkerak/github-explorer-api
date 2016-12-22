package com.jkerak.config;

import com.jkerak.api.RepositoriesApiImpl;
import com.jkerak.api.RepositorySearchApiImpl;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RepositoriesApiImpl.class);
        register(RepositorySearchApiImpl.class);
    }

    @PostConstruct
    public void init() {
        BeanConfig config = new BeanConfig();
        config.setTitle("Github Explorer API");
        config.setResourcePackage("com.jkerak.api");
        config.setPrettyPrint(true);
        config.setScan(true);
        config.setBasePath("/api");
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }
}
