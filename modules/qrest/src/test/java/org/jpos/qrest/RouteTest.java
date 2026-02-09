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

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Arturo Volpe
 * @since 2022-11-27
 */
class RouteTest {

    @Test
    void matches() {


        assertTrue(buildRoute("/simple").matches("/simple"));
        assertTrue(buildRoute("/simpleWithSlash/").matches("/simpleWithSlash/"));
        assertTrue(buildRoute("/withParam/{param1}/").matches("/withParam/1234/"));

        // test path with dot
        assertTrue(buildRoute("/{org}/{repo}/blob/{branch}/{file}").matches("/jpos/jPOS-EE/blob/master/README.md"));

        // test path with dot (for example for version)
        Route<?> path = buildRoute("/{version}/accounts/{code}");
        String uri = "/2.1/accounts/21.001.001";
        assertTrue(path.matches(uri));
        Map<String, Object> params = path.parameters(uri);
        assertEquals(2, params.size());
        assertEquals("2.1", params.get("version"));
        assertEquals("21.001.001", params.get("code"));
    }

    @Test
    void wildcardParameter() {
        Route<?> route = buildRoute("/api/{version}/**");
        String uri = "/api/v2/users/123/profile";
        assertTrue(route.matches(uri));
        Map<String, Object> params = route.parameters(uri);
        assertEquals("v2", params.get("version"));
        assertEquals("users/123/profile", params.get("*"));
    }

    @Test
    void wildcardSingleSegment() {
        Route<?> route = buildRoute("/template/{key}/**");
        String uri = "/template/SALE:1/form";
        assertTrue(route.matches(uri));
        Map<String, Object> params = route.parameters(uri);
        assertEquals("SALE:1", params.get("key"));
        assertEquals("form", params.get("*"));
    }

    @Test
    void wildcardEmptyTail() {
        Route<?> route = buildRoute("/files/**");
        String uri = "/files/";
        assertTrue(route.matches(uri));
        Map<String, Object> params = route.parameters(uri);
        assertNull(params.get("*"));
    }

    @Test
    void wildcardNoTrailingPath() {
        Route<?> route = buildRoute("/files/**");
        String uri = "/files";
        assertFalse(route.matches(uri));
    }

    @Test
    void multipleParamsWithWildcard() {
        Route<?> route = buildRoute("/org/{orgId}/repo/{repoId}/**");
        String uri = "/org/acme/repo/widgets/tree/main/src";
        assertTrue(route.matches(uri));
        Map<String, Object> params = route.parameters(uri);
        assertEquals("acme", params.get("orgId"));
        assertEquals("widgets", params.get("repoId"));
        assertEquals("tree/main/src", params.get("*"));
    }

    private static Route<String> buildRoute(String path) {
        return new Route<>(path, "GET", (r, p) -> "");
    }
}
