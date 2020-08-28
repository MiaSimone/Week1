/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest2;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author miade
 */
@Path("buldings")
public class BuildingDemo {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BuildingDemo
     */
    public BuildingDemo() {
    }

    /**
     * Retrieves representation of an instance of rest2.BuildingDemo
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJson() {
        return "Triumf buen";
    }

    /**
     * PUT method for updating or creating an instance of BuildingDemo
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
