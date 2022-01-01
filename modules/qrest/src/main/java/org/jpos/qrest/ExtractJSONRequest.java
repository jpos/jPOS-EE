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

package org.jpos.qrest;

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.util.CharsetUtil;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;

import static org.jpos.qrest.Constants.JSON_REQUEST;
import static org.jpos.qrest.Constants.REQUEST;

public class ExtractJSONRequest implements TransactionParticipant {
    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        ctx.put (JSON_REQUEST.name(), request.content().toString(CharsetUtil.UTF_8));
        return PREPARED | READONLY | NO_JOIN;
    }
}
