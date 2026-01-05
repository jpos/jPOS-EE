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

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.Serializer;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Abstract base class for Kafka producer QBeans.
 *
 * <p>Provides producer infrastructure:
 * <ul>
 *   <li>Producer instantiation with proper configuration</li>
 *   <li>Generic send methods (sync/async with callbacks)</li>
 *   <li>Optional transaction support</li>
 *   <li>Producer metrics (send rate, error rate, latency)</li>
 *   <li>Producer-specific error handling</li>
 * </ul>
 *
 * <p>Subclasses must implement:
 * <ul>
 *   <li>{@link #getKeySerializer()} - Provide key serializer</li>
 *   <li>{@link #getValueSerializer()} - Provide value serializer</li>
 * </ul>
 *
 * <p>Configuration properties (in addition to base properties):
 * <ul>
 *   <li>{@code producer.*} - Forwarded to Kafka ProducerConfig</li>
 *   <li>{@code transactional-id} - Enable transactional producer (optional)</li>
 *   <li>{@code enable-idempotence} (default: true) - Enable idempotent writes</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * public class NotificationProducer extends AbstractKafkaProducerQBean&lt;String, String&gt; {
 *     protected Serializer&lt;String&gt; getKeySerializer() {
 *         return new StringSerializer();
 *     }
 *
 *     protected Serializer&lt;String&gt; getValueSerializer() {
 *         return new StringSerializer();
 *     }
 *
 *     public void sendNotification(String userId, String message) {
 *         send("notifications", userId, message);
 *     }
 * }
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public abstract class AbstractKafkaProducerQBean<K, V> extends AbstractKafkaQBean<K, V> {
    private KafkaProducer<K, V> producer;
    private KafkaProducer<K, V> transactionalProducer;
    private boolean transactionsEnabled;
    private String transactionalId;

    @Override
    protected String getComponentType() {
        return "kafka-producer";
    }

    @Override
    protected void doInit() throws ConfigurationException {
        // Load transactional configuration
        transactionalId = getKafkaConfig().get("transactional-id", null);
        transactionsEnabled = transactionalId != null && !transactionalId.trim().isEmpty();

        if (transactionsEnabled) {
            info("Transactional producer enabled with ID: " + transactionalId);
        }
    }

    @Override
    protected void doStart() throws Exception {
        // Create standard producer
        Properties producerProps = createProducerProperties(false);
        producer = new KafkaProducer<>(producerProps);

        // Create transactional producer if configured
        if (transactionsEnabled) {
            Properties txnProps = createProducerProperties(true);
            transactionalProducer = new KafkaProducer<>(txnProps);
            transactionalProducer.initTransactions();
            info("Transactional producer initialized");
        }

        info("Producer created for bootstrap servers: " + bootstrapServers);
    }

    @Override
    protected void doStop() {
        if (producer != null) {
            try {
                producer.close(Duration.ofSeconds(shutdownTimeoutSeconds));
                info("Producer closed");
            } catch (Exception e) {
                warn("Error closing producer: " + e.getMessage());
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
     * Send a message to Kafka asynchronously.
     * @param topic the topic to send to
     * @param key the message key
     * @param value the message value
     */
    protected void send(String topic, K key, V value) {
        send(topic, key, value, null);
    }

    /**
     * Send a message to Kafka asynchronously with a callback.
     * @param topic the topic to send to
     * @param key the message key
     * @param value the message value
     * @param callback callback for success/error handling (optional)
     */
    protected void send(String topic, K key, V value, Callback callback) {
        ProducerRecord<K, V> record = new ProducerRecord<>(topic, key, value);
        producer.send(record, (metadata, exception) -> {
            if (exception != null) {
                onSendError(topic, key, value, exception);
                if (callback != null) {
                    callback.onCompletion(metadata, exception);
                }
            } else {
                onSendSuccess(topic, key, value, metadata);
                if (callback != null) {
                    callback.onCompletion(metadata, null);
                }
            }
        });
    }

    /**
     * Send a message synchronously.
     * @param topic the topic to send to
     * @param key the message key
     * @param value the message value
     * @return RecordMetadata for the sent record
     * @throws Exception if send fails
     */
    protected RecordMetadata sendSync(String topic, K key, V value) throws Exception {
        ProducerRecord<K, V> record = new ProducerRecord<>(topic, key, value);
        Future<RecordMetadata> future = producer.send(record);
        RecordMetadata metadata = future.get();
        onSendSuccess(topic, key, value, metadata);
        return metadata;
    }

    /**
     * Send a message asynchronously and return a CompletableFuture.
     * @param topic the topic to send to
     * @param key the message key
     * @param value the message value
     * @return CompletableFuture that completes when send is acknowledged
     */
    protected CompletableFuture<RecordMetadata> sendAsync(String topic, K key, V value) {
        CompletableFuture<RecordMetadata> future = new CompletableFuture<>();
        send(topic, key, value, (metadata, exception) -> {
            if (exception != null) {
                future.completeExceptionally(exception);
            } else {
                future.complete(metadata);
            }
        });
        return future;
    }

    /**
     * Flush all buffered records.
     */
    protected void flush() {
        if (producer != null) {
            producer.flush();
        }
    }

    /**
     * Get the Kafka producer instance.
     * @return KafkaProducer instance
     */
    protected KafkaProducer<K, V> getProducer() {
        return producer;
    }

    /**
     * Get the transactional producer instance.
     * @return KafkaProducer instance configured for transactions, or null if not enabled
     */
    protected KafkaProducer<K, V> getTransactionalProducer() {
        return transactionalProducer;
    }

    /**
     * Check if transactions are enabled.
     * @return true if transactional producer is configured
     */
    protected boolean isTransactionsEnabled() {
        return transactionsEnabled;
    }

    /**
     * Hook called when a message is sent successfully.
     * Subclasses can override to add custom logic (e.g., metrics).
     * @param topic the topic
     * @param key the key
     * @param value the value
     * @param metadata the record metadata
     */
    protected void onSendSuccess(String topic, K key, V value, RecordMetadata metadata) {
        getMetrics().counter("sends", "topic", topic, "result", "success").increment();
    }

    /**
     * Hook called when a message send fails.
     * Subclasses can override to add custom logic (e.g., metrics, alerting).
     * @param topic the topic
     * @param key the key
     * @param value the value
     * @param exception the exception
     */
    protected void onSendError(String topic, K key, V value, Exception exception) {
        getMetrics().counter("sends", "topic", topic, "result", "error").increment();
        error("Error sending message to topic " + topic, exception);
    }

    /**
     * Create producer properties.
     * @param transactional whether to create transactional producer
     * @return Properties for KafkaProducer
     */
    private Properties createProducerProperties(boolean transactional) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, getKeySerializer().getClass().getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, getValueSerializer().getClass().getName());

        // Enable idempotence by default
        boolean enableIdempotence = getKafkaConfig().getBoolean("enable-idempotence", true);
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, enableIdempotence);

        if (transactional) {
            props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionalId);
            props.put(ProducerConfig.ACKS_CONFIG, "all");
            props.put(ProducerConfig.RETRIES_CONFIG, 3);
        }

        // Forward producer.* properties
        Properties forwarded = getKafkaConfig().forwardPrefixed("producer", ProducerConfig.configNames());
        props.putAll(forwarded);

        return props;
    }

    @Override
    protected ConfigValidator createConfigValidator() {
        return super.createConfigValidator()
            .nonEmpty("transactional-id");
    }
}
