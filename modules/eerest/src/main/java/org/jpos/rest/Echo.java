package org.jpos.rest;

import org.jpos.q2.Q2;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("/echo")
public class Echo extends RestSupport {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response echoGet(
            @HeaderParam("version") String version,
            @HeaderParam("consumer-id") String consumerId,
            @HeaderParam("timestamp") long timestamp,
            @HeaderParam("hash") String hash,
            @HeaderParam("nonce") String nonce,
            @Context UriInfo uriInfo,
            @Context SecurityContext sc) {
        org.jpos.transaction.Context ctx = createContext(getClass().getSimpleName().toLowerCase() + "::get");
        ctx.put (RestConstants.RESTAPI_CREDENTIALS.value(),
                APICredential.builder().version(version)
                        .consumerId(consumerId)
                        .timestamp(timestamp)
                        .hash(hash)
                        .nonce(nonce)
                        .securityContext(sc).build()
        );
        ctx.put(RestConstants.URI_INFO.value(), uriInfo);
        Response.ResponseBuilder rb = execute(ctx, Response.Status.OK, (ctx1, resp) ->
        {
            put(resp, "version", Q2.getVersion());
            put(resp, "revision", Q2.getRevision());
            put(resp, "timestamp", ctx1.get(RestConstants.TIMESTAMP.value()));
            put(resp, "security-context", sc);
        });
        return rb.build();
    }
}
