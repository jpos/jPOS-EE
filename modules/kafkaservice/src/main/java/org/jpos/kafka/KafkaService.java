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

package org.jpos.kafka;


import org.apache.kafka.clients.producer.*;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.errors.WakeupException;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.q2.QBeanSupport;
import org.jpos.util.NameRegistrar;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.*;

/**
 * KafkaService QBean for jPOS-EE
 * Handles Kafka message production and consumption
 */
public class KafkaService extends QBeanSupport implements Runnable {
    private KafkaProducer<String, String> producer;
    private KafkaConsumer<String, String> consumer;
    private ExecutorService executor;
    private List<KafkaMessageListener> listeners = new CopyOnWriteArrayList<>();
    private String bootstrapServers;
    private String groupId;
    private String topics;

    @Override
    protected void initService() throws ConfigurationException {
        Configuration cfg = getConfiguration();
        bootstrapServers = cfg.get("bootstrap-servers", null);
        if (bootstrapServers == null) {
            throw new ConfigurationException("'bootstrap-servers' property is required");
        }
        groupId = cfg.get("group-id", "jpos-kafka-group");
        topics = cfg.get("topics", "");
        NameRegistrar.register(getName(), this);
    }

    @Override
    protected void startService() {
        Properties producerProps = createProducerProperties();
        Properties consumerProps = createConsumerProperties();

        producer = new KafkaProducer<>(producerProps);

        if (!topics.isEmpty()) {
            consumer = new KafkaConsumer<>(consumerProps);
            executor = Executors.newSingleThreadExecutor();
            executor.submit(this);
            getLog().info("Started Kafka consumer for topics: " + topics);
        }
        getLog().info("KafkaService started");
    }

    private Properties createProducerProperties() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.StringSerializer");

        addPrefixedProperties(props, "producer.", ProducerConfig.configNames());
        return props;
    }

    private Properties createConsumerProperties() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
          "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        addPrefixedProperties(props, "consumer.", ConsumerConfig.configNames());
        return props;
    }

    @Override
    public void run() {
        try {
            consumer.subscribe(Arrays.asList(topics.split(",")));
            while (running()) {
                ConsumerRecords<String, String> records =
                  consumer.poll(Duration.ofMillis(100));

                for (ConsumerRecord<String, String> record : records) {
                    notifyListeners(record);
                }
            }
        } catch (WakeupException e) {
            // Normal shutdown
        } catch (Exception e) {
            getLog().error("Kafka consumer error", e);
        } finally {
            consumer.close();
        }
    }

    private void notifyListeners(ConsumerRecord<String, String> record) {
        listeners.forEach(listener -> {
            try {
                listener.onMessage(record.topic(), record.key(), record.value());
            } catch (Exception e) {
                getLog().error("Listener error", e);
            }
        });
    }

    public void send(String topic, String key, String value) {
        send(topic, key, value, null);
    }

    public void send(String topic, String key, String value, Callback callback) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
        producer.send(record, (metadata, exception) -> {
            if (callback != null) {
                if (exception != null) {
                    callback.onError(exception);
                } else {
                    callback.onSuccess(metadata);
                }
            } else if (exception != null) {
                getLog().error("Error sending Kafka message", exception);
            }
        });
    }

    public void addMessageListener(KafkaMessageListener listener) {
        listeners.add(listener);
    }

    public void removeMessageListener(KafkaMessageListener listener) {
        listeners.remove(listener);
    }

    @Override
    protected void stopService() {
        if (consumer != null) {
            consumer.wakeup();
        }
        if (executor != null) {
            executor.shutdown();
            try {
                executor.awaitTermination(10, TimeUnit.SECONDS);
            } catch (InterruptedException ignored) {}
        }
        if (producer != null) {
            producer.close(Duration.ofSeconds(5));
        }
        NameRegistrar.unregister(getName());
        getLog().info("KafkaService stopped");
    }

    public interface KafkaMessageListener {
        void onMessage(String topic, String key, String value);
        void close();
    }

    public interface Callback {
        void onSuccess(RecordMetadata metadata);
        void onError(Exception exception);
    }
    
    private void addPrefixedProperties(Properties props, String prefix, Set<String> validConfigs) {
        Configuration cfg = getConfiguration();
        String prefixDot = prefix + ".";

        for (String key : cfg.keySet()) {
            if (key.startsWith(prefixDot)) {
                // Remove prefix to get actual Kafka property name
                String kafkaKey = key.substring(prefixDot.length());

                // Only add if it's a valid Kafka configuration property
                if (validConfigs.contains(kafkaKey)) {
                    String value = cfg.get(key, "");
                    props.put(kafkaKey, value);
                } else {
                    getLog().warn("Ignoring unknown Kafka configuration: " + key);
                }
            }
        }
    }
}

