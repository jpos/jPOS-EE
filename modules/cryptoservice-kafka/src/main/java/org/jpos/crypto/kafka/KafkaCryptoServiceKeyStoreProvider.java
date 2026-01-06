/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.crypto.kafka;

import io.micrometer.core.instrument.Tags;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.jpos.core.ConfigurationException;
import org.jpos.crypto.CryptoServiceKeyStoreException;
import org.jpos.crypto.CryptoServiceKeyStoreProvider;
import org.jpos.crypto.KeyAlreadyExistsException;
import org.jpos.kafka.base.AbstractKafkaStreamsQBean;
import org.jpos.space.Space;
import org.jpos.space.TSpace;

import java.util.Objects;

/**
 * Kafka Streams-based CryptoServiceKeyStoreProvider.
 *
 * <p>Uses {@link AbstractKafkaStreamsQBean} for infrastructure, providing:
 * <ul>
 *   <li>Kafka Streams lifecycle management</li>
 *   <li>Startup synchronization (wait for RUNNING state)</li>
 *   <li>Error recovery with circuit breaker and auto-restart</li>
 *   <li>State store access with retry logic</li>
 *   <li>Transactional producer support</li>
 *   <li>Micrometer metrics integration</li>
 * </ul>
 *
 * <p>This implementation adds read-after-write consistency via a local write cache (TSpace).
 *
 * <h2>Configuration</h2>
 * <pre>
 * bootstrap-servers      - Kafka broker addresses (required)
 * topic                  - Kafka topic name (default: "cryptoservice")
 * app-id                 - Kafka Streams application ID (default: "jpos-cryptoservice-keystore")
 * store-name             - State store name (default: "crypto-keystore-store")
 * transactional-id       - Producer transaction ID (default: app-id + "-txn")
 * write-cache-ttl-ms     - Write cache TTL in ms (default: 10000)
 * store-retry-attempts   - Max retries for state store access (default: 3)
 * store-retry-delay-ms   - Base delay for retry backoff (default: 100)
 * startup-timeout-seconds- Max wait for RUNNING state (default: 60)
 * max-auto-restarts      - Max auto-restart attempts (default: 3)
 * state-dir              - Kafka Streams state directory (default: "data")
 * </pre>
 */
