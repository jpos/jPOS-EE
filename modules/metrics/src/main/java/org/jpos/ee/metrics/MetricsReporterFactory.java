package org.jpos.ee.metrics;

import com.codahale.metrics.ScheduledReporter;
import org.jpos.core.XmlConfigurable;

import java.util.concurrent.TimeUnit;

public interface MetricsReporterFactory extends XmlConfigurable {

    long getOutputFrequency();

    TimeUnit getOutputFrequencyUnit();

    ScheduledReporter build(Metrics metrics);
}
