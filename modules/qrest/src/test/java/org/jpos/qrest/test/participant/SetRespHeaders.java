package org.jpos.qrest.test.participant;

import io.netty.handler.codec.http.HttpResponseStatus;
import org.jpos.qrest.Response;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;
import java.util.Collections;

import static org.jpos.qrest.Constants.RESPONSE;

public class SetRespHeaders implements TransactionParticipant {


    @Override
    public int prepare(long id, Serializable context) {

        Context ctx = (Context) context;

        try {
            Response response = new Response(HttpResponseStatus.OK, Collections.singletonMap("content", "world"));
            response.getHeaders().put("test-content-header","hello");
            ctx.put(RESPONSE, response);
            return PREPARED | NO_JOIN | READONLY;
        } catch (Exception e) {
            ctx.log(e);
            ctx.put(RESPONSE, new Response(HttpResponseStatus.INTERNAL_SERVER_ERROR, Collections.emptyMap()));
            return ABORTED;
        }
    }

}

