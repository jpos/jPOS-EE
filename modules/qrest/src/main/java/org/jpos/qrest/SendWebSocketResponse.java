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
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.rc.Result;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;

import java.io.Serializable;

import static org.jpos.qrest.WsConstants.*;

/**
 * Transaction participant that sends WebSocket responses.
 * Checks for WS_SESSION in context to determine if this is a WebSocket request.
 * Falls through to allow SendResponse to handle HTTP requests.
 *
 * Response handling:
 * - If RESPONSE is a String: sends as TextWebSocketFrame
 * - If RESPONSE is a byte[]: sends as BinaryWebSocketFrame
 * - If RESPONSE is any other object: JSON serializes and sends as TextWebSocketFrame
 * - If no RESPONSE but has Result failures: sends error as TextWebSocketFrame
 */
public class SendWebSocketResponse implements AbortParticipant, Configurable {
    private static ObjectMapper mapper = Mapper.getMapper();
    private boolean jsonIncludeNulls = true;
    private boolean closeOnError = false;

    @Override
    public int prepare(long id, Serializable context) {
        return PREPARED | READONLY;
    }

    @Override
    public void commit(long id, Serializable context) {
        Context ctx = (Context) context;
        ChannelHandlerContext ch = ctx.get(WS_SESSION);

        if (ch == null) {
            // Not a WebSocket request - let SendResponse handle it
            return;
        }

        sendResponse(ctx, ch, false);
    }

    @Override
    public void abort(long id, Serializable context) {
        Context ctx = (Context) context;
        ChannelHandlerContext ch = ctx.get(WS_SESSION);

        if (ch == null) {
            // Not a WebSocket request - let SendResponse handle it
            return;
        }

        sendResponse(ctx, ch, true);
    }

    private void sendResponse(Context ctx, ChannelHandlerContext ch, boolean isAbort) {
        Object response = ctx.get(Constants.RESPONSE);

        if (response == null) {
            Result result = ctx.getResult();
            if (result != null && result.hasFailures()) {
                String errorMsg = result.failure().getMessage();
                sendText(ch, errorMsg != null ? errorMsg : "Error");
                if (closeOnError) {
                    ch.writeAndFlush(new CloseWebSocketFrame(1011, "Internal Error"));
                }
            }
            return;
        }

        try {
            if (response instanceof String) {
                sendText(ch, (String) response);
            } else if (response instanceof byte[]) {
                sendBinary(ch, (byte[]) response);
            } else if (response instanceof WebSocketResponse) {
                WebSocketResponse wsResponse = (WebSocketResponse) response;
                if (wsResponse.isBinary()) {
                    sendBinary(ch, wsResponse.getBinaryContent());
                } else {
                    sendText(ch, wsResponse.getTextContent());
                }
            } else {
                // JSON serialize other objects
                ObjectMapper m = ctx.get(SendResponse.MAPPER);
                if (m == null) {
                    m = jsonIncludeNulls ? mapper : Mapper.getMapperNoNulls();
                }
                String json = m.writeValueAsString(response);
                sendText(ch, json);
            }
        } catch (JsonProcessingException e) {
            ctx.log(e);
            sendText(ch, "{\"error\":\"JSON serialization failed\"}");
        }
    }

    private void sendText(ChannelHandlerContext ch, String text) {
        ch.writeAndFlush(new TextWebSocketFrame(text));
    }

    private void sendBinary(ChannelHandlerContext ch, byte[] data) {
        ByteBuf buffer = ch.alloc().buffer(data.length);
        buffer.writeBytes(data);
        ch.writeAndFlush(new BinaryWebSocketFrame(buffer));
    }

    @Override
    public void setConfiguration(Configuration cfg) {
        this.jsonIncludeNulls = cfg.getBoolean("json-include-nulls", true);
        this.closeOnError = cfg.getBoolean("close-on-error", false);
    }

    /**
     * Response wrapper for WebSocket that allows explicit control over
     * whether to send text or binary frames.
     */
    public static class WebSocketResponse {
        private final String textContent;
        private final byte[] binaryContent;
        private final boolean binary;

        private WebSocketResponse(String textContent, byte[] binaryContent, boolean binary) {
            this.textContent = textContent;
            this.binaryContent = binaryContent;
            this.binary = binary;
        }

        public static WebSocketResponse text(String content) {
            return new WebSocketResponse(content, null, false);
        }

        public static WebSocketResponse binary(byte[] content) {
            return new WebSocketResponse(null, content, true);
        }

        public boolean isBinary() {
            return binary;
        }

        public String getTextContent() {
            return textContent;
        }

        public byte[] getBinaryContent() {
            return binaryContent;
        }
    }
}
