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

package org.jpos.kafka.metrics;

import io.micrometer.core.instrument.*;
import org.jpos.util.Log;
import org.jpos.metrics.Metrics;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/**
 * Conditional Micrometer metrics collector with graceful degradation.
 *
 * <p>Provides a facade for Micrometer metrics that:
 * <ul>
 *   <li>Auto-detects MeterRegistry availability via org.jpos.metrics.Metrics</li>
 *   <li>Gracefully degrades to no-op mode if Micrometer unavailable</li>
 *   <li>Thread-safe metric registration</li>
 *   <li>Tag support for multi-dimensional metrics</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * MetricsCollector metrics = MetricsCollector.forComponent("kafka-streams", config, log);
 *
 * // Counter
 * metrics.counter("operations", "type", "read").increment();
 *
 * // Timer
 * metrics.timer("duration", "operation", "write").record(() -> doWrite());
 *
 * // Gauge
 * metrics.gauge("error-count", errorCount, AtomicInteger::get);
 * </pre>
 */
public class MetricsCollector {
    private final MeterRegistry registry;
    private final Tags commonTags;
    private final boolean enabled;
    private final Log log;

    /**
     * Create a MetricsCollector for a component.
     * @param componentType the component type (e.g., "kafka-streams", "kafka-producer")
     * @param qbeanName the QBean name for distinguishing instances (may be null)
     * @param metricsEnabled whether metrics are enabled
     * @param log logger for warnings
     * @return MetricsCollector instance (may be no-op)
     */
    public static MetricsCollector forComponent(String componentType, String qbeanName, boolean metricsEnabled, Log log) {
        String name = qbeanName != null ? qbeanName : "unnamed";
        if (!metricsEnabled) {
            return new MetricsCollector(null, Tags.of("component", componentType, "name", name), false, log);
        }

        MeterRegistry registry = Metrics.getMeterRegistry();
        return new MetricsCollector(registry, Tags.of("component", componentType, "name", name), registry != null, log);
    }

    /**
     * Create a MetricsCollector with additional custom tags.
     * @param componentType the component type
     * @param qbeanName the QBean name (may be null)
     * @param additionalTags additional tags to include
     * @param metricsEnabled whether metrics are enabled
     * @param log logger for warnings
     * @return MetricsCollector instance (may be no-op)
     */
    public static MetricsCollector forComponent(String componentType, String qbeanName, Tags additionalTags, boolean metricsEnabled, Log log) {
        String name = qbeanName != null ? qbeanName : "unnamed";
        Tags baseTags = Tags.of("component", componentType, "name", name);
        Tags allTags = baseTags.and(additionalTags);

        if (!metricsEnabled) {
            return new MetricsCollector(null, allTags, false, log);
        }

        MeterRegistry registry = Metrics.getMeterRegistry();
        return new MetricsCollector(registry, allTags, registry != null, log);
    }

    private MetricsCollector(MeterRegistry registry, Tags commonTags, boolean enabled, Log log) {
        this.registry = registry;
        this.commonTags = commonTags;
        this.enabled = enabled;
        this.log = log;
    }

    /**
     * Create or retrieve a counter metric.
     * @param name the metric name
     * @param tags additional tags (key1, value1, key2, value2, ...)
     * @return Counter instance (may be no-op)
     */
    public Counter counter(String name, String... tags) {
        if (!enabled) {
            return NoOpCounter.INSTANCE;
        }
        try {
            return Counter.builder(name)
                .tags(commonTags)
                .tags(tags)
                .register(registry);
        } catch (Exception e) {
            logMetricError("counter", name, e);
            return NoOpCounter.INSTANCE;
        }
    }

    /**
     * Create or retrieve a timer metric.
     * @param name the metric name
     * @param tags additional tags (key1, value1, key2, value2, ...)
     * @return Timer instance (may be no-op)
     */
    public Timer timer(String name, String... tags) {
        if (!enabled) {
            return NoOpTimer.INSTANCE;
        }
        try {
            return Timer.builder(name)
                .tags(commonTags)
                .tags(tags)
                .register(registry);
        } catch (Exception e) {
            logMetricError("timer", name, e);
            return NoOpTimer.INSTANCE;
        }
    }

