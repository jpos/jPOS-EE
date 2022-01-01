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

package org.jpos.transaction;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.DB;

import java.io.Serializable;

import static org.jpos.transaction.TxnConstants.DB;
import static org.jpos.transaction.TxnConstants.TX;

public class Open extends TxnSupport {
    int timeout = 0;
    public int prepare (long id, Serializable o) {
        int rc = ABORTED;
        Context ctx = (Context) o;
        try {
            DB db = getDB (ctx);
            db.open ();
            ctx.put (TX, db.beginTransaction(timeout));
            checkPoint (ctx);
            rc = PREPARED;
        } catch (Throwable t) {
            error (t);
            ctx.remove (DB); // "Close" participant checks 
                             // for DB in Context
        }
        return rc | NO_JOIN | READONLY;
    }
    public void commit (long id, Serializable o) { }
    public void abort  (long id, Serializable o) { }
    public void setConfiguration (Configuration cfg) 
        throws ConfigurationException
    {
        super.setConfiguration (cfg);
        this.timeout = cfg.getInt ("timeout", 0);
    }
}

