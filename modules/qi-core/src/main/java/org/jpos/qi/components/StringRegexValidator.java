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

import com.vaadin.data.validator.RegexpValidator;

/**
 * Created by spr on 5/25/16.
 */
public class StringRegexValidator extends RegexpValidator {
    public static String STRING_REGEX = "^[\\w|#=@.-]{1,";
    public static int DEFAULT_LENGTH = 32;

    public StringRegexValidator (String errorMessage) {
        super(errorMessage,STRING_REGEX + DEFAULT_LENGTH + "}$");
    }

    public StringRegexValidator (int maxLength, String errorMessage) {
        super(errorMessage,STRING_REGEX + maxLength + "}$");
    }
}
