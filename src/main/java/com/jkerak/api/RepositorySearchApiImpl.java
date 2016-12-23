package com.jkerak.api;

import com.jkerak.dto.RepositorySearchQueryDto;
import com.jkerak.dto.RepositorySearchResultsDto;
import com.jkerak.model.RepositorySearchQuery;
import com.jkerak.model.RepositorySearchResults;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jkerak.service.RepositoryService;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class RepositorySearchApiImpl implements RepositorySearchApi {


    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private ModelMapper modelMapper;

    public Response searchRepositories(RepositorySearchQueryDto queryDto) throws NotFoundException {

        RepositorySearchQuery query = new RepositorySearchQuery();

        RepositorySearchResults searchResults = null;
        try {
            searchResults = repositoryService.searchRepositories(query);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (searchResults != null) {
            RepositorySearchResultsDto resultDto = modelMapper.map(searchResults, RepositorySearchResultsDto.class);
            return Response.ok().entity(resultDto).build();
        }

        return null;
    }
}
