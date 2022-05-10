/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

import java.util.*;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// RFC 6570 implementation, based on https://tools.ietf.org/html/rfc6570
public class Route<T> implements BiFunction<Route<T>, String,T> {
    private Pattern pathPattern;
    private String path;
    private String method;
    private BiFunction<Route<T>, String,T> supplier;

    private final List<String> params = new ArrayList<>();
    private static final Pattern PATH_PARAM_PATTERN = Pattern.compile("\\{([^/]+?)\\}");
    private static final Pattern WILDCARD_PATTERN = Pattern.compile("[\\*][\\*]");

    private Route() { }

    public Route(String path, String method, BiFunction<Route<T>, String,T> supplier) {
        Objects.requireNonNull(path);
        Objects.requireNonNull(method);
        Objects.requireNonNull(supplier);
        this.path = path;
        this.pathPattern = buildPathPattern(path);
        this.method = method;
        this.supplier = supplier;
    }
    public boolean matches (String uri) {
        return pathPattern.matcher(uri).matches();
    }
    public boolean hasPathParams() {
        return !params.isEmpty();
    }
    public boolean isValid(String uri) {
        return !hasPathParams() || !parameters(uri).isEmpty();
    }
    public Map<String, Object> parameters(String uri) {
        Map<String, Object> pathParameters = new HashMap<>();
        Matcher m = pathPattern.matcher(uri);
        if (m.matches()) {
            int i = 1;
            for (String name : params) {
                String val = m.group(i++);
                if (!val.isEmpty())
                    pathParameters.put(name, val);
            }
        }
        return pathParameters;
    }

    @Override
    public T apply(Route<T> route, String path) {
        return supplier.apply(route, path);
    }

    @Override
    public String toString() {
        return "Route{" +
          "path='" + path + "'" +
          ", method='" + method + "'" +
          '}';
    }

    private Pattern buildPathPattern(String path) {
        String s = "^" + path;
        Matcher m = PATH_PARAM_PATTERN.matcher(s);
        while (m.find()) {
            for (int i = 1; i <= m.groupCount(); i++) {
                String name = m.group(i);
                params.add(name);
                s = m.replaceFirst(
                  String.format("(?<%s>[^\\/.]*)", name)
                );
                m.reset(s);
            }
        }
        m = WILDCARD_PATTERN.matcher(s);
        while (m.find()) {
            s = m.replaceAll(".*");
            m.reset(s);
        }
        return Pattern.compile(s + "$");
    }
}
