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

import org.apache.commons.lang3.BitField;
import org.jpos.iso.ISOCurrency;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/**
 * This class handles amounts for certain fields in the jPOS-CMF spec that include a currency and minor unit before the amount.<br>
 *
 * <p>
 * The value may be signed or unsigned.
 * When signed, the string will be prefixed by a 'C' or 'D'.<br>
 * In jPOS-CMF, these are mostly used to represent fees such as those in DE-046
 * </p>
 *
 * <p><b>ATTN:</b>  The constructors in this class don't check the length in digits of the raw amount.
 * It's your responsibility to make sure that, when constructing, and then serializing with
 *  {@link #serialize(boolean, int)}, that the lengths are in accordance and what you need.
 * </p>
 * <p><b>NOTE:</b>This class does not handle additional amounts (DE-054).
 * For that, use {@link AdditionalAmount} and {@link AdditionalAmountsWrapper}.
 * </p>
 *
 */
public class CMFAmount {
    public static final int DEFAULT_AMOUNT_LENGTH = 8;              // useful for xn-13 fields (with n8 for the amount part)

    protected String currency;
    protected BigDecimal amount;

    public CMFAmount(BigDecimal amount, String currency) {
        setAmount(amount);
        setCurrency(currency);
    }

    /**
     * Constructor without minor unit, derives it from currency
     * @param sign 'C' for credit, 'D' for debit
     * @param currency currency code
     * @param amount Amount as string, unscaled
     */
    public CMFAmount(char sign, String currency, String amount) throws ISOException {
        this(sign, currency, ISOCurrency.getCurrency(currency).getDecimals(), amount);
    }

    /**
     * Constructor without sign; assumed positive ('C')
     */
    public CMFAmount(String currency, int minorUnit, String amount) {
        this('C', currency, minorUnit, amount);
    }

    /**
     *
     * @param sign 'C' for credit, 'D' for debit
     * @param currency currency code
     * @param minorUnit decimal position.
     * @param amount Amount as string, unscaled, absolute value
     *
     * @throws IllegalArgumentException if uppercase sign is not 'C' or 'D'
     * @throws IllegalArgumentException if amount includes a sign and parses as negative
     */
    public CMFAmount(char sign, String currency, int minorUnit, String amount) {
        sign = Character.toUpperCase(sign);
        if (sign != 'D' && sign != 'C')
            throw  new IllegalArgumentException("Invalid sign: " + sign);

        BigInteger amt= new BigInteger(amount);
        if (amt.compareTo(BigInteger.ZERO) < 0)
            throw new IllegalArgumentException("Amount string negative; must be given as absolute value: " + amount);

        BigDecimal value = new BigDecimal(amt, minorUnit);
        this.amount = (sign == 'D') ? value.negate() : value;   //no need to check for null
        setCurrency(currency);
    }


    /**
     * Constructor from full CMF string.<br>
     * It supports amounts with or without sign as the first character ('C' or 'D' prefix),
     * and expects currency and minor unit parts before the actual amount.<br>
     * The general syntax is [sign] + currency + minor + amount.<br>
     * Currency is <code>N3</code>, minor unit <code>N1</code>, and the rest is the amount (usually 8 or 12 digits).<br>
     *
     * @param cmfAmount The string representing all the components of the amount
     * @see #serialize(boolean, int)
     */
    public CMFAmount(String cmfAmount) {
        Objects.requireNonNull(cmfAmount);
        char sign = 'C';
        char first = Character.toUpperCase(cmfAmount.charAt(0));
        if (first == 'C' || first == 'D') {
            sign = first;
            cmfAmount = cmfAmount.substring(1);     // consume first character
        }
        currency = cmfAmount.substring(0, 3);
        char minorUnit = cmfAmount.charAt(3);
        if (minorUnit < '0' || minorUnit > '9') throw new IllegalArgumentException("Bad minor unit: " + minorUnit);

        BigDecimal value = new BigDecimal(new BigInteger(cmfAmount.substring(4)), minorUnit - '0');
        this.amount = (sign == 'D') ? value.negate() : value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = Objects.requireNonNull(amount);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = Objects.requireNonNull(currency);
    }

    public int getMinorUnit() {
        return amount.scale();
    }

    public char getSign() {
        return amount.signum() < 0 ? 'D' : 'C';
    }

    /**
     * Serialize with optional sign, and given length for the amount part.<br>
     *
     * The string returned is of the form <code>[C|D] + currency + minor + amount</code>,
     * where the first character ('C' or 'D') is the sign (for positive or negative, respectively),
     * the currency format is N3, the minor unit is N1, and the amount is of the given <code>amountLength</code>.
     *
     * @param withSign whether to emit the sign character
     * @param amountLength the length in digits for the amount part
     * @return The serialized value as a String
     */
    public String serialize(boolean withSign, int amountLength){
        StringBuilder builder = new StringBuilder(13);
        if (withSign) builder.append(getSign());
        return builder.append(currency)
                .append(getMinorUnit())
                .append(ISOUtil.zeropad(amount.abs().unscaledValue().intValue(), amountLength))
                .toString();
    }

    /**
     *  Serialize with optional sign and DEFAULT_AMOUNT_LENGTH (8)
     *
     * @param withSign whether to emit the sign character
     * @return A string as returned by {@link #serialize(boolean, int)} with the chosen withSign argument, and the default amount length
     */
    public String serialize(boolean withSign){
        return serialize(withSign, DEFAULT_AMOUNT_LENGTH);
    }

    /**
     * Serialize with sign and DEFAULT_AMOUNT_LENGTH (8)
     *
     * @return A string as returned by {@link #serialize(boolean, int)} with sign and the default amount length
     */
    public String serialize() {
        return serialize(true, DEFAULT_AMOUNT_LENGTH);
    }
}
