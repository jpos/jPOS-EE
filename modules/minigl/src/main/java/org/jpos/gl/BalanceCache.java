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

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/** 
 *      Journal level account Checkpoint.
 *     
*/
public class BalanceCache implements Serializable {
    private long ref;
    private BigDecimal balance;
    private org.jpos.gl.Journal journal;
    private org.jpos.gl.Account account;
    private String layers;

    public BalanceCache() {
        super();
    }
    public void setRef (long ref) {
        this.ref = ref;
    }
    public long getRef () {
        return ref;
    }
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public org.jpos.gl.Journal getJournal() {
        return this.journal;
    }

    public void setJournal(org.jpos.gl.Journal journal) {
        this.journal = journal;
    }

    public org.jpos.gl.Account getAccount() {
        return this.account;
    }

    public void setAccount(org.jpos.gl.Account account) {
        this.account = account;
    }

    public void setLayers (String layers) {
        this.layers = layers;
    }
    public String getLayers () {
        return layers;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("ref", getRef())
            .append("layers", getLayers())
            .append("journal", getJournal())
            .append("account", getAccount())
            .append("balance", getBalance())
            .toString();
    }
    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof BalanceCache) ) return false;
        BalanceCache castOther = (BalanceCache) other;
        return new EqualsBuilder()
            .append(this.getRef(), castOther.getRef())
            .append(this.getLayers(), castOther.getLayers())
            .append(this.getJournal(), castOther.getJournal())
            .append(this.getAccount(), castOther.getAccount())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getRef())
            .append(getLayers())
            .append(getJournal())
            .append(getAccount())
            .toHashCode();
    }
}
