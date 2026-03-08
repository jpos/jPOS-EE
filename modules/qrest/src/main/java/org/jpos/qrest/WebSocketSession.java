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

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.CharsetUtil;
import org.jpos.transaction.Context;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.util.Map;

/**
 * Handles WebSocket frames after the connection has been upgraded.
 * Routes messages to the TransactionManager via Space (same as HTTP).
 */
public class WebSocketSession extends ChannelInboundHandlerAdapter {
    private final RestServer server;
    private final WebSocketServerHandshaker handshaker;
    private final String path;
    private final WebSocketHandler handler;
    private final Map<String, String> upgradeHeaders;
    private WebSocketContext wsContext;

    /** Frame type constant for text frames */
    public static final String FRAME_TYPE_TEXT = "TEXT";
    /** Frame type constant for binary frames */
    public static final String FRAME_TYPE_BINARY = "BINARY";

    public WebSocketSession(RestServer server, WebSocketServerHandshaker handshaker, String path) {
        this(server, handshaker, path, null, Map.of());
    }

    public WebSocketSession(RestServer server, WebSocketServerHandshaker handshaker, String path, WebSocketHandler handler) {
        this(server, handshaker, path, handler, Map.of());
    }

    public WebSocketSession(RestServer server, WebSocketServerHandshaker handshaker, String path,
                             WebSocketHandler handler, Map<String, String> upgradeHeaders) {
        this.server = server;
        this.handshaker = handshaker;
        this.path = path;
        this.handler = handler;
        this.upgradeHeaders = upgradeHeaders != null ? upgradeHeaders : Map.of();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof WebSocketFrame) {
            handleWebSocketFrame(ctx, (WebSocketFrame) msg);
        } else {
            super.channelRead(ctx, msg);
        }
    }

    private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame) {
        try {
            if (frame instanceof CloseWebSocketFrame) {
                handleClose(ctx, (CloseWebSocketFrame) frame);
            } else if (frame instanceof PingWebSocketFrame) {
                handlePing(ctx, (PingWebSocketFrame) frame);
            } else if (frame instanceof PongWebSocketFrame) {
                // Pong frames are typically ignored
                handlePong(ctx, (PongWebSocketFrame) frame);
            } else if (frame instanceof TextWebSocketFrame) {
                handleTextFrame(ctx, (TextWebSocketFrame) frame);
            } else if (frame instanceof BinaryWebSocketFrame) {
                handleBinaryFrame(ctx, (BinaryWebSocketFrame) frame);
            } else {
                throw new UnsupportedOperationException("Unsupported frame type: " + frame.getClass().getName());
            }
        } finally {
            frame.release();
        }
    }

    private void handleClose(ChannelHandlerContext ctx, CloseWebSocketFrame frame) {
        int statusCode = frame.statusCode();
        String reason = frame.reasonText();
        server.getLog().info("WebSocket close requested: " + ctx.channel() +
            " status=" + statusCode + " reason=" + reason);
        if (handler != null && wsContext != null) {
            handler.onClose(wsContext, statusCode, reason != null ? reason : "");
        }
        handshaker.close(ctx.channel(), frame.retain());
    }

    private void handlePing(ChannelHandlerContext ctx, PingWebSocketFrame frame) {
        ctx.writeAndFlush(new PongWebSocketFrame(frame.content().retain()));
    }

    private void handlePong(ChannelHandlerContext ctx, PongWebSocketFrame frame) {
        // Pong received - connection is alive
    }

    private void handleTextFrame(ChannelHandlerContext ctx, TextWebSocketFrame frame) {
        String text = frame.text();
        if (handler != null && wsContext != null) {
            handler.onMessage(wsContext, text);
        } else {
            Context context = createContext(ctx, text, FRAME_TYPE_TEXT);
            queueToTransactionManager(context);
        }
    }

    private void handleBinaryFrame(ChannelHandlerContext ctx, BinaryWebSocketFrame frame) {
        ByteBuf content = frame.content();
        byte[] bytes = new byte[content.readableBytes()];
        content.readBytes(bytes);
        if (handler != null && wsContext != null) {
            handler.onBinaryMessage(wsContext, bytes);
        } else {
            Context context = createContext(ctx, bytes, FRAME_TYPE_BINARY);
            queueToTransactionManager(context);
        }
    }

    private Context createContext(ChannelHandlerContext ctx, Object frameContent, String frameType) {
        Context context = new Context();
        context.put(WsConstants.WS_SESSION, ctx);
        context.put(WsConstants.WS_FRAME, frameContent);
        context.put(WsConstants.WS_FRAME_TYPE, frameType);
        context.put(WsConstants.WS_PATH, path);
        return context;
    }

    private void queueToTransactionManager(Context context) {
        server.queueWebSocket(context, path);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        String msg = cause.getMessage();
        LogEvent evt = server.getLog().createWarn("WebSocket error " + ctx.channel() + " " + msg);
        Throwable rootCause = cause;
        while (rootCause.getCause() != null) {
            rootCause = rootCause.getCause();
            if (msg != null && !msg.equals(rootCause.getMessage())) {
                msg = rootCause.getMessage();
                evt.addMessage("  " + msg);
            }
        }
        Logger.log(evt);
        if (handler != null && wsContext != null) {
            handler.onError(wsContext, cause);
        }
        ctx.close();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
        // Initialize wsContext when handler is added to an already-active channel (WebSocket upgrade)
        if (handler != null && ctx.channel().isActive()) {
            wsContext = new WebSocketContext(ctx, server, path, upgradeHeaders);
            handler.onOpen(wsContext);
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        // Handle case where channel becomes active after handler was added
        if (handler != null && wsContext == null) {
            wsContext = new WebSocketContext(ctx, server, path, upgradeHeaders);
            handler.onOpen(wsContext);
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        server.getLog().info("WebSocket closed: " + ctx.channel());
        if (handler != null && wsContext != null) {
            handler.onClose(wsContext, 1000, "Connection closed");
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
        if (evt instanceof IdleStateEvent) {
            IdleState e = ((IdleStateEvent) evt).state();
            if (e == IdleState.READER_IDLE) {
                server.getLog().info("WebSocket timeout " + ctx.channel());
                ctx.close();
            }
        }
    }

    /**
     * Sends a text frame to the client.
     *
     * @param ctx the channel handler context
     * @param text the text to send
     */
    public static void sendText(ChannelHandlerContext ctx, String text) {
        ctx.writeAndFlush(new TextWebSocketFrame(text));
    }

    /**
     * Sends a binary frame to the client.
     *
     * @param ctx the channel handler context
     * @param data the binary data to send
     */
    public static void sendBinary(ChannelHandlerContext ctx, byte[] data) {
        ByteBuf buffer = ctx.alloc().buffer(data.length);
        buffer.writeBytes(data);
        ctx.writeAndFlush(new BinaryWebSocketFrame(buffer));
    }

    /**
     * Closes the WebSocket connection.
     *
     * @param ctx the channel handler context
     */
    public static void close(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(new CloseWebSocketFrame()).addListener(future -> ctx.close());
    }

    /**
     * Closes the WebSocket connection with a status code and reason.
     *
     * @param ctx the channel handler context
     * @param statusCode the WebSocket close status code
     * @param reason the reason for closing
     */
    public static void close(ChannelHandlerContext ctx, int statusCode, String reason) {
        ctx.writeAndFlush(new CloseWebSocketFrame(statusCode, reason))
           .addListener(future -> ctx.close());
    }
}
