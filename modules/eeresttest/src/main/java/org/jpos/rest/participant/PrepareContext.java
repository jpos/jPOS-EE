/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2014 Alejandro P. Revilla
 *
 * THIS PROGRAM IS NOT FREE SOFTWARE and access to it should
 * be considered PRIVILEGED and CONFIDENTIAL.
 * 
 * See license details in the PGP-signed file LICENSE.asc
 * available in the top level directory of this project.
 *
 * LICENSE.asc SHA-1 b1f42375545e1eb6351af9219f8949bc8563f1a3
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
