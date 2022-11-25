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

public class Q2ReporterFactory extends MetricReporterFactory
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
        return new Q2Reporter(
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

        String frequency = elem.getChildText("outputFrequency");
        if (frequency != null)
        {
            outputFrequency = Long.parseLong(frequency);
        }
        String frequencyUnit = elem.getChildText("outputFrequencyUnit");
        if (frequencyUnit != null)
        {
            outputFrequencyUnit = TimeUnit.valueOf(frequencyUnit);
        }
        String ratesUnit = elem.getChildText("ratesUnit");
        if (ratesUnit != null)
        {
            rateUnit = TimeUnit.valueOf(ratesUnit);
        }
        String durationsUnit = elem.getChildText("durationsUnit");
        if (durationsUnit != null)
        {
            durationUnit = TimeUnit.valueOf(durationsUnit);
        }
        for (Element exclusion : elem.getChildren("disabledMetricAttributes"))
        {
            try
            {
                String text = exclusion.getTextNormalize();
                if (!text.isEmpty())
                {
                    disabledMetricAttributes.add(MetricAttribute.valueOf(text));
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
