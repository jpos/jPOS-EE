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

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.rest.RestConstants;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.transaction.TxnSupport;
import org.jpos.util.WatchDog;

import java.io.Serializable;
import java.util.Date;

public class PrepareContext extends TxnSupport {
    boolean trace = false;
    TransactionManager txnmgr;
    long timeout;
    public int prepare (long id, Serializable o) {
        Context ctx = (Context) o;
        ctx.setTrace(trace);
        ctx.checkPoint("prepare-context");
        WatchDog wd = (WatchDog) ctx.get(RestConstants.WATCHDOG.value());
        if (wd != null)
            wd.cancel();

        String name = ctx.getString (RestConstants.TXNMGR.value());
        name = name == null ?
          txnmgr.getName() : ", " + txnmgr.getName();
        ctx.put (RestConstants.TXNMGR.value(), name);

        Date ts = (Date) ctx.get(RestConstants.TIMESTAMP.value());
        if (ts == null)
            ctx.put (RestConstants.TIMESTAMP.value(), new Date());
        else if (System.currentTimeMillis() - ts.getTime() > timeout) {
            ctx.log ("Source based timeout");
            return NO_JOIN; // ABORTED
        }
        return PREPARED | NO_JOIN;
    }
    @SuppressWarnings("unused")
    public void setTransactionManager (TransactionManager txnmgr) {
        this.txnmgr = txnmgr;
    }
    public void commit (long id, Serializable o) { }
    public void abort (long id, Serializable o)  { }
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        this.trace = cfg.getBoolean("trace");
        this.timeout = cfg.getLong("timeout", 30000L);
    }
}
