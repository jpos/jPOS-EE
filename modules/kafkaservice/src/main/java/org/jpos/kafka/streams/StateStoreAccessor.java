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

package org.jpos.kafka.streams;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.errors.InvalidStateStoreException;
import org.apache.kafka.streams.state.QueryableStoreType;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.jpos.kafka.metrics.MetricsCollector;
import org.jpos.kafka.recovery.RetryPolicy;

import java.time.Duration;
import java.util.concurrent.Callable;

/**
 * State store access with automatic retry and error handling.
 *
 * <p>Features:
 * <ul>
 *   <li>Retry with exponential backoff for InvalidStateStoreException</li>
 *   <li>Terminal state detection (ERROR, NOT_RUNNING)</li>
 *   <li>Type-safe store access</li>
 *   <li>Metrics integration</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * StateStoreAccessor accessor = new StateStoreAccessor(streams, retryPolicy, metrics);
 *
 * // Get key-value store with retry
 * ReadOnlyKeyValueStore&lt;String, String&gt; store = accessor.getKeyValueStore("my-store");
 *
 * // Execute operation with retry
 * String value = accessor.withRetry(() -&gt; store.get(key));
 * </pre>
 */
public class StateStoreAccessor {
    private final KafkaStreams streams;
    private final RetryPolicy retryPolicy;
    private final MetricsCollector metrics;

    /**
     * Create a state store accessor.
     * @param streams KafkaStreams instance
     * @param retryPolicy retry policy for state store access
     * @param metrics metrics collector
     */
    public StateStoreAccessor(KafkaStreams streams, RetryPolicy retryPolicy, MetricsCollector metrics) {
        this.streams = streams;
        this.retryPolicy = retryPolicy;
        this.metrics = metrics;
    }

    /**
     * Create a state store accessor with default retry policy.
     * @param streams KafkaStreams instance
     * @param metrics metrics collector
     */
    public StateStoreAccessor(KafkaStreams streams, MetricsCollector metrics) {
        this(streams, createDefaultRetryPolicy(), metrics);
    }

    /**
     * Get a key-value store with retry logic.
     * @param storeName the store name
     * @param <K> key type
     * @param <V> value type
     * @return ReadOnlyKeyValueStore instance
     * @throws Exception if store cannot be accessed after retries
     */
    public <K, V> ReadOnlyKeyValueStore<K, V> getKeyValueStore(String storeName) throws Exception {
        return getStore(storeName, QueryableStoreTypes.keyValueStore());
    }

    /**
     * Get a queryable store with retry logic.
     * @param storeName the store name
     * @param storeType the store type
     * @param <T> store type
     * @return store instance
     * @throws Exception if store cannot be accessed after retries
     */
    public <T> T getStore(String storeName, QueryableStoreType<T> storeType) throws Exception {
        return withRetry(() -> {
            checkTerminalState();
            StoreQueryParameters<T> params = StoreQueryParameters.fromNameAndType(storeName, storeType);
            return streams.store(params);
        }, storeName);
    }

    /**
     * Execute an operation with retry logic.
     * @param operation the operation to execute
     * @param <T> return type
     * @return the result of the operation
     * @throws Exception if operation fails after retries
     */
    public <T> T withRetry(Callable<T> operation) throws Exception {
        return withRetry(operation, "unknown");
    }

    /**
     * Execute an operation with retry logic and metrics.
     * @param operation the operation to execute
     * @param storeName store name for metrics
     * @param <T> return type
     * @return the result of the operation
     * @throws Exception if operation fails after retries
     */
    public <T> T withRetry(Callable<T> operation, String storeName) throws Exception {
        try {
            return retryPolicy.execute(() -> {
                checkTerminalState();
                return operation.call();
            });
        } catch (InvalidStateStoreException e) {
            if (metrics != null) {
                metrics.counter("store.retries", "store", storeName).increment();
            }
            throw e;
        }
    }

    /**
     * Check if Kafka Streams is in a terminal state.
     * @throws InvalidStateStoreException if in ERROR or NOT_RUNNING state
     */
    private void checkTerminalState() throws InvalidStateStoreException {
        KafkaStreams.State currentState = streams.state();
        if (currentState == KafkaStreams.State.ERROR || currentState == KafkaStreams.State.NOT_RUNNING) {
            throw new InvalidStateStoreException(
                "Kafka Streams is in terminal state: " + currentState + ". Cannot access state stores."
            );
        }
    }

    /**
     * Create default retry policy for state store access.
     * @return RetryPolicy with sensible defaults
     */
    private static RetryPolicy createDefaultRetryPolicy() {
        return RetryPolicy.builder()
            .maxAttempts(3)
            .initialDelay(Duration.ofMillis(100))
            .backoffMultiplier(2.0)
            .maxDelay(Duration.ofSeconds(5))
            .retryOn(InvalidStateStoreException.class)
            .build();
    }

    /**
     * Get the underlying KafkaStreams instance.
     * @return KafkaStreams instance
     */
    public KafkaStreams getStreams() {
        return streams;
    }

    /**
     * Get the retry policy.
     * @return RetryPolicy instance
     */
    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }
}
