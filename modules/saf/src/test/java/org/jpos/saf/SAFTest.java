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

package org.jpos.saf;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOResponseListener;
import org.jpos.iso.MUX;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SAFTest {
    @Test
    void initServiceCreatesMetricsAccessorWithoutServer() {
        SAF saf = new SAF();
        saf.setName("test-saf");

        saf.initService();

        assertNotNull(saf.getSAFMetrics());
    }

    @Test
    void sendCountsSuccessfulResponses() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(response("0210", "00")));
        SAF.Entry entry = new SAF.Entry(request("0200"));

        SAF.Entry result = invokeSend(saf, entry);

        assertNull(result);
        assertCounter(registry, "jpos.saf.send.success", "saf", "test-saf", "mti", "0200", "rc", "00");
        assertTimer(registry);
    }

    @Test
    void sendCountsRetryResponses() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(response("0210", "91")));
        saf.retryResponseCodes = "91";
        SAF.Entry entry = new SAF.Entry(request("0200"));

        SAF.Entry result = invokeSend(saf, entry);

        assertSame(entry, result);
        assertCounter(registry, "jpos.saf.send.retried", "saf", "test-saf", "mti", "0200", "rc", "91");
        assertTimer(registry);
    }

    @Test
    void sendCountsDiscardedResponsesOutsideValidCodes() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(response("0210", "05")));
        SAF.Entry entry = new SAF.Entry(request("0200"));

        SAF.Entry result = invokeSend(saf, entry);

        assertSame(entry, result);
        assertCounter(registry, "jpos.saf.send.discarded", "saf", "test-saf", "mti", "0200", "reason", "not-in-valid-codes");
        assertTimer(registry);
    }

    @Test
    void sendCountsExpiredMessages() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(null));
        saf.expiration = 1L;
        SAF.Entry entry = new SAF.Entry(request("0200"));
        entry.time = System.currentTimeMillis() - 5_000L;

        SAF.Entry result = invokeSend(saf, entry);

        assertNull(result);
        assertCounter(registry, "jpos.saf.send.expired", "saf", "test-saf", "mti", "0200", "reason", "expired");
    }

    @Test
    void sendCountsMaxRetransmissionMessages() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(null));
        saf.maxRetransmissions = 1;
        SAF.Entry entry = new SAF.Entry(request("0200"));
        entry.count = 2;

        SAF.Entry result = invokeSend(saf, entry);

        assertNull(result);
        assertCounter(registry, "jpos.saf.send.expired", "saf", "test-saf", "mti", "0200", "reason", "max-retransmissions");
    }

    @Test
    void sendCountsBothIgnoreReasonsWhenEntryIsExpiredAndMaxRetransmissionsExceeded() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF saf = newSAF(registry, new StaticMux(null));
        saf.expiration = 1L;
        saf.maxRetransmissions = 1;
        SAF.Entry entry = new SAF.Entry(request("0200"));
        entry.time = System.currentTimeMillis() - 5_000L;
        entry.count = 2;

        SAF.Entry result = invokeSend(saf, entry);

        assertNull(result);
        assertCounter(registry, "jpos.saf.send.expired", "saf", "test-saf", "mti", "0200", "reason", "expired");
        assertCounter(registry, "jpos.saf.send.expired", "saf", "test-saf", "mti", "0200", "reason", "max-retransmissions");
    }

    @Test
    void sendRecordsDurationOnTimeoutAndIsoException() throws Exception {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAF timeoutSaf = newSAF(registry, new StaticMux(null));

        SAF.Entry timeoutResult = invokeSend(timeoutSaf, new SAF.Entry(request("0200")));
        assertNotNull(timeoutResult);
        assertEquals(1L, registry.find("jpos.saf.send.duration").timer().count());

        SimpleMeterRegistry exceptionRegistry = new SimpleMeterRegistry();
        SAF exceptionSaf = newSAF(exceptionRegistry, new ThrowingMux());

        SAF.Entry exceptionResult = invokeSend(exceptionSaf, new SAF.Entry(request("0200")));
        assertNotNull(exceptionResult);
        assertEquals(1L, exceptionRegistry.find("jpos.saf.send.duration").timer().count());
    }

    private static SAF newSAF(SimpleMeterRegistry registry, MUX mux) {
        SAF saf = new SAF();
        saf.setName("test-saf");
        saf.metrics = new SAFMetrics(registry, saf.getName());
        saf.mux = mux;
        saf.validResponseCodes = "00";
        saf.waitForResponse = 1_000L;
        saf.flagRetransmissions = "";
        return saf;
    }

    private static SAF.Entry invokeSend(SAF saf, SAF.Entry entry) throws Exception {
        Method method = SAF.class.getDeclaredMethod("send", SAF.Entry.class);
        method.setAccessible(true);
        try {
            return (SAF.Entry) method.invoke(saf, entry);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception ex)
                throw ex;
            throw e;
        }
    }

    private static ISOMsg request(String mti) {
        return new ISOMsg(mti);
    }

    private static ISOMsg response(String mti, String rc) throws ISOException {
        ISOMsg response = new ISOMsg(mti);
        response.set(39, rc);
        return response;
    }

    private static void assertCounter(SimpleMeterRegistry registry, String name, String... tags) {
        Counter counter = registry.find(name).tags(tags).counter();
        assertNotNull(counter);
        assertEquals(1.0, counter.count(), 0.0001);
    }

    private static void assertTimer(SimpleMeterRegistry registry) {
        Timer timer = registry.find("jpos.saf.send.duration").tag("saf", "test-saf").timer();
        assertNotNull(timer);
        assertEquals(1L, timer.count());
        assertTrue(timer.totalTime(TimeUnit.NANOSECONDS) >= 0L);
    }

    private static final class StaticMux implements MUX {
        private final ISOMsg response;

        private StaticMux(ISOMsg response) {
            this.response = response;
        }

        @Override
        public ISOMsg request(ISOMsg m, long timeout) {
            return response;
        }

        @Override
        public void request(ISOMsg m, long timeout, ISOResponseListener r, Object handBack) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void send(ISOMsg m) throws IOException, ISOException {
        }

        @Override
        public boolean isConnected() {
            return true;
        }
    }

    private static final class ThrowingMux implements MUX {
        @Override
        public ISOMsg request(ISOMsg m, long timeout) throws ISOException {
            throw new ISOException("boom");
        }

        @Override
        public void request(ISOMsg m, long timeout, ISOResponseListener r, Object handBack) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void send(ISOMsg m) throws IOException, ISOException {
        }

        @Override
        public boolean isConnected() {
            return true;
        }
    }
}
