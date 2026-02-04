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

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebSocket path pattern matching in WebSocketUpgradeHandler.
 */
public class WebSocketPathPatternTest {

    @Test
    void testDoubleWildcardPattern() throws Exception {
        Pattern pattern = compilePattern("/ws/**");

        assertTrue(pattern.matcher("/ws").matches(), "/ws should match /ws/**");
        assertTrue(pattern.matcher("/ws/").matches(), "/ws/ should match /ws/**");
        assertTrue(pattern.matcher("/ws/foo").matches(), "/ws/foo should match /ws/**");
        assertTrue(pattern.matcher("/ws/foo/bar").matches(), "/ws/foo/bar should match /ws/**");
        assertTrue(pattern.matcher("/ws/foo/bar/baz").matches(), "/ws/foo/bar/baz should match /ws/**");

        assertFalse(pattern.matcher("/other").matches(), "/other should not match /ws/**");
        assertFalse(pattern.matcher("/websocket").matches(), "/websocket should not match /ws/**");
    }

    @Test
    void testSingleWildcardPattern() throws Exception {
        Pattern pattern = compilePattern("/ws/*");

        assertTrue(pattern.matcher("/ws/foo").matches(), "/ws/foo should match /ws/*");
        assertTrue(pattern.matcher("/ws/bar").matches(), "/ws/bar should match /ws/*");

        assertFalse(pattern.matcher("/ws").matches(), "/ws should not match /ws/*");
        assertFalse(pattern.matcher("/ws/foo/bar").matches(), "/ws/foo/bar should not match /ws/*");
    }

    @Test
    void testExactPathPattern() throws Exception {
        Pattern pattern = compilePattern("/ws/chat");

        assertTrue(pattern.matcher("/ws/chat").matches(), "/ws/chat should match /ws/chat");
        assertTrue(pattern.matcher("/ws/chat/").matches(), "/ws/chat/ should match /ws/chat");

        assertFalse(pattern.matcher("/ws").matches(), "/ws should not match /ws/chat");
        assertFalse(pattern.matcher("/ws/chat/room1").matches(), "/ws/chat/room1 should not match /ws/chat");
    }

    @Test
    void testNestedDoubleWildcard() throws Exception {
        Pattern pattern = compilePattern("/api/v1/ws/**");

        assertTrue(pattern.matcher("/api/v1/ws").matches(), "/api/v1/ws should match /api/v1/ws/**");
        assertTrue(pattern.matcher("/api/v1/ws/foo").matches(), "/api/v1/ws/foo should match /api/v1/ws/**");
        assertTrue(pattern.matcher("/api/v1/ws/foo/bar").matches(), "/api/v1/ws/foo/bar should match /api/v1/ws/**");

        assertFalse(pattern.matcher("/api/v1").matches(), "/api/v1 should not match /api/v1/ws/**");
        assertFalse(pattern.matcher("/api/v2/ws").matches(), "/api/v2/ws should not match /api/v1/ws/**");
    }

    /**
     * Uses reflection to access the private compilePathPattern method in WebSocketUpgradeHandler.
     */
    private Pattern compilePattern(String path) throws Exception {
        Method method = WebSocketUpgradeHandler.class.getDeclaredMethod("compilePathPattern", String.class);
        method.setAccessible(true);
        return (Pattern) method.invoke(null, path);
    }
}
