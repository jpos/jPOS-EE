/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

import org.hibernate.Transaction;
import org.jpos.ee.DB;

import java.io.Serializable;

import static org.jpos.transaction.TxnConstants.*;

public class Close extends TxnSupport implements AbortParticipant {
    public int prepare (long id, Serializable o) {
        return PREPARED | READONLY;
    }
    public int prepareForAbort (long id, Serializable o) {
        return PREPARED | READONLY;
    }
    public void commit (long id, Serializable o) { 
        closeDB(o);
    }
    public void abort  (long id, Serializable o) { 
        closeDB(o);
    }
    private void closeDB (Serializable o) {
        Context ctx = (Context) o;
        DB db = (DB) ctx.get (DB);
        if (db != null) {
            // ctx.checkPoint ("Closing");
            Transaction tx = (Transaction) ctx.get (TX);
            try {
                if (tx != null) {
                    try {
                        tx.commit ();
                        ctx.remove (TX); 
                        // ctx.checkPoint ("Close-Commit");
                    } catch (RuntimeException t) {
                        error (t);
                        try {
                            tx.rollback();
                        } catch (RuntimeException rte) {
                            error ("Rollback error", rte);
                        }
                    }
                }
                db.close ();
            } catch (RuntimeException ex) {
                error (ex);
            }
        }
        checkPoint(ctx);
    }
}

