/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
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

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.AbortParticipant;
import org.jpos.util.Log;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.transaction.Context;


@SuppressWarnings("unused")
public class HttpQuery extends Log implements AbortParticipant, Configurable {
    private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
    private static final int DEFAULT_TIMEOUT = 15000;

    private Configuration cfg;
    private String url;
    private String contentType;
    private Header[] httpHeaders;
    private boolean responseOnError;
    private int connectTimeout;                     // timeout waiting for connection
    private int timeout;                            // timeout waiting for HTTP response on socket

    private String httpClientKey;                   // a key into the Context to store a reference to the HTTP Client

    // Context variable names
    private String urlName;
    private String paramsName;
    private String headersName;
    private String methodName;
    private String requestName;
    private String responseName;
    private String statusName;
    private String contentTypeName;

    private String basicAuthenticationName;

    public HttpQuery () {
        super();

    }
    public int prepare (long id, Serializable o) {
        Context ctx = (Context) o;

        HttpRequestBase httpRequest = getHttpRequest(ctx);
        if (httpRequest == null)
            return FAIL;            // probably wrong http method; abort early and avoid NPEs later


        addHeaders(ctx, httpRequest);

        httpRequest.setConfig(RequestConfig.custom().
            setConnectTimeout(connectTimeout).
            setSocketTimeout(timeout).
            build());


        CloseableHttpAsyncClient client;
        String basicAuth = ctx.get(basicAuthenticationName);
        if (basicAuth != null && basicAuth.contains(":")) {
            CredentialsProvider credsProvider = null;
            String[] credentials = basicAuth.split(":");
            credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(AuthScope.ANY,
              new UsernamePasswordCredentials(credentials[0], credentials[1]));
            client = HttpAsyncClients.custom().setDefaultCredentialsProvider(credsProvider).build();
        } else {
            client = HttpAsyncClients.createDefault();
        }

        ctx.put(httpClientKey, client);     // store reference, that should be closed in abort() or commit()

        client.start();
        client.execute(httpRequest, new FutureCallback<HttpResponse>() {
            @Override
            public void completed(HttpResponse result) {
                ctx.log (result.getStatusLine());

                int sc = result.getStatusLine().getStatusCode();

                // we always include the response body on success and check responseOnError for failed requests
                boolean includeResponse= (sc == HttpStatus.SC_CREATED) || (sc == HttpStatus.SC_OK) || responseOnError;
                if (includeResponse) {
                    try {
                        ctx.put (responseName, EntityUtils.toString(result.getEntity()));
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

        return PREPARED | PAUSE | READONLY;
    }

    public int prepareForAbort (long id, Serializable o) {
        if (cfg.getBoolean ("on-abort", false))
            return prepare (id, o);
        return PREPARED;
    }

    @Override
    public void commit(long id, Serializable context) {
        Context ctx= (Context)context;
        CloseableHttpAsyncClient c= ctx.get(httpClientKey);
        if (c != null)
            closeClient(ctx, c);
    }

    @Override
    public void abort(long id, Serializable context) {
        Context ctx= (Context)context;
        CloseableHttpAsyncClient c= ctx.get(httpClientKey);
        if (c != null)
            closeClient(ctx, c);
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
        methodName = cfg.get("methodName", "HTTP_METHOD");
        paramsName = cfg.get ("paramsName", "HTTP_PARAMS");
        requestName = cfg.get ("requestName", "HTTP_REQUEST");
        contentTypeName = cfg.get("contentTypeName", "HTTP_CONTENT_TYPE");
        responseName = cfg.get("responseName", "HTTP_RESPONSE");
        statusName = cfg.get("responseStatusName", "HTTP_STATUS");

        basicAuthenticationName  = cfg.get("basicAuthenticationdName", ".HTTP_BASIC_AUTHENTICATION");

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

        // Other instances of HttpQuery in this TransactionManager will have a different this.toString.
        // All transactions going through *this* instance of HttpQuery will have the same key, but
        // they will be stored in different Context objects. No collisions or overwrites should happen.
        httpClientKey= "HTTP_CLIENT_REF_"+this.toString();
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

    private void closeClient(Context ctx, CloseableHttpAsyncClient client) {
        try {
            client.close();
        } catch (IOException e) {
            ctx.log(e);
        }
    }
}
