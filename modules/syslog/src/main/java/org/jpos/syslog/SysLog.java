/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

package org.jpos.syslog;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@SoftDelete
@Table(name = "syslog")
@Cache(usage = CacheConcurrencyStrategy.NONE)
@Comment("System audit log")
@SuppressWarnings("unused")
public class SysLog implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long id;
    private Instant date;
    private String source;
    private String type;
    private int severity;
    private String summary;
    private String detail;
    private String trace;

    public static final int DEBUG    = 0;
    public static final int TRACE    = 1;
    public static final int INFO     = 2;
    public static final int WARN     = 3;
    public static final int ERROR    = 4;
    public static final int CRITICAL = 5;

    public static final String[] severityAsString = 
        new String[] { "debug", "trace", "info", "warn", "error", "critical" };

    public SysLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeverity() {
        return severity;
    }

    public String getSeverityAsString () {
        if (getSeverity() > SysLog.CRITICAL)
            return Integer.toString (getSeverity());
        else
            return severityAsString [getSeverity()];
    }
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Override
    public String toString() {
        return "SysLog{" +
          "id=" + id +
          '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysLog sysLog = (SysLog) o;
        return Objects.equals(id, sysLog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
