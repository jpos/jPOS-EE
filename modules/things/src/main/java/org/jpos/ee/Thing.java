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

package org.jpos.ee;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Thing implements Serializable {
    private Long id;
    private String type;
    private Map<String,String> stringProps;
    private Map<String,String> textProps;
    private Map<String,Long> longProps;
    private Map<String, Date> dateProps;
    private Map<String, Timestamp> timestampProps;
    private Map<String, BigDecimal> bigDecimalProps;
    
    public Thing () {
        super();
    }
    public Thing (String type) {
        super();
        this.type = type;
    }
    public Long getId () {
        return this.id;
    }
    public void setId (Long id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Map<String,String> getStringProps () {
        return (stringProps = stringProps == null ? 
            new HashMap<String,String> () : stringProps);
    }
    public void setStringProps (Map<String,String> stringProps) {
        this.stringProps = stringProps;
    }
    public Map<String,String> getTextProps () {
        return (textProps = textProps == null ? 
            new HashMap<String,String> () : textProps);
    }
    public void setTextProps (Map<String,String> textProps) {
        this.textProps = textProps;
    }
    public Map<String,Long> getLongProps () {
        return (longProps = longProps == null ? 
            new HashMap<String,Long> () : longProps);
    }
    public void setLongProps (Map<String,Long> longProps) {
        this.longProps = longProps;
    }
    public Map<String,Date> getDateProps () {
        return (dateProps = dateProps == null ? 
            new HashMap<String,Date> () : dateProps);
    }
    public void setDateProps (Map<String,Date> dateProps) {
        this.dateProps = dateProps;
    }

    public Map<String, Timestamp> getTimestampProps() {
        return (timestampProps = timestampProps == null ?
            new HashMap<String,Timestamp> () : timestampProps);

    }

    public void setTimestampProps(Map<String, Timestamp> timestampProps) {
        this.timestampProps = timestampProps;
    }
    public Map<String,BigDecimal> getBigDecimalProps () {
        return (bigDecimalProps = bigDecimalProps == null ? 
                new HashMap<String,BigDecimal> () : bigDecimalProps);
    }
    public void setBigDecimalProps (Map<String,BigDecimal> bigDecimalProps) {
        this.bigDecimalProps = bigDecimalProps;
    }
    public void put (String name, String value) {
        getStringProps().put (name, value);
    }
    public void putText (String name, String value) {
        getTextProps().put (name, value);
    }
    public void put (String name, long value) {
        getLongProps().put (name, value);
    }
    public void put (String name, Date value) {
        getDateProps().put (name, value);
    }
    public void put (String name, Timestamp value) {
        getTimestampProps().put (name, value);
    }

    public void put (String name, BigDecimal value) {
        getBigDecimalProps().put (name, value);
    }
    public String getString (String name) {
        return getStringProps().get(name); 
    }
    public Long getLong (String name) {
        return getLongProps().get (name);
    }
    public BigDecimal getBigDecimal (String name) {
        return getBigDecimalProps().get (name);
    }
    public Date getDate (String name) {
        return getDateProps().get (name);
    }
    public Timestamp getTimestamp (String name) {
        return getTimestampProps().get (name);
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("type", getType())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof Thing) ) return false;
        Thing castOther = (Thing) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
}

