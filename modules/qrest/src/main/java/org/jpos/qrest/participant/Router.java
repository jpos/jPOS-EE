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

package org.jpos.qrest.participant;

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.QueryStringDecoder;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.qrest.Route;
import org.jpos.transaction.Context;
import org.jpos.transaction.GroupSelector;

import java.io.Serializable;
import java.net.URI;
import java.util.*;

import static org.jpos.qrest.Constants.*;

public class Router implements GroupSelector, XmlConfigurable {
    private Map<String,List<Route<String>>> routes = new HashMap<>();

    @Override
    public int prepare(long id, Serializable context) {
        return PREPARED | NO_JOIN | READONLY;
    }

    @Override
    public String select(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        String method = request.method().name();
        ctx.put (METHOD, method);
        List<Route<String>> routesByMethod = routes.get(method);
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
        if (!decoder.parameters().isEmpty())
            ctx.put(QUERYPARAMS, decoder.parameters());

        if (routesByMethod != null) {
            Optional<Route<String>> route = routesByMethod.stream().filter(r -> r.matches(decoder.path())).findFirst();
            String path = URI.create(decoder.uri()).getPath();
            if (route.isPresent()) {
                Route<String> r = route.get();
                Map m = r.parameters(path);
                if (m != null)
                    ctx.put(PATHPARAMS, m);

                ctx.log("Matched Route: "+r);
                return r.apply(r, path);
            }
        }
        return null;
    }

    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        try {
            for (Element r : e.getChildren("route")) {
                routes.computeIfAbsent(
                  r.getAttributeValue("method"),
                  k -> new ArrayList<>()).add(
                    new Route<>(
                      r.getAttributeValue("path"),
                      r.getAttributeValue("method"),
                      (t, s) -> r.getAttributeValue("name"))
                );
            }
        } catch (Throwable t) {
            throw new ConfigurationException(t);
        }
    }
}
