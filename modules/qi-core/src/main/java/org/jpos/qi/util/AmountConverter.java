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
        amountFormat.setMaximumFractionDigits(7);
        if (amountFormat instanceof DecimalFormat) {
            ((DecimalFormat) amountFormat).setParseBigDecimal(true);
        }
        return amountFormat;
    }

}
