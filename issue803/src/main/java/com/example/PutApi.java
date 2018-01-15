package com.example;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/")
public interface PutApi {
    @PUT
    @Path("/data/{id}")
    String putData(@PathParam("id") final String id, @QueryParam("value") final String value);
}
