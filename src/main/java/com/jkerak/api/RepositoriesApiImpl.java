package com.jkerak.api;

import com.jkerak.dto.RepositoryDto;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

@Component
public class RepositoriesApiImpl implements RepositoriesApi {

    public Response repositoriesIdGet(@ApiParam(value = "repositoryId to return", required = true) Long id) throws NotFoundException {
        RepositoryDto repositoryDto = new RepositoryDto();

        repositoryDto.setId(1L);
        repositoryDto.setUrl("www.google.com");
        repositoryDto.setStars(2);
        repositoryDto.setFullName("some/thing");
        repositoryDto.setDescription("description");
        repositoryDto.setNotes("Notes");

        return Response.ok().entity(repositoryDto).build();

    }
}
