/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

package org.jpos.cmf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Util class to parse and format CMF dates and datetimes.<br>
 *
 * This class uses the new java time API since its formatters are thread safe.<br>
 *
 * Null parameters are preserved in order to avoid unnecessary null checks before calling the function.<br>
 *
 * Unless indicated otherwise, conversions are done using {@link ZoneId#systemDefault()}
 */
public class CMFDate {
    //TODO: implement formatting methods

    public static final DateTimeFormatter CMF_DATE = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter CMF_DATETIME = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    /**
     * Parse a CMF formatted date as yyyyMMdd to {@link LocalDate}
     *
     * @param cmfDateString content to parse
     * @return parsed {@link LocalDate}
     */
    public static LocalDate parseLocalDate(String cmfDateString) {
        return cmfDateString == null ? null : LocalDate.parse(cmfDateString, CMF_DATE);
    }

    /**
     * Utilitarian method that converts a {@link LocalDate} instance to {@link Date}
     * @param dateToConvert {@link LocalDate} to convert
     * @return converted {@link Date}
     */
    public static Date toDate(LocalDate dateToConvert) {
        return dateToConvert == null ? null :
                java.util.Date.from(dateToConvert.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Parse a CMF formatted date as yyyyMMdd to {@link Date}
     *
     * @param cmfDateString content to parse
     * @return parsed {@link Date}
     */
    public static Date parseDate(String cmfDateString) {
        return cmfDateString == null ? null : toDate(parseLocalDate(cmfDateString));
    }

    public static String format(LocalDate date) {
        return date == null ? null : CMF_DATE.format(date);
    }

    public static LocalDate toLocalDate(Date date) {
        return date == null ? null : date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static String formatDate(Date date) {
        return date == null ? null : format(toLocalDate(date));
    }

    /**
     * Parse a CMF formatted date/time as yyyyMMddHHmmss to {@link LocalDateTime}
     * @param cmfDateString content to parse
     * @return parsed {@link LocalDateTime}
     */
    public static LocalDateTime parseLocalDateTime(String cmfDateString) {
        return cmfDateString == null ? null : LocalDateTime.parse(cmfDateString, CMF_DATETIME);
    }

    public static Date toDate(LocalDateTime dateTimeToConvert) {
        return dateTimeToConvert == null ? null
                : java.util.Date.from(dateTimeToConvert.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Parse a CMF formatted date/time as yyyyMMddHHmmss to {@link Date}
     * @param cmfDateString content to parse
     * @return parsed {@link Date}
     */
    public static Date parseDateTime(String cmfDateString) {
        return cmfDateString == null ? null : toDate(parseLocalDate(cmfDateString));
    }

    public static String format(LocalDateTime dateTime) {
        return dateTime == null ? null : CMF_DATETIME.format(dateTime);
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return date == null ? null : date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
    public static String formatDateTime(Date date) {
        return date == null ? null : format(toLocalDateTime(date));
    }

}
