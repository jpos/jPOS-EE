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

package org.jpos.iso;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class AdditionalAmount {
    private String accountType;
    private String amountType;
    private BigDecimal amount;
    private String currencyCode;
    private int currencyMinorUnit;

    public AdditionalAmount() {
    }

    protected AdditionalAmount(String accountType, BigDecimal amount, String currencyCode,
                            String amountType, int currencyMinorUnit) {

        setAccountType(accountType);
        setAmount(amount);
        setCurrencyCode(currencyCode);
        setAmountTypeCode(amountType);
        setCurrencyMinorUnit(currencyMinorUnit);
    }

    public abstract String serialize();

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        Objects.requireNonNull(accountType);

        if (accountType.length() != 2)
            throw new IllegalArgumentException("Invalid account type length");

        this.accountType = accountType;
    }

    /**
     * @return The internal amount type 2-char string
     */
    public String getAmountTypeCode() {
        return amountType;
    }

    public void setAmountTypeCode(String amountType) {
        Objects.requireNonNull(amountType);
        this.amountType = amountType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        Objects.requireNonNull(amount);
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        Objects.requireNonNull(currencyCode);

        if (currencyCode.length() != 3)
            throw new IllegalArgumentException("Invalid currency code");

        this.currencyCode = currencyCode;
    }

    public int getCurrencyMinorUnit() {
        return currencyMinorUnit;
    }

    public void setCurrencyMinorUnit(int currencyMinorUnit) {
        if (currencyMinorUnit < 0 || currencyMinorUnit > 9)
            throw new IllegalArgumentException("Invalid currency minor unit value");

        this.currencyMinorUnit = currencyMinorUnit;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
            String.format (" {%s,%s,%s,%d,%s}", accountType, amountType, currencyCode, currencyMinorUnit, amount);
    }

}
