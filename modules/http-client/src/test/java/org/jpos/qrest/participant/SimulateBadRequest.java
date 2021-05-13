package org.jpos.qrest.participant;

import io.netty.handler.codec.http.HttpResponseStatus;
import org.jpos.qrest.Response;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.jpos.qrest.Constants.RESPONSE;

public class SimulateBadRequest implements TransactionParticipant {

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        Map<String,String> response = new LinkedHashMap<>();
        response.put ("message", "Simulate_400");
        ctx.put(RESPONSE, new Response(HttpResponseStatus.BAD_REQUEST, response));
        return PREPARED | NO_JOIN | READONLY;
    }
}

