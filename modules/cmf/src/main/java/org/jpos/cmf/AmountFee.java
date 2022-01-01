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

import org.jpos.iso.ISOUtil;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

/**
 * A single Fee amount, from jPOS-CMF DE-046<br>
 *
 * Format:  FeeType + fee amount + conversion rate + settlement fee (N2, N13, N8, N13)
 *
 * @see AmountFeesWrapper
 * @see FeeType
 * @see CMFAmount
 */
public class AmountFee {
    protected final static int SERIALIZED_DATA_LENGTH = 36;
    protected static final MathContext RATE_PRECISION = new MathContext(7, RoundingMode.HALF_EVEN);

    protected FeeType feeType;
    protected CMFAmount fee;
    protected CMFAmount settlementFee;
    protected BigDecimal conversionRate;

    public AmountFee(FeeType feeType, CMFAmount fee, CMFAmount settlementFee, BigDecimal conversionRate) {
        setFeeType(feeType);
        setFee(fee);
        setSettlementFee(settlementFee);
        if (conversionRate == null) throw new IllegalArgumentException("null conversionRate");
        setConversionRate(conversionRate);
    }

    public AmountFee(FeeType feeType, CMFAmount fee, CMFAmount settlementFee, String conversionRate) {
        setFeeType(feeType);
        setFee(fee);
        setSettlementFee(settlementFee);
        if (conversionRate == null) throw new IllegalArgumentException("null conversionRate");
        setConversionRate(conversionRate);
    }

    public AmountFee(String data) {
        if (data.length() != SERIALIZED_DATA_LENGTH) throw new IllegalArgumentException("Invalid data length");
        feeType = FeeType.fromCode(data.substring(0, 2));
        fee = new CMFAmount(data.substring(2, 15));
        setConversionRate(data.substring(15, 23));
        settlementFee = new CMFAmount(data.substring(23));
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = requireNonNull(feeType);
    }

    public CMFAmount getFee() {
        return fee;
    }

    public void setFee(CMFAmount fee) {
        this.fee = requireNonNull(fee);
    }

    public CMFAmount getSettlementFee() {
        return settlementFee;
    }

    public void setSettlementFee(CMFAmount settlementFee) {
        this.settlementFee = requireNonNull(settlementFee);
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate given as a BigDecimal.
     *
     * ATTN: It will round the value to a precision of 7 significant digits.
     * @param conversionRate the conversion rate
     */
    public void setConversionRate(BigDecimal conversionRate) {
        requireNonNull(conversionRate);
        if (conversionRate.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Bad conversion rate. Can't be negative: "+conversionRate);
        this.conversionRate = conversionRate.round(RATE_PRECISION);
    }

    public void setConversionRate(String conversionRate) {
        Objects.requireNonNull(conversionRate, "conversionRate is null");
        if (conversionRate.length() != 8)
            throw new IllegalArgumentException("Bad conversion rate. String length should be 8 and got "+conversionRate.length());

        int conversionScale = conversionRate.charAt(0) - '0';               // value of first digit is scale
        setConversionRate(new BigDecimal(conversionRate.substring(1))
                            .movePointLeft(conversionScale)
                            .round(RATE_PRECISION));
    }

    public String serialize() {
        return feeType.getCode() +
                fee.serialize() +
                conversionRate.scale() + ISOUtil.zeropad(conversionRate.unscaledValue().intValue(), 7) +
                settlementFee.serialize();
    }

}
