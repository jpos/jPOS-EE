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

package org.jpos.cmf;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class AdditionalAmount {

    public final static int SERIALIZED_DATA_LENGTH = 21;

    private String accountType;
    private AmountType amountType;
    private BigDecimal amount;
    private String currencyCode;
    private int currencyMinorUnit;

    public AdditionalAmount(String accountType, BigDecimal amount, String currencyCode,
                            AmountType amountType, int currencyMinorUnit) {

        setAccountType(accountType);
        setAmount(amount);
        setCurrencyCode(currencyCode);
        setAmountType(amountType);
        setCurrencyMinorUnit(currencyMinorUnit);
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {

        Objects.requireNonNull(accountType);

        if (accountType.length() != 2)
            throw new IllegalArgumentException("Invalid account type length");

        this.accountType = accountType;
    }

    public AmountType getAmountType() {
        return amountType;
    }

    public void setAmountType(AmountType amountType) {
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

    public String serialize() {
        if (getAmountType() == null)
            throw new IllegalStateException("Amount type not set");

        if (getAmount() == null)
            throw new IllegalStateException("Amount not set");

        long absAmt= getAmount().movePointRight(getCurrencyMinorUnit()).abs().longValue();

        @SuppressWarnings("StringBufferReplaceableByString")
        StringBuilder sb = new StringBuilder();
        sb.append(getAccountType());
        sb.append(getAmountType().toString());
        sb.append(getCurrencyCode());
        sb.append(getCurrencyMinorUnit());
        sb.append(getAmount().compareTo(BigDecimal.ZERO) >= 0 ? "C" : "D");
        sb.append(StringUtils.leftPad(Long.toString(absAmt), 12, '0'));

        return sb.toString();
    }

    static AdditionalAmount parse(String data) {
        Objects.requireNonNull(data);

        if (data.length() != SERIALIZED_DATA_LENGTH)
            throw new IllegalArgumentException("Invalid data length");

        String accountType = StringUtils.mid(data, 0, 2);
        AmountType amountType = AmountType.fromCode(StringUtils.mid(data, 2, 2));
        String currencyCode = StringUtils.mid(data, 4, 3);
        int minorUnit = Integer.parseInt(StringUtils.mid(data, 7, 1));
        BigDecimal amount = new BigDecimal(StringUtils.right(data, 12)).movePointLeft(minorUnit);
        String amountSign = StringUtils.mid(data, 8, 1);

        if (!"C.D".contains(amountSign))
            throw new IllegalArgumentException("Invalid amount sign");

        if ("D".equalsIgnoreCase(amountSign))
            amount = amount.negate();

        return new AdditionalAmount(accountType, amount, currencyCode, amountType, minorUnit);
    }
}
