/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;
import org.jpos.transaction.AbortParticipant;
import org.jpos.util.Destroyable;
import org.jpos.util.Log;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.transaction.Context;


@SuppressWarnings("unused")
public class HttpQuery extends Log implements AbortParticipant, Configurable, Destroyable {
    private Configuration cfg;
    private String url;
    private String contentType;

    // Context variable names
    private String urlName;
    private String paramsName;
    private String methodName;
    private String requestName;
    private String responseName;
    private String statusName;
    private String contentTypeName;

    private CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();

    public HttpQuery () {
        super();
        client.start();

    }
    public int prepare (long id, Serializable o) {
        Context ctx = (Context) o;
        String url = getURL (ctx);

        HttpUriRequest httpRequest = getHttpUriRequest(ctx);

        client.execute(httpRequest, new FutureCallback<HttpResponse>() {
            @Override
            public void completed(HttpResponse result) {
                ctx.log (result.getStatusLine());
                int sc = result.getStatusLine().getStatusCode();
                if (sc == HttpStatus.SC_CREATED || sc == HttpStatus.SC_OK) {
                    try {
                        ctx.put (responseName, EntityUtils.toString(result.getEntity()));
                    } catch (IOException e) {
                        ctx.log (e);
                    }
                }
                ctx.put (statusName, sc);
                ctx.resume();
            }

            @Override
            public void failed(Exception ex) {
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
    public void setConfiguration (Configuration cfg) {
        this.cfg = cfg;
        url = cfg.get("url");
        contentType = cfg.get("contentType", "application/json");
        urlName = cfg.get("urlName", "HTTP_URL");
        methodName = cfg.get("methodName", "HTTP_METHOD");
        paramsName = cfg.get ("paramsName", "HTTP_PARAMS");
        requestName = cfg.get ("requestName", "HTTP_REQUEST");
        responseName = cfg.get("responseName", "HTTP_RESPONSE");
        statusName = cfg.get("responseStatusName", "HTTP_STATUS");
        contentTypeName = cfg.get("contentTypeName", "HTTP_CONTENT_TYPE");
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

    private HttpUriRequest getHttpUriRequest (Context ctx) {
        String url = getURL(ctx);
        switch (ctx.getString(methodName)) {
            case "POST":
                HttpPost post = new HttpPost(url);
                post.setEntity(new StringEntity(ctx.getString(requestName), getContentType(ctx)));
                return post;
            case "PUT":
                HttpPut put = new HttpPut(url);
                put.setEntity(new StringEntity(ctx.getString(requestName), getContentType(ctx)));
                return put;
            case "GET":
                return new HttpGet(url);
        }
        ctx.log ("Invalid request method");
        return null;
    }

    private ContentType getContentType (Context ctx) {
        return ContentType.create(ctx.get(contentTypeName, contentType), Consts.UTF_8);
    }

    @Override
    public void destroy() {
        if (client.isRunning()) {
            try {
                client.close();
            } catch (IOException e) {
                warn(e);
            }
        }
    }
}
