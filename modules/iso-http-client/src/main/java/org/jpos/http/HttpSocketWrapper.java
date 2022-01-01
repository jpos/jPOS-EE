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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.BytesContentProvider;
import org.eclipse.jetty.client.util.FutureResponseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * Wrapper around the Socket interface to connect via HTTP.
 *
 */
public class HttpSocketWrapper extends Socket {
    private static final Logger logger = LoggerFactory.getLogger(HttpSocketWrapper.class);
    
    HttpClientSocketFactory httpClientSocketFactory;
    URI host;
    private OutputStream out;
    private PipedInputStream in;
    private PipedOutputStream pOut;
    private boolean isConnected = false;
    private boolean closeOnError;
    
    private LinkedBlockingQueue<byte[]> queue;
    private Thread t[];
    
    private int timeout = 0;
    private int maxSendPerRequest = 1;
    private int clients = 5;

    
    public HttpSocketWrapper(HttpClientSocketFactory httpClientSocketFactory, HttpClient http, String hostStr, int clients, boolean failOnError) throws IOException {
        this.httpClientSocketFactory = httpClientSocketFactory;
        this.host = URI.create(hostStr);
        
        this.clients = clients;
        this.closeOnError = failOnError;
        isConnected = true;

        in = new PipedInputStream(512*clients);
        pOut = new PipedOutputStream(in);
        
        queue = new LinkedBlockingQueue<byte[]>(clients);
        Runnable job = new Runnable() {
            @Override
            public void run() {
                List<byte[]> list = new ArrayList<byte[]>();
                while (isConnected()) {
                    byte data[];
                    try {
                        data = queue.poll(10, TimeUnit.SECONDS);
                        if (data == null || data.length == 0) {
                            continue;
                        }
                        list.add(data);
                        if (getMaxSendPerRequest() > 1) {
                            queue.drainTo(list, getMaxSendPerRequest()-1);
                        }
                    } catch (InterruptedException e1) {
                        logger.warn("Thread interrupted while waiting on queue.", e1);
                    }
                    logger.debug("Connecting to {} with {} messages.", host, list.size());
                    try {
                        Request request = http.POST(host).content(new BytesContentProvider(list.toArray(new byte[0][0])));
                        FutureResponseListener listener = new FutureResponseListener(request);
                        request.send(listener); // Asynchronous send
                        ContentResponse r = listener.get(getWaitTime(), TimeUnit.SECONDS); // Timed block
                        logger.debug("Received Response: {}", r);
                        if(r.getStatus() == 200) {
                            byte responseData[] = r.getContent();
                            if (responseData != null) {
                                pOut.write(responseData);
                                synchronized(in) {
                                    in.notifyAll();
                                }
                            }
                        } else {
                            try {
                                if (HttpSocketWrapper.this.closeOnError) {
                                    logger.warn("Failed to get response, clossing socket");
                                    HttpSocketWrapper.this.close();
                                }
                            } catch (IOException e) {
                                logger.warn("Problem while trying to close", e);
                            }
                            
                        }
                    } catch (Exception e) {
                        logger.warn("Failed to execute request.", e);
                        try {
                            if (HttpSocketWrapper.this.closeOnError) {
                                logger.warn("Failed to get response, clossing socket");
                                HttpSocketWrapper.this.close();
                            }
                        } catch (IOException c) {
                            logger.warn("Problem while trying to close", c);
                        }
                    }
                    list.clear();
                }
            }
            };
        t = new Thread[clients];    
        for (int i = 0; i < clients; i++) {
            t[i] = new Thread(job, "HttpClient-" + i);
            t[i].start();
        }
        out = new ByteArrayOutputStream(256) {

            @Override
            public void flush() throws IOException {
                super.flush();
                if (this.size() > 0) {
                    synchronized (this) {
                        byte data[] = this.toByteArray();
                        this.reset();
                        try {
                            queue.put(data);
                        } catch (InterruptedException e) {
                            throw new IOException(e);
                        }
                    }
                }
            }
        };
    }
    
    int getWaitTime() {
        return (timeout > 0) ? timeout * 2 : 30000;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public InputStream getInputStream() {
        return in;
    }

    @Override
    public OutputStream getOutputStream() {
        return out;
    }

    @Override
    public InetAddress getInetAddress() {
        try {
            return InetAddress.getByName(host.getHost());
        } catch (Exception ignore) {}
        return InetAddress.getLoopbackAddress();
    }

    @Override
    public int getPort() {
        return host.getPort();
    }

    @Override
    public void setSoLinger(boolean on, int linger) throws SocketException {
    }

    @Override
    public synchronized void setSoTimeout(int timeout) throws SocketException {
        this.timeout = timeout;
    }
    
    @Override
    public synchronized int getSoTimeout() {
        return timeout;
    }

    @Override
    public void setKeepAlive(boolean on) throws SocketException {
    }

    @Override
    public synchronized void close() throws IOException {
        this.isConnected = false;
        logger.debug("Closing socket.");
        for(int i = 0; i < clients; i++) {
            try {
                queue.offer(new byte[0], 10, TimeUnit.SECONDS);
            } catch (InterruptedException ignore) {}
        }
        if (pOut != null) {
            pOut.close();
        }
        pOut = null;
        if (in != null) {
            in.close();
        }
        in = null;
        if (out != null)
            out.close();
        out = null;
        super.close();
    }

    public int getMaxSendPerRequest() {
        return maxSendPerRequest;
    }

    public void setMaxSendPerRequest(int maxSendPerRequest) {
        this.maxSendPerRequest = maxSendPerRequest;
    }
    
}
