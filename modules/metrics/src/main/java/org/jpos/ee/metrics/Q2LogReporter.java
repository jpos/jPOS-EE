package org.jpos.ee.metrics;

import com.codahale.metrics.*;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static com.codahale.metrics.MetricAttribute.*;

public class Q2LogReporter extends ScheduledReporter
{

    private final Log logger;
    private final String prefix;

    public Q2LogReporter(
        final MetricRegistry registry,
        final Log logger,
        final String prefix,
        final TimeUnit rateUnit,
        final TimeUnit durationUnit,
        final MetricFilter filter,
        final ScheduledExecutorService executor,
        final boolean shutdownExecutorOnStop,
        final Set<MetricAttribute> disabledMetricAttributes)
    {
        super(registry, "log-reporter", filter, rateUnit, durationUnit, executor, shutdownExecutorOnStop, disabledMetricAttributes);
        this.logger = Objects.requireNonNull(logger);
        this.prefix = Objects.toString(prefix, "");
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void report(
        final SortedMap<String, Gauge> gauges,
        final SortedMap<String, Counter> counters,
        final SortedMap<String, Histogram> histograms,
        final SortedMap<String, Meter> meters,
        final SortedMap<String, Timer> timers)
    {
        LogEvent event = logger.createInfo();
        for (Entry<String, Gauge> entry : gauges.entrySet())
        {
            logGauge(event, entry.getKey(), entry.getValue());
        }
        for (Entry<String, Counter> entry : counters.entrySet())
        {
            logCounter(event, entry.getKey(), entry.getValue());
        }
        for (Entry<String, Histogram> entry : histograms.entrySet())
        {
            logHistogram(event, entry.getKey(), entry.getValue());
        }
        for (Entry<String, Meter> entry : meters.entrySet())
        {
            logMeter(event, entry.getKey(), entry.getValue());
        }
        for (Entry<String, Timer> entry : timers.entrySet())
        {
            logTimer(event, entry.getKey(), entry.getValue());
        }
        Logger.log(event);
    }

    private void logTimer(
        final LogEvent event,
        final String name,
        final Timer timer)
    {
        Snapshot snapshot = timer.getSnapshot();
        appendCountIfEnabled(event, name, timer);
        appendLongDurationIfEnabled(event, name, MIN, snapshot::getMin);
        appendLongDurationIfEnabled(event, name, MAX, snapshot::getMax);
        appendDoubleDurationIfEnabled(event, name, MEAN, snapshot::getMean);
        appendDoubleDurationIfEnabled(event, name, STDDEV, snapshot::getStdDev);
        appendDoubleDurationIfEnabled(event, name, P50, snapshot::getMedian);
        appendDoubleDurationIfEnabled(event, name, P75, snapshot::get75thPercentile);
        appendDoubleDurationIfEnabled(event, name, P95, snapshot::get95thPercentile);
        appendDoubleDurationIfEnabled(event, name, P98, snapshot::get98thPercentile);
        appendDoubleDurationIfEnabled(event, name, P99, snapshot::get99thPercentile);
        appendDoubleDurationIfEnabled(event, name, P999, snapshot::get999thPercentile);
        appendMetered(event, name, timer);
        append(event, prefix(name, "rate_unit"), getRateUnit());
        append(event, prefix(name, "duration_unit"), getDurationUnit());
    }

    private void logMeter(
        final LogEvent event,
        final String name,
        final Meter meter)
    {
        appendCountIfEnabled(event, name, meter);
        appendMetered(event, name, meter);
        append(event, prefix(name, "rate_unit"), getRateUnit());
    }

    private void logHistogram(
        final LogEvent event,
        final String name,
        final Histogram histogram)
    {
        Snapshot snapshot = histogram.getSnapshot();
        appendCountIfEnabled(event, name, histogram);
        appendLongIfEnabled(event, name, MIN, snapshot::getMin);
        appendLongIfEnabled(event, name, MAX, snapshot::getMax);
        appendDoubleIfEnabled(event, name, MEAN, snapshot::getMean);
        appendDoubleIfEnabled(event, name, STDDEV, snapshot::getStdDev);
        appendDoubleIfEnabled(event, name, P50, snapshot::getMedian);
        appendDoubleIfEnabled(event, name, P75, snapshot::get75thPercentile);
        appendDoubleIfEnabled(event, name, P95, snapshot::get95thPercentile);
        appendDoubleIfEnabled(event, name, P98, snapshot::get98thPercentile);
        appendDoubleIfEnabled(event, name, P99, snapshot::get99thPercentile);
        appendDoubleIfEnabled(event, name, P999, snapshot::get999thPercentile);
    }

    private void logCounter(
        final LogEvent event,
        final String name,
        final Counter counter)
    {
        append(event, prefix(name, COUNT.getCode()), counter.getCount());
    }

    private void logGauge(
        final LogEvent event,
        final String name,
        final Gauge<?> gauge)
    {
        append(event, prefix(name), gauge.getValue());
    }

    private void appendLongDurationIfEnabled(
        final LogEvent event,
        final String name,
        final MetricAttribute metricAttribute,
        final Supplier<Long> durationSupplier)
    {
        if (!getDisabledMetricAttributes().contains(metricAttribute))
        {
            append(event, prefix(name, metricAttribute.getCode()), convertDuration(durationSupplier.get()));
        }
    }

    private void appendDoubleDurationIfEnabled(
        final LogEvent event,
        final String name,
        final MetricAttribute metricAttribute,
        final Supplier<Double> durationSupplier)
    {
        if (!getDisabledMetricAttributes().contains(metricAttribute))
        {
            append(event, prefix(name, metricAttribute.getCode()), convertDuration(durationSupplier.get()));
        }
    }

    private void appendLongIfEnabled(
        final LogEvent event,
        final String name,
        final MetricAttribute metricAttribute,
        final Supplier<Long> valueSupplier)
    {
        if (!getDisabledMetricAttributes().contains(metricAttribute))
        {
            append(event, prefix(name, metricAttribute.getCode()), valueSupplier.get());
        }
    }

    private void appendDoubleIfEnabled(
        final LogEvent event,
        final String name,
        final MetricAttribute metricAttribute,
        final Supplier<Double> valueSupplier)
    {
        if (!getDisabledMetricAttributes().contains(metricAttribute))
        {
            append(event, prefix(name, metricAttribute.getCode()), valueSupplier.get());
        }
    }

    private void appendCountIfEnabled(
        final LogEvent event,
        final String name,
        final Counting counting)
    {
        if (!getDisabledMetricAttributes().contains(COUNT))
        {
            append(event, prefix(name, COUNT.getCode()), counting.getCount());
        }
    }

    private void appendMetered(
        final LogEvent event,
        final String name,
        final Metered meter)
    {
        appendRateIfEnabled(event, name, M1_RATE, meter::getOneMinuteRate);
        appendRateIfEnabled(event, name, M5_RATE, meter::getFiveMinuteRate);
        appendRateIfEnabled(event, name, M15_RATE, meter::getFifteenMinuteRate);
        appendRateIfEnabled(event, name, MEAN_RATE, meter::getMeanRate);
    }

    private void appendRateIfEnabled(
        final LogEvent event,
        final String name,
        final MetricAttribute metricAttribute,
        final Supplier<Double> rateSupplier)
    {
        if (!getDisabledMetricAttributes().contains(metricAttribute))
        {
            append(event, prefix(name, metricAttribute.getCode()), convertRate(rateSupplier.get()));
        }
    }

    private void append(
        final LogEvent event,
        final String key,
        final long value)
    {
        event.addMessage(new StringBuilder().append(key).append('=').append(value));
    }

    private void append(
        final LogEvent event,
        final String key,
        final double value)
    {
        event.addMessage(new StringBuilder().append(key).append('=').append(value));
    }

    private void append(
        final LogEvent event,
        final String key,
        final String value)
    {
        event.addMessage(new StringBuilder().append(key).append('=').append(value));
    }

    private void append(
        final LogEvent event,
        final String key,
        final Object value)
    {
        event.addMessage(new StringBuilder().append(key).append('=').append(value));
    }

    @Override
    protected String getRateUnit()
    {
        return "events/" + super.getRateUnit();
    }

    private String prefix(String... components)
    {
        return MetricRegistry.name(prefix, components);
    }
}
