package org.jpos.rest.participant;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;

public class EchoGet implements TransactionParticipant, Configurable {
    Configuration cfg;
    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        checkPoint (ctx);
        return PREPARED | NO_JOIN | READONLY;
    }

    protected void checkPoint (Context ctx) {
        String checkPointMessage = cfg.get ("checkpoint", null);
        if (checkPointMessage != null)
            ctx.checkPoint (checkPointMessage);
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }
}
