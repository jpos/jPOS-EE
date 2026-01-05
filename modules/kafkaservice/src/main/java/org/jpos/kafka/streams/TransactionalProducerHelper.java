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

import org.apache.kafka.clients.producer.KafkaProducer;
import org.jpos.kafka.metrics.MetricsCollector;

import java.util.concurrent.Callable;

/**
 * Helper for managing Kafka transactional writes.
 *
 * <p>Simplifies transaction lifecycle:
 * <ul>
 *   <li>Automatic begin/commit/abort</li>
 *   <li>Pre-write validation hooks</li>
 *   <li>Error recovery</li>
 *   <li>Metrics tracking</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * TransactionalProducerHelper&lt;String, String&gt; helper =
 *     new TransactionalProducerHelper&lt;&gt;(producer, metrics);
 *
 * // Simple transaction
 * helper.executeInTransaction(() -&gt; {
 *     producer.send(new ProducerRecord&lt;&gt;(topic, key, value)).get();
 * });
 *
 * // Transaction with validation
 * helper.executeInTransaction(
 *     () -&gt; checkKeyDoesNotExist(key),  // Pre-write validation
 *     () -&gt; {
 *         producer.send(new ProducerRecord&lt;&gt;(topic, key, value)).get();
 *     }
 * );
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public class TransactionalProducerHelper<K, V> {
    private final KafkaProducer<K, V> producer;
    private final MetricsCollector metrics;

    /**
     * Create a transactional producer helper.
     * @param producer KafkaProducer configured for transactions
     * @param metrics metrics collector
     */
    public TransactionalProducerHelper(KafkaProducer<K, V> producer, MetricsCollector metrics) {
        this.producer = producer;
        this.metrics = metrics;
    }

    /**
     * Execute an operation within a transaction.
     * @param operation the operation to execute
     * @throws Exception if operation or transaction fails
     */
    public void executeInTransaction(TransactionOperation operation) throws Exception {
        executeInTransaction(null, operation);
    }

    /**
     * Execute an operation within a transaction with pre-write validation.
     * @param preWriteValidation validation to run before write (optional)
     * @param operation the operation to execute
     * @throws Exception if validation, operation, or transaction fails
     */
    public void executeInTransaction(Callable<Void> preWriteValidation, TransactionOperation operation)
        throws Exception {

        producer.beginTransaction();

        try {
            // Pre-write validation (if provided)
            if (preWriteValidation != null) {
                preWriteValidation.call();
            }

            // Execute operation
            operation.execute();

            // Commit transaction
            producer.commitTransaction();
            if (metrics != null) {
                metrics.counter("transactions", "result", "committed").increment();
            }

        } catch (Exception e) {
            // Abort transaction on error
            safeAbort();
            if (metrics != null) {
                metrics.counter("transactions", "result", "aborted").increment();
            }
            throw e;
        }
    }

    /**
     * Execute an operation that returns a value within a transaction.
     * @param operation the operation to execute
     * @param <T> return type
     * @return the result of the operation
     * @throws Exception if operation or transaction fails
     */
    public <T> T executeInTransactionWithResult(Callable<T> operation) throws Exception {
        producer.beginTransaction();

        try {
            T result = operation.call();
            producer.commitTransaction();
            if (metrics != null) {
                metrics.counter("transactions", "result", "committed").increment();
            }
            return result;

        } catch (Exception e) {
            safeAbort();
            if (metrics != null) {
                metrics.counter("transactions", "result", "aborted").increment();
            }
            throw e;
        }
    }

    /**
     * Safely abort a transaction, handling errors gracefully.
     */
    private void safeAbort() {
        try {
            producer.abortTransaction();
        } catch (Exception abortError) {
            // Transaction may have already been aborted or producer closed
            // Log but don't throw - we're already in error handling
        }
    }

    /**
     * Get the underlying producer.
     * @return KafkaProducer instance
     */
    public KafkaProducer<K, V> getProducer() {
        return producer;
    }

    /**
     * Functional interface for transaction operations.
     */
    @FunctionalInterface
    public interface TransactionOperation {
        /**
         * Execute the operation within a transaction.
         * @throws Exception if operation fails
         */
        void execute() throws Exception;
    }
}
