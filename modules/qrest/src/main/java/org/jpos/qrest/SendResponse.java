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

package org.jpos.qrest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;
import io.netty.util.ReferenceCountUtil;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.rc.Result;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;

import java.io.Serializable;
import java.util.Arrays;

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
        Context ctx = (Context) context;
        ChannelHandlerContext ch = ctx.get(SESSION);
        FullHttpRequest request = ctx.get(REQUEST);
        FullHttpResponse response = getResponse(ctx);
        sendResponse(ctx, ch, request, response);
    }

    @Override
    public void abort (long id, Serializable context) {
        Context ctx = (Context) context;
        ChannelHandlerContext ch = ctx.get(SESSION);
        FullHttpRequest request = ctx.get(REQUEST);
        FullHttpResponse response = getResponse(ctx);
        sendResponse(ctx, ch, request, response);
    }

    private void sendResponse (Context ctx, ChannelHandlerContext ch, FullHttpRequest request, FullHttpResponse response) {
        boolean keepAlive = HttpUtil.isKeepAlive(request);
        HttpHeaders headers = response.headers();
        try {
            if (keepAlive)
                headers.set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);

            if (contentType != null)
                headers.set(HttpHeaderNames.CONTENT_TYPE, contentType);
            headers.set(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
            ChannelFuture cf = ch.writeAndFlush(response);
            if (!keepAlive)
                ch.close();
        } finally {
            ReferenceCountUtil.release(request);
        }
    }

    private FullHttpResponse error (HttpResponseStatus rc) {
        return new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, rc);
    }

    private FullHttpResponse getResponse (Context ctx) {
        Object r = ctx.get(RESPONSE);
        FullHttpResponse httpResponse;

        if (r instanceof FullHttpResponse) {
            httpResponse = (FullHttpResponse) r;
        } else if (r instanceof Response) {
            Response response = (Response) r;
            byte[] responseBody;
            boolean isJson = false;
            try {
                if (response.body() instanceof String)
                    responseBody = String.valueOf(response.body()).getBytes();
                else {
                    ObjectMapper m = ctx.get(MAPPER);
                    if (m == null)
                        m = jsonIncludeNulls ? mapper : Mapper.getMapperNoNulls();
                    responseBody = m.writeValueAsBytes(response.body());
                    isJson = true;
                }
                httpResponse = new DefaultFullHttpResponse(
                  HttpVersion.HTTP_1_1,
                  response.status(),
                  copiedBuffer(responseBody));

                HttpHeaders httpHeaders = httpResponse.headers();
                if (isJson)
                    httpResponse.headers().set(CONTENT_TYPE, APPLICATION_JSON);
                if (corsHeader != null)
                    httpHeaders.add("Access-Control-Allow-Origin", corsHeader);
            } catch (JsonProcessingException e) {
                ctx.log(e);
                httpResponse = error(HttpResponseStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            Result result = ctx.getResult();
            if (result.hasFailures()) {
                httpResponse = error(HttpResponseStatus.valueOf(result.failure().getIrc().irc()));
            } else
                httpResponse = error(HttpResponseStatus.NOT_FOUND);
        }
        return httpResponse;
    }

    public void setConfiguration (Configuration cfg) {
        this.contentType = cfg.get("content-type", null);
        this.jsonIncludeNulls = cfg.getBoolean("json-include-nulls", true);
        this.corsHeader = cfg.get("Access-Control-Allow-Origin", null);
    }
}
