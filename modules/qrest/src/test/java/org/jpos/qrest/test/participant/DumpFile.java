/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
