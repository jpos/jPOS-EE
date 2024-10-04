/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    private static Route<String> buildRoute(String path) {
        return new Route<>(path, "GET", (r, p) -> "");
    }
}
