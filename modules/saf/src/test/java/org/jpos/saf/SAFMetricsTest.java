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
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SAFMetricsTest {
    @Test
    void noopWhenRegistryIsNull() {
        SAFMetrics metrics = new SAFMetrics(null, "saf");
        assertFalse(metrics.isEnabled());

        metrics.registerQueueDepthGauge(() -> 3);
        metrics.sendCompleted(1_000L);
        metrics.sendSucceeded("0200", "00");
        metrics.sendRetried("0200", "91");
        metrics.sendExpired("0200", "expired");
        metrics.sendDiscarded("0200", "not-in-valid-codes");
    }

    @Test
    void registersQueueDepthGauge() {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAFMetrics metrics = new SAFMetrics(registry, "saf");

        metrics.registerQueueDepthGauge(() -> 7);

        Gauge gauge = registry.find("jpos.saf.queue.size").tag("saf", "saf").gauge();
        assertNotNull(gauge);
        assertEquals(7.0, gauge.value(), 0.0001);
    }

    @Test
    void recordsSendDuration() {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAFMetrics metrics = new SAFMetrics(registry, "saf");

        metrics.sendCompleted(TimeUnit.MILLISECONDS.toNanos(25));

        Timer timer = registry.find("jpos.saf.send.duration").tag("saf", "saf").timer();
        assertNotNull(timer);
        assertEquals(1L, timer.count());
        assertTrue(timer.totalTime(TimeUnit.MILLISECONDS) >= 25.0);
    }

    @Test
    void recordsOutcomeCountersWithTags() {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        SAFMetrics metrics = new SAFMetrics(registry, "saf");

        metrics.sendSucceeded("0200", "00");
        metrics.sendRetried("0200", "91");
        metrics.sendExpired("0200", "expired");
        metrics.sendDiscarded("0200", "not-in-valid-codes");

        Counter success = registry.find("jpos.saf.send.success")
          .tags("saf", "saf", "mti", "0200", "rc", "00")
          .counter();
        Counter retried = registry.find("jpos.saf.send.retried")
          .tags("saf", "saf", "mti", "0200", "rc", "91")
          .counter();
        Counter expired = registry.find("jpos.saf.send.expired")
          .tags("saf", "saf", "mti", "0200", "reason", "expired")
          .counter();
        Counter discarded = registry.find("jpos.saf.send.discarded")
          .tags("saf", "saf", "mti", "0200", "reason", "not-in-valid-codes")
          .counter();

        assertNotNull(success);
        assertNotNull(retried);
        assertNotNull(expired);
        assertNotNull(discarded);
        assertEquals(1.0, success.count(), 0.0001);
        assertEquals(1.0, retried.count(), 0.0001);
        assertEquals(1.0, expired.count(), 0.0001);
        assertEquals(1.0, discarded.count(), 0.0001);
    }
}
