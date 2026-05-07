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

import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.core.SimpleConfiguration;
import org.jpos.qrest.evt.QRestAccess;
import org.jpos.transaction.Context;
import org.jpos.util.LogEvent;
import org.jpos.util.LogListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verifies that {@link RestSession} emits exactly one structured
 * {@link QRestAccess} audit-log event per HTTP request, and that the legacy
 * {@code accepted}/{@code closed} info log lines are gone.
 *
 * <p>For the keep-alive case, a long-lived TCP connection that handles N HTTP
 * requests produces N {@code QRestAccess} events — one per completed request,
 * all sharing a single session-scoped UUIDv7 trace-id (so a log viewer can
 * group them). A request that never reaches {@code SendResponse} (e.g. because
 * the client disconnected mid-flight) is flushed at {@code channelInactive} so
 * it is still recorded.</p>
 */
class RestSessionTest {
    private CapturingRestServer server;
    private CapturingRestSession session;
    private EmbeddedChannel channel;
    private LogListener captureListener;
    private final List<LogEvent> capturedLogEvents = Collections.synchronizedList(new ArrayList<>());

    @BeforeEach
    void setUp() throws Exception {
        server = new CapturingRestServer();
        server.setName("rest-test");
        server.setConfiguration(new SimpleConfiguration());
        captureListener = evt -> { capturedLogEvents.add(evt); return evt; };
        server.getLog().getLogger().addListener(captureListener);

        session = new CapturingRestSession(server);
        channel = new EmbeddedChannel(session);
    }

    @AfterEach
    void tearDown() {
        if (server != null && captureListener != null && server.getLog().getLogger() != null)
            server.getLog().getLogger().removeListener(captureListener);
        if (channel != null)
            channel.finishAndReleaseAll();
    }

    @Test
    void channelActiveDoesNotEmitAnything() {
        // EmbeddedChannel construction already fires channelActive on the handler.
        assertEquals(0, session.emitted.size(),
          "channelActive must not emit a QRest audit event");
        assertNoLegacyAcceptOrCloseLogs();
    }

    @Test
    void emitsExactlyOneQRestAccessPerCompletedRequest() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/balance?secret=hunter2");
        channel.writeInbound(request);

        // Mid-request: nothing emitted yet.
        assertEquals(0, session.emitted.size(),
          "no QRestAccess must be emitted before SendResponse runs");

        Context ctx = server.lastQueuedContext;
        assertNotNull(ctx, "RestSession.channelRead must have queued a transaction Context");
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
        new SendResponse().commit(1L, ctx);
        drainOutbound();

        // SendResponse completed the request → exactly one event, emitted now (not at close).
        assertEquals(1, session.emitted.size(),
          "exactly one QRestAccess must be emitted when SendResponse completes the request");

        QRestAccess evt = session.emitted.get(0);
        assertEquals("GET", evt.method());
        assertEquals("/balance", evt.path(),
          "query string must be stripped to avoid leaking sensitive params");
        assertEquals(Integer.valueOf(200), evt.status());
        assertEquals("TEST.Q", evt.queue());
        assertNotNull(evt.responseBytes());
        assertNotNull(evt.elapsed());
        assertTrue(evt.elapsed() >= 0L);
        assertNotNull(evt.ts());

        UUID traceId = session.traceIds.get(0);
        assertNotNull(traceId, "trace-id must be generated for the session and passed to emitAccessLog");
        assertIsUuidV7(traceId);

        // Closing the channel must NOT produce an additional event — the request was already accounted for.
        channel.close().syncUninterruptibly();
        assertEquals(1, session.emitted.size(),
          "channelInactive must not double-count a request that SendResponse already emitted");