public class KafkaCryptoServiceKeyStoreProvider
    extends AbstractKafkaStreamsQBean<String, String>
    implements CryptoServiceKeyStoreProvider {

    private static final String DEFAULT_STORE_NAME = "crypto-keystore-store";
    private static final String DEFAULT_TOPIC = "cryptoservice";
    private static final String DEFAULT_APP_ID = "jpos-cryptoservice-keystore";
    private static final long DEFAULT_WRITE_CACHE_TTL_MS = 10_000;

    private String topic;
    private String storeName;
    private long writeCacheTtlMs;

    // Write cache for read-after-write consistency
    private final Space<String, String> writeCache = new TSpace<>();

    @Override
    protected void doInit() throws ConfigurationException {
        // Load configuration BEFORE calling super.doInit()
        // because buildTopology() (called by super.doInit()) needs these values
        topic = getKafkaConfig().get("topic", DEFAULT_TOPIC);
        storeName = getKafkaConfig().get("store-name", DEFAULT_STORE_NAME);
        writeCacheTtlMs = getKafkaConfig().getLong("write-cache-ttl-ms", DEFAULT_WRITE_CACHE_TTL_MS);

        // Set default transactional-id if not provided (app-id + "-txn")
        String appId = getKafkaConfig().get("app-id", DEFAULT_APP_ID);
        String txnId = getKafkaConfig().get("transactional-id", appId + "-txn");
        getKafkaConfig().getUnderlying().put("transactional-id", txnId);

        info("CryptoService KeyStore: topic=" + topic + ", store=" + storeName + ", cacheTTL=" + writeCacheTtlMs + "ms");

        // Call parent initialization (which will call buildTopology() and setup transactional producer)
        super.doInit();

        // Note: Metrics are created on-demand when first used (no need to pre-register)

        // Auto-start Kafka Streams since this is a nested component (not a standalone QBean)
        // and CryptoService expects it to be ready immediately after init()
        try {
            startStreams();
        } catch (Exception e) {
            throw new ConfigurationException("Failed to start Kafka Streams", e);
        }
    }

    @Override
    protected void doStart() throws Exception {
        // No-op: Streams already started in doInit()
        // This prevents double-start when used as a standalone QBean
    }

    /**
     * Start Kafka Streams and wait for RUNNING state.
     * This is called from doInit() for nested component usage.
     */
    private void startStreams() throws Exception {
        super.doStart();
    }

    @Override
    protected Topology buildTopology(StreamsBuilder builder) {
        // Build simple KTable topology: topic → state store
        builder.table(
            topic,
            Materialized.<String, String, KeyValueStore<Bytes, byte[]>>as(storeName)
                .withKeySerde(Serdes.String())
                .withValueSerde(Serdes.String())
        );
        return builder.build();
    }

    @Override
    protected Tags getAdditionalMetricTags() {
        // Add topic and store-name tags to distinguish different CryptoService instances
        // Following jPOS TransactionManager pattern: Tags.of("name", getName(), "participant", x, "phase", y)
        return super.getAdditionalMetricTags()  // Gets app-id from AbstractKafkaStreamsQBean
            .and("topic", topic)
            .and("store-name", storeName);
    }

    @Override
    protected String getApplicationId() {
        return DEFAULT_APP_ID;
    }

    @Override
    protected Serializer<String> getKeySerializer() {
        return new StringSerializer();
    }

    @Override
    protected Serializer<String> getValueSerializer() {
        return new StringSerializer();
    }

    @Override
    public void put(String id, String value, boolean override) throws CryptoServiceKeyStoreException {
        requireNonNull(id, "id must not be null");
        requireNonNull(value, "value must not be null");

        try {
            if (getMetrics() != null) {
                getMetrics().counter("operations", "type", "write").increment();
            }

            if (!override) {
                // Check-and-write with transaction
                getTransactionHelper().executeInTransaction(
                    () -> {
                        // Pre-write check: ensure key doesn't exist
                        String existing = get(id);
                        if (existing != null) {
                            throw new KeyAlreadyExistsException("Key '" + id + "' already exists");
                        }
                        return null;
                    },
                    () -> writeToKafka(id, value)
                );
            } else {
                // Direct write with transaction
                getTransactionHelper().executeInTransaction(() -> writeToKafka(id, value));
            }

            // Cache write for read-after-write consistency
            writeCache.put(id, value, writeCacheTtlMs);

        } catch (KeyAlreadyExistsException e) {
            throw e;
        } catch (Exception e) {
            throw new CryptoServiceKeyStoreException("Error putting key '" + id + "'", e);
        }
    }

    @Override
    public String get(String id) throws CryptoServiceKeyStoreException {
        requireNonNull(id, "id must not be null");

        try {
            if (getMetrics() != null) {
                getMetrics().counter("operations", "type", "read").increment();
            }

            // Check write cache first
            String cached = writeCache.rdp(id);
            if (cached != null) {
                if (getMetrics() != null) {
                    getMetrics().counter("cache", "result", "hit").increment();
                }
                return cached;
            }

            // Cache miss - query state store (base class handles retry)
            if (getMetrics() != null) {
                getMetrics().counter("cache", "result", "miss").increment();
            }
            ReadOnlyKeyValueStore<String, String> store = getStateStore(storeName);
            String value = store.get(id);

            // Repopulate cache
            if (value != null) {
                writeCache.put(id, value, writeCacheTtlMs);
            }

            return value;

        } catch (Exception e) {
            throw new CryptoServiceKeyStoreException("Error getting key '" + id + "'", e);
        }
    }

    public void close() {
        stopService(); // Graceful shutdown via base class
    }

    /**
     * Write key-value pair to Kafka topic.
     * @param id key
     * @param value value
     * @throws Exception if write fails
     */
    private void writeToKafka(String id, String value) throws Exception {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, id, value);
        getTransactionalProducer().send(record).get();
    }

    private void requireNonNull (Object o, String msg) throws CryptoServiceKeyStoreException {
        if (o == null)
            throw new CryptoServiceKeyStoreException(msg);
    }
}
