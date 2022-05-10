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

package org.jpos.http.client;

import static org.jpos.util.Logger.log;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateExpiredException;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import org.jpos.core.ConfigurationException;
import org.jpos.transaction.AbortParticipant;
import org.jpos.util.Destroyable;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.transaction.Context;


@SuppressWarnings("unused")
public class HttpQuery extends Log implements AbortParticipant, Configurable, Destroyable {
    private static final String DEFAULT_MAX_CONNECTIONS = "25";         // overridable by sys prop http.maxConnections, or with cfg "maxConnections"

    private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
    private static final int DEFAULT_TIMEOUT = 15000;

    private Configuration cfg;
    private String url;
    private String contentType;
    private Header[] httpHeaders;
    private boolean responseOnError;
    private boolean preemptiveAuth= false;          // Preemptive Basic Authentication (send on first request, false by default)
    private int connectTimeout;                     // timeout waiting for connection
    private int timeout;                            // timeout waiting for HTTP response on socket

    // Context variable names
    private String urlName;
    private String paramsName;
    private String headersName;
    private String methodName;
    private String requestName;
    private String responseName;
    private String statusName;
    private String contentTypeName;
    private String trustAllCertsName;
    private String basicAuthenticationName;
    private RedirectStrategy redirectStrategy;
    private boolean ignoreNullRequest;
    private String httpVersionName;

    // Shared clients for the instance.
    // Created at configuration time; destroyed when this participant is destroyed.
    private CloseableHttpAsyncClient httpClient = null;
    // This client will be used when certificate validation bypassing is needed
    private CloseableHttpAsyncClient unsecureHttpClient = null;

    public HttpQuery () {
        super();
    }

    public int prepare (long id, Serializable o) {
        Context ctx = (Context) o;

        HttpRequestBase httpRequest = getHttpRequest(ctx);
        if (httpRequest == null)
            return ignoreNullRequest ? PREPARED | NO_JOIN | READONLY : FAIL;

        addHeaders(ctx, httpRequest);

        //set the http protocol version, default to version 1.1
        //config example <property name="httpVersionName" value="1.1"/>
        HttpVersion definedVersion = null;
        String httpVersion = getVersion(ctx);
        if(httpVersion != null && httpVersion.length() > 0) {
            String[] majmin = httpVersion.split("\\.");                 // split into major and minor version numbers
            definedVersion = new HttpVersion(Integer.parseInt(majmin[0]),
                                             majmin.length > 1 ? Integer.parseInt(majmin[1]) : 0);            // default to minor 0 if it can't be split
        }
        httpRequest.setProtocolVersion((definedVersion != null) ? definedVersion : HttpVersion.HTTP_1_1);     // default to HTTP/1.1

        httpRequest.setConfig(RequestConfig.custom().
            setConnectTimeout(connectTimeout).
            setSocketTimeout(timeout).
            build());

        HttpClientContext httpCtx= HttpClientContext.create();                              // per-request http context

        String basicAuth = ctx.get(basicAuthenticationName);
        if (basicAuth != null && basicAuth.contains(":")) {
            String[] credentials = basicAuth.split(":");
            CredentialsProvider credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(AuthScope.ANY,
                                         new UsernamePasswordCredentials(credentials[0], credentials[1]));
            httpCtx.setCredentialsProvider(credsProvider);

            // NOTE: The Apache HTTP client does not do preemptive authentication out of the box.
            // Therefore, it will normally send a non-authenticated request first, and if the server
            // requires authentication (status code 401, etc) then it will send a second request with
            // the credentials.
            // For preemptive authentication, an AuthCache needs to be configured.
            // Ref: https://hc.apache.org/httpcomponents-client-4.5.x/tutorial/html/authentication.html
            if (preemptiveAuth) {
                URI uri= httpRequest.getURI();
                AuthCache authCache= new BasicAuthCache();
                authCache.put(new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), new BasicScheme());
                httpCtx.setAuthCache(authCache);
            }
        }