        assertNoLegacyAcceptOrCloseLogs();
    }

    @Test
    void keepAliveRequestsShareOneTraceId() {
        // Three HTTP requests sharing a single keep-alive TCP session.
        sendAndRespond(HttpMethod.GET,    "/one");
        sendAndRespond(HttpMethod.POST,   "/two");
        sendAndRespond(HttpMethod.DELETE, "/three");

        assertEquals(3, session.emitted.size(),
          "each request on a keep-alive session must produce its own QRestAccess");

        UUID traceId = session.traceIds.get(0);
        assertNotNull(traceId);
        assertIsUuidV7(traceId);
        assertEquals(traceId, session.traceIds.get(1),
          "all events from the same TCP session must share one trace-id");
        assertEquals(traceId, session.traceIds.get(2),
          "all events from the same TCP session must share one trace-id");

        channel.close().syncUninterruptibly();
        assertEquals(3, session.emitted.size(),
          "channelInactive must not emit anything when every request was already drained");

        assertNoLegacyAcceptOrCloseLogs();
    }

    @Test
    void differentSessionsGetDifferentTraceIds() {
        sendAndRespond(HttpMethod.GET, "/first");
        UUID firstTraceId = session.traceIds.get(0);

        // Second session: tear down and recreate.
        if (server.getLog().getLogger() != null && captureListener != null)
            server.getLog().getLogger().removeListener(captureListener);
        channel.finishAndReleaseAll();

        capturedLogEvents.clear();
        captureListener = evt -> { capturedLogEvents.add(evt); return evt; };
        server.getLog().getLogger().addListener(captureListener);
        session = new CapturingRestSession(server);
        channel = new EmbeddedChannel(session);
        sendAndRespond(HttpMethod.GET, "/second");
        UUID secondTraceId = session.traceIds.get(0);

        assertNotEquals(firstTraceId, secondTraceId,
          "each TCP session must get its own UUIDv7 trace-id");
    }

    @Test
    void flushesResidualRequestAtCloseWhenSendResponseNeverRan() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.POST, "/orders");
        channel.writeInbound(request);

        // Client drops the connection before SendResponse runs.
        channel.close().syncUninterruptibly();

        assertEquals(1, session.emitted.size(),
          "channelInactive must flush a residual in-flight request as a QRestAccess summary");
        QRestAccess evt = session.emitted.get(0);
        assertEquals("POST", evt.method());
        assertEquals("/orders", evt.path());
        assertNull(evt.status(),
          "status must be null when SendResponse never ran");
        assertNotNull(session.traceIds.get(0),
          "residual events at channelInactive must still carry the session trace-id");

        assertNoLegacyAcceptOrCloseLogs();
    }

    @Test
    void emitsNothingIfChannelClosesWithoutAnyRequest() {
        channel.close().syncUninterruptibly();

        assertEquals(0, session.emitted.size(),
          "no QRest audit event must be emitted when no request was processed");
        assertNoLegacyAcceptOrCloseLogs();
    }

    private void sendAndRespond(HttpMethod method, String uri) {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, method, uri);
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        channel.writeInbound(request);

        Context ctx = server.lastQueuedContext;
        assertNotNull(ctx, "RestSession.channelRead must have queued a transaction Context for " + method + " " + uri);
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
        new SendResponse().commit(1L, ctx);
        drainOutbound();
    }

    private void drainOutbound() {
        FullHttpResponse outbound = channel.readOutbound();
        while (outbound != null) {
            outbound.release();
            outbound = channel.readOutbound();
        }
    }

    private static void assertIsUuidV7(UUID uuid) {
        assertEquals(7, uuid.version(),
          "trace-id must be a UUIDv7 (got version " + uuid.version() + ")");
        assertEquals(2, uuid.variant(),
          "trace-id must use the RFC 9562 variant (got variant " + uuid.variant() + ")");
    }

    private void assertNoLegacyAcceptOrCloseLogs() {
        synchronized (capturedLogEvents) {
            for (LogEvent evt : capturedLogEvents) {
                List<Object> payload = evt.getPayLoad();
                synchronized (payload) {
                    for (Object m : payload) {
                        if (m instanceof String s) {
                            if (s.startsWith("accepted:") || s.startsWith("closed:"))
                                throw new AssertionError(
                                  "legacy '" + s + "' log line must not be emitted; tag=" + evt.getTag());
                        }
                    }
                }
            }
        }
    }

    /** Subclass that captures emitted QRestAccess events (and their session trace-ids) instead of going through Logger. */
    private static class CapturingRestSession extends RestSession {
        final List<QRestAccess> emitted = Collections.synchronizedList(new ArrayList<>());
        final List<UUID> traceIds = Collections.synchronizedList(new ArrayList<>());

        CapturingRestSession(RestServer server) {
            super(server);
        }

        @Override
        protected void emitAccessLog(QRestAccess access, UUID traceId) {
            emitted.add(access);
            traceIds.add(traceId);
        }
    }

    /** RestServer test double whose queue() captures the Context instead of dispatching to a Space. */
    private static class CapturingRestServer extends RestServer {
        Context lastQueuedContext;

        @Override
        public void queue(io.netty.handler.codec.http.FullHttpRequest request, Context ctx) {
            lastQueuedContext = ctx;
            io.netty.channel.ChannelHandlerContext ch = ctx.get(Constants.SESSION);
            if (ch != null) {
                RestAccessState state = ch.channel().attr(RestSession.ACCESS_STATE).get();
                if (state != null)
                    state.queue = "TEST.Q";
            }
        }
    }
}
