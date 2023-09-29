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
