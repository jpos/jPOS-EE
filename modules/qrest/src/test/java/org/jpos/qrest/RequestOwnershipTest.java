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

import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.cors.CorsConfig;
import io.netty.handler.codec.http.cors.CorsConfigBuilder;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.jpos.core.SimpleConfiguration;
import org.jpos.qrest.evt.QRestAccess;
import org.jpos.space.TSpace;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class RequestOwnershipTest {
    private final List<QRestAccess> events = new ArrayList<>();
    private SimpleMeterRegistry registry;
    private QueueServer server;
    private RestSession session;
    private EmbeddedChannel channel;

    @BeforeEach
    void setUp() throws Exception {
        registry = new SimpleMeterRegistry();
        server = new QueueServer();
        server.setName("ownership-test");
        Properties props = new Properties();
        props.setProperty("queue", "REQUESTS");
        props.setProperty("request-timeout", "1");
        server.setConfiguration(new SimpleConfiguration(props));
        session = new RestSession(server) {
            @Override
            protected void emitAccessLog(QRestAccess event, UUID traceId) {
                events.add(event);
            }
        };
        channel = new EmbeddedChannel(session);
        channel.freezeTime();
    }

    @AfterEach
    void tearDown() {
        channel.finishAndReleaseAll();
        registry.close();
    }

    @Test
    void aggregatedPooledBodyIsReleasedBeforeTheContextCanExpire() throws Exception {
        channel.pipeline().addFirst(new HttpObjectAggregator(1024));
        ByteBuf first = PooledByteBufAllocator.DEFAULT.directBuffer().writeBytes("hello ".getBytes());
        ByteBuf second = PooledByteBufAllocator.DEFAULT.directBuffer().writeBytes("world".getBytes());
        DefaultHttpRequest head = new DefaultHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST, "/aggregate");
        HttpUtil.setTransferEncodingChunked(head, true);
        channel.writeInbound(head, new DefaultHttpContent(first), new DefaultLastHttpContent(second));
        assertEquals(0, first.refCnt());
        assertEquals(0, second.refCnt());
        FullHttpRequest detached = server.last.get(Constants.REQUEST);
        assertFalse(detached.content().isDirect());
        assertEquals("hello world", detached.content().toString(CharsetUtil.UTF_8));
        // Exercise the actual RestServer.queue path, with a short Space lease.
        assertEquals(60000L, server.space.requestedLease);
        Thread.sleep(20);
        assertNull(server.space.rdp("REQUESTS"));
        assertTrue(channel.isActive(), "expiry must not require a disconnect to free pooled storage");
        channel.advanceTimeBy(2, TimeUnit.SECONDS);
        channel.runScheduledPendingTasks();
        assertFalse(channel.isActive());
        assertEquals(1, events.size());
        assertNull(events.getFirst().status());
        assertEquals(0, server.metrics.activeRequests());
        assertTrue(channel.attr(RestSession.PENDING).get().isEmpty());
    }

    @Test
    void disconnectAndHandlerRemovalDoNotInvalidateAPickedUpRequest() {
        server.space.lease = 60000L;
        FullHttpRequest source = request("/body", "payload");
        source.headers().set("Authorization", "Bearer test-credential");
        source.trailingHeaders().set("X-Trailer", "value");
        channel.writeInbound(source);
        Context ctx = server.space.inp("REQUESTS");
        assertNotNull(ctx);
        FullHttpRequest detached = ctx.get(Constants.REQUEST);
        assertEquals(0, source.refCnt());
        source.headers().set("Authorization", "changed");
        channel.pipeline().remove(session);
        channel.close();
        assertEquals("payload", detached.content().toString(CharsetUtil.UTF_8));
        assertEquals("Bearer test-credential", detached.headers().get("Authorization"));
        assertEquals("value", detached.trailingHeaders().get("X-Trailer"));
        assertFalse(detached.toString().contains("test-credential"));
        FullHttpResponse response = response();
        ctx.put(Constants.RESPONSE, response);
        new SendResponse().commit(1, ctx);
        assertEquals(0, response.refCnt(), "late response is not handed to a closed channel");
        assertEquals("payload", detached.content().toString(CharsetUtil.UTF_8));
        assertEquals(1, events.size());
        assertEquals(0, server.metrics.activeRequests());
    }

    @Test
    void participantCanReadWhileTheChannelCloses() throws Exception {
        server.space.lease = 60000L;
        FullHttpRequest source = request("/concurrent-read", "still readable");
        channel.writeInbound(source);
        Context ctx = server.space.inp("REQUESTS");
        FullHttpRequest detached = ctx.get(Constants.REQUEST);
        CyclicBarrier start = new CyclicBarrier(2);
        try (var workers = Executors.newSingleThreadExecutor()) {
            var read = workers.submit(() -> {
                start.await();
                for (int i = 0; i < 1000; i++)
                    assertEquals("still readable", detached.content().toString(CharsetUtil.UTF_8));
                return detached.content().toString(CharsetUtil.UTF_8);
            });
            start.await(5, TimeUnit.SECONDS);
            channel.close();
            assertEquals("still readable", read.get(5, TimeUnit.SECONDS));
        }
        assertEquals(0, source.refCnt());
        assertEquals(1, events.size());
    }

    @Test
    void successfulRequestsCancelTheirDeadlinesAndKeepTheirOwnAccessState() {
        channel.writeInbound(request("/first", "one"));
        Context first = server.last;
        channel.writeInbound(request("/second", "two"));
        Context second = server.last;
        first.put(Constants.RESPONSE, response());
        second.put(Constants.RESPONSE, response());
        new SendResponse().commit(1, first);
        new SendResponse().abort(2, second);
        assertEquals(List.of("/first", "/second"), events.stream().map(QRestAccess::path).toList());
        assertEquals(0, server.metrics.activeRequests());
        channel.advanceTimeBy(2, TimeUnit.SECONDS);
        channel.runScheduledPendingTasks();
        assertTrue(channel.isActive(), "completed requests must not close a reused connection");
        assertEquals(2, events.size());
    }

    @Test
    void handlerRemovalCompletesEveryOutstandingRequestOnce() {
        channel.writeInbound(request("/first", "one"), request("/second", "two"));
        channel.pipeline().remove(session);
        assertEquals(2, events.size());
        assertEquals(0, server.metrics.activeRequests());
        channel.close();
        channel.advanceTimeBy(2, TimeUnit.SECONDS);
        channel.runScheduledPendingTasks();
        assertEquals(2, events.size());
    }

    @Test
    void responseWriteFailureIsNotLoggedAsSuccess() {
        channel.pipeline().addFirst(new ChannelOutboundHandlerAdapter() {
            @Override
            public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
                ReferenceCountUtil.release(msg);
                promise.setFailure(new IllegalStateException("write failed"));
            }
        });
        channel.writeInbound(request("/failure", "body"));
        FullHttpResponse response = response();
        server.last.put(Constants.RESPONSE, response);
        new SendResponse().commit(1, server.last);
        assertEquals(0, response.refCnt());
        assertEquals(1, events.size());
        assertNull(events.getFirst().status());
        assertEquals(0, server.metrics.activeRequests());
    }

    @Test
    void concurrentCompletionRecordsOneAccessAndOneMetric() throws Exception {
        channel.writeInbound(request("/race", "body"));
        Context ctx = server.last;
        RestAccessState state = RestSession.accessState(ctx);
        ChannelHandlerContext ch = ctx.get(Constants.SESSION);
        CyclicBarrier start = new CyclicBarrier(2);
        try (var workers = Executors.newFixedThreadPool(2)) {
            var success = workers.submit(() -> {
                start.await();
                return RestSession.completeAccess(ch, state, 200, 0L);
            });
            var disconnect = workers.submit(() -> {
                start.await();
                return RestSession.completeAccess(ch, state, null, null);
            });
            assertNotEquals(success.get(5, TimeUnit.SECONDS), disconnect.get(5, TimeUnit.SECONDS));
        }
        assertEquals(1, events.size());
        assertEquals(0, server.metrics.activeRequests());
    }

    @Test
    void enqueueFailureReleasesTransportAndCompletesAccess() {
        server.failQueue = true;
        FullHttpRequest source = request("/enqueue-failure", "body");
        channel.writeInbound(source);
        assertEquals(0, source.refCnt());
        assertEquals(1, events.size());
        assertEquals(500, events.getFirst().status());
        assertEquals(0, server.metrics.activeRequests());
    }

    @Test
    void corsPreflightReleasesPooledRequestWithoutQueueing() {
        assertCorsOwnership(true, "https://allowed.test", HttpResponseStatus.OK);
    }

    @Test
    void corsForbiddenRequestIsReleasedWithoutQueueing() {
        assertCorsOwnership(false, "https://denied.test", HttpResponseStatus.FORBIDDEN);
    }

    @Test
    void corsPassThroughTransfersOwnershipDownstream() {
        // EmbeddedChannel captures unhandled inbound messages instead of releasing
        // them like a normal pipeline tail. Install an explicit consuming handler.
        java.util.concurrent.atomic.AtomicBoolean consumed = new java.util.concurrent.atomic.AtomicBoolean();
        channel.pipeline().addLast(new ChannelInboundHandlerAdapter() {
            @Override
            public void channelRead(ChannelHandlerContext ctx, Object msg) {
                consumed.set(true);
                ReferenceCountUtil.release(msg);
            }
        });
        assertCorsOwnership(false, "https://allowed.test", null);
        assertTrue(consumed.get());
    }

    private void assertCorsOwnership(boolean preflight, String origin, HttpResponseStatus expected) {
        server.cors = CorsConfigBuilder.forOrigin("https://allowed.test")
          .allowedRequestMethods(HttpMethod.POST).shortCircuit().build();
        FullHttpRequest source = request("/cors", "body");
        source.setMethod(HttpMethod.OPTIONS);
        source.headers().set(HttpHeaderNames.ORIGIN, origin);
        if (preflight)
            source.headers().set(HttpHeaderNames.ACCESS_CONTROL_REQUEST_METHOD, "POST");
        channel.writeInbound(source);
        assertEquals(0, source.refCnt());
        assertNull(server.last, "CORS-handled OPTIONS must not reach the TM queue");
        assertEquals(0, server.metrics.activeRequests());
        FullHttpResponse response = channel.readOutbound();
        if (expected == null) {
            assertNull(response);
        } else {
            assertNotNull(response);
            try {
                assertEquals(expected, response.status());
            } finally {
                response.release();
            }
        }
    }

    @Test
    void nullMessageExceptionReturnsGeneric500() {
        assertGenericError(new RuntimeException());
    }

    @Test
    void exceptionMessageIsNotExposedToTheClient() {
        assertGenericError(new RuntimeException("private server diagnostic"));
    }

    private void assertGenericError(Throwable error) {
        channel.writeInbound(request("/exception", "body"));
        channel.pipeline().fireExceptionCaught(error);
        FullHttpResponse response = channel.readOutbound();
        assertNotNull(response);
        try {
            assertEquals(HttpResponseStatus.INTERNAL_SERVER_ERROR, response.status());
            assertEquals("Internal Server Error", response.content().toString(CharsetUtil.UTF_8));
        } finally {
            response.release();
        }
        assertFalse(channel.isActive());
        assertEquals(1, events.size());
        assertEquals(500, events.getFirst().status());
        assertEquals(0, server.metrics.activeRequests());
    }

    private static FullHttpRequest request(String path, String body) {
        ByteBuf buffer = PooledByteBufAllocator.DEFAULT.directBuffer();
        buffer.writeCharSequence(body, CharsetUtil.UTF_8);
        FullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST, path, buffer);
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        return request;
    }

    private static FullHttpResponse response() {
        return new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,
          PooledByteBufAllocator.DEFAULT.directBuffer().writeByte(1));
    }

    private class QueueServer extends RestServer {
        final QRestMetrics metrics = new QRestMetrics(registry, "ownership-test", QRestMetrics.PathLabel.ROUTE, 100);
        final ShortLeaseSpace space = new ShortLeaseSpace();
        Context last;
        boolean failQueue;
        CorsConfig cors;

        @Override
        public CorsConfig getCorsConfig(FullHttpRequest request) {
            return cors;
        }

        QueueServer() throws Exception {
            var field = RestServer.class.getDeclaredField("sp");
            field.setAccessible(true);
            field.set(this, space);
        }

        @Override
        public void queue(FullHttpRequest request, Context ctx) {
            if (failQueue)
                throw new IllegalStateException("queue failed");
            last = ctx;
            super.queue(request, ctx);
        }

        @Override
        QRestMetrics getMetrics() {
            return metrics;
        }
    }

    private static class ShortLeaseSpace extends TSpace<String, Context> {
        long lease = 1L;
        long requestedLease;
        @Override
        public void out(String key, Context value, long timeout) {
            requestedLease = timeout;
            super.out(key, value, lease);
        }
    }
}
