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

package org.jpos.space;

import java.io.*;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.UUID;
import org.jpos.iso.ISOUtil;
import org.jpos.util.Log;
import org.jpos.util.Logger;
import org.jpos.util.LogEvent;
import org.jgroups.JChannel;
import org.jgroups.View;
import org.jgroups.Message;
import org.jgroups.Address;
import org.jgroups.Receiver;

@SuppressWarnings("unchecked")
public class ReplicatedSpace 
    extends Log
    implements LocalSpace, Receiver 
{
    JChannel channel;
    String nodeName;
    String nodePrefix;
    String seqName;
    Space sp;
    TSpace sl;    
    View view;
    boolean trace;
    boolean replicate;
    public static final long TIMEOUT    = 15000L;
    public static final long MAX_WAIT   = 1000L;
    public static final long MAX_OUT_WAIT  = 5000L;
    public static final long ONE_MINUTE = 60000L;
    public static final long FIVE_MINUTES = 5*60000L;
    private static final long NRD_RESOLUTION = 500L;

    public ReplicatedSpace (
            Space sp, 
            String groupName, 
            String configFile, 
            Logger logger, 
            String realm,
            boolean trace, boolean replicate)
        throws Exception
    {
        super ();
        this.sp = sp;
        setLogger (logger, realm);
        initChannel(groupName, configFile);
        this.nodeName = channel.getAddress().toString();
        this.nodePrefix = nodeName + ".";
        this.seqName  = nodeName + ".seq";
        this.trace = trace;
        this.replicate = replicate;
    }
    public ReplicatedSpace 
        (Space sp, String groupName, String configFile)
        throws Exception
    {
        this (sp, groupName, configFile, null, null, false, false);
    }
    public void close() throws IOException {
        block();
        channel.close();
    }
    public void out(Object key, Object value) {
        out(key, value, 0L);
    }
    public void out (Object key, Object value, long timeout) { 
        getCoordinator();   
        try {
            Request r = new Request (Request.OUT, key, value, timeout);
            channel.send (new Message (null, r));
            Object o = sp.in (r.getUUID(), MAX_OUT_WAIT);
            if (o == null)
                throw new SpaceError ("Could not out " + key);
        } catch (Exception e) {
            throw new SpaceError (e);
        }
    }
    public void push (Object key, Object value) { 
        push(key, value, 0L);
    }
    public void push (Object key, Object value, long timeout) { 
        getCoordinator();
        try {
            Request r = new Request (Request.PUSH, key, value, timeout);
            channel.send (new Message (null, r));
            Object o = sp.in (r.getUUID(), MAX_OUT_WAIT);
            if (o == null)
                throw new SpaceError ("Could not push " + key);
        } catch (Exception e) {
            throw new SpaceError (e);
        }
    }
    public void put (Object key, Object value) { 
        put(key, value, 0L);
    }
    public void put (Object key, Object value, long timeout) { 
        getCoordinator();   
        try {
            Request r = new Request (Request.PUT, key, value, timeout);
            channel.send (new Message (null, r));
            Object o = sp.in (r.getUUID(), MAX_OUT_WAIT);
            if (o == null)
                throw new SpaceError ("Could not put " + key);
        } catch (Exception e) {
            throw new SpaceError (e);
        }
    }
    public Object rdp (Object key) {
        Request r = new Request (Request.RDP, key, 0);
        r.value = r.getUUID();
        sendToCoordinator (r);
        Object obj = sp.in (r.value, MAX_WAIT);
        if (obj instanceof NullPointerException)
            obj = null;
        return obj;
    }
    public Object inp (Object key) {
        Request r = new Request (Request.INP, key, 0);
        r.value = r.getUUID();
        sendToCoordinator (r);
        Object obj = sp.in (r.value, MAX_WAIT);
        if (obj instanceof NullPointerException)
            obj = null;
        return obj;
    }
    public void receive (Message msg) { 
        LogEvent evt = null;
        Object obj = msg.getObject();
        if (trace && logger != null) {
            evt = createTrace (" receive: " + msg.toString());
            if (obj != null) {
                evt.addMessage (" object: " + obj.toString());
            }
        }
        if (obj instanceof Request) {
            Request r = (Request) obj;
            switch (r.type) {
                case Request.OUT:
                    if (r.timeout != 0)
                        sp.out (r.key, r.value, r.timeout + TIMEOUT);
                    else
                        sp.out (r.key, r.value);

                    if (msg.getSrc().equals (channel.getAddress())) {
                        sp.out (r.getUUID(), Boolean.TRUE, MAX_OUT_WAIT);
                    }
                    if (sl != null)
                        notifyListeners(r.key, r.value);
                    break;
                case Request.PUSH:
                    if (r.timeout != 0) 
                        sp.push (r.key, r.value, r.timeout + TIMEOUT);
                    else
                        sp.push (r.key, r.value);

                    if (msg.getSrc().equals (channel.getAddress())) {
                        sp.out (r.getUUID(), Boolean.TRUE, MAX_OUT_WAIT);
                    }
                    if (sl != null)
                        notifyListeners(r.key, r.value);
                    break;
                case Request.PUT:
                    if (r.timeout != 0) 
                        sp.put (r.key, r.value, r.timeout + TIMEOUT);
                    else
                        sp.put (r.key, r.value);

                    if (msg.getSrc().equals (channel.getAddress())) {
                        sp.out (r.getUUID(), Boolean.TRUE, MAX_OUT_WAIT);
                    }
                    if (sl != null)
                        notifyListeners(r.key, r.value);
                    break;
                case Request.RDP:
                    send (msg.getSrc(), 
                        new Request (
                            Request.RDP_RESPONSE, 
                            r.value, // value is ref key for response
                            sp.rdp (r.key)
                        )
                    );
                    break;
                case Request.RDP_RESPONSE:
                    if (r.value == null) {
                        r.value = new NullPointerException();
                        if (evt != null)
                            evt.addMessage (" negative response");
                    }
                    sp.out (r.key, r.value, MAX_WAIT);
                    break;
                case Request.INP:
                    Object v = sp.inp (r.key);
                    if (v != null) {
                        MD5Template tmpl = new MD5Template(r.key, v);
                        send (null,
                            new Request (
                                Request.INP_NOTIFICATION, 
                                r.key, 
                                tmpl
                            )
                        );
                    }
                    send (msg.getSrc(), 
                        new Request (
                            Request.INP_RESPONSE, 
                            r.value, // value is ref key for response
                            v
                        )
                    );
                    break;
                case Request.INP_RESPONSE:
                    if (r.value == null)
                        r.value = new NullPointerException();
                    sp.out (r.key, r.value, MAX_WAIT);
                    break;
                case Request.INP_NOTIFICATION:
                    sp.inp (r.value);
                    break;
                case Request.SPACE_COPY:
                    if (replicate && !isCoordinator() && sp instanceof TSpace) {
                        ((TSpace)sp).setEntries ((Map) r.value);
                        synchronized (sp) {
                            sp.notifyAll();
                        }
                    }
                    break;
            }
        } else if (evt != null) {
            evt.addMessage ("  class: " + obj.getClass().getName());
        }
        if (evt != null)
            Logger.log (evt);
    }

    /**
     * Allows an application to write a state through a provided OutputStream. After the state has
     * been written the OutputStream doesn't need to be closed as stream closing is automatically
     * done when a calling thread returns from this callback.
     *
     * @param output the OutputStream
     * @throws Exception if the streaming fails, any exceptions should be thrown so that the state requester
     *                   can re-throw them and let the caller know what happened
     * @see OutputStream#close()
     */
    @Override
    public void getState(OutputStream output) throws Exception {

    }

    /**
     * Allows an application to read a state through a provided InputStream. After the state has been
     * read the InputStream doesn't need to be closed as stream closing is automatically done when a
     * calling thread returns from this callback.
     *
     * @param input the InputStream
     * @throws Exception if the streaming fails, any exceptions should be thrown so that the state requester
     *                   can catch them and thus know what happened
     * @see InputStream#close()
     */
    @Override
    public void setState(InputStream input) throws Exception {

    }

    public boolean existAny (Object[] keys) {
        for (int i=0; i<keys.length; i++) {
            if (rdp (keys[i]) != null)
                return true;
        }
        return false;
    }
    public boolean existAny (Object[] keys, long timeout) {
        long now = System.currentTimeMillis();
        long end = now + timeout;
        while (((now = System.currentTimeMillis()) < end)) {
            if (existAny (keys))
                return true;
            try {
                synchronized (sp) {
                    if (!sp.existAny (keys, timeout))
                        sp.wait (end - now);
                }
            } catch (InterruptedException e) { }
        }
        return false;
    }
    // ----------------------------------------------------------------
    public Object rd  (Object key) {
        Object obj;
        while ((obj = rdp (key)) == null) {
            synchronized (sp) {
                try {
                    if (sp.rdp (key) == null) 
                        sp.wait (MAX_WAIT);
                } catch (InterruptedException e) { }
            }
        }
        return obj;
    }
    public Object rd  (Object key, long timeout) {
        Object obj;
        long end = System.currentTimeMillis() + timeout;
        while ((obj = rdp (key)) == null) {
            long timeleft = end - System.currentTimeMillis();
            if (timeleft > 0) {
                synchronized (sp) {
                    try {
                        if (sp.rdp (key) == null) 
                            sp.wait (Math.min (MAX_WAIT, timeleft));
                    } catch (InterruptedException e) { }
                }
            }
            else
                break;
        }
        return obj;
    }
    public Object in (Object key) {
        Object obj;
        while ((obj = inp(key)) == null) {
            synchronized (sp) {
                try {
                    if (sp.rdp (key) == null) 
                        sp.wait (MAX_WAIT);
                } catch (InterruptedException e) { }
            }
        }
        return obj;
    }
    public Object in (Object key, long timeout) {
        Object obj;
        long end = System.currentTimeMillis() + timeout;
        while ((obj = inp(key)) == null) {
            long timeleft = end - System.currentTimeMillis();
            if (timeleft > 0) {
                synchronized (sp) {
                    try {
                        if (sp.rdp (key) == null) 
                            sp.wait (Math.min (MAX_WAIT, timeleft));
                    } catch (InterruptedException e) { }
                }
            }
            else
                break;
        }
        return obj;
    }
    public void setTrace (boolean trace) {
        this.trace = trace;
    }
    public boolean isTrace() {
        return trace;
    }
    private Address getCoordinator () {
        assertChannel();
        if (view != null)
            return view.getMembers().get(0);

        throw new SpaceError ("Channel not ready - coordinator is null");
    }
    private void assertChannel () {
        if (!channel.isConnected())
            throw new SpaceError ("Channel is not connected");
    }
    /** Called when a member is suspected */
    public void suspect (Address suspected_mbr) {
        //
    }
    /** Block sending and receiving of messages until ViewAccepted is called */
    public void block () {
        this.view = null;
    }

    /**
     * Called <em>after</em> the FLUSH protocol has unblocked previously blocked senders, and
     * messages can be sent again. This callback only needs to be implemented if we require a
     * notification of that.
     * <p>
     * Note that during new view installation we provide guarantee that unblock invocation strictly
     * follows view installation at some node A belonging to that view . However, some other message
     * M may squeeze in between view and unblock callbacks.
     * <p>
     * For more details see https://jira.jboss.org/jira/browse/JGRP-986
     */
    @Override
    public void unblock() {

    }

    public void viewAccepted (View view) {
        this.view = view;
        if (logger != null) {
            LogEvent evt = createInfo ("view-accepted");
            evt.addMessage (view.toString());
            Logger.log (evt);
        }
        if (replicate && isCoordinator() && view.getMembers().size() > 1 && sp instanceof TSpace) {
            new Thread () {
                public void run() {
                    info ("New node joined, sending full Space");
                    send (null,
                        new Request (
                            Request.SPACE_COPY, 
                            null,
                            ((TSpace)sp).getEntries()
                        )
                    );
                }
            }.start();
        }
    }
    public boolean isCoordinator () {
        return channel.getAddress().equals (view.getMembers().get(0));
    }
    public void setState(byte[] new_state) {
        // 
    }
    public void setReplicate (boolean replicate) {
        this.replicate = replicate;
    }
    public boolean isReplicate () {
        return replicate;
    }
    public byte[] getState() {
        return "DummyState".getBytes();
    }
    private void commitOff() {
        if (sp instanceof JDBMSpace) 
            ((JDBMSpace)sp).setAutoCommit(false);
    }
    private void commitOn() {
        if (sp instanceof JDBMSpace) 
            ((JDBMSpace)sp).setAutoCommit(true);
    }
    private void send (Address destination, Request r) 
    {
        try {
            channel.send (new Message (destination, r));
        } catch (Exception e) {
            error (e);
        }
    }
    private void sendToCoordinator (Request r) 
    {
        while (true) {
            Address coordinator = getCoordinator();
            try {
                channel.send (new Message (coordinator, r));
                break;
            } catch (Exception e) {
                error ("error " + e.getMessage() + ", retrying");
                try {
                    Thread.sleep (MAX_WAIT);
                } catch (InterruptedException ex) { }
            }
        }
    }
    private void initChannel (String groupName, String configFile) 
        throws Exception
    {
        channel = new JChannel (configFile);
        channel.setReceiver(this);
        channel.connect (groupName);
        info ("member: " + channel.getAddress().toString());
    }
    public static class Request implements Serializable {
        static final long serialVersionUID = -5676486343295850374L;
        static final int OUT=1;
        static final int PUSH=2;
        static final int RDP=3;
        static final int RDP_RESPONSE=4;
        static final int INP=5;
        static final int INP_RESPONSE=6;
        static final int INP_NOTIFICATION=7;
        static final int SPACE_COPY=8;
        static final int PUT=9;
        static final String[] types = { 
            "", "OUT", "PUSH", "RDP", "RDP_RESPONSE", 
            "INP", "INP_RESPONSE", "INP_NOTIFICATION", 
            "SPACE_COPY", "PUT"
        };

        public int type=0;
        public Object key=null;
        public Object value=null;
        public long timeout=0;
        private UUID uuid;

        public Request() {
            super();
            uuid = UUID.randomUUID();
        }
        public Request(int type, Object key, Object value, long timeout) {
            this ();
            this.type    = type;
            this.key     = key;
            this.value   = value;
            this.timeout = timeout;
        }
        public Request(int type, Object key, Object value) {
            this ();
            this.type    = type;
            this.key     = key;
            this.value   = value;
        }
        public String toString() {
            StringBuffer sb=new StringBuffer();
            sb.append (type2String (type));
            if(key != null) {
                sb.append(" key=" + key);
            }
            if(value != null) {
                if (value instanceof byte[])
                    sb.append (" value=" + ISOUtil.hexString ((byte[]) value));
                else
                    sb.append(" value=" + value);
            }
            sb.append (" timeout=" + timeout);
            return sb.toString();
        }
        public UUID getUUID () {
            return uuid;
        }
        String type2String (int type) {
            return type < types.length ? types [type] : "invalid";
        }
    }
    public Set getKeySet () {
        return ((LocalSpace)sp).getKeySet();
    }
    public int size (Object key) {
        return ((LocalSpace)sp).size(key);
    }
    public synchronized void addListener (Object key, SpaceListener listener) {
        getSL().out (key, listener);
    }
    public synchronized void addListener
        (Object key, SpaceListener listener, long timeout)
    {
        getSL().out (key, listener, timeout);
    }
    public synchronized void removeListener
        (Object key, SpaceListener listener)
    {
        if (sl != null) {
            sl.inp (new ObjectTemplate (key, listener));
        }
    }
    public void notifyListeners (final Object key, final Object value) {
        new Thread() {
            public void run() {
                Object[] listeners = null;
                synchronized (this) {
                    if (sl == null)
                        return;
                    List l = (List) sl.entries.get (key);
                    if (l != null)
                        listeners = l.toArray();
                }
                if (listeners != null) {
                    for (int i=0; i<listeners.length; i++) {
                        Object o = listeners[i];
                        if (o instanceof TSpace.Expirable) {
                            o = ((TSpace.Expirable)o).getValue();
                        }
                        if (o instanceof SpaceListener) {
                            ((SpaceListener) o).notify(key, value);
                        }
                    }
                }
            }
        }.start();
    }
    private TSpace getSL() {
        synchronized (this) {
            if (sl == null)
                sl = new TSpace();
        }
        return sl;
    }

    public synchronized void nrd  (Object key) {
        while (rdp (key) != null) {
            try {
                this.wait (NRD_RESOLUTION);
            } catch (InterruptedException ignored) { }
        }
    }
    public synchronized Object nrd  (Object key, long timeout) {
        Object obj;
        long now = System.currentTimeMillis();
        long end = now + timeout;
        while ((obj = rdp (key)) != null &&
                (now = System.currentTimeMillis()) < end)
        {
            try {
                this.wait (Math.min(NRD_RESOLUTION, end - now));
            } catch (InterruptedException ignored) { }
        }
        return obj;
    }

    public JChannel getChannel() {
        return channel;
    }
}

