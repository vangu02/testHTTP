package com.ca.field.test;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "rest" path)
 */
@Path("UIM")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{param}")
    public String getIt(@PathParam("param") String msg) {
    	
    	String output = "REST says : " + msg;

        return "{ \""+output+ "\": { \"subkey\" : \"hello world.json\" }}";
    }
    
    @PUT
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String putIt(@QueryParam("id") String Id, @QueryParam("inDate") String inDate) // ?id=something&inDate=tomorrow
    {
    	String output = "REST says : " + Id + " " + " " + inDate ;

        return "{ \""+output+ "\": { \"subkey\" : \"hello world.json\" }}";
   
    }
}
