/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import org.apache.hc.client5.http.auth.*;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.DefaultRedirectStrategy;
import org.apache.hc.client5.http.impl.LaxRedirectStrategy;
import org.apache.hc.client5.http.impl.auth.*;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManager;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManagerBuilder;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.client5.http.protocol.RedirectStrategy;
import org.apache.hc.client5.http.ssl.ClientTlsStrategyBuilder;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.async.methods.*;

import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.nio.ssl.TlsStrategy;
import org.apache.hc.core5.util.Timeout;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;
import org.jpos.util.Destroyable;
import org.jpos.util.Log;

import javax.net.ssl.*;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.function.Consumer;

/**
 * jPOS-EE HttpQuery upgraded to Apache HttpComponents 5.5.
 * Behaviour and public surface remain identical to the original 4.x implementation.
 */
@SuppressWarnings("unused")
public class HttpQuery extends Log implements AbortParticipant, Configurable, Destroyable {
    /* ------------------------------------------------------------- constants */
    private static final String DEFAULT_MAX_CONNECTIONS = "25";
    private static final int    DEFAULT_CONNECT_TIMEOUT = 10_000; // ms
    private static final int    DEFAULT_TIMEOUT         = 15_000; // ms

    /* -------------------------------------------------------------- cfg data */
    private Configuration cfg;

    private String   url;
    private String   contentType;
    private Header[] httpHeaders = new Header[0];

    private boolean responseOnError;
    private boolean preemptiveAuth;
    private int     connectTimeout;
    private int     timeout;

    /* -------------------------- context-variable names (same defaults) */
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
    private String httpVersionName;
    private boolean ignoreNullRequest;

    /* ------------------------------------------------------- redirect policy */
    private RedirectStrategy redirectStrategy = DefaultRedirectStrategy.INSTANCE;

    /* ------------------------------------------------------------- clients */
    private CloseableHttpAsyncClient httpClient;          // regular TLS
    private CloseableHttpAsyncClient unsecureHttpClient;  // trust-all TLS

