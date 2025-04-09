/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.iso;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Handles additional amounts field content (DE-054 in most 8583 specs)
 */
public class AdditionalAmountsWrapper extends LinkedHashSet<AdditionalAmount> {

    private static final long serialVersionUID = 2526355280704001242L;

    /**
     * Parses a full string of Additional Amount occurrences (usually DE-054) using a helper
     * parser and the given length for each occurrence.
     * @param data a String of one or more occurrences of Additional Amount
     * @param amtLength the length of each occurrence
     * @param parser a function that receives a single occurrence String, and returns an {@link AdditionalAmount} instance
     * @return an instance of this class that wraps all the occurrences
     */
    public static AdditionalAmountsWrapper parse(
            String data,
            final int amtLength,
            Function<String,AdditionalAmount> parser)
    {
        if (data.length() % amtLength != 0)
            throw new IllegalArgumentException("Invalid length");

        AdditionalAmountsWrapper amounts = new AdditionalAmountsWrapper();

        for (int i = 0; i < data.length(); i += amtLength) {
            AdditionalAmount amount = parser.apply(StringUtils.mid(data, i, amtLength));
            amounts.add(amount);
        }

        return amounts;
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        forEach(amount -> sb.append(amount.serialize()));
        return sb.toString();
    }

    public AdditionalAmount getAny(Predicate<AdditionalAmount> p) {
        for (AdditionalAmount addAmnt : this) {
            if (p.test(addAmnt))
                return addAmnt;
        }
        return null;
    }

    /**
     * Returns a list of the additional amounts that match the filter criteria.
     *
     * If one of the filters is null, it's not considered in the criteria.
     *
     * @param accountType the account type to filter amounts by.
     * @param amountType the amount type to filter amounts by.
     * @return a list of the additional amounts that match the filter criteria.
     */
    public List<AdditionalAmount> listByTypes(String accountType, String amountType) {
        ArrayList<AdditionalAmount> amounts = new ArrayList<>();
        for (AdditionalAmount amount : this) {
            if ((accountType == null || amount.getAccountType().equals(accountType)) &&
                (amountType  == null || amount.getAmountTypeCode().equals(amountType))) {
                amounts.add(amount);
            }
        }

        return amounts;
    }

    /**
     * Returns true when the wrapper has the given {@code amountType}.
     *
     * @param amountType the amount type code.
     * @return true when the wrapper has the given {@code amountType}.
     * @throws NullPointerException if {@code amountType} is {@code null}
     */
    public boolean containsAmountType(String amountType) {
        Objects.requireNonNull(amountType);
        return getAny(a -> amountType.equals(a.getAmountTypeCode())) != null;
    }

    /**
     * Returns the first occurrence of the additional amount that matches the filter criteria.
     *
     * @param amountType the amount type to filter amounts by
     * @return the first occurrence of the additional amount that matches the filter criteria, or null if none matches
     * @throws NullPointerException if {@code amountType} is {@code null}
     */
    public AdditionalAmount getFirstByAmountType(String amountType) {
        Objects.requireNonNull(amountType);
        for (AdditionalAmount addAmnt : this) {
            if (amountType.equals(addAmnt.getAmountTypeCode()))
                return addAmnt;
        }
        return null;
    }

    /**
     * Returns a list of the additional amounts that match the filter criteria.
     *
     * @param amountType the amount type to filter amounts by.
     * @return a list of the additional amounts that match the filter criteria.
     * @throws NullPointerException if {@code amountType} is {@code null}
     */
    public List<AdditionalAmount> listByAmountType(String amountType) {
        Objects.requireNonNull(amountType);
        return listByTypes(null, amountType);
    }

}
