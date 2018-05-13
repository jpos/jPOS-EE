/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;

import java.io.Serializable;

import static io.netty.buffer.Unpooled.copiedBuffer;
import static io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpHeaderValues.APPLICATION_JSON;
import static org.jpos.qrest.Constants.*;

public class SendResponse implements AbortParticipant {
    private static ObjectMapper mapper = Mapper.getMapper();

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
        if (keepAlive)
            response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        response.headers().set(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
        ChannelFuture cf = ch.writeAndFlush(response);
        ctx.log(cf);
        if (!keepAlive)
            ch.close();
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
                    responseBody = mapper.writeValueAsBytes(response.body());
                    isJson = true;
                }
                httpResponse = new DefaultFullHttpResponse(
                  HttpVersion.HTTP_1_1,
                  response.status(),
                  copiedBuffer(responseBody));

                if (isJson)
                    httpResponse.headers().set(CONTENT_TYPE, APPLICATION_JSON);

            } catch (JsonProcessingException e) {
                ctx.log(e);
                httpResponse = error(HttpResponseStatus.INTERNAL_SERVER_ERROR);
            }
        } else
            httpResponse = error(HttpResponseStatus.NOT_FOUND);

        return httpResponse;
    }
}

