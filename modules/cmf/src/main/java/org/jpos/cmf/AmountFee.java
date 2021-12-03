package org.jpos.cmf;

import org.jpos.iso.ISOUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

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
//        calculateConversionRate();
        setConversionRate(conversionRate);
    }

    public AmountFee(FeeType feeType, CMFAmount fee, CMFAmount settlementFee, String conversionRate) {
        setFeeType(feeType);
        setFee(fee);
        setSettlementFee(settlementFee);
        if (conversionRate == null) throw new IllegalArgumentException("null conversionRate");
//        calculateConversionRate();
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

    public void setConversionRate(BigDecimal conversionRate) {
        // BBB: what if the value has more than 7 significant digits (precision)?
        //      should we round the value or reject it?
        this.conversionRate = requireNonNull(conversionRate);
    }

    public void setConversionRate(String conversionRate) {
        if (conversionRate != null) {
            // Conversion rate is N8, where first digit moves the decimal point to the left
            // But: ISO8583-1:2003 "6.2.4 Conversion rates"
            //    If the value of the first digit is 8, a single zero after the decimal point is assumed.
            //    If the value of the first digit is 9, two zeroes after the decimal point are assumed.
            int conversionScale = conversionRate.charAt(0) - '0';
            if (conversionScale == 8 || conversionScale == 9)
                conversionScale++;
            setConversionRate(new BigDecimal(new BigInteger(conversionRate.substring(1)), conversionScale));
        }
    }

    public String serialize() {
        // TODO: 1. Correctly serialize for cases with with high decimal counts
        //       ----
        //       2. Maybe we should check that the (unscaled) value has no more than 7 digits?
        //         Should we round, fail?
        return feeType.getCode() +
                fee.serialize() +
                conversionRate.scale() + ISOUtil.zeropad(conversionRate.unscaledValue().intValue(), 7) +
                settlementFee.serialize();
    }

    // BBB comment on the RATE_PRECISION: currently == MathContext(7, RoundingMode.HALF_EVEN)
    //     This is for the rare cases where the conversionRate has not been made explicit in the constructors.
    //     Another alternative: Eliminate this method and DON'T ALLOW the construction of this object with a null conversion rate!
    protected void calculateConversionRate() {
        if (conversionRate == null)
            conversionRate = settlementFee.getAmount().divide(fee.getAmount(), RATE_PRECISION);
    }

}
