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
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;
import org.jpos.kafka.lifecycle.StartupSynchronizer;
import org.jpos.kafka.recovery.RetryPolicy;
import org.jpos.kafka.recovery.StreamsRecoveryHandler;
import org.jpos.kafka.streams.StateStoreAccessor;
import org.jpos.kafka.streams.TransactionalProducerHelper;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Abstract base class for Kafka Streams QBeans.
 *
 * <p>Provides sophisticated Kafka Streams infrastructure:
 * <ul>
 *   <li>Topology building support</li>
 *   <li>State store access with retry logic</li>
 *   <li>Error recovery (uncaught exception handler, state listener, circuit breaker)</li>
 *   <li>Startup synchronization (wait for RUNNING state)</li>
 *   <li>Auto-restart on errors (up to configurable max attempts)</li>
 *   <li>Transactional producer support</li>
 *   <li>Comprehensive Streams metrics</li>
 * </ul>
 *
 * <p>Subclasses must implement:
 * <ul>
 *   <li>{@link #buildTopology(StreamsBuilder)} - Build the Streams topology</li>
 *   <li>{@link #getApplicationId()} - Provide application ID</li>
 *   <li>{@link #getKeySerializer()} - Provide key serializer</li>
 *   <li>{@link #getValueSerializer()} - Provide value serializer</li>
 * </ul>
 *
 * <p>Configuration properties (in addition to base properties):
 * <ul>
 *   <li>{@code streams.*} - Forwarded to Kafka StreamsConfig</li>
 *   <li>{@code app-id} (required) - Kafka Streams application ID</li>
 *   <li>{@code store-retry-attempts} (default: 3) - Max retries for state store access</li>
 *   <li>{@code store-retry-delay-ms} (default: 100) - Base delay for retry backoff</li>
 *   <li>{@code max-auto-restarts} (default: 3) - Max auto-restart attempts</li>
 *   <li>{@code state-dir} (default: "data") - Kafka Streams state directory</li>
 *   <li>{@code processing-guarantee} (default: "at_least_once") - Processing guarantee</li>
 *   <li>{@code transactional-id} - Enable transactional producer (optional)</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * public class MyStreamsApp extends AbstractKafkaStreamsQBean&lt;String, String&gt; {
 *     protected String getApplicationId() {
 *         return "my-streams-app";
 *     }
 *
 *     protected Topology buildTopology(StreamsBuilder builder) {
 *         builder.table("input-topic", Materialized.as("my-store"));
 *         return builder.build();
 *     }
 *
 *     protected Serializer&lt;String&gt; getKeySerializer() {
 *         return new StringSerializer();
 *     }
 *
 *     protected Serializer&lt;String&gt; getValueSerializer() {
 *         return new StringSerializer();
 *     }
 *
 *     public String getValue(String key) {
 *         ReadOnlyKeyValueStore&lt;String, String&gt; store = getStateStore("my-store");
 *         return store.get(key);
 *     }
 * }
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public abstract class AbstractKafkaStreamsQBean<K, V> extends AbstractKafkaQBean<K, V> {
    private KafkaStreams streams;
    private KafkaProducer<K, V> transactionalProducer;
    private StateStoreAccessor stateStoreAccessor;
    private TransactionalProducerHelper<K, V> txnHelper;
    private StreamsRecoveryHandler recoveryHandler;
    private String applicationId;
    private String stateDir;
    private int storeRetryAttempts;
    private long storeRetryDelayMs;
    private int maxAutoRestarts;
    private String processingGuarantee;
    private String transactionalId;
    private boolean transactionsEnabled;

    @Override
    protected String getComponentType() {
        return "kafka-streams";
    }

    @Override
    protected void doInit() throws ConfigurationException {
        applicationId = getKafkaConfig().get("app-id", getApplicationId());
        stateDir = getKafkaConfig().get("state-dir", "data");
        storeRetryAttempts = getKafkaConfig().getInt("store-retry-attempts", 3);
        storeRetryDelayMs = getKafkaConfig().getLong("store-retry-delay-ms", 100);
        maxAutoRestarts = getKafkaConfig().getInt("max-auto-restarts", 3);
        processingGuarantee = getKafkaConfig().get("processing-guarantee", StreamsConfig.AT_LEAST_ONCE);
        transactionalId = getKafkaConfig().get("transactional-id", null);
        transactionsEnabled = transactionalId != null && !transactionalId.trim().isEmpty();

        info("Streams application: " + applicationId);
        info("State directory: " + stateDir);
        info("Store retry: attempts=" + storeRetryAttempts + ", delay=" + storeRetryDelayMs + "ms");
        info("Max auto-restarts: " + maxAutoRestarts);
        info("Processing guarantee: " + processingGuarantee);

        // Initialize recovery handler
        recoveryHandler = new StreamsRecoveryHandler(maxAutoRestarts);

        // Initialize retry policy for state store access
        RetryPolicy retryPolicy = RetryPolicy.builder()
            .maxAttempts(storeRetryAttempts)
            .initialDelay(Duration.ofMillis(storeRetryDelayMs))
            .backoffMultiplier(2.0)
            .build();

        // Build topology
        StreamsBuilder builder = new StreamsBuilder();
        Topology topology = buildTopology(builder);

        if (topology == null) {
            throw new ConfigurationException("buildTopology() returned null");
        }

        // Create KafkaStreams instance
        Properties streamsProps = createStreamsProperties();
        streams = new KafkaStreams(topology, streamsProps);

        // Set uncaught exception handler
        streams.setUncaughtExceptionHandler(recoveryHandler.createExceptionHandler());
        // Note: State listener is set in doStart() before calling start()

        // Initialize state store accessor
        stateStoreAccessor = new StateStoreAccessor(streams, retryPolicy, getMetrics());

        // Initialize transactional producer if configured
        if (transactionsEnabled) {
            Properties producerProps = createTransactionalProducerProperties();
            transactionalProducer = new KafkaProducer<>(producerProps);
            transactionalProducer.initTransactions();
            txnHelper = new TransactionalProducerHelper<>(transactionalProducer, getMetrics());
            info("Transactional producer initialized with ID: " + transactionalId);
        }

        info("Kafka Streams initialized");
    }

    @Override
    protected void doStart() throws Exception {
        // Wait for RUNNING state with timeout
        StartupSynchronizer sync = new StartupSynchronizer(startupTimeoutSeconds, TimeUnit.SECONDS);

        // Set combined state listener BEFORE starting (combines recovery + sync)
        streams.setStateListener((newState, oldState) -> {
            info("State transition: " + oldState + " → " + newState);

            if (newState == KafkaStreams.State.RUNNING) {
                sync.signalReady();
            } else if (newState == KafkaStreams.State.ERROR) {
                sync.signalError("Kafka Streams entered ERROR state");
            }

            recoveryHandler.createStateListener().onChange(newState, oldState);
            onStateChange(newState, oldState);
        });

        // Start streams
        streams.start();
        info("Kafka Streams started, waiting for RUNNING state...");

        try {
            sync.await();
            info("Kafka Streams is RUNNING");

            // Register gauge metric for state
            if (getMetrics() != null) {
                getMetrics().gauge("state", streams, s -> s.state().ordinal());
            }

        } catch (Exception e) {
            throw new Exception("Failed to start Kafka Streams: " + e.getMessage(), e);
        }
    }

    @Override
    protected void doStop() {
        if (streams != null) {
            try {
                streams.close(Duration.ofSeconds(shutdownTimeoutSeconds));
                info("Kafka Streams closed");
            } catch (Exception e) {
                warn("Error closing Kafka Streams: " + e.getMessage());
            }
        }

        if (transactionalProducer != null) {
            try {
                transactionalProducer.close(Duration.ofSeconds(shutdownTimeoutSeconds));
                info("Transactional producer closed");
            } catch (Exception e) {
                warn("Error closing transactional producer: " + e.getMessage());
            }
        }
    }

    /**
     * Build the Kafka Streams topology.
     * Subclasses must implement this to define stream processing logic.
     * @param builder StreamsBuilder for constructing topology
     * @return Topology instance
     */
    protected abstract Topology buildTopology(StreamsBuilder builder);

    /**
     * Get the application ID for this Streams application.
     * Subclasses must implement this to provide a unique application ID.
     * Can be overridden by "app-id" configuration property.
     * @return application ID
     */
    protected abstract String getApplicationId();

    /**
     * Hook called when Kafka Streams state changes.
     * Subclasses can override to react to state transitions.
     * @param newState new state
     * @param oldState old state
     */
    protected void onStateChange(KafkaStreams.State newState, KafkaStreams.State oldState) {
        // Default: no-op
    }

    /**
     * Get a key-value state store by name.
     * Automatically retries on InvalidStateStoreException.
     * @param storeName the store name
     * @param <VT> value type
     * @return ReadOnlyKeyValueStore instance
     */
    protected <VT> ReadOnlyKeyValueStore<K, VT> getStateStore(String storeName) {
        try {
            return stateStoreAccessor.getKeyValueStore(storeName);
        } catch (Exception e) {
            throw new RuntimeException("Failed to access state store: " + storeName, e);
        }
    }

    /**
     * Get the KafkaStreams instance.
     * @return KafkaStreams instance
     */
    protected KafkaStreams getStreams() {
        return streams;
    }

    /**
     * Get the transactional producer instance.
     * @return KafkaProducer instance or null if not configured
     */
    protected KafkaProducer<K, V> getTransactionalProducer() {
        return transactionalProducer;
    }

    /**
     * Get the transactional producer helper.
     * @return TransactionalProducerHelper instance or null if not configured
     */
    protected TransactionalProducerHelper<K, V> getTransactionHelper() {
        return txnHelper;
    }

    /**
     * Get the state store accessor.
     * @return StateStoreAccessor instance
     */
    protected StateStoreAccessor getStateStoreAccessor() {
        return stateStoreAccessor;
    }

    /**
     * Get the recovery handler.
     * @return StreamsRecoveryHandler instance
     */
    protected StreamsRecoveryHandler getRecoveryHandler() {
        return recoveryHandler;
    }

    /**
     * Create Kafka Streams properties.
     */
    private Properties createStreamsProperties() {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, applicationId);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(StreamsConfig.STATE_DIR_CONFIG, stateDir);
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, processingGuarantee);

        // Use serializer classes
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG,
            org.apache.kafka.common.serialization.Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,
            org.apache.kafka.common.serialization.Serdes.String().getClass().getName());

        // Forward streams.* properties
        Properties forwarded = getKafkaConfig().forwardPrefixed("streams", null);
        props.putAll(forwarded);

        return props;
    }

    /**
     * Create transactional producer properties.
     */
    private Properties createTransactionalProducerProperties() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, getKeySerializer().getClass().getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, getValueSerializer().getClass().getName());
        props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionalId);
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 3);
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, true);

        return props;
    }

    @Override
    protected ConfigValidator createConfigValidator() {
        ConfigValidator validator = super.createConfigValidator()
            .required("app-id")
            .range("store-retry-attempts", 0, 10)
            .rangeLong("store-retry-delay-ms", 10, 10000)
            .range("max-auto-restarts", 0, 10)
            .custom("processing-guarantee",
                v -> v.equals(StreamsConfig.AT_LEAST_ONCE) || v.equals(StreamsConfig.EXACTLY_ONCE_V2),
                "must be 'at_least_once' or 'exactly_once_v2'");

        return validator;
    }

    /**
     * Provide Kafka Streams-specific metric tags.
     * Includes app-id tag by default. Subclasses can override to add more tags
     * (e.g., topic, store-name) following the pattern from jPOS TransactionManager.
     *
     * @return Tags with Kafka Streams metadata
     */
    @Override
    protected Tags getAdditionalMetricTags() {
        return Tags.of("app-id", applicationId);
    }
}
