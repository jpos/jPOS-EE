package org.jpos.crypto.kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.errors.TopicExistsException;
import org.jpos.core.SimpleConfiguration;
import org.jpos.crypto.CryptoServiceKeyStoreException;
import org.junit.jupiter.api.*;
import org.testcontainers.kafka.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for KafkaCryptoServiceKeyStoreProvider.
 *
 * Uses Testcontainers to spin up a Kafka broker automatically.
 * No manual Kafka setup required - works in CI/CD and locally.
 */
class KafkaCryptoServiceKeyStoreProviderTest {

    private static KafkaContainer kafka;

    private KafkaCryptoServiceKeyStoreProvider provider;

    @BeforeAll
    static void setupKafka() {
        System.setProperty("api.version", "1.44");
        kafka = new KafkaContainer(DockerImageName.parse("apache/kafka:latest"));
        kafka.start();
        createTopicIfMissing(kafka.getBootstrapServers(), "cryptoservice", 1, (short) 1);
    }

    @AfterAll
    static void teardownKafka() {
        if (kafka != null) {
            kafka.stop();
        }
    }

    @BeforeEach
    void setup() {
        provider = new KafkaCryptoServiceKeyStoreProvider();
    }

    @AfterEach
    void cleanup() {
        if (provider != null) {
            provider.close();
        }
    }

    /**
     * Helper method to create a SimpleConfiguration with common Kafka settings.
     *
     * @param testPrefix Prefix for app-id and transactional-id (e.g., "test-app")
     * @param extraProps Additional properties as key-value pairs (e.g., "topic", "test-topic")
     * @return Configured SimpleConfiguration instance
     */
    private SimpleConfiguration createConfig(String testPrefix, String... extraProps) {
        SimpleConfiguration cfg = new SimpleConfiguration();
        cfg.put("bootstrap-servers", kafka.getBootstrapServers());
        cfg.put("app-id", testPrefix + "-" + System.currentTimeMillis());
        cfg.put("transactional-id", testPrefix + "-txn-" + System.currentTimeMillis());

        // Add extra properties in pairs (key, value, key, value, ...)
        for (int i = 0; i < extraProps.length; i += 2) {
            if (i + 1 < extraProps.length) {
                cfg.put(extraProps[i], extraProps[i + 1]);
            }
        }

        return cfg;
    }

    @Test
    @DisplayName("Configuration should accept valid bootstrap-servers")
    void testValidConfiguration() throws Exception {
        SimpleConfiguration cfg = createConfig("test-app", "topic", "test-topic");
        assertDoesNotThrow(() -> provider.setConfiguration(cfg));
    }
    
    @Test
    @DisplayName("Configuration should use default values")
    void testDefaultConfiguration() throws Exception {
        SimpleConfiguration cfg = createConfig("test-default");
        assertDoesNotThrow(() -> provider.setConfiguration(cfg));
        // Defaults: topic=cryptoservice
    }

    @Test
    @DisplayName("Configuration should set transactional-id")
    void testTransactionalIdConfiguration() throws Exception {
        SimpleConfiguration cfg = createConfig("test-txn-config");
        assertDoesNotThrow(() -> provider.setConfiguration(cfg));
    }

    @Test
    @DisplayName("put() should reject null id before initialization")
    void testPutNullId() throws Exception {
        provider.setConfiguration(createConfig("test-null-id"));

        assertThrows(CryptoServiceKeyStoreException.class, () ->
            provider.put(null, "value", false)
        );
    }

    @Test
    @DisplayName("put() should reject null value before initialization")
    void testPutNullValue() throws Exception {
        provider.setConfiguration(createConfig("test-null-value"));

        assertThrows(CryptoServiceKeyStoreException.class, () ->
            provider.put("key", null, false)
        );
    }

    @Test
    @DisplayName("get() should reject null id before initialization")
    void testGetNullId() throws Exception {
        provider.setConfiguration(createConfig("test-get-null"));

        assertThrows(CryptoServiceKeyStoreException.class, () ->
            provider.get(null)
        );
    }

    @Test
    @DisplayName("Operations should fail before init() is called")
    void testOperationsFailBeforeInit() throws Exception {
        provider.setConfiguration(createConfig("test-before-init"));

        // Don't call init()

        assertThrows(CryptoServiceKeyStoreException.class, () ->
            provider.put("key", "value", false)
        );

        assertThrows(CryptoServiceKeyStoreException.class, () ->
            provider.get("key")
        );
    }

    @Test
    @DisplayName("close() should be safe to call multiple times")
    void testMultipleClose() throws Exception {
        provider.setConfiguration(createConfig("test-close"));

        assertDoesNotThrow(() -> {
            provider.close();
            provider.close();
        });
    }

    @Test
    @DisplayName("Read-after-write: get() should immediately see recently written key")
    void testReadAfterWriteConsistency() throws Exception {
        provider.setConfiguration(createConfig("test-raw", "write-cache-ttl-ms", "10000"));
        provider.init();

        String keyId = "raw-test-key-" + System.currentTimeMillis();
        String value = "encrypted-value-123";

        // Write the key
        provider.put(keyId, value, false);

        // Immediately read it back (should come from cache, not state store)
        String retrieved = provider.get(keyId);

        // Should see the value immediately, even if state store hasn't caught up
        assertEquals(value, retrieved, "Read-after-write should return the just-written value");
    }

    @Test
    @DisplayName("Write cache should expire after TTL")
    void testWriteCacheExpiration() throws Exception {
        provider.setConfiguration(createConfig("test-cache-expire", "write-cache-ttl-ms", "1000"));
        provider.init();

        String keyId = "expire-test-key-" + System.currentTimeMillis();
        String value = "encrypted-value-456";

        // Write the key
        provider.put(keyId, value, false);

        // Read immediately (should come from cache)
        String retrieved1 = provider.get(keyId);
        assertEquals(value, retrieved1);

        // Wait for cache to expire
        Thread.sleep(1500);

        // Read again - cache expired, should query state store
        // State store should have the value by now
        String retrieved2 = provider.get(keyId);
        assertEquals(value, retrieved2,
            "Value should still be available from state store after cache expires");
    }

    @Test
    @DisplayName("Write cache should handle override updates")
    void testWriteCacheOverride() throws Exception {
        provider.setConfiguration(createConfig("test-override-cache", "write-cache-ttl-ms", "5000"));
        provider.init();

        String keyId = "override-cache-key-" + System.currentTimeMillis();
        String value1 = "value-1";
        String value2 = "value-2";

        // Write initial value
        provider.put(keyId, value1, false);
        assertEquals(value1, provider.get(keyId));

        // Override with new value
        provider.put(keyId, value2, true);

        // Should immediately see updated value from cache
        assertEquals(value2, provider.get(keyId));
    }

    static void createTopicIfMissing(String bootstrapServers, String topic, int partitions, short replicationFactor) {
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);

        try (AdminClient admin = AdminClient.create(props)) {
            NewTopic newTopic = new NewTopic(topic, partitions, replicationFactor);
            try {
                admin.createTopics(Collections.singleton(newTopic)).all().get();
            } catch (ExecutionException e) {
                if (!(e.getCause() instanceof TopicExistsException)) {
                    throw new RuntimeException("Failed to create topic " + topic, e);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}