    /**
     * Create or retrieve a gauge metric.
     * @param name the metric name
     * @param stateObject the object to observe
     * @param valueFunction function to extract numeric value from stateObject
     * @param tags additional tags (key1, value1, key2, value2, ...)
     * @param <T> type of state object
     * @return the observed stateObject
     */
    public <T> T gauge(String name, T stateObject, ToDoubleFunction<T> valueFunction, String... tags) {
        if (!enabled) {
            return stateObject;
        }
        try {
            Gauge.builder(name, stateObject, valueFunction)
                .tags(commonTags)
                .tags(tags)
                .register(registry);
        } catch (Exception e) {
            logMetricError("gauge", name, e);
        }
        return stateObject;
    }

    /**
     * Record a timed operation.
     * @param timerName the timer metric name
     * @param operation the operation to time
     * @param tags additional tags (key1, value1, key2, value2, ...)
     * @param <T> return type of operation
     * @return the result of the operation
     */
    public <T> T recordTimer(String timerName, Callable<T> operation, String... tags) {
        if (!enabled) {
            try {
                return operation.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Timer timer = timer(timerName, tags);
            return timer.recordCallable(operation);
        } catch (Exception e) {
            throw new RuntimeException("Error recording timer: " + timerName, e);
        }
    }

    /**
     * Record a timed operation (void).
     * @param timerName the timer metric name
     * @param operation the operation to time
     * @param tags additional tags (key1, value1, key2, value2, ...)
     */
    public void recordTimer(String timerName, Runnable operation, String... tags) {
        if (!enabled) {
            operation.run();
            return;
        }
        Timer timer = timer(timerName, tags);
        timer.record(operation);
    }

    /**
     * Check if metrics collection is enabled.
     * @return true if metrics are enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    private void logMetricError(String type, String name, Exception e) {
        if (log != null) {
            log.warn("Failed to register " + type + " metric '" + name + "': " + e.getMessage());
        }
    }

    /**
     * No-op Counter implementation.
     */
    private static class NoOpCounter implements Counter {
        static final NoOpCounter INSTANCE = new NoOpCounter();

        @Override public void increment() {}
        @Override public void increment(double amount) {}
        @Override public double count() { return 0; }
        @Override public Id getId() { return new Id("noop", Tags.empty(), null, null, Type.COUNTER); }
    }

    /**
     * No-op Timer implementation.
     */
    private static class NoOpTimer implements Timer {
        static final NoOpTimer INSTANCE = new NoOpTimer();

        @Override public void record(long amount, java.util.concurrent.TimeUnit unit) {}
        @Override public void record(java.time.Duration duration) {}
        @Override public <T> T recordCallable(Callable<T> f) throws Exception { return f.call(); }
        @Override public <T> T record(Supplier<T> f) { return f.get(); }
        @Override public void record(Runnable f) { f.run(); }
        @Override public Runnable wrap(Runnable f) { return f; }
        @Override public <T> Callable<T> wrap(Callable<T> f) { return f; }
        @Override public <T> Supplier<T> wrap(Supplier<T> f) { return f; }
        @Override public long count() { return 0; }
        @Override public double totalTime(java.util.concurrent.TimeUnit unit) { return 0; }
        @Override public double max(java.util.concurrent.TimeUnit unit) { return 0; }
        @Override public double mean(java.util.concurrent.TimeUnit unit) { return 0; }
        @Override public Id getId() { return new Id("noop", Tags.empty(), null, null, Type.TIMER); }
        @Override public java.util.concurrent.TimeUnit baseTimeUnit() { return java.util.concurrent.TimeUnit.NANOSECONDS; }
        @Override public io.micrometer.core.instrument.distribution.HistogramSnapshot takeSnapshot() {
            return io.micrometer.core.instrument.distribution.HistogramSnapshot.empty(0, 0, 0);
        }
    }
}
