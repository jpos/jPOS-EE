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
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.Deserializer;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;
import org.jpos.kafka.consumer.MessageListener;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * Abstract base class for Kafka consumer QBeans.
 *
 * <p>Provides consumer infrastructure:
 * <ul>
 *   <li>Consumer instantiation and topic subscription</li>
 *   <li>ExecutorService-based polling loop</li>
 *   <li>Thread-safe message listener registry</li>
 *   <li>Consumer metrics (consumption rate, lag)</li>
 *   <li>Offset management</li>
 * </ul>
 *
 * <p>Subclasses must implement:
 * <ul>
 *   <li>{@link #getKeyDeserializer()} - Provide key deserializer</li>
 *   <li>{@link #getValueDeserializer()} - Provide value deserializer</li>
 * </ul>
 *
 * <p>Subclasses can either:
 * <ul>
 *   <li>Override {@link #processRecord(ConsumerRecord)} to handle messages directly, OR</li>
 *   <li>Register {@link MessageListener} instances via {@link #addMessageListener(MessageListener)}</li>
 * </ul>
 *
 * <p>Configuration properties (in addition to base properties):
 * <ul>
 *   <li>{@code consumer.*} - Forwarded to Kafka ConsumerConfig</li>
 *   <li>{@code topics} - Comma-separated topic list (optional)</li>
 *   <li>{@code topic-pattern} - Regex pattern for subscription (optional)</li>
 *   <li>{@code group-id} (required) - Consumer group ID</li>
 *   <li>{@code poll-duration-ms} (default: 100) - Poll timeout in milliseconds</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * public class EventLogger extends AbstractKafkaConsumerQBean&lt;String, String&gt; {
 *     protected Deserializer&lt;String&gt; getKeyDeserializer() {
 *         return new StringDeserializer();
 *     }
 *
 *     protected Deserializer&lt;String&gt; getValueDeserializer() {
 *         return new StringDeserializer();
 *     }
 *
 *     protected void processRecord(ConsumerRecord&lt;String, String&gt; record) {
 *         info("Event: " + record.value());
 *     }
 * }
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public abstract class AbstractKafkaConsumerQBean<K, V> extends AbstractKafkaQBean<K, V> implements Runnable {
    private KafkaConsumer<K, V> consumer;
    private ExecutorService executor;
    private final CopyOnWriteArrayList<MessageListener<K, V>> listeners = new CopyOnWriteArrayList<>();
    private String groupId;
    private String topics;
    private String topicPattern;
    private long pollDurationMs;

    @Override
    protected String getComponentType() {
        return "kafka-consumer";
    }

    @Override
    protected void doInit() throws ConfigurationException {
        groupId = getKafkaConfig().getRequired("group-id");
        topics = getKafkaConfig().get("topics", "");
        topicPattern = getKafkaConfig().get("topic-pattern", null);
        pollDurationMs = getKafkaConfig().getLong("poll-duration-ms", 100);

        if (topics.isEmpty() && topicPattern == null) {
            throw new ConfigurationException("Either 'topics' or 'topic-pattern' must be specified");
        }

        info("Consumer group: " + groupId);
        if (!topics.isEmpty()) {
            info("Subscribing to topics: " + topics);
        }
        if (topicPattern != null) {
            info("Subscribing to pattern: " + topicPattern);
        }
    }

    @Override
    protected void doStart() throws Exception {
        Properties consumerProps = createConsumerProperties();
        consumer = new KafkaConsumer<>(consumerProps);

        // Subscribe to topics or pattern
        if (!topics.isEmpty()) {
            consumer.subscribe(Arrays.asList(topics.split(",")));
        } else if (topicPattern != null) {
            consumer.subscribe(Pattern.compile(topicPattern));
        }

        // Start consumer thread
        executor = Executors.newSingleThreadExecutor();
        executor.submit(this);

        info("Consumer started");
    }

    @Override
    protected void doStop() {
        // Wake up consumer from poll
        if (consumer != null) {
            consumer.wakeup();
        }

        // Shutdown executor
        if (executor != null) {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(shutdownTimeoutSeconds, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                    warn("Consumer thread did not terminate within timeout");
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        // Close consumer
        if (consumer != null) {
            try {
                consumer.close(CloseOptions.timeout(Duration.ofSeconds(shutdownTimeoutSeconds)));
                info("Consumer closed");
            } catch (Exception e) {
                warn("Error closing consumer: " + e.getMessage());
            }
        }

        // Close listeners
        for (MessageListener<K, V> listener : listeners) {
            try {
                listener.close();
            } catch (Exception e) {
                warn("Error closing listener: " + e.getMessage());
            }
        }
    }

    /**
     * Consumer polling loop.
     * Runs in dedicated thread managed by ExecutorService.
     */
    @Override
    public void run() {
        try {
            info("Consumer polling loop started");
            while (isRunning()) {
                ConsumerRecords<K, V> records = consumer.poll(Duration.ofMillis(pollDurationMs));

                for (ConsumerRecord<K, V> record : records) {
                    try {
                        processRecordInternal(record);
                    } catch (Exception e) {
                        error("Error processing record from topic " + record.topic(), e);
                        onProcessingError(record, e);
                    }
                }
            }
        } catch (WakeupException e) {
            // Normal shutdown - consumer.wakeup() was called
            info("Consumer wakeup - shutting down");
        } catch (Exception e) {
            error("Consumer polling error", e);
        } finally {
            info("Consumer polling loop terminated");
        }
    }

    /**
     * Process a consumed record.
     * Default implementation calls listeners. Subclasses can override.
     * @param record the consumed record
     */
    protected void processRecord(ConsumerRecord<K, V> record) {
        // Default: notify listeners
        for (MessageListener<K, V> listener : listeners) {
            try {
                listener.onMessage(record);
            } catch (Exception e) {
                error("Listener error processing record from topic " + record.topic(), e);
            }
        }
    }

    /**
     * Hook called when record processing fails.
     * Subclasses can override to add custom error handling (e.g., dead letter queue).
     * @param record the record that failed
     * @param exception the exception
     */
    protected void onProcessingError(ConsumerRecord<K, V> record, Exception exception) {
        getMetrics().counter("errors", "topic", record.topic()).increment();
    }

    /**
     * Add a message listener.
     * @param listener the listener to add
     */
    public void addMessageListener(MessageListener<K, V> listener) {
        listeners.add(listener);
        info("Added message listener: " + listener.getClass().getSimpleName());
    }

    /**
     * Remove a message listener.
     * @param listener the listener to remove
     */
    public void removeMessageListener(MessageListener<K, V> listener) {
        listeners.remove(listener);
        info("Removed message listener: " + listener.getClass().getSimpleName());
    }

    /**
     * Commit offsets synchronously.
     */
    protected void commitSync() {
        if (consumer != null) {
            consumer.commitSync();
        }
    }

    /**
     * Commit offsets asynchronously.
     */
    protected void commitAsync() {
        if (consumer != null) {
            consumer.commitAsync();
        }
    }

    /**
     * Get the Kafka consumer instance.
     * @return KafkaConsumer instance
     */
    protected KafkaConsumer<K, V> getConsumer() {
        return consumer;
    }

    /**
     * Internal record processing with metrics.
     */
    private void processRecordInternal(ConsumerRecord<K, V> record) {
        getMetrics().recordTimer("processing.duration", () -> {
            processRecord(record);
            getMetrics().counter("records", "topic", record.topic()).increment();
        }, "topic", record.topic());
    }

    /**
     * Create consumer properties.
     * @return Properties for KafkaConsumer
     */
    private Properties createConsumerProperties() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, getKeyDeserializer().getClass().getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, getValueDeserializer().getClass().getName());

        // Defaults
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");

        // Forward consumer.* properties
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
