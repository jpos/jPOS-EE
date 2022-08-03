package org.jpos.qrest.test.participant;

import io.netty.handler.codec.http.HttpResponseStatus;
import org.jpos.qrest.Response;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.Collections;

import static org.jpos.qrest.Constants.RESPONSE;

/**
 * @author Arturo Volpe
 * @since 2022-08-03
 */
public class DumpFile implements TransactionParticipant {


    @Override
    public int prepare(long id, Serializable context) {

        Context ctx = (Context) context;

        File file = ctx.get("FILE_FROM_REQUEST");
        try {
            String content = String.join("", Files.readAllLines(file.toPath()));
            ctx.put(RESPONSE, new Response(HttpResponseStatus.OK, Collections.singletonMap("content", content)));
            return PREPARED | NO_JOIN | READONLY;
        } catch (Exception e) {
            ctx.log(e);
            ctx.put(RESPONSE, new Response(HttpResponseStatus.INTERNAL_SERVER_ERROR, Collections.emptyMap()));
            return ABORTED;
        }
    }

}
