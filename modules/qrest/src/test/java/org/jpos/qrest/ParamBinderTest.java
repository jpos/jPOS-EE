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

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParamBinderTest {

    record QueryParams(
        @QueryParam("name") String name,
        @QueryParam("age") int age,
        @QueryParam("active") boolean active
    ) { }

    @Test
    void queryParamStringIntBoolean() {
        Context ctx = new Context();
        ctx.put(Constants.QUERYPARAMS, Map.of(
            "name", List.of("Alice"),
            "age", List.of("30"),
            "active", List.of("true")
        ));
        QueryParams p = ParamBinder.bind(ctx, QueryParams.class);
        assertEquals("Alice", p.name());
        assertEquals(30, p.age());
        assertTrue(p.active());
    }

    record WithDefaults(
        @QueryParam("color") @DefaultValue("blue") String color,
        @QueryParam("count") @DefaultValue("5") int count
    ) { }

    @Test
    void defaultValueWhenMissing() {
        Context ctx = new Context();
        ctx.put(Constants.QUERYPARAMS, Map.of());
        WithDefaults p = ParamBinder.bind(ctx, WithDefaults.class);
        assertEquals("blue", p.color());
        assertEquals(5, p.count());
    }

    record PathParams(
        @PathParam("id") long id,
        @PathParam("slug") String slug
    ) { }

    @Test
    void pathParamExtraction() {
        Context ctx = new Context();
        ctx.put(Constants.PATHPARAMS, Map.of(
            "id", 42L,
            "slug", "hello-world"
        ));
        PathParams p = ParamBinder.bind(ctx, PathParams.class);
        assertEquals(42L, p.id());
        assertEquals("hello-world", p.slug());
    }

    record FormParams(
        @FormParam("username") String username,
        @FormParam("score") @DefaultValue("100") BigDecimal score
    ) { }

    @Test
    void formParamExtraction() {
        Context ctx = new Context();
        ctx.put(Constants.FORMPARAMS, Map.of(
            "username", List.of("bob")
        ));
        FormParams p = ParamBinder.bind(ctx, FormParams.class);
        assertEquals("bob", p.username());
        assertEquals(new BigDecimal("100"), p.score());
    }

    @Test
    void nullParamMaps() {
        Context ctx = new Context();
        QueryParams p = ParamBinder.bind(ctx, QueryParams.class);
        assertNull(p.name());
        assertEquals(0, p.age());
        assertFalse(p.active());
    }

    record Mixed(
        @QueryParam("q") String query,
        @PathParam("id") int id
    ) { }

    @Test
    void mixedAnnotations() {
        Context ctx = new Context();
        ctx.put(Constants.QUERYPARAMS, Map.of("q", List.of("search")));
        ctx.put(Constants.PATHPARAMS, Map.of("id", "7"));
        Mixed p = ParamBinder.bind(ctx, Mixed.class);
        assertEquals("search", p.query());
        assertEquals(7, p.id());
    }

    record UnsupportedType(
        @QueryParam("ts") java.time.Instant ts
    ) { }

    @Test
    void unknownTypeThrows() {
        Context ctx = new Context();
        ctx.put(Constants.QUERYPARAMS, Map.of("ts", List.of("2024-01-01T00:00:00Z")));
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> ParamBinder.bind(ctx, UnsupportedType.class)
        );
        assertTrue(ex.getMessage().contains("Unsupported parameter type"));
    }
}
