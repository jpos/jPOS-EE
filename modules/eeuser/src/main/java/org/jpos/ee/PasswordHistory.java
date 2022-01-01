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
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

@SuppressWarnings("unused")
public class PasswordHistory implements Serializable {
    String value;
    public PasswordHistory () {
        super ();
        setValue ("");
    }
    public PasswordHistory (String value) {
        super ();
        setValue (value);
    }        
    public void setValue (String value) {
        this.value = value;
    }
    public String getValue () {
        return value;
    }
    public String toString () {
        return getValue ();
    } 
    public boolean equals(Object other) {
        if ( !(other instanceof PasswordHistory) ) return false;
        PasswordHistory castOther = (PasswordHistory) other;
        return new EqualsBuilder()
            .append(this.getValue(), castOther.getValue())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getValue())
            .toHashCode();
    }
}

