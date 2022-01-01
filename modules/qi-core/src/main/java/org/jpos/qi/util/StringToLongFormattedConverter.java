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

package org.jpos.qi.util;

import com.vaadin.data.ErrorMessageProvider;
import com.vaadin.data.Result;
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

    @Override
    public Result<Long> convertToModel(String value, ValueContext context) {
        Result<Number> n = convertToNumber(value, context);
        return n.map(number -> {
            if (number == null)
                return 0L;
            return number.longValue();
        });
    }
}
