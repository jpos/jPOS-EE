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

package org.jpos.gl;

import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.jdom2.Element;

/**
 * Assorted helper methods
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class Util {
    static SimpleDateFormat df_yyyyMMdd;
    static SimpleDateFormat df_yyyyMMddhhmmss;
    static {
        df_yyyyMMdd = (SimpleDateFormat) DateFormat.getDateTimeInstance();
        df_yyyyMMdd.applyPattern("yyyyMMdd");
        df_yyyyMMddhhmmss = (SimpleDateFormat)
            DateFormat.getDateTimeInstance();
        df_yyyyMMddhhmmss.applyPattern("yyyyMMddHHmmss");
    }
    static SimpleDateFormat dfDate = (SimpleDateFormat)
        DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
    static SimpleDateFormat dfDateTime = (SimpleDateFormat)
        DateFormat.getDateTimeInstance(
            DateFormat.SHORT, DateFormat.MEDIUM, Locale.UK);

    /**
     * @param s date string in YYYYMMdd format
     * @return a Date object
     */
    public static Date parseDate (String s) throws ParseException {
        if (s == null)
            return null;
        return df_yyyyMMdd.parse (s);
    }
    /**
     * @param s date string in YYYYMMddhhmmss format
     * @return a Date object
     */
    public static Date parseDateTime (String s) throws ParseException {
        if (s == null)
            return null;
        return df_yyyyMMddhhmmss.parse (s);
    }
    /**
     * @param d a date object
     * @return date string in YYYYMMDD format
     */
    public static String dateToString (Date d) {
        if (d == null)
            return null;
        return df_yyyyMMdd.format (d);
    }
    /**
     * @param d a date object
     * @return date string in YYYYMMDDHHMMSS format
     */
    public static String dateTimeToString (Date d) {
        if (d == null)
            return null;
        return df_yyyyMMddhhmmss.format (d);
    }
    /**
     * Sets date="YYYYMMDD" attribute to an XML Element
     * @param elem JDOM Element
     * @param attributeName attribute name
     * @param d date object
     */
    public static void setDateAttribute
        (Element elem, String attributeName, Date d)
    {
        if (d != null) {
            elem.setAttribute (attributeName, dateToString (d));
        }
    }
    /**
     * Sets date="YYYYMMDDHHMMSS" attribute to an XML Element
     * @param elem JDOM Element
     * @param attributeName attribute name
     * @param d date object
     */
    public static void setDateTimeAttribute
        (Element elem, String attributeName, Date d)
    {
        if (d != null) {
            elem.setAttribute (attributeName, dateTimeToString (d));
        }
    }

    /**
     * Force the 'time' portion of a date up to 23:59:59.999
     * @param d date
     * @return converted date
     */
    public static Date ceil (Date d) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime (d);
        else {
            cal.set (Calendar.DAY_OF_MONTH, 31);
            cal.set (Calendar.MONTH, 12);
            cal.set (Calendar.YEAR, 2099);
        }
        cal.set (Calendar.AM_PM, Calendar.PM);
        cal.set (Calendar.HOUR, 11);
        cal.set (Calendar.MINUTE, 59);
        cal.set (Calendar.SECOND, 59);
        cal.set (Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    public static Date ceil (Date d, int precision) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime (d);
        else {
            cal.set (Calendar.DAY_OF_MONTH, 31);
            cal.set (Calendar.MONTH, 12);
            cal.set (Calendar.YEAR, 2099);
        }

        switch (precision) {
            case Calendar.DATE:
                cal.set (Calendar.HOUR_OF_DAY, 23);  // nobreak
            case Calendar.HOUR:
            case Calendar.HOUR_OF_DAY:
                cal.set (Calendar.MINUTE, 59);       // nobreak
            case Calendar.MINUTE:
                cal.set (Calendar.SECOND, 59);       // nobreak
            case Calendar.SECOND:
            case Calendar.MILLISECOND:
                cal.set (Calendar.MILLISECOND, 999); // nobreak

            default:
                // nothing? throw error?
        }
        return cal.getTime();
    }

    /**
     * Force the 'time' portion of a date down to 00:00:00.000
     * @param d date (if null, we default to 01/01/1970)
     * @return converted date
     */
    public static Date floor (Date d) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime (d);
        else {
            cal.set (Calendar.DAY_OF_MONTH, 1);
            cal.set (Calendar.MONTH, 1);
            cal.set (Calendar.YEAR, 1970);
        }
        cal.set (Calendar.AM_PM, Calendar.AM);
        cal.set (Calendar.HOUR, 0);
        cal.set (Calendar.MINUTE, 0);
        cal.set (Calendar.SECOND, 0);
        cal.set (Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date floor (Date d, int precision) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime (d);
        else {
            cal.set (Calendar.DAY_OF_MONTH, 1);
            cal.set (Calendar.MONTH, 1);
            cal.set (Calendar.YEAR, 1970);
        }

        // keep in sync with nextFloor(Date, int)!
        switch (precision) {
            case Calendar.DATE:
                cal.set (Calendar.HOUR_OF_DAY, 0);  // nobreak
            case Calendar.HOUR:
            case Calendar.HOUR_OF_DAY:
                cal.set (Calendar.MINUTE, 0);       // nobreak
            case Calendar.MINUTE:
                cal.set (Calendar.SECOND, 0);       // nobreak
            case Calendar.SECOND:
                cal.set (Calendar.MILLISECOND, 0);  // nobreak
            // case Calendar.MILLISECOND: ???
            default:
                // nothing? throw error?
        }
        return cal.getTime();
    }

    /**
     * Increment the given precision unit, and set the next lower unit to ZERO.
     *
     * For example, if the <code>Date d</code> represents "Mon Jan 21 20:34:46 UYT 2019",
     * then, <code>Util.nextFloor(d, Calendar.HOUR_OF_DAY)</code> will advance to the beginning
     * of next hour, i.e. "Mon Jan 21 21:00:00 UYT 2019". (notice that  the next hour could very well be
     * on the next day, year, etc...)
     *
     * @param d date
     * @param precision is one of the Calendar constants: DATE, HOUR, HOUR_OF_DAY, MINUTE, SECOND
     *                   (behavior for other values is undefined)
     * @return converted date
     * @throws NullPointerException if d is null
     */
    public static Date nextFloor (Date d, int precision) {
        Calendar cal = Calendar.getInstance();
        cal.setTime (d);
        cal.add (precision, 1);

        // floor it! (basically what floor(Date, int) does, keep in sync!
        switch (precision) {
            case Calendar.DATE:
                cal.set (Calendar.HOUR_OF_DAY, 0);  // nobreak
            case Calendar.HOUR:
            case Calendar.HOUR_OF_DAY:
                cal.set (Calendar.MINUTE, 0);       // nobreak
            case Calendar.MINUTE:
                cal.set (Calendar.SECOND, 0);       // nobreak
            case Calendar.SECOND:
                cal.set (Calendar.MILLISECOND, 0);  // nobreak
            // case Calendar.MILLISECOND: ???
            default:
                // nothing? throw error?
        }
        return cal.getTime();
    }


    /**
     * Force date to tomorrow at 00:00:00.000
     * @param d date
     * @return converted date
     */
    public static Date tomorrow (Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime (d);
        cal.add (Calendar.DATE, 1);
        cal.set (Calendar.AM_PM, Calendar.AM);
        cal.set (Calendar.HOUR, 0);
        cal.set (Calendar.MINUTE, 0);
        cal.set (Calendar.SECOND, 0);
        cal.set (Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
