/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

    private final List<MetricsReporterFactory> factories = new ArrayList<>();
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
        for (MetricsReporterFactory factory : factories)
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

    protected void setup(MetricRegistry metrics)
    {
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

        for (Element e : element.getChildren("reporter-factory"))
        {
            String className = e.getAttributeValue("class");
            try
            {
                MetricsReporterFactory factory = Class.forName(className).asSubclass(MetricsReporterFactory.class).newInstance();
                factory.setConfiguration(e);
                factories.add(factory);
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
