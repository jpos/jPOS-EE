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

package org.jpos.qrest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 * Utility class providing a shared, preconfigured Jackson {@link ObjectMapper}
 * and robust date/time string parsing for use in jPOS QREST modules.
 *
 * <p>
 * This class centralizes serialization and deserialization behavior,
 * especially around ISO-8601-compliant date/time formats and {@link OffsetDateTime}.
 * </p>
 *
 * <h2>Features</h2>
 * <ul>
 *   <li>Provides a globally configured {@code ObjectMapper} with sensible defaults:
 *     <ul>
 *       <li>Pretty-printed output</li>
 *       <li>Support for Java Time module</li>
 *       <li>Non-timestamp date formatting</li>
 *       <li>Lenient deserialization settings</li>
 *     </ul>
 *   </li>
 *   <li>Parses date-time and time strings with multiple ISO-compatible formats.</li>
 *   <li>Supplies reusable Jackson serializers/deserializers for {@link OffsetDateTime}.</li>
 * </ul>
 *
 * <p>
 * Intended for use internally by QREST participants and REST interfaces.
 * </p>
 *
 * @author jPOS
 * @since 1.9.0
 */
public class Converter {
    // Preconfigured Jackson ObjectMapper with custom settings
    private static ObjectMapper mapper = instantiateMapper();

    /**
     * Provides a shared {@link ObjectMapper} instance used throughout the application.
     *
     * @return configured ObjectMapper with time/date support and safe defaults.
     */
    public static ObjectMapper getMapper() {
        return mapper;
    }

    // Flexible formatter for date-time strings, with multiple ISO-8601 variants
    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
      .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
      .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
      .appendOptional(DateTimeFormatter.ISO_INSTANT)
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
      .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
      .toFormatter()
      .withZone(ZoneOffset.UTC);

    /**
     * Parses a date-time string into an {@link OffsetDateTime}, using flexible ISO-compatible formats.
     *
     * @param str date-time string to parse.
     * @return corresponding OffsetDateTime.
     * @throws DateTimeException if the string cannot be parsed.
     */
    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    // Flexible formatter for time-only strings, with default date values
    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
      .appendOptional(DateTimeFormatter.ISO_TIME)
      .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
      .parseDefaulting(ChronoField.YEAR, 2020)
      .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
      .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
      .toFormatter()
      .withZone(ZoneOffset.UTC);


    private static StdSerializer<OffsetDateTime> offsetDateTimeSerializer(DateTimeFormatter formatter) {
        return new OffsetDateTimeSerializer(OffsetDateTimeSerializer.INSTANCE, false, formatter) {};
    }

    private static StdDeserializer<OffsetDateTime> offsetDateTimeDeserializer(DateTimeFormatter formatter) {
        return new InstantDeserializer<OffsetDateTime>(InstantDeserializer.OFFSET_DATE_TIME, formatter) {};
    }

    /**
     * Parses a time-only string into an {@link OffsetTime}.
     *
     * @param str the time string to parse.
     * @return corresponding OffsetTime object.
     * @throws DateTimeException if the string cannot be parsed.
     */
    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }

    /**
     * Instantiates and configures the shared {@link ObjectMapper} instance.
     *
     * <p>Applies the following settings:</p>
     * <ul>
     *   <li>Enables BigDecimal for float parsing.</li>
     *   <li>Pretty-print output.</li>
     *   <li>Ignores unknown properties.</li>
     *   <li>Disables timestamp-based date output.</li>
     *   <li>Registers the Java Time module.</li>
     * </ul>
     *
     * @return configured ObjectMapper.
     */
    private static ObjectMapper instantiateMapper () {
        ObjectMapper mapper = new ObjectMapper()
          .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
          .enable(SerializationFeature.INDENT_OUTPUT)
          .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
          .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false)
          .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        mapper.findAndRegisterModules();
        mapper.enable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);
        mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }
}
