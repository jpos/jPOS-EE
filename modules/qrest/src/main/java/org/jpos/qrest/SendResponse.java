/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.qrest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;
import io.netty.util.ReferenceCountUtil;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.rc.Result;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;

import java.io.Serializable;
import java.util.Map;

import static io.netty.buffer.Unpooled.copiedBuffer;
import static io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpHeaderValues.APPLICATION_JSON;
import static org.jpos.qrest.Constants.*;

public class SendResponse implements AbortParticipant, Configurable {
    private static ObjectMapper mapper = Mapper.getMapper();
    private String contentType;
    private boolean jsonIncludeNulls= true;
    private String corsHeader;
    public static final String MAPPER = ".mapper";

    @Override
    public int prepare(long id, Serializable context) {
        return PREPARED | READONLY;
    }

    @Override
    public void commit (long id, Serializable context) {
        respond((Context) context);
    }

    @Override
    public void abort (long id, Serializable context) {
        respond((Context) context);
    }

    private void respond(Context ctx) {
        ChannelHandlerContext ch = ctx.get(SESSION);
        FullHttpRequest request = ctx.get(REQUEST);
        FullHttpResponse response = null;
        boolean handedOff = false;
        RestAccessState state = RestSession.accessState(ctx);
        try {
            response = getResponse(ctx, protocolVersion(request));
            if (ch == null || !ch.channel().isActive()) {
                RestSession.completeAccess(ch, state, null, null);
                return;
            }
            boolean keepAlive = request != null && HttpUtil.isKeepAlive(request);
            HttpHeaders headers = response.headers();
            if (keepAlive)
                headers.set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
            if (contentType != null)
                headers.set(HttpHeaderNames.CONTENT_TYPE, contentType);
            long responseBytes = response.content().readableBytes();
            int status = response.status().code();
            headers.set(HttpHeaderNames.CONTENT_LENGTH, responseBytes);
            ChannelFuture cf = ch.writeAndFlush(response);
            handedOff = true;
            cf.addListener(future -> {
                RestSession.completeAccess(ch, state,
                  future.isSuccess() ? status : null, future.isSuccess() ? responseBytes : null);
                if (!future.isSuccess())
                    ch.close();
            });
            if (!keepAlive)
                cf.addListener(ChannelFutureListener.CLOSE);
        } catch (RuntimeException | Error e) {
            RestSession.completeAccess(ch, state, null, null);
            if (ch != null)
                ch.close();
            throw e;
        } finally {
            try {
                if (!handedOff && response != null)
                    ReferenceCountUtil.release(response);
            } finally {
                releaseRequest(ctx, request);
            }
        }
    }

    private void releaseRequest (Context ctx, FullHttpRequest request) {
        if (request == null)
            return;
        if (ReferenceCountUtil.refCnt(request) > 0)
            ReferenceCountUtil.release(request);
        else
            ctx.log("WARNING: HTTP request already released");
    }

    private HttpVersion protocolVersion(FullHttpRequest request) {
        return request != null ? request.protocolVersion() : HttpVersion.HTTP_1_1;
    }

    private FullHttpResponse error (HttpResponseStatus rc, HttpVersion version) {
        return new DefaultFullHttpResponse(version, rc);
    }

    private FullHttpResponse getResponse (Context ctx, HttpVersion version) {
        Object r = ctx.get(RESPONSE);
        FullHttpResponse httpResponse;

        if (r instanceof FullHttpResponse) {
            httpResponse = (FullHttpResponse) r;
        } else if (r instanceof Response) {
            Response response = (Response) r;
            byte[] responseBody;
            boolean isJson = false;

            try {
                if (response.body() instanceof byte[])
                    responseBody = (byte[])response.body();
                else if (response.body() instanceof String)
                    responseBody = String.valueOf(response.body()).getBytes();
                else {
                    ObjectMapper m = ctx.get(MAPPER);
                    if (m == null)
                        m = jsonIncludeNulls ? mapper : Mapper.getMapperNoNulls();
                    responseBody = m.writeValueAsBytes(response.body());
                    isJson = true;
                }

                ByteBuf content = copiedBuffer(responseBody);
                try {
                    httpResponse = new DefaultFullHttpResponse(version, response.status(), content);
                    HttpHeaders httpHeaders = httpResponse.headers();
                    for (Map.Entry<String, String> header : response.getHeaders().entrySet())
                        httpHeaders.add(header.getKey(), header.getValue());
                    if (response.contentType() != null)
                        httpHeaders.set(CONTENT_TYPE, response.contentType());
                    else if (isJson)
                        httpHeaders.set(CONTENT_TYPE, APPLICATION_JSON);
                    if (corsHeader != null)
                        httpHeaders.add("Access-Control-Allow-Origin", corsHeader);
                } catch (RuntimeException | Error e) {
                    content.release();
                    throw e;
                }
            } catch (JsonProcessingException e) {
                ctx.log(e);
                httpResponse = error(HttpResponseStatus.INTERNAL_SERVER_ERROR, version);
            }
        } else {
            Result result = ctx.getResult();
            if (result.hasFailures()) {
                httpResponse = error(HttpResponseStatus.valueOf(result.failure().getIrc().irc()), version);
            } else
                httpResponse = error(HttpResponseStatus.NOT_FOUND, version);
        }
        return httpResponse;
    }

    public void setConfiguration (Configuration cfg) {
        this.contentType = cfg.get("content-type", null);
        this.jsonIncludeNulls = cfg.getBoolean("json-include-nulls", true);
        this.corsHeader = cfg.get("Access-Control-Allow-Origin", null);
    }
}
