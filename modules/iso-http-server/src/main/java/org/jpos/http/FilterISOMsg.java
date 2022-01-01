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

package org.jpos.http;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.BaseChannel;
import org.jpos.iso.HttpWrapperUtil;
import org.jpos.iso.ISOChannelWrapper;
import org.jpos.iso.ISOFilter;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOServer;
import org.jpos.q2.QFactory;
import org.jpos.q2.iso.ChannelAdaptor;
import org.jpos.q2.iso.QServer;
import org.jpos.util.NameRegistrar;
import org.jpos.util.NameRegistrar.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilterISOMsg {
    private static final Logger logger = LoggerFactory.getLogger(FilterISOMsg.class);

    private static final int MIN_TIMEOUT = 5*000; // 5s min timeout

    Collection<ISORequestListener> requestListeners = new ArrayList<ISORequestListener>();
    ISOChannelWrapper channel = new ISOChannelWrapper();
    String name;
    int port;

    public FilterISOMsg(String serverName) {
        this.name = serverName;
    }

    public FilterISOMsg(BaseChannel isoChannel) {
        this(isoChannel, null);
    }

    public FilterISOMsg(BaseChannel isoChannel, Collection<ISORequestListener> requestListeners) {
        configure(isoChannel, requestListeners);
    }

    public void configure(BaseChannel isoChannel, Collection<ISORequestListener> requestListeners) {
        channel.setChannel(isoChannel);
        if (requestListeners != null) {
            this.requestListeners = requestListeners;
        }
        if (name == null) {
            name = isoChannel.getName();
        }
        if (isoChannel.getPort() > 0) {
            port = isoChannel.getPort();
        }
    }
    
    public ISOResponse process(byte[] inMsg, ClientRequestDetails requestDetails) {
        requestDetails.setLength(inMsg.length);
        ByteArrayInputStream in = new ByteArrayInputStream(inMsg);
        return process(in, requestDetails);
    }

    public ISOResponse process(InputStream in, ClientRequestDetails requestDetails) {
        ISOResponse res = null;
        BaseChannel c = null;
        try {
            initialize();
            ByteArrayOutputStream out = new ByteArrayOutputStream(512);
            c = channel.getChannel(in, out, requestDetails);
            List<ISOMsg> mList = new ArrayList<ISOMsg>();
            do {
                ISOMsg m = c.receive();
                mList.add(m);
            } while (HttpWrapperUtil.hasMoreData(c));
            logger.debug("Received: expected {} bytes with {} messages.", requestDetails.length, mList.size());
            res = new ISOResponse(c, mList, out);
            for (ISOMsg m : mList) {
                m.setSource(res);
                processListeners(m);
            }
        } catch (Exception e) {
            logger.error("Failed to process txn", e);
        }

        res.getResponse(requestDetails.getTimeout());

        if (c != null) {
            try {
                c.disconnect();
            } catch (IOException ignore) {
            }
        }

        return res;
    }

    public void processListeners(ISOMsg request) {
        for (ISORequestListener listener : requestListeners) {
            if (listener.process(request.getSource(), request)) {
                break;
            }
        }
    }

    private Collection<ISORequestListener> getListeners(QServer server) throws ConfigurationException {
        QFactory factory = server.getFactory();
        @SuppressWarnings("rawtypes")
        Iterator iter = server.getPersist().getChildren("request-listener").iterator();
        Collection<ISORequestListener> listeners = new ArrayList<ISORequestListener>();
        while (iter.hasNext()) {
            Element l = (Element) iter.next();
            ISORequestListener listener = (ISORequestListener) factory.newInstance(l.getAttributeValue("class"));
            factory.setLogger(listener, l);
            factory.setConfiguration(listener, l);
            listeners.add(listener);
        }
        return listeners;
    }

    private BaseChannel getChannel(QServer server) throws ConfigurationException {
        Element persist = server.getPersist();
        Element e = persist.getChild("channel");
        if (e == null) {
            throw new ConfigurationException("channel element missing");
        }

        ChannelAdaptor adaptor = new ChannelAdaptor();
        BaseChannel channel = (BaseChannel) adaptor.newChannel(e, server.getFactory());
        if (channel == null) {
            throw new ConfigurationException("Could not instanciate ISOChannel");
        }
        return channel;
    }

    public synchronized void initialize() throws ConfigurationException, NotFoundException {
        if (getPackager() == null && name != null) {
            Object entry = NameRegistrar.getIfExists(name);
            if (entry instanceof QServer) {
                QServer server = (QServer) entry;
                configure(getChannel(server), getListeners(server));
                setPort(server.getPort());
            }
            if (entry instanceof ISOServer) {
                ISOServer server = (ISOServer) entry;
                HttpWrapperUtil.configureFilter(this, server);
                if (getPackager() == null) {
                    BaseChannel c = (BaseChannel) server.getISOChannel(":last");
                    if (c != null) {
                        channel.setChannel((BaseChannel) c.clone());
                    }
                }
                setPort(server.getPort());
            }
        }
        if (getPort() <= 0 && name != null) {
            Object entry = NameRegistrar.getIfExists(name);
            if (entry instanceof QServer) {
                QServer server = (QServer) entry;
                setPort(server.getPort());
            }
            if (entry instanceof ISOServer) {
                ISOServer server = (ISOServer) entry;
                setPort(server.getPort());
            }
        }
    }

    public int getTimeout() {
        return Math.max(channel.getChannel().getTimeout(), MIN_TIMEOUT);
    }

    public ISOPackager getPackager() {
        return channel.getPackager();
    }

    public void setPackager(ISOPackager clientPackager) {
        channel.setPackager(clientPackager);
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }
    
    public Collection<ISOFilter> getIncomingFilters() {
        return channel.getChannel().getIncomingFilters();
    }
    
    public Collection<ISOFilter> getOutgoingFilters() {
        return channel.getChannel().getOutgoingFilters();
    }

}
