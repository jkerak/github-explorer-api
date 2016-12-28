package com.jkerak.api;

import com.jkerak.model.UserCollection;
import com.jkerak.service.UserCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;

public class UserCollectionsApiImpl implements UserCollectionsApi {

    @Autowired
    private UserCollectionService userCollectionService;

    public Response createUserCollection(String title) throws NotFoundException {
        return null;
    }

    public Response ignoreRepository(Long id, Long repositoryId) throws NotFoundException {
        return null;
    }

    public Response saveRepository(Long id, Long repositoryId) throws NotFoundException {
        return null;
    }

    public Response userCollectionsIdGet(Long id) throws NotFoundException {
        UserCollection userCollection = userCollectionService.getUserCollection(id);
        return Response.ok().entity(userCollection).build();
    }
}