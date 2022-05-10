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
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("unused")
public class ResultCode implements Serializable {
    private Long id;
    private String mnemonic;
    private String description;
    private Map<String,ResultCodeInfo> locales;

    public ResultCode(Long id, String mnemonic, String description, Map<String,ResultCodeInfo> locales) {
        this.id = id;
        this.mnemonic = mnemonic;
        this.description = description;
        this.locales = locales;
    }

    public ResultCode() {
    }

    public ResultCode(Long id, Map<String,ResultCodeInfo> locales) {
        this.id = id;
        this.locales = locales;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String,ResultCodeInfo> getLocales() {
        return this.locales;
    }

    public void setLocales(Map<String,ResultCodeInfo> locales) {
        this.locales = locales;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof ResultCode) ) return false;
        ResultCode castOther = (ResultCode) other;
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
