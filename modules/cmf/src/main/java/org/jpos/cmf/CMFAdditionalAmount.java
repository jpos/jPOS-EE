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

package org.jpos.cmf;

// import org.apache.commons.lang3.StringUtils;
import org.jpos.cmf.iso.AdditionalAmount;
import org.jpos.iso.ISOUtil;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents one occurrence of an Additional Amount (from DE-54) in jPOS-CMF format.
 */
public class CMFAdditionalAmount extends AdditionalAmount {

    public final static int SERIALIZED_DATA_LENGTH = 21;

    public CMFAdditionalAmount() {
    }

    public CMFAdditionalAmount(String accountType, BigDecimal amount, String currencyCode,
                               String amountType, int currencyMinorUnit) {
        super(accountType, amount, currencyCode, amountType, currencyMinorUnit);
    }

    @Override
    public String serialize() {
        if (getAmountTypeCode() == null)
            throw new IllegalStateException("Amount type not set");

        if (getAmount() == null)
            throw new IllegalStateException("Amount not set");

        long absAmt= getAmount().movePointRight(getCurrencyMinorUnit()).abs().longValue();

        return  getAccountType() +
                getAmountTypeCode() +
                getCurrencyCode() +
                getCurrencyMinorUnit() +
                (getAmount().compareTo(BigDecimal.ZERO) >= 0 ? "C" : "D") +
                ISOUtil.zeropad(absAmt, 12);
    }

    public static AdditionalAmount parse(String data) {
        Objects.requireNonNull(data);

        if (data.length() != SERIALIZED_DATA_LENGTH)
            throw new IllegalArgumentException("Invalid data length");

        String accountType = data.substring(0, 2);
        String amountType = data.substring(2, 4);
        String currencyCode = data.substring(4, 7);
        int minorUnit = Integer.parseInt(data.substring(7, 8));

        String amountSign = data.substring(8,9);
        BigDecimal amount = new BigDecimal(data.substring(data.length() - 12)).movePointLeft(minorUnit);

        if (!"C.D".contains(amountSign))
            throw new IllegalArgumentException("Invalid amount sign");

        if ("D".equalsIgnoreCase(amountSign))
            amount = amount.negate();

        return new CMFAdditionalAmount(accountType, amount, currencyCode, amountType, minorUnit);
    }

}
