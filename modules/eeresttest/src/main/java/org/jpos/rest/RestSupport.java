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

package org.jpos.rest;

import org.apache.commons.lang3.StringUtils;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.iso.ISODate;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.Q2;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.transaction.TxnConstants;
import org.jpos.util.Log;
import org.jpos.util.NameRegistrar;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jpos.rest.RestConstants.RESTAPI_TXN_QUEUE;
import static org.jpos.rest.RestConstants.TRUSTED;

public class RestSupport {
    protected static Space sp = SpaceFactory.getSpace();
    protected static AtomicLong stan = new AtomicLong();
    private static final long MAX_STAN = 1000000000000L;
    public static final long TIMEOUT = 15000L;

    protected void assertTrue(boolean condition, String message)
            throws BLException {
        if (!condition) {
            throw new BLException(message);
        }
    }

    protected void assertFalse(boolean condition, String message)
            throws BLException {
        if (condition) {
            throw new BLException(message);
        }
    }

    protected void assertTrue(boolean condition, String message, String detail)
            throws BLException {
        if (!condition) {
            throw new BLException(message, detail);
        }
    }

    protected void assertFalse(boolean condition, String message, String detail)
            throws BLException {
        if (condition) {
            throw new BLException(message, detail);
        }
    }

    protected void assertNotNull(Object obj, String message)
            throws BLException {
        if (obj == null) {
            throw new BLException(message);
        }
    }

    protected void assertNotNull(Object obj, String message, String detail)
            throws BLException {
        if (obj == null) {
            throw new BLException(message, detail);
        }
    }

    protected void assertNull(Object obj, String message)
            throws BLException {
        if (obj != null) {
            throw new BLException(message);
        }
    }

    protected void assertNull(Object obj, String message, String detail)
            throws BLException {
        if (obj != null) {
            throw new BLException(message, detail);
        }
    }

    protected void assertValid(String value, String regexp, String message, String detail)
            throws BLException
    {
        assertNotNull(value, message, detail);
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(value);
        assertTrue(m.matches(), message, detail);
    }

    protected void assertValid(String value, String regexp, String message)
            throws BLException {
        assertValid(value, regexp, message, null);
    }

    protected String getDate() {
        return ISODate.getDateTime(new Date());
    }

    protected String getDate(Date d) {
        return ISODate.getDateTime(d);
    }

    protected String getDate(Date d, String format) {
        return ISODate.formatDate(d, format);
    }

    protected String getStan() {
        return ISOUtil.zeropad(stan.incrementAndGet() % MAX_STAN, 12);
    }
    protected void assertParameter (String paramName, String value, String regexp, boolean notNull)
            throws BLException
    {
        if (value != null) {
            assertValid(value, regexp, "parameter " + paramName + " is not valid", null);
        } else if (notNull)
            throw new BLException(paramName + " can't be null");
    }
    protected String getParameter (String paramName, String value, String regexp, boolean notNull)
            throws BLException
    {
        if (value != null) {
            assertValid(value, regexp, "parameter " + paramName + " is not valid", value);
        } else if (notNull)
            throw new BLException(paramName + " can't be null");
        return value;
    }

    protected boolean getBoolean (String paramName, String value, boolean notNull)
            throws BLException
    {
        getParameter(paramName, value, RestConstants.BOOLEAN_PATTERN.value(), notNull);
        return "true".equals(value);
    }

    protected ISOMsg createISOMsg(String mti) throws ISOException
    {
        final ISOMsg request = new ISOMsg(mti);
        final Date date = new Date();
        request.set(7, getDate(date));
        request.set(11, getStan());
        request.set(12, getDate(date, "yyyyMMddHHmmss"));
        return request;
    }
    /**
     * Helper method to send a local ISO Message to Transaction Manager.
     *
     * @param msg The message to send
     * @param txnName The name of the transaction to get identified by txnmgr
     * @return Response
     * @throws org.jpos.iso.ISOException on error
     */
    protected Context sendISOMsg(final ISOMsg msg, final String txnName) throws ISOException {
        final RestISOSource source = new RestISOSource();
        final Context ctx = new Context();
        final DB db = new DB();
        try {
            ctx.put(RestConstants.REQUEST.value(), msg);
            ctx.put(RestConstants.SOURCE.value(), source);
            ctx.put(RestConstants.TXNNAME.value(), txnName);
            ctx.put(RestConstants.DB.value(), db);
            //We claim to be trusted so jPOS avoid some checks
            ctx.put(RestConstants.SS.value(), TRUSTED.value());
            msg.set(CMFConstants.JPF_VERSION.value(), RestConstants.JPOS_CMF_VERSION.value());
            try {
                final TransactionManager txnmgr = (TransactionManager) NameRegistrar.get("txnmgr");
                txnmgr.queue(ctx);
                final ISOMsg response = source.getResponse(30000L); //30 secs timeout for now
                ctx.put(RestConstants.RESPONSE.value(), response);
                return ctx;
            } catch (NameRegistrar.NotFoundException e) {
                //shouldn't happen
                return null;
            }
        } finally {
            if (db.session() != null && db.session().isOpen()) {
                db.close();
            }
        }
    }

