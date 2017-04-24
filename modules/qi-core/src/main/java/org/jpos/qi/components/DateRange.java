/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.qi.components;

import com.vaadin.ui.UI;
import org.joda.time.DateTime;
import org.jpos.qi.QI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by spr on 10/22/15.
 */
public class DateRange {
    public static String LAST_HOUR  = "daterange.lasthour";
    public static String TODAY      = "daterange.today";
    public static String YESTERDAY  = "daterange.yesterday";
    public static String THIS_WEEK  = "daterange.thisweek";
    public static String LAST_WEEK  = "daterange.lastweek";
    public static String THIS_MONTH = "daterange.thismonth";
    public static String LAST_MONTH = "daterange.lastmonth";
    public static String THIS_YEAR  = "daterange.thisyear";
    public static String ALL_TIME   = "daterange.alltime";
    public static String[] ranges   = new String[] {
            LAST_HOUR, TODAY, YESTERDAY, THIS_WEEK, LAST_WEEK, THIS_MONTH, LAST_MONTH, THIS_YEAR, ALL_TIME
    };
    private String range;
    private Date start;
    private Date end;
    public Map<String, Date> startDate = createStartDateMap();
    public Map<String, Date> endDate = createEndDateMap();

    public DateRange() {
        super();
    }

    public DateRange(String range) {
        this();
        if (startDate.containsKey(range) && endDate.containsKey(range)) {
            setStart(startDate.get(range));
            setEnd(endDate.get(range));
            setRange(range);
        }
    }

    private static Map<String, Date> createStartDateMap () {
        QI app = (QI) UI.getCurrent();
        DateTime dt = DateTime.now().millisOfDay().withMinimumValue();
        Map<String, Date> map = new HashMap<>();
        map.put(app.getMessage(LAST_HOUR),  DateTime.now().minusHours(1).toDate());
        map.put(app.getMessage(TODAY),      dt.toDate());
        map.put(app.getMessage(YESTERDAY),  dt.minusDays(1).toDate());
        map.put(app.getMessage(THIS_WEEK),  dt.dayOfWeek().withMinimumValue().toDate());
        map.put(app.getMessage(LAST_WEEK),  dt.dayOfWeek().withMinimumValue().minusWeeks(1).toDate());
        map.put(app.getMessage(THIS_MONTH), dt.dayOfMonth().withMinimumValue().toDate());
        map.put(app.getMessage(LAST_MONTH), dt.dayOfMonth().withMinimumValue().minusMonths(1).toDate());
        map.put(app.getMessage(THIS_YEAR),  dt.dayOfYear().withMinimumValue().toDate());
        map.put(app.getMessage(ALL_TIME),   null);
        return map;
    }

    private static Map<String, Date> createEndDateMap () {
        QI app = (QI) UI.getCurrent();
        DateTime dt = DateTime.now().millisOfDay().withMaximumValue();
        Map<String, Date> map = new HashMap<>();
        map.put(app.getMessage(LAST_HOUR),  DateTime.now().toDate());
        map.put(app.getMessage(TODAY),      dt.toDate());
        map.put(app.getMessage(YESTERDAY),  dt.minusDays(1).toDate());
        map.put(app.getMessage(THIS_WEEK),  dt.dayOfWeek().withMaximumValue().toDate());
        map.put(app.getMessage(LAST_WEEK),  dt.dayOfWeek().withMaximumValue().minusWeeks(1).toDate());
        map.put(app.getMessage(THIS_MONTH), dt.dayOfMonth().withMaximumValue().toDate());
        map.put(app.getMessage(LAST_MONTH), dt.dayOfMonth().withMaximumValue().minusMonths(1).toDate());
        map.put(app.getMessage(THIS_YEAR),  dt.dayOfYear().withMaximumValue().toDate());
        map.put(app.getMessage(ALL_TIME),   null);
        return map;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String toString() {
        if (getRange() != null)
            return getRange();
        DateTime from = new DateTime(getStart());
        DateTime to = new DateTime(getEnd());
        if (from.getDayOfYear() == to.getDayOfYear())
            return from.toString("MM/dd/YYYY");
        return from.toString("MM/dd/YYYY") + " - " + to.toString("MM/dd/YYYY");

    }
}
