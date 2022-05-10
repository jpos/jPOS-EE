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

import java.util.LinkedList;
import java.util.stream.Collectors;


/**
 * Wrapper to handle a sequence of {@link AmountFee}, from jPOS-CMF DE-046
 *
 * @see AmountFee
 */
public class AmountFeesWrapper extends LinkedList<AmountFee> {

    public AmountFeesWrapper() {
        super();
    }

    public AmountFeesWrapper(String data) {
        super();
        if (data.length() % AmountFee.SERIALIZED_DATA_LENGTH != 0)
            throw new IllegalArgumentException("Invalid length");

        for (int i = 0; i < data.length(); ) {
            add(new AmountFee(data.substring(i, i += AmountFee.SERIALIZED_DATA_LENGTH)));
        }
    }

    public String serialize() {
        return stream().map(AmountFee::serialize).collect(Collectors.joining());
    }
}
