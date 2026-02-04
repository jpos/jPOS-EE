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

/**
 * Constants for WebSocket-related context keys.
 */
public enum WsConstants {
    /** The WebSocketSession handler for the connection */
    WS_SESSION,
    /** The WebSocket frame content (text or binary) */
    WS_FRAME,
    /** The type of frame: "TEXT" or "BINARY" */
    WS_FRAME_TYPE,
    /** The original WebSocket URI path */
    WS_PATH
}
