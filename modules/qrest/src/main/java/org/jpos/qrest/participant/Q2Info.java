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

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

import io.netty.handler.codec.http.*;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.q2.Q2;
import org.jpos.q2.iso.QMUX;
import org.jpos.qrest.Response;
import org.jpos.qrest.Route;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.transaction.TransactionParticipant;
import org.jpos.util.Caller;
import org.jpos.util.NameRegistrar;

import static org.jpos.qrest.Constants.REQUEST;
import static org.jpos.qrest.Constants.RESPONSE;

public class Q2Info implements TransactionParticipant, Configurable {
    // special temp key in response map to indicate a specific HttpResponseStatus value (should be removed from actual response)
    private final static String HTTP_STATUS_KEY = "__http_status__";
    private TransactionManager txnmgr;
    private Q2 q2;
    private List<Route<Map<String,Object>>> routes = new ArrayList<>();
    private String prefix;

    public Q2Info() { }

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
        Map<String,Object> response = null;
        Optional<Route<Map<String,Object>>> route = routes.stream().filter(rr -> rr.matches(decoder.uri())).findFirst();
        String path = URI.create(decoder.uri()).getPath();

        HttpResponseStatus status = HttpResponseStatus.NOT_FOUND;
        if (route.isPresent()) {
            if (route.get().isValid(path)) {
                response = new LinkedHashMap<>();
                response.putAll(route.get().apply(route.get(), path));
                status = HttpResponseStatus.OK;
            }
        } else {
            response = new LinkedHashMap<>();
            for (Route<Map<String,Object>> r : routes) {
                if (!r.hasPathParams())
                    response.putAll(r.apply(r, path));
            }
            status = HttpResponseStatus.OK;
        }

