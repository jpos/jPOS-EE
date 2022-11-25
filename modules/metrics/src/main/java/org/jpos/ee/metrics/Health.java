package org.jpos.ee.metrics;

import com.codahale.metrics.SharedMetricRegistries;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.codahale.metrics.health.SharedHealthCheckRegistries;
import org.jdom2.Element;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QBeanSupport;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class Health extends QBeanSupport implements XmlConfigurable
{

    private final List<HealthCheckAdaptor> checks = new ArrayList<>();
    private HealthCheckRegistry registry;
    private boolean defaultRegistry;

    @Override
    protected void startService()
    {
        if (registry == null)
        {
            registry = new HealthCheckRegistry();
            SharedHealthCheckRegistries.add(getName(), registry);

            if (defaultRegistry)
            {
                SharedMetricRegistries.setDefault(getName());
            }
        }
        for (HealthCheckAdaptor check : checks)
        {
            registry.register(check.name(), check);
        }
    }

    @Override
    protected void stopService()
    {
        if (registry != null)
        {
            SharedHealthCheckRegistries.remove(getName());
            registry.shutdown();
            registry = null;
        }
    }

    @Override
    public void setConfiguration(Element element)
    {
        requireNonNull(element);

        defaultRegistry = Boolean.parseBoolean(element.getAttributeValue("default", "true"));

        for (Element e : element.getChildren("check"))
        {
            String className = e.getAttributeValue("class");
            try
            {
                HealthCheckAdaptor check = Class.forName(className).asSubclass(HealthCheckAdaptor.class).newInstance();
                check.setConfiguration(e);
                checks.add(check);
            } catch (Exception ex)
            {
                log.error(ex);
            }
        }
    }
}
