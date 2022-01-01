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

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/**
 * Handles additional amounts field content - DE-054
 */
public final class AdditionalAmountsWrapper extends LinkedHashSet<AdditionalAmount> {

    private static final long serialVersionUID = 2526355280704001241L;

    public static AdditionalAmountsWrapper parse(String data) {
        if (data.length() % AdditionalAmount.SERIALIZED_DATA_LENGTH != 0)
            throw new IllegalArgumentException("Invalid length");

        AdditionalAmountsWrapper amounts = new AdditionalAmountsWrapper();
        int i = 0;

        while (i < data.length()) {
            AdditionalAmount amount = AdditionalAmount.parse(
                    StringUtils.mid(data, i, AdditionalAmount.SERIALIZED_DATA_LENGTH));

            amounts.add(amount);

            i += AdditionalAmount.SERIALIZED_DATA_LENGTH;
        }

        return amounts;
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        forEach(amount -> sb.append(amount.serialize()));
        return sb.toString();
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
    public List<AdditionalAmount> listByTypes(String accountType, AmountType amountType) {
        ArrayList<AdditionalAmount> amounts = new ArrayList<>();
        for (AdditionalAmount amount : this) {
            if ((accountType == null || amount.getAccountType().equals(accountType)) &&
                (amountType  == null || amount.getAmountType() == amountType)) {
                amounts.add(amount);
            }
        }

        return amounts;
    }


    /**
     * Returns true when the wrapper has the given {@code amountType}.
     *
     * @param amountType the amount type.
     * @return true when the wrapper has the given {@code amountType}.
     * @throws NullPointerException if {@code amountType} is {@code null}
     */
    public boolean containsAmountType(AmountType amountType) {
        Objects.requireNonNull(amountType);
        return getFirstByAmountType(amountType) != null;
    }


    /**
     * Returns the first occurrence of the additional amount that matches the filter criteria.
     *
     * @param amountType the amount type to filter amounts by
     * @return the first occurrence of the additional amount that matches the filter criteria, or null if none matches
     * @throws NullPointerException if {@code amountType} is {@code null}
     */
    public AdditionalAmount getFirstByAmountType(AmountType amountType) {
        Objects.requireNonNull(amountType);
        for (AdditionalAmount addAmnt : this) {
            if (addAmnt.getAmountType().equals(amountType))
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
    public List<AdditionalAmount> listByAmountType(AmountType amountType) {
        Objects.requireNonNull(amountType);
        return listByTypes(null, amountType);
    }

}
