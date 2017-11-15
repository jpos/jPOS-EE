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
