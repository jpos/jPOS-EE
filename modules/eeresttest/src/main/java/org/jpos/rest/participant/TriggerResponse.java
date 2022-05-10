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

package org.jpos.rest.participant;

import org.jpos.rest.RestConstants;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;

import java.io.Serializable;

public class TriggerResponse implements AbortParticipant{
    @Override
    public int prepare (long id, Serializable context) {
        return PREPARED | READONLY;
    }

    @Override
    public int prepareForAbort(long id, Serializable context) {
        return READONLY;
    }

    @Override
    public void commit(long id, Serializable context) {
        Context ctx = (Context) context;
        ctx.put(RestConstants.TXNRESULT.value(), PREPARED);
    }
    @Override
    public void abort(long id, Serializable context) {
        Context ctx = (Context) context;
        ctx.put(RestConstants.TXNRESULT.value(), ABORTED);
    }
}
