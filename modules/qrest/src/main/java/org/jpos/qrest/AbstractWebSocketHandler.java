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

import org.jdom2.Element;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;

/**
 * Abstract base class for WebSocket handlers providing no-op default implementations.
 * Subclasses only need to override the methods they care about.
 *
 * <p>Example usage:</p>
 * <pre>
 * public class EchoHandler extends AbstractWebSocketHandler {
 *     {@literal @}Override
 *     public void onMessage(WebSocketContext ctx, String message) {
 *         ctx.send("Echo: " + message);
 *     }
 * }
 * </pre>
 */
public abstract class AbstractWebSocketHandler implements WebSocketHandler {

    protected Configuration cfg;
    protected Element xmlConfig;

    @Override
    public void onOpen(WebSocketContext ctx) {
        // No-op by default
    }

    @Override
    public void onMessage(WebSocketContext ctx, String message) {
        // No-op by default
    }

    @Override
    public void onBinaryMessage(WebSocketContext ctx, byte[] data) {
        // No-op by default
    }

    @Override
    public void onClose(WebSocketContext ctx, int statusCode, String reason) {
        // No-op by default
    }

    @Override
    public void onError(WebSocketContext ctx, Throwable cause) {
        // No-op by default
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }

    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        this.xmlConfig = e;
    }

    /**
     * Returns the Configuration for this handler.
     * @return the Configuration, or null if not set
     */
    protected Configuration getConfiguration() {
        return cfg;
    }

    /**
     * Returns the XML configuration element for this handler.
     * @return the Element, or null if not set
     */
    protected Element getXmlConfiguration() {
        return xmlConfig;
    }
}