    /* ========================================================================
                                  PARTICIPANT
       ===================================================================== */
    @Override
    public int prepare(long id, Serializable o) {
        Context ctx = (Context) o;

        SimpleHttpRequest req = buildRequest(ctx);
        if (req == null)
            return ignoreNullRequest ? PREPARED | NO_JOIN | READONLY : FAIL;

        addHeaders(ctx, req);

        /* per-request HTTP version (default 1.1) */
        String ver = ctx.getString(httpVersionName);
        if (ver != null && !ver.isEmpty() && ver.startsWith("1.")) {
            String[] mm = ver.split("\\.");
            req.setVersion(new HttpVersion(
              Integer.parseInt(mm[0]),
              mm.length > 1 ? Integer.parseInt(mm[1]) : 0));
        }

        /* execution context */
        HttpClientContext httpCtx = HttpClientContext.create();

        // ── Basic / pre-emptive auth ───────────────────────────────────────
        String ba = ctx.get(basicAuthenticationName);
        if (ba != null && ba.contains(":")) {
            String[] c = ba.split(":", 2);
            var cp = new BasicCredentialsProvider();
            cp.setCredentials(
              new AuthScope(null, -1),                      // any host/port
              new UsernamePasswordCredentials(c[0], c[1].toCharArray()));
            httpCtx.setCredentialsProvider(cp);

            if (preemptiveAuth) {
                URI uri = null;
                try {
                    uri = req.getUri();
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
                AuthCache cache = new BasicAuthCache();
                cache.put(new HttpHost(uri.getScheme(), uri.getHost(), uri.getPort()),
                  new BasicScheme());
                httpCtx.setAuthCache(cache);
            }
        }

        boolean trustAll = "true".equals(ctx.getString(trustAllCertsName, "false"));
        getHttpClient(trustAll).execute(req, httpCtx, new FutureCallback<>() {
            @Override
            public void completed(SimpleHttpResponse rsp) {
                int sc = rsp.getCode();
                boolean include = (sc == HttpStatus.SC_OK ||
                  sc == HttpStatus.SC_CREATED ||
                  responseOnError);
                if (include && rsp.getBody() != null)
                    ctx.put(responseName, rsp.getBodyText());
                ctx.put(statusName, sc);          // always last
                ctx.resume(PREPARED);
            }
            @Override public void failed(Exception ex) { ctx.log(ex); ctx.resume(ABORTED); }
            @Override public void cancelled()           { ctx.resume(ABORTED); }
        });

        return PREPARED | PAUSE | NO_JOIN | READONLY;
    }

    @Override
    public int prepareForAbort(long id, Serializable o) {
        return cfg.getBoolean("on-abort", false) ? prepare(id, o) : PREPARED;
    }

    /* ========================================================================
                                CONFIGURABLE
       ===================================================================== */
    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;

        url             = cfg.get("url");
        contentType     = cfg.get("contentType", "application/json");
        responseOnError = cfg.getBoolean("responseBodyOnError", false);
        connectTimeout  = cfg.getInt("connect-timeout", DEFAULT_CONNECT_TIMEOUT);
        timeout         = cfg.getInt("timeout", DEFAULT_TIMEOUT);

        /* context-variable names (defaults match original) */
        urlName          = cfg.get("urlName", "HTTP_URL");
        httpVersionName  = cfg.get("httpVersionName", "HTTP_VERSION");
        methodName       = cfg.get("methodName", "HTTP_METHOD");
        paramsName       = cfg.get("paramsName", "HTTP_PARAMS");
        requestName      = cfg.get("requestName", "HTTP_REQUEST");
        contentTypeName  = cfg.get("contentTypeName", "HTTP_CONTENT_TYPE");
        responseName     = cfg.get("responseName", "HTTP_RESPONSE");
        statusName       = cfg.get("responseStatusName", "HTTP_STATUS");
        ignoreNullRequest= cfg.getBoolean("ignoreNullRequest", false);

        preemptiveAuth          = cfg.getBoolean("preemptiveAuth", false);
        basicAuthenticationName = cfg.get("basicAuthenticationName", ".HTTP_BASIC_AUTHENTICATION");
        trustAllCertsName       = cfg.get("trustAllCerts", "HTTP_TRUST_ALL_CERTS");

        headersName = cfg.get("headersName", "HTTP_HEADERS");

        /* fixed headers from cfg */
        String[] h = cfg.getAll("httpHeader");
        httpHeaders = new Header[h.length];
        for (int i = 0; i < h.length; i++) {
            int p = h[i].indexOf(':');
            if (p < 0)
                throw new ConfigurationException("Bad HTTP header '" + h[i] + '\'');
            httpHeaders[i] = new BasicHeader(
              h[i].substring(0, p).trim(),
              h[i].substring(p + 1).trim());
        }

        /* redirect strategy */
        String rs = cfg.get("redirect-strategy", "default");
        redirectStrategy = switch (rs) {
            case "lax"     -> LaxRedirectStrategy.INSTANCE;
            case "default" -> DefaultRedirectStrategy.INSTANCE;
            default -> throw new ConfigurationException(
              "'redirect-strategy' must be 'default' or 'lax'");
        };

        /* global pool size (legacy property retained) */
        String max = Optional.ofNullable(System.getProperty("http.maxConnections"))
          .orElseGet(() -> cfg.get("maxConnections", DEFAULT_MAX_CONNECTIONS));
        System.setProperty("http.maxConnections", max.trim());
        try { Integer.parseInt(max.trim()); }
        catch (NumberFormatException nfe) {
            throw new ConfigurationException("Bad value for maxConnections: " + max);
        }
    }

    /* ========================================================================
                               INTERNAL HELPERS
       ===================================================================== */
    private SimpleHttpRequest buildRequest(Context ctx) {
        String url   = getURL(ctx);
        String m     = ctx.getString(methodName, "GET");
        String body  = ctx.getString(requestName);
        ContentType ct = getContentType(ctx);

        SimpleRequestBuilder b = switch (m) {
            case "POST"   -> SimpleRequestBuilder.post(url);
            case "PUT"    -> SimpleRequestBuilder.put(url);
            case "PATCH"  -> SimpleRequestBuilder.patch(url);
            case "DELETE" -> SimpleRequestBuilder.delete(url);
            case "GET"    -> SimpleRequestBuilder.get(url);
            default -> { ctx.log("Invalid HTTP method: " + m); yield null; }
        };
        if (b == null) return null;

        if (body != null && !body.isEmpty() &&
          ("POST".equals(m) || "PUT".equals(m) || "PATCH".equals(m))) {
            b.setBody(body, ct);
        }
        return b.build();
    }

