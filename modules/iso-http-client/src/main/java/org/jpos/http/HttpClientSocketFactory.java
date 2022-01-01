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

import java.io.IOException;
import java.net.Socket;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http2.client.HTTP2Client;
import org.eclipse.jetty.http2.client.http.HttpClientTransportOverHTTP2;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.jpos.iso.ISOClientSocketFactory;
import org.jpos.iso.ISOException;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.SimpleConfiguration;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogSource;


/**
 * <code>HttpClientSocketFactory</code> is used by BaseChannel 
 * in order to provide hooks for ISO traffic over HTTP.
 * Used in conjunction with module iso-http-qrest or iso-http-servlet
 * on the server side.
 *
 * @version $Revision$ $Date$
 * @author  Ozzy Espaillat
 *
 */
public class HttpClientSocketFactory extends SimpleLogSource 
implements ISOClientSocketFactory, Configurable {
    enum HttpType {HTTP, HTTP2};
    static final int DEFAULT_SENDER_THREADS=5;
    
    private static HttpClientSocketFactory DEFAULT;
    
    public static synchronized HttpClientSocketFactory getDefaultInstance() {
        if (DEFAULT == null) {
            DEFAULT = new HttpClientSocketFactory(true);
        }
        return DEFAULT;        
    }
    
    private Map<HttpType, HttpClient> httpClients = new HashMap<HttpType, HttpClient>();
    
    private Configuration cfg;

    boolean failOnError = false;
    int senderThreads = DEFAULT_SENDER_THREADS;
    private int maxSendPerRequest = 1;
    
    String sslProviderClass = null;    
    private String trustStore=null;
    private String trustStorePassword=null;
    private String keyStore=null;
    private String password=null;
    private String keyPassword=null;
    private boolean serverAuthNeeded=false;
    private String[] enabledCipherSuites;
    private String[] enabledProtocols;

    public void setKeyStore(String keyStore){
        this.keyStore=keyStore;  
    }

    public void setPassword(String password){
        this.password=password;  
    }

    public void setKeyPassword(String keyPassword){
        this.keyPassword=keyPassword;  
    }

    public void setServerAuthNeeded(boolean serverAuthNeeded){
        this.serverAuthNeeded=serverAuthNeeded;  
    }

    public int getMaxSendPerRequest() {
        return maxSendPerRequest;
    }

    public void setMaxSendPerRequest(int maxSendPerRequest) {
        this.maxSendPerRequest = maxSendPerRequest;
    }

    private synchronized HttpClient getHttpClient(HttpType type) {
        HttpClient httpClient = httpClients.get(type);
        if (httpClient == null) {
            LogEvent evt = new LogEvent (this, "info");
            // Instantiate and configure the SslContextFactory
            SslContextFactory sslContextFactory = new SslContextFactory(!serverAuthNeeded);
            sslContextFactory.setExcludeCipherSuites("^.*_(MD5|SHA1)$");
            
            if (keyStore != null && keyStore.length() > 0) {
                sslContextFactory.setKeyStorePath(keyStore);
                evt.addMessage("keystore", keyStore);
                sslContextFactory.setKeyStorePassword(password);
                if (keyPassword != null && keyPassword.length() > 0) {
                    sslContextFactory.setKeyManagerPassword(keyPassword);
                }
            }
            if (trustStore != null && trustStore.length() > 0) {
                sslContextFactory.setTrustStorePath(trustStore);
                sslContextFactory.setTrustStorePassword(trustStorePassword);
            }
            if (enabledCipherSuites != null && enabledCipherSuites.length > 0) {
                sslContextFactory.setIncludeCipherSuites(enabledCipherSuites);
                evt.addMessage("cipher", Arrays.toString(enabledCipherSuites));
            }
            if (enabledProtocols != null && enabledProtocols.length > 0) {
                sslContextFactory.setIncludeProtocols(enabledProtocols);
                evt.addMessage("protocol", Arrays.toString(enabledProtocols));
            }
            
            try {
                if (sslProviderClass != null) {
                    Provider sslProviderName = (Provider) Class.forName(sslProviderClass).newInstance();
                    if (Security.getProvider(sslProviderName.getName()) != null) {
                        Security.addProvider(sslProviderName);
                    }
                    evt.addMessage("Using " + sslProviderName.getName() + " Provider.");
                    sslContextFactory.setProvider(sslProviderName.getName());
                }
            } catch (Throwable e) {
                evt.addMessage("error", "Failed to load OpenSSLProvider, ignoring: " + e.toString());
            }

            switch (type) {
            case HTTP2 : 
                HTTP2Client h2Client = new HTTP2Client();
                h2Client.setSelectors(1);
                h2Client.addBean(sslContextFactory);
                
                HttpClientTransportOverHTTP2 transport = new HttpClientTransportOverHTTP2(h2Client);

                

                // Instantiate HttpClient with the SslContextFactory
                httpClient = new HttpClient(transport, sslContextFactory);
                evt.addMessage("Using HTTP2 transport!");
                
            break;
            case HTTP :
                // Instantiate HttpClient with the SslContextFactory
                httpClient = new HttpClient(sslContextFactory);                
                evt.addMessage("Using HTTP1.1 transport!");
                break;
            }

            // Configure HttpClient, for example:
            httpClient.setFollowRedirects(false);
            
            //httpClient.setMaxConnectionsPerDestination(senderThreads*2);
            
            // Start HttpClient
            try {
                httpClient.start();
            } catch (Exception e) {
                evt.addMessage("error", "Could not start http client");
                evt.addMessage(e);
            }
            Logger.log(evt);
            
            httpClients.put(type, httpClient);
        } else if (!httpClient.isRunning()) {
            // Start HttpClient
            try {
                httpClient.start();
            } catch (Exception e) {
                LogEvent evt = new LogEvent (this, "warn");
                evt.addMessage("error", "Could not start http client");
                evt.addMessage(e);
                Logger.log(evt);
            }
        }
        try {
            while(!httpClient.isStarted() && !httpClient.isFailed()) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {}
        
        return httpClient;
    }
    
    @Override
    public void finalize() {
        for(HttpClient httpClient: httpClients.values()) {
            if (httpClient != null) {
                try {
                    httpClient.stop();
                } catch (Exception e) {
                }
            }
        }
    }

    
    public HttpClientSocketFactory() {
        this(false);
    }
    
    public HttpClientSocketFactory(boolean failOnError) {
        this(failOnError, DEFAULT_SENDER_THREADS);
    }
    
    public HttpClientSocketFactory(int senderThreads) {
        this(false, senderThreads);
    }

    public HttpClientSocketFactory(boolean failOnError, int senderThreads) {
        super();
        try {
            setConfiguration(new SimpleConfiguration());
        } catch (ConfigurationException e) {
        }

        this.senderThreads = senderThreads;
        this.failOnError = failOnError;
    }
    
    

    @Override
    public Socket createSocket(String host, int port) throws IOException, ISOException {
        LogEvent evt = new LogEvent (this, "info");
        Socket s = null;

        evt.addMessage("connect");
        if (host.toLowerCase().startsWith("http")) {
            HttpType type;
            if (host.startsWith("http2")) {
                type = HttpType.HTTP2;
                host = "http" + host.substring("http2".length());
            } else {
                type = HttpType.HTTP;
            }
            if (host.endsWith("/iso")) {
                host = host + "/" + port;
            } else if (host.endsWith("/iso/")) {
                host = host + port;
            }
            evt.addMessage("type", type.name());
            evt.addMessage("host", host);
            evt.addMessage("senders", Integer.toString(senderThreads));
            evt.addMessage("failOnError", Boolean.toString(failOnError));
            
            HttpSocketWrapper httpSocket = new HttpSocketWrapper(this, getHttpClient(type), host, senderThreads, failOnError);
            httpSocket.setMaxSendPerRequest(maxSendPerRequest);
            s = httpSocket;
        } else {
            evt.addMessage("type", "socket");
            evt.addMessage("host", host);
            evt.addMessage("port", Integer.toString(port));
            
            s = new Socket(host, port);
        }
        Logger.log(evt);
        
        return s;
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
        failOnError = cfg.getBoolean("failOnError", false);
        maxSendPerRequest = cfg.getInt("maxSendPerRequest", 1);
        senderThreads = cfg.getInt("senderThreads", DEFAULT_SENDER_THREADS);
        sslProviderClass = cfg.get("sslProvider", null);
        serverAuthNeeded = cfg.getBoolean("serverauth");

        trustStore = cfg.get("truststore", System.getProperty("javax.net.ssl.trustStore"));
        trustStorePassword = cfg.get("truststorepassword", System.getProperty("javax.net.ssl.trustStorePassword", "changeit"));
        
        keyStore = cfg.get("keystore", System.getProperty("javax.net.ssl.keyStore"));
        String passwordProp = cfg.get("storepasswordprop", "javax.net.ssl.keyStorePassword");
        password = cfg.get("storepassword", System.getProperty(passwordProp));
        
        String keyPaswwordProp = cfg.get("keypassword", "jpos.ssl.keypass");
        keyPassword = cfg.get("keypassword", System.getProperty(keyPaswwordProp));
        
        enabledCipherSuites = cfg.getAll("addEnabledCipherSuite");
        enabledProtocols = cfg.getAll("addEnabledProtocol");
    }
    
    public Configuration getConfiguration() {
        return cfg;
    }
    
    public static void main(String args[]) throws Exception {
        HttpClientSocketFactory f = HttpClientSocketFactory.getDefaultInstance();
        f.sslProviderClass = null;
        HttpClient c = f.getHttpClient(HttpType.HTTP);
        System.out.println(c.GET(args[0]).getContentAsString());
        c.stop();
    }

}
