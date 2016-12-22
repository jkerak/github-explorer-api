package com.jkerak.api;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.core.Response;

public class UserCollectionsApiImpl implements UserCollectionsApi {


    @Override
    public Response addRepositoryToUserCollection(@ApiParam(value = "userRepositoryCollectionId to add dao", required = true) Long id) throws NotFoundException {
        return null;
    }

    @Override
    public Response ignoreRepository(@ApiParam(value = "userRepositoryCollectionId to add dao", required = true) Long id) throws NotFoundException {
        return null;
    }

    @Override
    public Response userCollectionsIdGet(@ApiParam(value = "id of collection to return", required = true) Long id) throws NotFoundException {
        return null;
    }
}
