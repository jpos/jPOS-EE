package org.jpos.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/echo")
public class Echo {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response echoGet() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("success", "true1");
        Response.ResponseBuilder rb = Response.ok(resp, MediaType.APPLICATION_JSON).status(Response.Status.OK);
        return rb.build();
    }
}
