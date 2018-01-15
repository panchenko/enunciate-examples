package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public interface GetApi {
    @GET
    @Path("/data/{id}")
    String getData(@PathParam("id") final String id);
}