        if (response != null) {
            if (response.containsKey("error"))
                status = HttpResponseStatus.NOT_ACCEPTABLE;
            else if (response.containsKey(HTTP_STATUS_KEY)) {
                status = (HttpResponseStatus) response.get(HTTP_STATUS_KEY);
                response.remove(HTTP_STATUS_KEY);
            }
        }
        ctx.put(RESPONSE,
          response != null ? new Response(status, response) :
            new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, status)
        );
        return PREPARED | NO_JOIN | READONLY;
    }

    @SuppressWarnings("unused")
    public void setTransactionManager (TransactionManager txnmgr) {
        this.txnmgr = txnmgr;
        this.q2 = txnmgr.getServer();
    }

    @Override
    public void setConfiguration(Configuration cfg) {
        this.prefix = cfg.get("prefix");
        initInternalRoutes();
    }

    private Map<String, Object> muxes () {
        List<Object> muxes =  NameRegistrar.getAsMap().entrySet()
          .stream().filter(e -> e.getValue() instanceof QMUX && e.getKey().startsWith("mux."))
          .map(e -> muxInfo((QMUX) e.getValue()))
          .collect(Collectors.toList());

        Map<String,Object> wrapper = new HashMap<>();
        wrapper.put("mux", muxes);
        return wrapper;
    }

    private Map<String,Object> muxInfo(QMUX mux) {
        Map<String,Object> m = new LinkedHashMap<>();
        m.put ("name", mux.getName());
        m.put ("type", mux.getClass().getSimpleName());
        m.put ("connected", mux.isConnected());
        m.put ("rx", mux.getRXCounter());
        m.put ("tx", mux.getTXCounter());
        m.put ("txExpired", mux.getTXExpired());
        m.put ("txPending", mux.getTXPending());
        m.put ("rxExpired", mux.getRXExpired());
        m.put ("rxPending", mux.getRXPending());
        m.put ("rxUnhandled", mux.getRXUnhandled());
        m.put ("rxForwarded", mux.getRXForwarded());
        m.put ("metrics", mux.getMetrics().metrics());
        long last = mux.getLastTxnTimestampInMillis();
        if (last > 0) {
            m.put("last", new Date(last));
            m.put("idle", mux.getIdleTimeInMillis());
        }
        return m;
    }

    private Map<String,Object> muxInfo (Route r, String path) {
        try {
            return muxInfo((QMUX) QMUX.getMUX((String) r.parameters(path).get("muxname")));
        } catch (NameRegistrar.NotFoundException e) {
            return mapOf("error", e.getMessage() + " not found");
        }
    }

    private Map<String,Object> connected (Route r, String path) {
        try {
            QMUX qmux = (QMUX)QMUX.getMUX((String) r.parameters(path).get("muxname"));
            Map<String,Object> m = muxInfo(qmux);
            m.put(HTTP_STATUS_KEY,  qmux.isConnected()    ?
                                    HttpResponseStatus.OK :
                                    HttpResponseStatus.SERVICE_UNAVAILABLE);
            return m;
        } catch (NameRegistrar.NotFoundException e) {
            return mapOf("error", e.getMessage() + " not found");
        }
    }

    private Map<String, Object> txnmgr () {
        List<Object> txnmgr =  NameRegistrar.getAsMap().entrySet()
                .stream().filter(e -> e.getValue() instanceof TransactionManager)
                .map(e -> txnmgrInfo((TransactionManager) e.getValue()))
                .collect(Collectors.toList());

        Map<String,Object> wrapper = new HashMap<>();
        wrapper.put("txnmgr", txnmgr);
        return wrapper;
    }

    private Map<String,Object> txnmgrInfo(TransactionManager txnmgr) {
        Map<String,Object> m = new LinkedHashMap<>();
        m.put ("name", txnmgr.getName());
        m.put ("type", txnmgr.getClass().getSimpleName());
        m.put ("tail", txnmgr.getTail());
        m.put ("head", txnmgr.getHead());
        m.put ("inTransit", txnmgr.getInTransit());
        m.put ("TPSAvg", txnmgr.getTPSAvg());
        m.put ("TPSPeak", txnmgr.getTPSPeak());
        m.put ("TPSPeakWhen", txnmgr.getTPSPeakWhen());
        m.put ("TPSElapsed", txnmgr.getTPSElapsed());
        if (txnmgr.getMetrics() != null)
            m.put ("metrics", txnmgr.getMetrics().metrics());
        return m;
    }


    private void initInternalRoutes() {
        routes.add(new Route<>(prefix + "/q2/version**", "GET", (t,s) -> mapOf ("version", q2Version())));
        routes.add(new Route<>(prefix + "/q2/applicationVersion**", "GET", (t,s) -> mapOf("applicationVersion", Q2.getAppVersionString())));
        routes.add(new Route<>(prefix + "/q2/instanceId**", "GET", (t,s) -> mapOf("instanceId", q2.getInstanceId())));
        routes.add(new Route<>(prefix + "/q2/uptime**", "GET", (t,s) -> mapOf("uptime", q2.getUptime())));
        routes.add(new Route<>(prefix + "/q2/started**", "GET", (t,s) -> mapOf("started", new Date(System.currentTimeMillis() - q2.getUptime()))));
        routes.add(new Route<>(prefix + "/q2/diskspace**", "GET", (t,s) -> diskspace()));
        routes.add(new Route<>(prefix + "/q2/mux/{muxname}/connected", "GET", (t,s) -> connected(t,s)));    // like below, but returns HTTP code 503 if mux not connected
        routes.add(new Route<>(prefix + "/q2/mux/{muxname}**", "GET", (t,s) -> muxInfo(t,s)));
        routes.add(new Route<>(prefix + "/q2/mux**", "GET", (t,s) -> muxes()));
        routes.add(new Route<>(prefix + "/q2/txnmgr/name", "GET", (t,s) -> mapOf("name", txnmgr.getName())));
        routes.add(new Route<>(prefix + "/q2/txnmgr**", "GET", (t,s) -> txnmgr()));
    }

    private  Map<String, Object> newMap () {
        return new LinkedHashMap<>();
    }
    private  Map<String, Object> mapOf (String k, Object v) {
        Map<String,Object> m = new LinkedHashMap<>();
        m.put(k, v);
        return m;
    }
    private String q2Version() {
        return String.format("jPOS %s %s/%s (%s)",
          Q2.getVersion(), Q2.getBranch(), Q2.getRevision(), Q2.getBuildTimestamp()
        );
    }
    private Map<String,Object> diskspace() {
        File f = new File(".");
        Map<String, Object> m = newMap();
        m.put("free", f.getFreeSpace());
        m.put("usable", f.getUsableSpace());
        return mapOf("diskspace", m);
    }

}
