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

import org.jpos.core.Configurable;
import org.jpos.core.XmlConfigurable;

/**
 * Interface for handling WebSocket connections in QRest.
 * Provides a more natural, bidirectional interface for WebSocket connections
 * compared to the TransactionManager-based approach.
 *
 * <p>Handlers are configured per-path in the qrest XML configuration:</p>
 * <pre>
 * &lt;websocket-route path="/ws/chat/**" handler="com.example.ChatHandler"&gt;
 *     &lt;property name="max-connections" value="100"/&gt;
 * &lt;/websocket-route&gt;
 * </pre>
 */
public interface WebSocketHandler extends Configurable, XmlConfigurable {

    /**
     * Called when a new WebSocket connection is established.
     *
     * @param ctx the WebSocket context for this connection
     */
    void onOpen(WebSocketContext ctx);

    /**
     * Called when a text message is received from the client.
     *
     * @param ctx the WebSocket context for this connection
     * @param message the text message content
     */
    void onMessage(WebSocketContext ctx, String message);

    /**
     * Called when a binary message is received from the client.
     *
     * @param ctx the WebSocket context for this connection
     * @param data the binary data
     */
    void onBinaryMessage(WebSocketContext ctx, byte[] data);

    /**
     * Called when the WebSocket connection is closed.
     *
     * @param ctx the WebSocket context for this connection
     * @param statusCode the WebSocket close status code
     * @param reason the reason for closing (may be empty)
     */
    void onClose(WebSocketContext ctx, int statusCode, String reason);

    /**
     * Called when an error occurs on the WebSocket connection.
     *
     * @param ctx the WebSocket context for this connection
     * @param cause the error that occurred
     */
    void onError(WebSocketContext ctx, Throwable cause);
}
