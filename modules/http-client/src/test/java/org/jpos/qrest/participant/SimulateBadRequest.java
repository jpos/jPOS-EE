/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

