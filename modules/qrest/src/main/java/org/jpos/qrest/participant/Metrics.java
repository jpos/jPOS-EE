/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

package org.jpos.qrest.participant;

import java.io.Serializable;
import java.util.*;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.*;
import org.jpos.q2.Q2;
import org.jpos.qrest.Route;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.transaction.TransactionParticipant;

import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static org.jpos.qrest.Constants.RESPONSE;

public class Metrics implements TransactionParticipant {
    // special temp key in response map to indicate a specific HttpResponseStatus value (should be removed from actual response)
    private final static String HTTP_STATUS_KEY = "__http_status__";
    private TransactionManager txnmgr;
    private Q2 q2;
    private List<Route<Map<String,Object>>> routes = new ArrayList<>();
    private String prefix;

    public Metrics () { }

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        HttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK,
          Unpooled.wrappedBuffer(q2.getPrometheusMeterRegistry().scrape().getBytes())
        );
        ctx.put(RESPONSE, response);
        return PREPARED | NO_JOIN | READONLY;
    }

    @SuppressWarnings("unused")
    public void setTransactionManager (TransactionManager txnmgr) {
        this.txnmgr = txnmgr;
        this.q2 = txnmgr.getServer();
    }
}
