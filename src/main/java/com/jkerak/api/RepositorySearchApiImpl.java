package com.jkerak.api;

import com.jkerak.dto.RepositorySearchQueryDto;
import com.jkerak.dto.RepositorySearchResultDto;
import com.jkerak.model.RepositorySearchQuery;
import com.jkerak.model.RepositorySearchResult;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jkerak.service.GithubRepositoryService;
import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class RepositorySearchApiImpl implements RepositorySearchApi {


    @Autowired
    private GithubRepositoryService repositoryService;

    @Autowired
    private ModelMapper modelMapper;

    public Response searchRepositories(RepositorySearchQueryDto queryDto) throws NotFoundException {

        RepositorySearchQuery query = new RepositorySearchQuery();

        List<RepositorySearchResult> searchResults = repositoryService.searchRepositories(query);

        Type destinationListType = new TypeToken<List<RepositorySearchResultDto>>() {}.getType();
        List<RepositorySearchResultDto> resultDtos = modelMapper.map(searchResults, destinationListType);

        return Response.ok().entity(resultDtos).build();
    }
}
