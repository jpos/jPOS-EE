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

package org.jpos.kafka.config;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.ConfigValidator;

import java.util.Properties;
import java.util.Set;

/**
 * Type-safe configuration wrapper for Kafka QBeans.
 *
 * <p>Provides convenient accessors for configuration properties with:
 * <ul>
 *   <li>Type conversion (String, int, long, boolean)</li>
 *   <li>Default values</li>
 *   <li>Required property validation</li>
 *   <li>Prefixed property forwarding (producer.*, consumer.*, streams.*)</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * KafkaConfiguration config = new KafkaConfiguration(cfg);
 * String servers = config.getRequired("bootstrap-servers");
 * int timeout = config.getInt("startup-timeout-seconds", 60);
 * Properties props = config.forwardPrefixed("producer.", ProducerConfig.configNames());
 * </pre>
 */
public class KafkaConfiguration {
    private final Configuration config;

    /**
     * Create a new KafkaConfiguration wrapper.
     * @param config the underlying jPOS Configuration
     */
    public KafkaConfiguration(Configuration config) {
        this.config = config;
    }

    /**
     * Get a required configuration property.
     * @param key the property key
     * @return the property value
     * @throws ConfigurationException if property is missing or empty
     */
    public String getRequired(String key) throws ConfigurationException {
        String value = config.get(key, null);
        if (value == null || value.trim().isEmpty()) {
            throw new ConfigurationException("Required property '" + key + "' is missing or empty");
        }
        return value.trim();
    }

    /**
     * Get a configuration property with a default value.
     * @param key the property key
     * @param defaultValue the default value if property is missing
     * @return the property value or default
     */
    public String get(String key, String defaultValue) {
        String value = config.get(key, defaultValue);
        return value != null ? value.trim() : defaultValue;
    }

    /**
     * Get an integer configuration property.
     * @param key the property key
     * @param defaultValue the default value if property is missing
     * @return the property value as int or default
     * @throws ConfigurationException if value cannot be parsed as int
     */
    public int getInt(String key, int defaultValue) throws ConfigurationException {
        String value = config.get(key, null);
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            throw new ConfigurationException("Property '" + key + "' must be an integer: " + value, e);
        }
    }

    /**
     * Get a long configuration property.
     * @param key the property key
     * @param defaultValue the default value if property is missing
     * @return the property value as long or default
     * @throws ConfigurationException if value cannot be parsed as long
     */
    public long getLong(String key, long defaultValue) throws ConfigurationException {
        String value = config.get(key, null);
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        try {
            return Long.parseLong(value.trim());
        } catch (NumberFormatException e) {
            throw new ConfigurationException("Property '" + key + "' must be a long: " + value, e);
        }
    }

    /**
     * Get a boolean configuration property.
     * @param key the property key
     * @param defaultValue the default value if property is missing
     * @return the property value as boolean or default
     */
    public boolean getBoolean(String key, boolean defaultValue) {
        String value = config.get(key, null);
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        return Boolean.parseBoolean(value.trim());
    }

    /**
     * Forward prefixed properties to a Properties object.
     *
     * <p>For example, given configuration:
     * <pre>
     * producer.acks=all
     * producer.retries=3
     * </pre>
     *
     * <p>Calling {@code forwardPrefixed("producer.", validKeys)} will return:
     * <pre>
     * acks=all
     * retries=3
     * </pre>
     *
     * @param prefix the property prefix (e.g., "producer.", "consumer.")
     * @param validKeys set of valid Kafka configuration keys (optional, null to skip validation)
     * @return Properties object with prefix removed
     */
    public Properties forwardPrefixed(String prefix, Set<String> validKeys) {
        Properties props = new Properties();
        String prefixDot = prefix.endsWith(".") ? prefix : prefix + ".";

        for (String key : config.keySet()) {
            if (key.startsWith(prefixDot)) {
                String kafkaKey = key.substring(prefixDot.length());

                if (validKeys == null || validKeys.contains(kafkaKey)) {
                    String value = config.get(key, "");
                    if (!value.isEmpty()) {
                        props.put(kafkaKey, value);
                    }
                }
            }
        }

        return props;
    }

    /**
     * Validate this configuration using a ConfigValidator.
     * @param validator the validator to use
     * @throws ConfigurationException if validation fails
     */
    public void validate(ConfigValidator validator) throws ConfigurationException {
        validator.validate(config);
    }

    /**
     * Check if a property exists.
     * @param key the property key
     * @return true if property exists
     */
    public boolean hasProperty(String key) {
        return config.get(key, null) != null;
    }

    /**
     * Get the underlying jPOS Configuration.
     * @return the wrapped Configuration object
     */
    public Configuration getUnderlying() {
        return config;
    }
}
