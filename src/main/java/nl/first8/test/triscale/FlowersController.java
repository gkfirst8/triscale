/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.first8.test.triscale;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author gkok
 */
@Path("/flowers")
public class FlowersController {
    @Context
    private UriInfo context;

    @Inject
    private FlowersService flowersService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flower> get() {
        return flowersService.getFlowers();
    }

    @GET
    /**
     * Sub-resource locator method for {id}
     */
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Flower get(@PathParam("id") String id) {
        return flowersService.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response post(Flower content) {
        flowersService.add(content);
        return Response.created(context.getAbsolutePath()).build();
    }
}