        boolean trustAllCerts = ctx.getString(trustAllCertsName, "false").equals("true");
        getHttpClient(trustAllCerts).execute(httpRequest, httpCtx, new FutureCallback<HttpResponse>() {
            @Override
            public void completed(HttpResponse result) {
                ctx.log (result.getStatusLine());

                int sc = result.getStatusLine().getStatusCode();

                // we always include the response body on success and check responseOnError for failed requests
                boolean includeResponse= (sc == HttpStatus.SC_CREATED) || (sc == HttpStatus.SC_OK) || responseOnError;
                if (includeResponse) {
                    try {
                        if (null != result.getEntity()) {
                            ctx.put(responseName, EntityUtils.toString(result.getEntity()));
                        }
                    } catch (IOException e) {
                        ctx.log (e);
                    }
                }

                ctx.put (statusName, sc); // status has to be the last entry because client might be waiting on it
                ctx.resume();
            }

            @Override
            public void failed(Exception ex) {
                // Common cases with current Apache impl; just logged but not handled here:
                //      java.net.UnknownHostException: mydomain.com: nodename nor servname provided, or not known
                //      java.net.ConnectException: Connection refused
                //      java.net.ConnectException: Timeout connecting to [mydomain.com/xxx.xxx.xxx.xxx:ppp]
                //      java.net.SocketTimeoutException: ... (when no HTTP response)
                ctx.log(ex);
                ctx.resume();
            }

            @Override
            public void cancelled() {
                ctx.resume();
            }
        });

