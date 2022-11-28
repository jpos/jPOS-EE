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

import com.codahale.metrics.MetricAttribute;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.ScheduledReporter;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.requireNonNull;

public class Q2LogReporterFactory implements MetricsReporterFactory
{

    private MetricFilter filter = MetricFilter.ALL;
    private String prefix = "";
    private long outputFrequency = 30L;
    private TimeUnit outputFrequencyUnit = TimeUnit.SECONDS;
    private TimeUnit rateUnit = TimeUnit.SECONDS;
    private TimeUnit durationUnit = TimeUnit.MILLISECONDS;
    private final Set<MetricAttribute> disabledMetricAttributes = new HashSet<>();

    @Override
    public ScheduledReporter build(Metrics metrics)
    {
        return new Q2LogReporter(
            metrics.getMetricRegistry(),
            metrics.getLog(),
            prefix,
            rateUnit,
            durationUnit,
            filter,
            metrics.getScheduledThreadPoolExecutor(),
            false,
            disabledMetricAttributes);
    }

    @Override
    public void setConfiguration(Element elem) throws ConfigurationException
    {
        requireNonNull(elem);

        String frequency = elem.getChildText("output-frequency");
        if (frequency != null)
        {
            outputFrequency = Long.parseLong(frequency);
        }
        String frequencyUnit = elem.getChildText("output-frequency-unit");
        if (frequencyUnit != null)
        {
            outputFrequencyUnit = TimeUnit.valueOf(frequencyUnit);
        }
        String ratesUnit = elem.getChildText("rates-unit");
        if (ratesUnit != null)
        {
            rateUnit = TimeUnit.valueOf(ratesUnit);
        }
        String durationsUnit = elem.getChildText("durations-unit");
        if (durationsUnit != null)
        {
            durationUnit = TimeUnit.valueOf(durationsUnit);
        }
        for (Element exclusion : elem.getChildren("exclude-attributes"))
        {
            try
            {
                String text = exclusion.getTextNormalize();
                if (!text.isEmpty())
                {
                    disabledMetricAttributes.add(MetricAttribute.valueOf(text.toUpperCase()));
                }
            }
            catch (Exception ignore)
            {
                // do nothing
            }
        }
    }

    @Override
    public long getOutputFrequency()
    {
        return outputFrequency;
    }

    @Override
    public TimeUnit getOutputFrequencyUnit()
    {
        return outputFrequencyUnit;
    }
}
