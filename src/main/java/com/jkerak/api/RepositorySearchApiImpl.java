package com.jkerak.api;

import com.jkerak.dto.RepositorySearchQueryDto;
import com.jkerak.dto.RepositorySearchResultDto;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Component
public class RepositorySearchApiImpl implements RepositorySearchApi {

    public Response searchRepositories(RepositorySearchQueryDto query) throws NotFoundException {
        List<RepositorySearchResultDto> resultDtos = new ArrayList<>();

        RepositorySearchResultDto resultDto = new RepositorySearchResultDto();
        resultDto.setId(1L);
        resultDto.setDescription("Description");
        resultDto.setFullName("jkerak/something");
        resultDto.setStars(4);
        resultDto.setUrl("www.google.com");

        resultDtos.add(resultDto);
        resultDtos.add(resultDto);
        resultDtos.add(resultDto);
        resultDtos.add(resultDto);

        return Response.ok().entity(resultDtos).build();
    }
}
