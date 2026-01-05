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

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.errors.WakeupException;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.regex.Pattern;

/**
 * Abstract base class for QBeans needing both producer and consumer capabilities.
 *
 * <p>Provides combined producer/consumer infrastructure for use cases like:
 * <ul>
 *   <li>Stream processing (read-transform-write)</li>
 *   <li>Event forwarding/routing</li>
 *   <li>Data pipelines</li>
 * </ul>
 *
 * <p>This class combines the functionality of {@link AbstractKafkaProducerQBean} and
 * {@link AbstractKafkaConsumerQBean}.
 *
 * <p>Subclasses must implement:
 * <ul>
 *   <li>{@link #getKeySerializer()} - Provide key serializer</li>
 *   <li>{@link #getValueSerializer()} - Provide value serializer</li>
 *   <li>{@link #getKeyDeserializer()} - Provide key deserializer</li>
 *   <li>{@link #getValueDeserializer()} - Provide value deserializer</li>
 *   <li>{@link #processRecord(ConsumerRecord)} - Process consumed records</li>
 * </ul>
 *
 * <p>Configuration properties:
 * <ul>
 *   <li>All properties from {@link AbstractKafkaProducerQBean}</li>
 *   <li>All properties from {@link AbstractKafkaConsumerQBean}</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * public class EventRouter extends AbstractKafkaProducerConsumerQBean&lt;String, String&gt; {
 *     protected void processRecord(ConsumerRecord&lt;String, String&gt; record) {
 *         // Transform and route
 *         String outputTopic = determineOutputTopic(record);
 *         String transformedValue = transform(record.value());
 *         send(outputTopic, record.key(), transformedValue);
 *     }
 * }
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public abstract class AbstractKafkaProducerConsumerQBean<K, V> extends AbstractKafkaQBean<K, V> implements Runnable {
    // Producer components
    private KafkaProducer<K, V> producer;
    private KafkaProducer<K, V> transactionalProducer;
    private boolean transactionsEnabled;
    private String transactionalId;

    // Consumer components
    private KafkaConsumer<K, V> consumer;
    private ExecutorService executor;
    private String groupId;
    private String topics;
    private String topicPattern;
    private long pollDurationMs;

    @Override
    protected String getComponentType() {
        return "kafka-producer-consumer";
    }

    @Override
    protected void doInit() throws ConfigurationException {
        // Producer initialization
        transactionalId = getKafkaConfig().get("transactional-id", null);
        transactionsEnabled = transactionalId != null && !transactionalId.trim().isEmpty();

        // Consumer initialization
        groupId = getKafkaConfig().getRequired("group-id");
        topics = getKafkaConfig().get("topics", "");
        topicPattern = getKafkaConfig().get("topic-pattern", null);
        pollDurationMs = getKafkaConfig().getLong("poll-duration-ms", 100);

        if (topics.isEmpty() && topicPattern == null) {
            throw new ConfigurationException("Either 'topics' or 'topic-pattern' must be specified");
        }

        info("Producer-Consumer initialized: group=" + groupId + ", topics=" + topics);
    }

    @Override
    protected void doStart() throws Exception {
        // Start producer
        Properties producerProps = createProducerProperties(false);
        producer = new KafkaProducer<>(producerProps);

        if (transactionsEnabled) {
            Properties txnProps = createProducerProperties(true);
            transactionalProducer = new KafkaProducer<>(txnProps);
            transactionalProducer.initTransactions();
            info("Transactional producer initialized");
        }

        // Start consumer
        Properties consumerProps = createConsumerProperties();
        consumer = new KafkaConsumer<>(consumerProps);

        if (!topics.isEmpty()) {
            consumer.subscribe(Arrays.asList(topics.split(",")));
        } else if (topicPattern != null) {
            consumer.subscribe(Pattern.compile(topicPattern));
        }

        // Start consumer thread
        executor = Executors.newSingleThreadExecutor();
        executor.submit(this);

        info("Producer-Consumer started");
    }

    @Override
    protected void doStop() {
        // Stop consumer
        if (consumer != null) {
            consumer.wakeup();
        }

        if (executor != null) {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(shutdownTimeoutSeconds, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        if (consumer != null) {
            try {
                consumer.close(CloseOptions.timeout(Duration.ofSeconds(shutdownTimeoutSeconds)));
            } catch (Exception e) {
                warn("Error closing consumer: " + e.getMessage());
            }
        }

        // Stop producer
        if (producer != null) {
            try {
                producer.close(Duration.ofSeconds(shutdownTimeoutSeconds));
            } catch (Exception e) {
                warn("Error closing producer: " + e.getMessage());
            }
        }

        if (transactionalProducer != null) {
            try {
                transactionalProducer.close(Duration.ofSeconds(shutdownTimeoutSeconds));
            } catch (Exception e) {
                warn("Error closing transactional producer: " + e.getMessage());
            }
        }

        info("Producer-Consumer stopped");
    }

    /**
     * Consumer polling loop.
     */
    @Override
    public void run() {
        try {
            info("Consumer polling loop started");
            while (isRunning()) {
                ConsumerRecords<K, V> records = consumer.poll(Duration.ofMillis(pollDurationMs));

                for (ConsumerRecord<K, V> record : records) {
                    try {
                        getMetrics().recordTimer("processing.duration", () -> {
                            processRecord(record);
                            getMetrics().counter("records.consumed", "topic", record.topic()).increment();
                        }, "topic", record.topic());
                    } catch (Exception e) {
                        error("Error processing record from topic " + record.topic(), e);
                        onProcessingError(record, e);
                    }
                }
            }
        } catch (WakeupException e) {
            info("Consumer wakeup - shutting down");
        } catch (Exception e) {
            error("Consumer polling error", e);
        } finally {
            info("Consumer polling loop terminated");
        }
    }

    /**
     * Process a consumed record.
     * Subclasses must implement this to handle messages.
     * @param record the consumed record
     */
    protected abstract void processRecord(ConsumerRecord<K, V> record);

    /**
     * Hook called when record processing fails.
     * @param record the record that failed
     * @param exception the exception
     */
    protected void onProcessingError(ConsumerRecord<K, V> record, Exception exception) {
        getMetrics().counter("errors", "topic", record.topic()).increment();
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
                getMetrics().counter("sends", "topic", topic, "result", "error").increment();
                error("Error sending message to topic " + topic, exception);
                if (callback != null) {
                    callback.onCompletion(metadata, exception);
                }
            } else {
                getMetrics().counter("sends", "topic", topic, "result", "success").increment();
                if (callback != null) {
                    callback.onCompletion(metadata, null);
                }
            }
        });
    }

    /**
     * Get the producer instance.
     * @return KafkaProducer instance
     */
    protected KafkaProducer<K, V> getProducer() {
        return producer;
    }

    /**
     * Get the transactional producer instance.
     * @return transactional KafkaProducer or null if not enabled
     */
    protected KafkaProducer<K, V> getTransactionalProducer() {
        return transactionalProducer;
    }

    /**
     * Get the consumer instance.
     * @return KafkaConsumer instance
     */
    protected KafkaConsumer<K, V> getConsumer() {
        return consumer;
    }

    /**
     * Create producer properties.
     */
    private Properties createProducerProperties(boolean transactional) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, getKeySerializer().getClass().getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, getValueSerializer().getClass().getName());

        boolean enableIdempotence = getKafkaConfig().getBoolean("enable-idempotence", true);
        props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, enableIdempotence);

        if (transactional) {
            props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, transactionalId);
            props.put(ProducerConfig.ACKS_CONFIG, "all");
            props.put(ProducerConfig.RETRIES_CONFIG, 3);
        }

        Properties forwarded = getKafkaConfig().forwardPrefixed("producer", ProducerConfig.configNames());
        props.putAll(forwarded);

        return props;
    }

    /**
     * Create consumer properties.
     */
    private Properties createConsumerProperties() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, getKeyDeserializer().getClass().getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, getValueDeserializer().getClass().getName());
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");

        Properties forwarded = getKafkaConfig().forwardPrefixed("consumer", ConsumerConfig.configNames());
        props.putAll(forwarded);

        return props;
    }

    @Override
    protected ConfigValidator createConfigValidator() {
        return super.createConfigValidator()
            .required("group-id")
            .rangeLong("poll-duration-ms", 1, 60000);
    }
}
