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
