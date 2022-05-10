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

package org.jpos.saf;

import java.io.PrintStream;
import java.util.Date;
import java.io.Serializable;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOException;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceUtil;
import org.jpos.space.JDBMSpace;
import org.jpos.space.SpaceFactory;
import org.jpos.iso.MUX;
import org.jpos.iso.ISOUtil;
import org.jpos.util.Logger;
import org.jpos.util.LogEvent;
import org.jpos.util.Loggeable;
import org.jpos.util.NameRegistrar;

public class SAF extends QBeanSupport implements Runnable, Loggeable {
    Space psp;
    MUX mux;
    long initialDelay;
    long interMessageDelay;
    long waitForResponse;
    int maxRetransmissions;
    long expiration;
    long preMessageDelay = 0L;
    String flagRetransmissions;
    String validResponseCodes;
    String retryResponseCodes;
    String queue;
    String head;
    String delayQueue;

    public void initService() {
        queue = getName();
        head = getName() + ".head";
        delayQueue = getName() + ".delayed";
        NameRegistrar.register(getName(), this);
    }

    public void startService() {
        // we re-register just in case the component was soft-stopped
        NameRegistrar.register(getName(), this);
        new Thread(this).start();
    }

    public void stopService() {
        NameRegistrar.unregister(getName());
    }

    public void run() {
        Thread.currentThread().setName(getName());
        ISOUtil.sleep(initialDelay);
        while (running()) {
            if (!mux.isConnected()) {
                ISOUtil.sleep(1000);
                continue;
            }
            for (Object e; (e = psp.rdp(delayQueue)) != null;) {
                if (e instanceof Entry) {
                    if (((Entry)e).time + preMessageDelay <= System.currentTimeMillis()) {
                        // Entry is now activated so put it to the saf queue and take it off delayQueue
                        psp.out(queue, e);
                        psp.inp(delayQueue);
                    } else
                        break; // First delayed entry not activated yet so no point looking further
                } else
                    psp.inp(delayQueue); // ignore objects that are not an Entry
            }
            try {
                if (latchMsg()) {
                    Entry entry = (Entry) psp.rdp(head);
                    entry = send(entry);
                    synchronized (psp) {
                        autoCommitOff();
                        psp.inp(head);
                        if (entry != null)
                            psp.out(head, entry);
                        autoCommitOn();
                    }
                    if (interMessageDelay > 0)
                        ISOUtil.sleep(interMessageDelay);
                }
            } catch (Exception e) {
                getLog().error(e);
                ISOUtil.sleep(15000L); // "easy" on exceptions
            }
        }
    }

    public void setConfiguration(Configuration cfg)
            throws ConfigurationException {
        super.setConfiguration(cfg);
        psp = SpaceFactory.getSpace(cfg.get("space"));
        String muxName = "mux." + cfg.get("mux");
        try {
            mux = (MUX) NameRegistrar.get(muxName);
        } catch (NameRegistrar.NotFoundException e) {
            throw new ConfigurationException(
                    "MUX '" + muxName + "' not found in registrar."
            );
        }
        flagRetransmissions = cfg.get("flag-retransmissions", "");
        initialDelay = cfg.getLong("initial-delay", 30000L);
        interMessageDelay = cfg.getLong("inter-message-delay", 1000L);
        waitForResponse = cfg.getLong("wait-for-response", 60000L);
        maxRetransmissions = cfg.getInt("max-retransmissions", 0);
        expiration = cfg.getLong("expire-after", 0L) * 1000L;
        validResponseCodes = cfg.get("valid-response-codes", "00");
        retryResponseCodes = cfg.get("retry-response-codes", null);
        preMessageDelay = cfg.getLong("pre-message-delay", 0L);
    }

    public static SAF getSAF(String name) throws NameRegistrar.NotFoundException {
        return (SAF) NameRegistrar.get(name);
    }

    public Space getSpace() {
        return psp;
    }

    /**
     * queue message for transmission
     *
     * @param msg message to send
     */
    public void send(ISOMsg msg) {
        send(msg, null, 0L, false);
    }

    /**
     * queue message for transmission
     *
     * @param msg             message to send
     * @param responseKey     if not null, on response, put the response message on the space
     * @param responseTimeout optional timeout for response message
     * @param wipe            if true and responseKey is not null, SAF would wipe previous entries
     */
    public void send(ISOMsg msg, String responseKey, long responseTimeout, boolean wipe) {
        // if pre-message-delay is not configured (default is 0) then the message can be put
        // main queue itself. Otherwise it will be placed in delayQueue till the DelayTask moves it back.
        String q = (preMessageDelay > 0L) ? delayQueue : queue;
        psp.out(q, new Entry(msg, responseKey, responseTimeout, wipe));
    }

    public void dump(PrintStream p, String indent) {
        String inner = indent + "  ";
        p.println(indent + "<saf name='" + getName() + "'>");
        p.println(inner + getStatus());
        p.println(indent + "</saf>");
    }

    public String getStatus() {
        StringBuffer sb = new StringBuffer();
        sb.append("mux=");
        sb.append(mux.isConnected() ? "ready" : "not-ready");
        if (psp instanceof JDBMSpace) {
            sb.append(", queue-size=");
            sb.append(((JDBMSpace) psp).size(queue));
        }
        Entry latched = (Entry) psp.rdp(head);
        if (latched != null) {
            if (latched.count > 0)
                sb.append(" head transmitted " + latched.count + " time(s)");
        }
        return sb.toString();
    }