        return PREPARED | PAUSE | NO_JOIN | READONLY;
    }

    public int prepareForAbort (long id, Serializable o) {
        if (cfg.getBoolean ("on-abort", false))
            return prepare (id, o);
        return PREPARED;
    }

    @Override
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
        url = cfg.get("url");
        contentType = cfg.get("contentType", "application/json");
        responseOnError= cfg.getBoolean("responseBodyOnError", false);    // do we include a response body for failed requests? default: false
        connectTimeout= cfg.getInt("connect-timeout", DEFAULT_CONNECT_TIMEOUT);
        timeout= cfg.getInt("timeout", DEFAULT_TIMEOUT);

        urlName = cfg.get("urlName", "HTTP_URL");
        httpVersionName = cfg.get("httpVersionName", "HTTP_VERSION");
        methodName = cfg.get("methodName", "HTTP_METHOD");
        paramsName = cfg.get ("paramsName", "HTTP_PARAMS");
        requestName = cfg.get ("requestName", "HTTP_REQUEST");
        contentTypeName = cfg.get("contentTypeName", "HTTP_CONTENT_TYPE");
        responseName = cfg.get("responseName", "HTTP_RESPONSE");
        statusName = cfg.get("responseStatusName", "HTTP_STATUS");
        ignoreNullRequest = cfg.getBoolean("ignoreNullRequest", false);

        preemptiveAuth = cfg.getBoolean("preemptiveAuth", preemptiveAuth);
        basicAuthenticationName = cfg.get("basicAuthenticationName", ".HTTP_BASIC_AUTHENTICATION");

        trustAllCertsName = cfg.get("trustAllCerts", "HTTP_TRUST_ALL_CERTS");

        // ctx name under which extra http headers could exist at runtime
        // the object could be a List<String> or String[] (in the "name:value" format)
        // or a Map<String,String>
        headersName = cfg.get("headersName", "HTTP_HEADERS");

        // hardcoded headers configured for this participant (in the "name:value" format)
        String[] headers= cfg.getAll("httpHeader");
        httpHeaders= new Header[headers.length];
        for (int i= 0; i < headers.length; i++) {
            int colonPos= headers[i].indexOf(':');
            if (colonPos < 0)
                throw new ConfigurationException("Bad HTTP header '"+headers[i]+"' (needs a colon)");

            httpHeaders[i]= new BasicHeader(headers[i].substring(0, colonPos),      // header name
                                            headers[i].substring(colonPos+1));      // header value
        }

        String redirProp = cfg.get("redirect-strategy", "default");
        if ("default".equals(redirProp))
            redirectStrategy= DefaultRedirectStrategy.INSTANCE;
        else if ("lax".equals(redirProp))
            redirectStrategy= LaxRedirectStrategy.INSTANCE;
        else
            throw new ConfigurationException("'redirect-strategy' must be 'lax' or 'default'");


        String maxConn = System.getProperty("http.maxConnections");
        if (maxConn == null || maxConn.trim().isEmpty()) {
            String maxConnCfg = cfg.get("maxConnections", DEFAULT_MAX_CONNECTIONS);
            maxConn = maxConnCfg.trim();
            System.setProperty("http.maxConnections", maxConn);
        }
        try { Integer.parseInt(maxConn); }
        catch (Exception e) {
            throw new ConfigurationException("Bad value for maxConnections: "+maxConn);
        }
    }


    /**
        Method is synchronized against this instance of HttpQuery, because the instance of
        the CloseableHttpAsyncClient is *lazily* created upon first request, and only one
        should be created and shared by all threads.
    */
    public synchronized CloseableHttpAsyncClient getHttpClient(boolean trustAllCerts) {
        if (trustAllCerts) {
            if (unsecureHttpClient == null) {
                setUnsecureHttpClient(getClientBuilder(true).build());
                unsecureHttpClient.start();
            }
            return unsecureHttpClient;
        } else if (httpClient == null) {
            setHttpClient(getClientBuilder(false).build());
            httpClient.start();
        }
        return httpClient;
    }

    public void setHttpClient(CloseableHttpAsyncClient httpClient) {
        this.httpClient = httpClient;
    }

    public void setUnsecureHttpClient(CloseableHttpAsyncClient httpClient) {
        this.unsecureHttpClient = httpClient;
    }

    protected HttpAsyncClientBuilder getClientBuilder(boolean trustAllCerts) {
        HttpAsyncClientBuilder builder = HttpAsyncClients.custom().useSystemProperties()
                .setRedirectStrategy(redirectStrategy);
        if (trustAllCerts) {
            disableSSLVerification(builder);
        }

        return builder;
    }

    private HttpAsyncClientBuilder disableSSLVerification(HttpAsyncClientBuilder builder) {
        TrustManager[] wrappedTrustManagers = new TrustManager[] {
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    log(new LogEvent(certs.toString() + " " + authType));
                }
            }
        };

        SSLContext sc;
        try {
            sc = SSLContext.getInstance("TLS");
            sc.init(null, wrappedTrustManagers, new SecureRandom());
            return builder.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).setSSLContext(sc);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            LogEvent evt = new LogEvent(this, "warn");
            evt.addMessage(e);
            log(evt);
            return builder;
        }
    }

    private String getURL (Context ctx) {
        StringBuilder sb = new StringBuilder (
            ctx.getString (urlName, url)
        );
        String params = ctx.getString (paramsName, "");
        if (params.length() > 0) {
            sb.append ('?');
            sb.append (params);
        }
        return sb.toString();
    }

    private HttpRequestBase getHttpRequest(Context ctx) {
        String url = getURL(ctx);
        String payload;
        switch (ctx.getString(methodName)) {
            case "POST":
                HttpPost post = new HttpPost(url);
                payload = ctx.getString(requestName);
                if (payload != null)
                    post.setEntity(new StringEntity(payload, getContentType(ctx)));
                return post;
            case "PUT":
                HttpPut put = new HttpPut(url);
                payload = ctx.getString(requestName);
                if (payload != null)
                    put.setEntity(new StringEntity(payload, getContentType(ctx)));
                return put;
            case "GET":
                return new HttpGet(url);
        }
        ctx.log ("Invalid request method");
        return null;
    }

    private String getVersion(Context ctx) {
        return ctx.getString(httpVersionName);
    }

    private ContentType getContentType (Context ctx) {
        return cfg.getBoolean("no-charset") ?
          ContentType.create(ctx.get(contentTypeName, contentType)) :
          ContentType.create(ctx.get(contentTypeName, contentType), Consts.UTF_8);
    }

    @SuppressWarnings("unchecked")
    private void addHeaders(Context ctx, HttpUriRequest req) {
        // first add the ones from the cfg
        req.setHeaders(httpHeaders);

        // now the ones in the ctx (possibly overwriting some of the above)
        Object hObj= ctx.get(headersName);
        if (hObj != null) {

            // case Map<String,String>
            if (hObj instanceof Map) {
                for (Map.Entry<String,Object> ent : ((Map<String,Object>)hObj).entrySet()) {
                    req.setHeader(ent.getKey(), ent.getValue().toString());
                }
                return;
            }

            // cases List<String> and String[]
            List<String> hList;
            if (hObj instanceof String[])
                hList= Arrays.asList((String[])hObj);
            else if (hObj instanceof List)
                hList= (List<String>)hObj;
            else {
                hList= new ArrayList<>(0);  // dummy
                ctx.log("Wrong class for Context entry HTTP_HEADERS ("+headersName+"): "+hObj.getClass().getName()+". "+
                        "(one of these expected: String[], List<String>, Map<String,String>)" );
            }

            for (String hStr : hList) {
                int colonPos= hStr.indexOf(':');
                if (colonPos < 0) {
                    ctx.log("Bad HTTP header '"+hStr+"' (needs colon; ignoring)");
                    continue;   // ignoring this bad header
                }

                req.setHeader(hStr.substring(0, colonPos),      // header name
                              hStr.substring(colonPos+1));      // header value
            }
        }
    } // addHeaders

    @Override
    public void destroy() {
        httpClient = destroyClient(httpClient);
        unsecureHttpClient = destroyClient(unsecureHttpClient);
    }

    private CloseableHttpAsyncClient destroyClient (CloseableHttpAsyncClient client) {
        if (client != null && client.isRunning()) {
            try {
                client.close();
            } catch (IOException e) {
                warn(e);
            }
        }
        return null;
    }
}
