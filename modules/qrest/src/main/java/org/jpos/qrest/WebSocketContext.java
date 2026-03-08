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
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Provides a clean API for WebSocket handlers to interact with the connection.
 * Wraps the Netty ChannelHandlerContext and provides convenient methods for
 * sending messages, managing connection state, and storing per-connection attributes.
 */
public class WebSocketContext {

    private final ChannelHandlerContext nettyCtx;
    private final RestServer server;
    private final String path;
    private final Map<String, String> upgradeHeaders;
    private final Map<String, Object> attributes = new ConcurrentHashMap<>();

    /**
     * Creates a new WebSocketContext.
     *
     * @param nettyCtx the underlying Netty channel handler context
     * @param server the RestServer instance
     * @param path the WebSocket path for this connection
     */
    public WebSocketContext(ChannelHandlerContext nettyCtx, RestServer server, String path) {
        this(nettyCtx, server, path, Map.of());
    }

    /**
     * Creates a new WebSocketContext with HTTP upgrade headers.
     *
     * @param nettyCtx the underlying Netty channel handler context
     * @param server the RestServer instance
     * @param path the WebSocket path for this connection
     * @param upgradeHeaders headers from the HTTP upgrade request
     */
    public WebSocketContext(ChannelHandlerContext nettyCtx, RestServer server, String path,
                            Map<String, String> upgradeHeaders) {
        this.nettyCtx = nettyCtx;
        this.server = server;
        this.path = path;
        this.upgradeHeaders = upgradeHeaders != null ? upgradeHeaders : Map.of();
    }

    /**
     * Sends a text message to the client.
     *
     * @param text the text message to send
     * @return a ChannelFuture that will be notified when the write completes
     */
    public ChannelFuture send(String text) {
        return nettyCtx.writeAndFlush(new TextWebSocketFrame(text));
    }

    /**
     * Sends binary data to the client.
     *
     * @param data the binary data to send
     * @return a ChannelFuture that will be notified when the write completes
     */
    public ChannelFuture sendBinary(byte[] data) {
        ByteBuf buffer = nettyCtx.alloc().buffer(data.length);
        buffer.writeBytes(data);
        return nettyCtx.writeAndFlush(new BinaryWebSocketFrame(buffer));
    }

    /**
     * Closes the WebSocket connection with a normal closure status (1000).
     *
     * @return a ChannelFuture that will be notified when the close completes
     */
    public ChannelFuture close() {
        return nettyCtx.writeAndFlush(new CloseWebSocketFrame())
            .addListener(future -> nettyCtx.close());
    }

    /**
     * Closes the WebSocket connection with a specific status code and reason.
     *
     * @param statusCode the WebSocket close status code
     * @param reason the reason for closing
     * @return a ChannelFuture that will be notified when the close completes
     */
    public ChannelFuture close(int statusCode, String reason) {
        return nettyCtx.writeAndFlush(new CloseWebSocketFrame(statusCode, reason))
            .addListener(future -> nettyCtx.close());
    }

    /**
     * Returns the WebSocket path for this connection.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Gets a per-connection attribute.
     *
     * @param key the attribute key
     * @return the attribute value, or null if not set
     */
    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    /**
     * Gets a per-connection attribute with type casting.
     *
     * @param key the attribute key
     * @param <T> the expected type
     * @return the attribute value cast to the expected type, or null if not set
     */
    @SuppressWarnings("unchecked")
    public <T> T getAttribute(String key, Class<T> type) {
        return (T) attributes.get(key);
    }

    /**
     * Sets a per-connection attribute.
     *
     * @param key the attribute key
     * @param value the attribute value
     */
    public void setAttribute(String key, Object value) {
        if (value == null) {
            attributes.remove(key);
        } else {
            attributes.put(key, value);
        }
    }

    /**
     * Removes a per-connection attribute.
     *
     * @param key the attribute key
     * @return the previous value, or null if there was no value
     */
    public Object removeAttribute(String key) {
        return attributes.remove(key);
    }

    /**
     * Returns the remote address of the connected client.
     *
     * @return the remote socket address
     */
    public SocketAddress getRemoteAddress() {
        return nettyCtx.channel().remoteAddress();
    }

    /**
     * Returns the RestServer instance.
     *
     * @return the server
     */
    public RestServer getServer() {
        return server;
    }

    /**
     * Returns the underlying Netty ChannelHandlerContext.
     * Use with caution - prefer the higher-level methods when possible.
     *
     * @return the Netty context
     */
    public ChannelHandlerContext getNettyContext() {
        return nettyCtx;
    }

    /**
     * Returns true if the connection is still active.
     *
     * @return true if active, false otherwise
     */
    public boolean isActive() {
        return nettyCtx.channel().isActive();
    }

    /**
     * Returns a header from the HTTP upgrade request.
     *
     * @param name the header name (case-sensitive)
     * @return the header value, or null if not present
     */
    public String getUpgradeHeader(String name) {
        return upgradeHeaders.get(name);
    }
}
