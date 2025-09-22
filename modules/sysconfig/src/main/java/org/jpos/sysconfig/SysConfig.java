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

package org.jpos.sysconfig;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.*;
import org.jpos.ee.Cloneable;

@Entity
@Table(name = "sysconfig")
@Cache(usage = CacheConcurrencyStrategy.NONE)
@Comment("General purpose System Configuration")
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


    public SysConfig() {
        super();
    }
    public SysConfig(String id) {
        this.id = id;
    }
    public SysConfig(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public SysConfig(String id, String value, String readPerm, String writePerm) {
        this.id = id;
        this.value = value;
        this.readPerm = readPerm;
        this.writePerm = writePerm;
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
        return readPerm;
    }

    public void setReadPerm(String readPerm) {
        this.readPerm = readPerm;
    }

    public String getWritePerm() {
        return writePerm;
    }

    public void setWritePerm(String writePerm) {
        this.writePerm = writePerm;
    }

    @Override
    public String toString() {
        return "SysConfig{" +
          "id='" + id + '\'' +
          '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysConfig sysConfig = (SysConfig) o;
        return Objects.equals(id, sysConfig.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
