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

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "sysconfig")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("unused")
public class SysConfig extends Cloneable implements Serializable {
    @Id
    @Column(length=64)
    private String id;

    @Column(length=8000)
    private String value;

    @Column(length=64)
    private String readPerm;

    @Column(length=64)
    private String writePerm;

    public SysConfig(String id, String value, String readPerm, String writePerm) {
        this.id = id;
        this.value = value;
        this.readPerm = readPerm;
        this.writePerm = writePerm;
    }
    public SysConfig() {
        super();
    }

    public SysConfig(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReadPerm() {
        return this.readPerm;
    }

    public void setReadPerm(String readPerm) {
        this.readPerm = readPerm;
    }

    public String getWritePerm() {
        return this.writePerm;
    }

    public void setWritePerm(String writePerm) {
        this.writePerm = writePerm;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof SysConfig) ) return false;
        SysConfig castOther = (SysConfig) other;
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
