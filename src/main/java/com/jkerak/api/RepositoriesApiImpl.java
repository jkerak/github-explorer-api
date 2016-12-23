package com.jkerak.api;

import com.jkerak.dto.RepositoryDto;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

@Component
public class RepositoriesApiImpl implements RepositoriesApi {


    private static final Logger logger = Logger.getLogger(RepositoriesApiImpl.class);

    public Response repositoriesIdGet(Long id) throws NotFoundException {
        RepositoryDto repositoryDto = new RepositoryDto();

        repositoryDto.setId(1L);
        repositoryDto.setUrl("www.google.com");
        repositoryDto.setStars(2);
        repositoryDto.setFullName("some/thing");
        repositoryDto.setDescription("description");
        repositoryDto.setNotes("Notes");
        logger.debug("something happened");

        return Response.ok().entity(repositoryDto).build();

    }
}
