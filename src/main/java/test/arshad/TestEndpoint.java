package test.arshad;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class TestEndpoint {

    @POST
    @Path("/save/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(@DefaultValue("none")@PathParam("name")String name) {
        try {
            System.out.println("The name to save is: " + name);
            return Response.ok("{\"success\": true}").build();
        } catch (Exception e) {
            return Response.status(406).build();
        }

    }

}