    private String getURL(Context ctx) {
        StringBuilder sb = new StringBuilder(ctx.getString(urlName, url));
        String params = ctx.getString(paramsName, "");
        if (!params.isEmpty()) sb.append('?').append(params);
        return sb.toString();
    }

    private ContentType getContentType(Context ctx) {
        String mime = ctx.get(contentTypeName, contentType);
        return cfg.getBoolean("no-charset")
          ? ContentType.parse(mime)
          : ContentType.create(mime, StandardCharsets.UTF_8);
    }

    /** Add fixed cfg headers first, then any runtime overrides. */
    @SuppressWarnings("unchecked")
    private void addHeaders(Context ctx, SimpleHttpRequest req) {
        req.setHeaders(httpHeaders);

        Object hObj = ctx.get(headersName);
        if (hObj == null) return;

        if (hObj instanceof Map<?,?> map) {
            map.forEach((k, v) -> req.setHeader(k.toString(), v.toString()));
            return;
        }

        List<String> list;
        if (hObj instanceof String[] arr)      list = Arrays.asList(arr);
        else if (hObj instanceof List<?> l)    list = (List<String>) l;
        else {
            ctx.log("HTTP_HEADERS is not String[], List<String> or Map<String,String>");
            return;
        }

        for (String h : list) {
            int p = h.indexOf(':');
            if (p < 0) { ctx.log("Bad HTTP header '" + h + '\''); continue; }
            req.setHeader(h.substring(0, p).trim(), h.substring(p + 1).trim());
        }
    }

    /* -----------------------------------------------------------------------
                                HTTP CLIENT FACTORY
       -------------------------------------------------------------------- */
    private synchronized CloseableHttpAsyncClient getHttpClient(boolean trustAll) {
        if (trustAll) {
            if (unsecureHttpClient == null) {
                unsecureHttpClient = createBuilder(true).build();
                unsecureHttpClient.start();
            }
            return unsecureHttpClient;
        }
        if (httpClient == null) {
            httpClient = createBuilder(false).build();
            httpClient.start();
        }
        return httpClient;
    }

    private HttpAsyncClientBuilder createBuilder(boolean trustAll) {
        RequestConfig defaults = RequestConfig.custom()
          .setConnectTimeout(Timeout.ofMilliseconds(connectTimeout))
          .setResponseTimeout(Timeout.ofMilliseconds(timeout))
          .build();

        HttpAsyncClientBuilder b = HttpAsyncClients.custom()
          .useSystemProperties()
          .setRedirectStrategy(redirectStrategy)
          .setDefaultRequestConfig(defaults);

        if (trustAll) {
            SSLContext sc = buildTrustAllContext();
            if (sc != null) {
                TlsStrategy tls = ClientTlsStrategyBuilder.create()
                  .setSslContext(sc)
                  .setHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                  .build();

                PoolingAsyncClientConnectionManager cm =
                  PoolingAsyncClientConnectionManagerBuilder.create()
                    .setTlsStrategy(tls)
                    .build();

                b.setConnectionManager(cm);
            }
        }
        return b;
    }

    private SSLContext buildTrustAllContext() {
        try {
            TrustManager[] tm = { new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] c, String a) {}
                public void checkServerTrusted(X509Certificate[] c, String a) {}
                public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
            }};
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, tm, new SecureRandom());
            return sc;
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            warn(e); return null;
        }
    }

    /* ========================================================================
                                   DESTROYABLE
       ===================================================================== */
    @Override
    public void destroy() {
        closeQuiet(httpClient);       httpClient = null;
        closeQuiet(unsecureHttpClient); unsecureHttpClient = null;
    }
    private void closeQuiet(CloseableHttpAsyncClient c) {
        if (c != null) {
            try { c.close(); } catch (IOException ex) { warn(ex); }
        }
    }
}