    private boolean latchMsg() {
        Entry entry = (Entry) psp.rdp(head);
        if (entry == null) {
            entry = (Entry) psp.rd(queue, 5000L);
            if (entry != null) {
                synchronized (psp) {
                    autoCommitOff();
                    psp.out(head, psp.in(queue));
                    autoCommitOn();
                }
            }
        }
        return entry != null;
    }

    private void autoCommitOn() {
        if (psp instanceof JDBMSpace)
            ((JDBMSpace) psp).setAutoCommit(true);
    }

    private void autoCommitOff() {
        if (psp instanceof JDBMSpace)
            ((JDBMSpace) psp).setAutoCommit(false);
    }

    private Entry send(Entry entry) {
        if (shouldIgnore(entry)) {
            LogEvent evt = getLog().createLogEvent("saf-warning");
            if (isMaxRetransmission(entry))
                evt.addMessage("max retransmission count (" + maxRetransmissions + ") has been reached.");
            if (isExpired(entry)) {
                Date d = new Date(entry.time);
                evt.addMessage("message queued on " + d.toString() + " is now expired.");
            }
            evt.addMessage(entry.msg);
            Logger.log(evt);
            return null;
        }
        try {
            ISOMsg resp = mux.request(entry.msg, waitForResponse);
            if (resp == null) {
                // we don't count if we don't get a response, the request
                // will expire at its expiration time
                return entry;
            }
            if (resp.hasField(39)) {
                String rc = resp.getString(39);
                if (retryResponseCodes != null && retryResponseCodes.indexOf(rc) >= 0) {
                    // this result code requires retransmission, so we don't increase
                    // the retransmission counter. The request may expire though
                    LogEvent evt = createLogEvent("info", entry, resp);
                    evt.addMessage("response code '"
                            + resp.getString(39)
                            + "' is in retry-response-codes list ("
                            + retryResponseCodes + ")");
                    Logger.log(evt);
                    return entry;
                }
                entry.count++;
                if ("*".equals(validResponseCodes) || validResponseCodes.indexOf(rc) >= 0) {
                    LogEvent evt = createLogEvent("info", entry, resp);
                    evt.addMessage("response code '"
                            + resp.getString(39)
                            + "' is in valid-response-codes list ("
                            + validResponseCodes + ")");
                    Logger.log(evt);
                    // GOOD - Message was sent
                    if (entry.responseKey != null) {
                        if (entry.wipePreviousResponse)
                            SpaceUtil.wipe(psp, entry.responseKey);
                        if (entry.responseTimeout > 0L)
                            psp.out(entry.responseKey, resp, entry.responseTimeout);
                        else
                            psp.out(entry.responseKey, resp);
                    }
                    return null;
                } else {
                    LogEvent evt = createLogEvent("info", entry, resp);
                    evt.addMessage("response code '"
                            + resp.getString(39)
                            + "' not in valid-response-codes list ("
                            + validResponseCodes + ")");
                    Logger.log(evt);
                }
            }
            if (entry.count == 1 && flagRetransmissions.indexOf(entry.msg.getMTI()) >= 0)
                entry.msg.setRetransmissionMTI();   // we'll send a retransmission on next try
        } catch (ISOException e) {
            LogEvent evt = createLogEvent("error", entry);
            evt.addMessage("Error " + e.toString() + " while sending message.");
            evt.addMessage("--- stack trace ---");
            evt.addMessage(e);
            Logger.log(evt);
        }
        return entry;
    }

    private LogEvent createLogEvent(String type, Entry entry, ISOMsg resp) {
        LogEvent evt = getLog().createLogEvent(type);
        evt.addMessage(" Message timestamp: " + new Date(entry.time));
        evt.addMessage("Transmission count: " + entry.count);
        evt.addMessage("--- request ---");
        evt.addMessage(entry.msg);
        if (resp != null) {
            evt.addMessage("--- response ---");
            evt.addMessage(resp);
        }
        return evt;
    }

    private LogEvent createLogEvent(String type, Entry entry) {
        return createLogEvent(type, entry, null);
    }

    private boolean isExpired(Entry e) {
        return expiration == 0 ? false :
                System.currentTimeMillis() > (e.time + expiration);
    }

    private boolean isMaxRetransmission(Entry e) {
        return maxRetransmissions == 0 ? false :
                e.count > maxRetransmissions;
    }

    private boolean shouldIgnore(Entry e) {
        return isExpired(e) || isMaxRetransmission(e);
    }

    public static class Entry implements Serializable {
        public static final long serialVersionUID = 1L;
        public ISOMsg msg;
        public long time;
        public int count;
        public String responseKey;
        public long responseTimeout;
        public boolean wipePreviousResponse;

        public Entry() {
            super();
            this.time = System.currentTimeMillis();
        }

        public Entry(ISOMsg msg) {
            this(msg, null, 0L, false);
        }

        public Entry(ISOMsg msg, String responseKey, long responseTimeout, boolean wipePreviousResponse) {
            this();
            this.msg = msg;
            this.responseKey = responseKey;
            this.responseTimeout = responseTimeout;
            this.wipePreviousResponse = wipePreviousResponse;
        }
    }
}

