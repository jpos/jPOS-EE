package org.jpos.ee.metrics;

import com.codahale.metrics.ScheduledReporter;
import org.jpos.core.XmlConfigurable;

import java.util.concurrent.TimeUnit;

public abstract class MetricReporterFactory implements XmlConfigurable {

    public abstract long getOutputFrequency();

    public abstract TimeUnit getOutputFrequencyUnit();

    public abstract ScheduledReporter build(Metrics metrics);
}
