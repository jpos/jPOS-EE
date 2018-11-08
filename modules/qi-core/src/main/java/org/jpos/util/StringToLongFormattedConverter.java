package org.jpos.util;

import com.vaadin.data.ErrorMessageProvider;
import com.vaadin.data.ValueContext;
import com.vaadin.data.converter.StringToLongConverter;

import java.text.NumberFormat;
import java.util.Locale;

public class StringToLongFormattedConverter extends StringToLongConverter {
    public StringToLongFormattedConverter(String errorMessage) {
        super(errorMessage);
    }

    public StringToLongFormattedConverter(Long emptyValue, String errorMessage) {
        super(emptyValue, errorMessage);
    }

    public StringToLongFormattedConverter(ErrorMessageProvider errorMessageProvider) {
        super(errorMessageProvider);
    }

    public StringToLongFormattedConverter(Long emptyValue, ErrorMessageProvider errorMessageProvider) {
        super(emptyValue, errorMessageProvider);
    }

    /**
     * Returns the format used by
     * {@link #convertToPresentation(Object, ValueContext)} and
     * {@link #convertToModel(String, ValueContext)}.
     *
     * @param locale
     *            The locale to use
     * @return A NumberFormat instance
     */
    @Override
    protected NumberFormat getFormat(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        NumberFormat format = NumberFormat.getIntegerInstance(locale);
        format.setGroupingUsed(false);
        return format;
    }
}
