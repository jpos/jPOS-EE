package org.jpos.qi.util;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;

public class StringToShortConverter implements Converter<String,Short> {

    public StringToShortConverter() {
        super();
    }

    @Override
    public Result<Short> convertToModel(String value, ValueContext context) {
        if (value != null && !value.isEmpty())
            try {
                return Result.ok(Short.valueOf(value));
            } catch (NumberFormatException e) {
                return Result.error("invalid value");
            }
        return Result.ok(null);
    }

    @Override
    public String convertToPresentation(Short value, ValueContext context) {
        if (value != null && value > 0)
            return value.toString();
        return "";
    }
}