    protected ISOMsg getResponse(Context ctx) {
        return (ISOMsg) ctx.get(RestConstants.RESPONSE.value());
    }

    protected void assertResultCode(ISOMsg msg) throws BLException {
        if (msg == null) {
            throw new BLException("Response not received");
        }
        if (!RestConstants.TRAN_APPROVED.value().equals(msg.getString(39))) {
            throw new BLException(msg.getString(63), msg.getString(123));
        }
    }

    protected Map createMessage (String level, String key, String description) {
        if (description == null) {
            description = "";
        }
        Map<String,String> m = new LinkedHashMap<String,String>();
        m.put("level", level);
        m.put("key", key);
        m.put("dsc", description);
        return m;
    }

    protected void put (Map<String,Object> map, String key, Object value) {
        if (value != null)
            map.put(key, value);
    }
    protected Log getLog() {
        return Log.getLog(Q2.LOGGER_NAME, "restapi");
    }
    protected Map<String,Object> createResponseMap() {
        return new LinkedHashMap<String,Object>();
    }

    @SuppressWarnings("unchecked")
    protected int queryTxnMgr (Context ctx) {
        return queryTxnMgr(ctx, TIMEOUT);
    }

    protected int queryTxnMgr (Context ctx, long timeout) {
        SpaceFactory.getSpace().out(RESTAPI_TXN_QUEUE.value(), ctx, timeout);
        Integer result = (Integer) ctx.get(RestConstants.TXNRESULT.value(), timeout);
        return result != null ? result : -1;
    }

    protected Context createContext(String txnName) {
        Context ctx = new Context();
        ctx.put(RestConstants.TXNNAME.value(), txnName);
        return ctx;
    }

    protected Response.ResponseBuilder execute(Context ctx, Response.Status defaultOK) {
        return execute(ctx,defaultOK, null,TIMEOUT);
    }

    protected Response.ResponseBuilder execute(Context ctx, Response.Status defaultOK, RestAction action) {
        return execute(ctx,defaultOK,action,TIMEOUT);
    }

    protected Response.ResponseBuilder execute(Context ctx, Response.Status defaultOK, RestAction action, long timeout) {
        int result = queryTxnMgr(ctx, timeout);
        Map<String,Object> resp = new HashMap<>();
        put(resp, "success", result == TransactionManager.PREPARED);
        String errors = "";
        if (result != TransactionManager.PREPARED) {
            errors += ctx.getString(TxnConstants.RC)
                    + (ctx.getString(TxnConstants.EXTRC) != null ? " " + ctx.getString(TxnConstants.EXTRC) : "");
            put(resp, "errors", errors);
        } else if (action!= null) {
            action.execute(ctx,resp);
        }
        return  Response.ok(resp, MediaType.APPLICATION_JSON)
                .status(getStatus(defaultOK, (String) resp.get("errors")))
                .location(((UriInfo) ctx.get(RestConstants.URI_INFO.value())).getAbsolutePath());
    }

    protected Response.Status getStatus(Response.Status defaultOK, String errors) {
        if (errors != null && !errors.isEmpty()) {
            String[] errorTokens = StringUtils.split(errors, ".");
            switch (errorTokens[0]) {
                case "invalid" : {
                    switch (errorTokens[1]) {
                        case  "permissions" : {
                            return Response.Status.FORBIDDEN;
                        }
                        case  "jsonformat" : {
                            return Response.Status.BAD_REQUEST;
                        }
                    }
                    return Response.Status.CONFLICT;
                } case "not" : {
                    //not.sufficient.funds
                    return Response.Status.EXPECTATION_FAILED;
                } default : {
                    return Response.Status.BAD_REQUEST;
                }
            }
        }
        return defaultOK;
    }
}
