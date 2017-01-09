package com.jkerak.api;

import com.jkerak.dto.UserCollectionDto;
import com.jkerak.model.UserCollection;
import com.jkerak.service.UserCollectionService;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import java.net.URI;

public class UserCollectionsApiImpl implements UserCollectionsApi {

    @Autowired
    private UserCollectionService userCollectionService;

    @Autowired
    private ModelMapper modelMapper;

    public Response createUserCollection(String title) throws NotFoundException {
        return null;
    }

    public Response ignoreRepository(Long id, Long repositoryId) throws NotFoundException {
        userCollectionService.ignoreRepository(repositoryId, id);
        return Response.ok().build();

    }


    public Response userCollectionsIdGet(Long id) throws NotFoundException {
        UserCollection userCollection = userCollectionService.getUserCollection(id);
        UserCollectionDto collectionDto = modelMapper.map(userCollection, UserCollectionDto.class);

        return Response.ok().entity(collectionDto).build();
    }

    public Response userCollectionsIdPut(Long id, UserCollectionDto userCollectionDto) throws NotFoundException {
        userCollectionService.updateUserCollection(id,userCollectionDto);
        UserCollection userCollection = userCollectionService.getUserCollection(id);
        UserCollectionDto collectionDto = modelMapper.map(userCollection, UserCollectionDto.class);

        return Response.ok().entity(collectionDto).build();
    }



}