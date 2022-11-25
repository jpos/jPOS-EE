package org.jpos.ee.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.SharedMetricRegistries;
import com.codahale.metrics.jvm.*;
import org.jdom2.Element;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QBeanSupport;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.Objects.requireNonNull;

public class Metrics extends QBeanSupport implements XmlConfigurable
{

    private final List<MetricReporterFactory> factories = new ArrayList<>();
    private final List<ScheduledReporter> reporters = new ArrayList<>();

    private MetricRegistry registry;
    private boolean defaultRegistry;

    @Override
    protected void startService()
    {
        if (registry == null)
        {
            registry = new MetricRegistry();
            setup(registry);
            SharedMetricRegistries.add(getName(), registry);

            if (defaultRegistry)
            {
                SharedMetricRegistries.setDefault(getName());
            }
        }
        for (MetricReporterFactory factory : factories)
        {
            ScheduledReporter reporter = factory.build(this);
            try
            {
                reporter.start(factory.getOutputFrequency(), factory.getOutputFrequencyUnit());
                reporters.add(reporter);
            } catch (Exception e)
            {
                log.error(e);
            }
        }
    }

    protected void setup(MetricRegistry metrics) {
        metrics.register("jvm.buffers", new BufferPoolMetricSet(ManagementFactory.getPlatformMBeanServer()));
        metrics.register("jvm.filedescriptor", new FileDescriptorRatioGauge());
        metrics.register("jvm.classloader", new ClassLoadingGaugeSet());
        metrics.register("jvm.gc", new GarbageCollectorMetricSet());
        metrics.register("jvm.memory", new MemoryUsageGaugeSet());
        metrics.register("jvm.threads", new ThreadStatesGaugeSet());
    }

    @Override
    protected void stopService()
    {
        if (registry != null)
        {
            SharedMetricRegistries.remove(getName());
            for (ScheduledReporter reporter : reporters)
            {
                try
                {
                    reporter.stop();
                } catch (Exception e)
                {
                    log.error(e);
                }
            }
            reporters.clear();
            registry = null;
        }
    }

    @Override
    public void setConfiguration(Element element)
    {
        requireNonNull(element);

        defaultRegistry = Boolean.parseBoolean(element.getAttributeValue("default", "true"));

        for (Element e : element.getChildren("reporter"))
        {
            String className = e.getAttributeValue("class");
            try
            {
                MetricReporterFactory check = Class.forName(className).asSubclass(MetricReporterFactory.class).newInstance();
                check.setConfiguration(e);
                factories.add(check);
            } catch (Exception ex)
            {
                log.error(ex);
            }
        }
    }

    public MetricRegistry getMetricRegistry()
    {
        return registry;
    }

    @Override
    public synchronized ScheduledThreadPoolExecutor getScheduledThreadPoolExecutor()
    {
        return super.getScheduledThreadPoolExecutor();
    }

}
