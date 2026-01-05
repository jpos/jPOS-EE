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

package org.jpos.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * Listener interface for consuming Kafka messages.
 *
 * <p>Implementations of this interface can be registered with {@link org.jpos.kafka.base.AbstractKafkaConsumerQBean}
 * to receive messages from subscribed topics.
 *
 * <p>Example usage:
 * <pre>
 * consumer.addMessageListener(new MessageListener&lt;String, String&gt;() {
 *     public void onMessage(ConsumerRecord&lt;String, String&gt; record) {
 *         System.out.println("Received: " + record.value());
 *     }
 *
 *     public void close() {
 *         // cleanup resources
 *     }
 * });
 * </pre>
 *
 * @param <K> key type
 * @param <V> value type
 */
public interface MessageListener<K, V> {
    /**
     * Called when a message is received from Kafka.
     *
     * <p>This method is called for each record consumed from subscribed topics.
     * Implementations should process messages quickly to avoid blocking the consumer thread.
     *
     * <p>If this method throws an exception, it will be logged but the consumer will continue
     * processing subsequent messages.
     *
     * @param record the consumed record
     */
    void onMessage(ConsumerRecord<K, V> record);

    /**
     * Called when the consumer is shutting down.
     * Implementations should use this to clean up resources.
     */
    default void close() {
        // Default: no-op
    }
}
