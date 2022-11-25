package org.jpos.ee.metrics;

import com.codahale.metrics.health.HealthCheck;
import org.jpos.core.XmlConfigurable;

public abstract class HealthCheckAdaptor extends HealthCheck implements XmlConfigurable {

    protected HealthCheckAdaptor() {}

    protected abstract String name();
}
