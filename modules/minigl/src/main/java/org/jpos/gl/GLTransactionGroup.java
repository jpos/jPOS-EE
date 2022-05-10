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

import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class GLTransactionGroup {
    private long id;
    private String name;
    private Set transactions;

    public GLTransactionGroup () {
        super();
    }
    public GLTransactionGroup (String name) {
        super ();
        setName (name);
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTransactions (Set transactions) {
        this.transactions = transactions;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Set getTransactions() {
        return transactions;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("name", getId())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof GLTransactionGroup) ) return false;
        GLTransactionGroup castOther = (GLTransactionGroup) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
    /*
    public BigDecimal getDebits (short[] layers) {
        BigDecimal debits = GLSession.ZERO;
        for (GLEntry e : (List<GLEntry>) getEntries()) {
            if (e.isDebit() && e.hasLayers (layers)) {
                debits = debits.add (e.getAmount());
            }
        }
        return debits;
    }
    public BigDecimal getCredits (short[] layers) {
        BigDecimal credits = GLSession.ZERO;
        for (GLEntry e : (List<GLEntry>) getEntries()) {
            if (e.isCredit() && e.hasLayers (layers)) {
                credits = credits.add (e.getAmount());
            }
        }
        return credits;
    }
    */
}

