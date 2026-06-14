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
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.Timer;

import java.util.function.Supplier;

final class SAFMetrics {
    private static final String QUEUE_SIZE = "jpos.saf.queue.size";
    private static final String SEND_DURATION = "jpos.saf.send.duration";
    private static final String SEND_SUCCESS = "jpos.saf.send.success";
    private static final String SEND_RETRIED = "jpos.saf.send.retried";
    private static final String SEND_EXPIRED = "jpos.saf.send.expired";
    private static final String SEND_DISCARDED = "jpos.saf.send.discarded";

    private final MeterRegistry registry;
    private final String name;

    SAFMetrics(MeterRegistry registry, String name) {
        this.registry = registry;
        this.name = name;
    }

    boolean isEnabled() {
        return registry != null;
    }

    void registerQueueDepthGauge(Supplier<Number> supplier) {
        if (registry == null)
            return;
        Gauge.builder(QUEUE_SIZE, supplier)
          .tags(tags())
          .description("Current SAF queue depth")
          .register(registry);
    }

    void sendCompleted(long elapsedNanos) {
        if (registry == null)
            return;
        Timer.builder(SEND_DURATION)
          .tags(tags())
          .description("Time spent waiting for SAF send responses")
          .publishPercentileHistogram()
          .publishPercentiles(0.5, 0.95, 0.99)
          .register(registry)
          .record(Math.max(0L, elapsedNanos), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    void sendSucceeded(String mti, String rc) {
        if (registry == null)
            return;
        counter(SEND_SUCCESS, Tags.of("mti", mti, "rc", rc)).increment();
    }

    void sendRetried(String mti, String rc) {
        if (registry == null)
            return;
        counter(SEND_RETRIED, Tags.of("mti", mti, "rc", rc)).increment();
    }

    void sendExpired(String mti, String reason) {
        if (registry == null)
            return;
        counter(SEND_EXPIRED, Tags.of("mti", mti, "reason", reason)).increment();
    }

    void sendDiscarded(String mti, String reason) {
        if (registry == null)
            return;
        counter(SEND_DISCARDED, Tags.of("mti", mti, "reason", reason)).increment();
    }

    private Counter counter(String name, Tags tags) {
        return Counter.builder(name)
          .tags(tags().and(tags))
          .register(registry);
    }

    private Tags tags() {
        return Tags.of("saf", name);
    }
}
