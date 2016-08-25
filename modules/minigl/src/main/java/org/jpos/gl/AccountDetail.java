/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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
import java.util.List;
import java.math.BigDecimal;

/**
 * Account Detail bulk response object.
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see GLSession#getAccountDetail
 */
public class AccountDetail {
    Journal journal;
    Account account;
    Date end;
    Date start;
    BigDecimal initialBalance;
    BigDecimal finalBalance;
    BigDecimal debits;
    BigDecimal credits;
    List<GLEntry> entries;
    short[] layers;

    /**
     * Constructs an AccountDetail.
     * @param journal the Journal.
     * @param account the account.
     * @param initialBalance initial balance (reporting currency).
     * @param start start date (inclusive).
     * @param end end date (inclusive).
     * @param entries list of GLEntries.
     * @param layers the layers involved in this detail
     */
    public AccountDetail(
        Journal journal, Account account,
        BigDecimal initialBalance,
        Date start, Date end, List<GLEntry> entries, short[] layers)
    {
        super();
        this.journal               = journal;
        this.account               = account;
        this.initialBalance        = initialBalance;
        this.start                 = start;
        this.end                   = end;
        this.entries               = entries;
        this.layers                = layers;
        computeBalances();
    }

    /**
     * Constructs an AccountDetail (reverse order, mini statement)
     * @param journal the Journal.
     * @param account the account.
     * @param balance final balance (reporting currency).
     * @param entries list of GLEntries.
     * @param layers the layers involved in this detail
     */
    public AccountDetail(
            Journal journal, Account account,
            BigDecimal balance,
            List<GLEntry> entries, short[] layers)
    {
        super();
        this.journal               = journal;
        this.account               = account;
        this.finalBalance          = balance;
        this.entries               = entries;
        this.layers                = layers;
        computeReverseBalances(balance);
    }

    public Journal getJournal() {
        return journal;
    }
    public Account getAccount() {
        return account;
    }
    public BigDecimal getInitialBalance() {
        return initialBalance;
    }
    public BigDecimal getFinalBalance() {
        return finalBalance;
    }
    public BigDecimal getDebits () {
        return debits;
    }
    public BigDecimal getCredits () {
        return credits;
    }
    public Date getStart() {
        return start;
    }
    public Date getEnd() {
        return end;
    }
    public List<GLEntry> getEntries() {
        return entries;
    }
    public short[] getLayers() {
        return layers;
    }
    public int size() {
        return entries.size();
    }
    private void computeBalances() {
        BigDecimal balance = initialBalance;
        debits = credits = GLSession.ZERO;        
        for (GLEntry entry : entries) {
            balance = balance.add (entry.getImpact());
            entry.setBalance (balance);
            if (entry.isCredit())
                credits = credits.add (entry.getAmount());
            else
                debits = debits.add (entry.getAmount());
        }
        finalBalance = balance;
    }
    private void computeReverseBalances(BigDecimal balance) {
        debits = credits = GLSession.ZERO;
        for (GLEntry entry : entries) {
            if (end == null)
                end = entry.getTransaction().getTimestamp();
            start = entry.getTransaction().getTimestamp();
            entry.setBalance(balance);
            balance = balance.subtract (entry.getImpact());
            if (entry.isCredit())
                credits = credits.add (entry.getAmount());
            else
                debits = debits.add (entry.getAmount());
        }
        this.initialBalance = balance;

    }
}

