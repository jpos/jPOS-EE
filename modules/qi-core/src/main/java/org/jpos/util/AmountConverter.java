package org.jpos.util;

import com.vaadin.data.converter.StringToBigDecimalConverter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class AmountConverter extends StringToBigDecimalConverter {

    public AmountConverter(String errorMessage) {
        super(errorMessage);
    }

    @Override
    protected NumberFormat getFormat(Locale locale) {
        NumberFormat amountFormat = NumberFormat.getInstance();
        amountFormat.setGroupingUsed(true);
        amountFormat.setMinimumFractionDigits(2);
        if (amountFormat instanceof DecimalFormat) {
            ((DecimalFormat) amountFormat).setParseBigDecimal(true);
        }
        return amountFormat;
    }

}
