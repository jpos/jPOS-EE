/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.qi.components;

import com.vaadin.v7.data.Validator;
import com.vaadin.v7.ui.TextField;
import org.jpos.qi.QI;

import java.math.BigDecimal;

/**
 * Created by jr on 5/12/16.
 */
public class BigDecimalField extends TextField {

    public BigDecimalField() {
        this("");
    }

    public BigDecimalField(String caption) {
        super(caption);
        addValidator(getValidator());
        setNullRepresentation("");
        setNullSettingAllowed(true); //check

    }

    private Validator getValidator() {
        return new Validator() {
            private boolean isValid(Object value) {
                try {
                    if (value != null && !((String) value).isEmpty()) {
                        new BigDecimal((String) value);
                    }
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            @Override
            public void validate(Object value) throws com.vaadin.v7.data.Validator.InvalidValueException {
                if (!isValid(value)) {
                    throw new Validator.InvalidValueException(QI.getQI()
                            .getMessage("errorMessage.NaN",getCaption()));
                }
            }
        };
    }

}
