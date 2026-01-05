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

package org.jpos.kafka.base;

import io.micrometer.core.instrument.Tags;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;
import org.jpos.kafka.config.KafkaConfiguration;
import org.jpos.kafka.lifecycle.LifecycleState;
import org.jpos.kafka.metrics.MetricsCollector;
import org.jpos.q2.QBeanSupport;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;
import org.jpos.util.NameRegistrar;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Abstract base class for all Kafka QBeans.
 *
 * <p>Provides common infrastructure for Kafka-based QBeans:
 * <ul>
 *   <li>Configuration loading and validation</li>
 *   <li>Lifecycle state management</li>
 *   <li>NameRegistrar integration</li>
 *   <li>Conditional Micrometer metrics</li>
 *   <li>Graceful shutdown coordination</li>
 *   <li>jPOS logging integration</li>
 * </ul>
 *
 * <p>Subclasses must implement:
 * <ul>
 *   <li>{@link #doInit()} - Initialize component-specific resources</li>
 *   <li>{@link #doStart()} - Start component-specific operations</li>
 *   <li>{@link #doStop()} - Stop component-specific operations</li>
 *   <li>{@link #getComponentType()} - Return component type for logging/metrics</li>
 *   <li>{@link #getKeySerializer()} - Provide key serializer</li>
 *   <li>{@link #getValueSerializer()} - Provide value serializer</li>
 * </ul>
 *
 * <p>Configuration properties (all optional unless noted):
 * <ul>
 *   <li>{@code bootstrap-servers} (required) - Kafka broker addresses</li>
 *   <li>{@code metrics-enabled} (default: true) - Enable Micrometer metrics</li>
 *   <li>{@code startup-timeout-seconds} (default: 60) - Startup timeout</li>
 *   <li>{@code shutdown-timeout-seconds} (default: 30) - Shutdown timeout</li>
 * </ul>
 *
 * @param <K> key type
 * @param <V> value type
 */
public abstract class AbstractKafkaQBean<K, V> extends QBeanSupport {
    private final AtomicReference<LifecycleState> state = new AtomicReference<>(LifecycleState.UNINITIALIZED);
    private KafkaConfiguration kafkaConfig;
    private MetricsCollector metrics;
    protected String bootstrapServers;
    protected boolean metricsEnabled;
    protected int startupTimeoutSeconds;
    protected int shutdownTimeoutSeconds;
    protected volatile LogEvent evt;

    /**
     * Initialize the QBean.
     * Loads configuration and calls {@link #doInit()}.
     */
    @Override
    protected final void initService() throws ConfigurationException {
        evt = new LogEvent();
        try {
            state.set(LifecycleState.CONFIGURED);
            loadConfiguration();
            validateConfiguration();
            registerInNameRegistrar();

            state.set(LifecycleState.INITIALIZING);
            doInit();
            state.set(LifecycleState.INITIALIZED);

            // Initialize metrics after doInit() so subclasses can provide additional tags
            initializeMetrics();
            info("Initialized " + getComponentType() + " QBean: " + getName());
        } catch (Exception e) {
            state.set(LifecycleState.ERROR);
            throw new ConfigurationException("Failed to initialize " + getComponentType(), e);
        } finally {
            Logger.log(evt);
            evt = null;
        }
    }

    /**
     * Start the QBean.
     * Calls {@link #doStart()}.
     */
    @Override
    protected final void startService() {
        try {
            state.set(LifecycleState.STARTING);
            doStart();
            state.set(LifecycleState.RUNNING);
            info(getComponentType() + " QBean started: " + getName());
        } catch (Exception e) {
            state.set(LifecycleState.ERROR);
            error("Failed to start " + getComponentType(), e);
        }
    }

    /**
     * Stop the QBean.
     * Calls {@link #doStop()} and unregisters from NameRegistrar.
     */
    @Override
    protected final void stopService() {
        try {
            state.set(LifecycleState.STOPPING);
            doStop();
            unregisterFromNameRegistrar();
            state.set(LifecycleState.STOPPED);
            info(getComponentType() + " QBean stopped: " + getName());
        } catch (Exception e) {
            state.set(LifecycleState.ERROR);
            error("Error stopping " + getComponentType(), e);
        }
    }

    /**
     * Initialize component-specific resources.
     * Called during {@link #initService()}.
     * @throws ConfigurationException if initialization fails
     */
    protected abstract void doInit() throws ConfigurationException;

    /**
     * Start component-specific operations.
     * Called during {@link #startService()}.
     * @throws Exception if startup fails
     */
    protected abstract void doStart() throws Exception;

    /**
     * Stop component-specific operations.
     * Called during {@link #stopService()}.
     */
    protected abstract void doStop();

    /**
     * Get the component type for logging and metrics.
     * @return component type (e.g., "producer", "consumer", "streams")
     */
    protected abstract String getComponentType();

    /**
     * Get the key serializer.
     * @return key serializer instance
     */
    protected abstract Serializer<K> getKeySerializer();

    /**
     * Get the value serializer.
     * @return value serializer instance
     */
    protected abstract Serializer<V> getValueSerializer();

    /**
     * Get the key deserializer.
     * Default implementation throws UnsupportedOperationException.
     * Override in consumer QBeans.
     * @return key deserializer instance
     */
    protected Deserializer<K> getKeyDeserializer() {
        throw new UnsupportedOperationException("getKeyDeserializer() not implemented");
    }

    /**
     * Get the value deserializer.
     * Default implementation throws UnsupportedOperationException.
     * Override in consumer QBeans.
     * @return value deserializer instance
     */
    protected Deserializer<V> getValueDeserializer() {
        throw new UnsupportedOperationException("getValueDeserializer() not implemented");
    }

    /**
     * Create a configuration validator.
     * Subclasses can override to add component-specific validation.
     * @return ConfigValidator with validation rules
     */
    protected ConfigValidator createConfigValidator() {
        return new ConfigValidator()
            .required("bootstrap-servers")
            .range("startup-timeout-seconds", 1, 3600)
            .range("shutdown-timeout-seconds", 1, 300);
    }

    /**
     * Get the Kafka configuration.
     * @return KafkaConfiguration instance
     */
    protected final KafkaConfiguration getKafkaConfig() {
        return kafkaConfig;
    }

    /**
     * Get the metrics collector.
     * @return MetricsCollector instance (may be no-op if disabled)
     */
    protected final MetricsCollector getMetrics() {
        return metrics;
    }

    /**
     * Get the current lifecycle state.
     * @return current LifecycleState
     */
    protected final LifecycleState getLifecycleState() {
        return state.get();
    }

    /**
     * Check if the component is running.
     * @return true if state is RUNNING
     */
    protected final boolean isRunning() {
        return state.get().isRunning();
    }

    /**
     * Log info message.
     * @param message the message
     */
    protected final void info(String message) {
        if (evt != null)
            evt.addMessage(message); // batch init messages
        else
            getLog().info(message);
    }

    /**
     * Log warning message.
     * @param message the message
     */
    protected final void warn(String message) {
        getLog().warn(message);
    }

    /**
     * Log error message.
     * @param message the message
     * @param e the exception
     */
    protected final void error(String message, Exception e) {
        getLog().error(message, e);
    }

    /**
     * Register this QBean with NameRegistrar.
     */
    private void registerInNameRegistrar() {
        if (getName() == null) // used outside QBean
            return;
        try {
            NameRegistrar.register(getName(), this);
            info("Registered with NameRegistrar: " + getName());
        } catch (Exception e) {
            warn("Failed to register with NameRegistrar: " + e.getMessage());
        }
    }

    /**
     * Unregister this QBean from NameRegistrar.
     */
    private void unregisterFromNameRegistrar() {
        if (getName() == null) // used outside QBean
            return;
        try {
            NameRegistrar.unregister(getName());
            info("Unregistered from NameRegistrar: " + getName());
        } catch (Exception e) {
            warn("Failed to unregister from NameRegistrar: " + e.getMessage());
        }
    }

    /**
     * Load configuration from jPOS Configuration.
     */
    private void loadConfiguration() throws ConfigurationException {
        Configuration cfg = getConfiguration();
        kafkaConfig = new KafkaConfiguration(cfg);

        bootstrapServers = kafkaConfig.getRequired("bootstrap-servers");
        metricsEnabled = kafkaConfig.getBoolean("metrics-enabled", true);
        startupTimeoutSeconds = kafkaConfig.getInt("startup-timeout-seconds", 60);
        shutdownTimeoutSeconds = kafkaConfig.getInt("shutdown-timeout-seconds", 30);
    }

    /**
     * Validate configuration using ConfigValidator.
     */
    private void validateConfiguration() throws ConfigurationException {
        ConfigValidator validator = createConfigValidator();
        kafkaConfig.validate(validator);
    }

    /**
     * Initialize Micrometer metrics.
     */
    private void initializeMetrics() {
        Tags additionalTags = getAdditionalMetricTags();
        // Always use additional tags version - Tags.empty() is safe to .and() with
        metrics = MetricsCollector.forComponent(
            getComponentType(),
            getName(),
            additionalTags != null ? additionalTags : Tags.empty(),
            metricsEnabled,
            getLog()
        );

        if (metrics.isEnabled()) {
            info("Metrics enabled for " + getComponentType() + (getName() != null ? " '" + getName() + "'" : ""));
        } else {
            info("Metrics disabled for " + getComponentType());
        }
    }

    /**
     * Get additional tags for metrics.
     * Subclasses can override to add custom tags (e.g., topic, store-name, app-id).
     * This method is called after doInit(), so configuration values are available.
     *
     * <p>Example following jPOS TransactionManager pattern:
     * <pre>
     * protected Tags getAdditionalMetricTags() {
     *     return Tags.of("app-id", applicationId, "topic", topic);
     * }
     * </pre>
     *
     * @return Tags to add to all metrics (default: empty)
     */
    protected Tags getAdditionalMetricTags() {
        return Tags.empty();
    }
}
