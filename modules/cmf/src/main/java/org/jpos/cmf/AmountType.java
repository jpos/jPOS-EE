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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * See jPOS-CMF.pdf DE-054 <br>
 * Some extra entries are based on ISO-8583:2003
 */
public enum AmountType {
    ISO_RESERVED("00"),

    // Account related balances
    ACCOUNT_LEDGER_CURRENT_BALANCE("01"),
    ACCOUNT_AVAILABLE_BALANCE("02"),
    AMOUNT_OWING("03"),
    AMOUNT_DUE("04"),
    ACCOUNT_AVAILABLE_CREDIT("05"),
    UNKNOWN("06"),
    DESTINATION_ACCOUNT_LEDGER_BALANCE("07"),
    DESTINATION_ACCOUNT_AVAILABLE_BALANCE("08"),
    CREDIT_LINE("09"),
    AMOUNT_ON_HOLD("10"),

    // 2x - Card related amounts
    AMOUNT_REMAINING_THIS_CYCLE("20"),

    // 4x - Transaction related amounts
    AMOUNT_CASH("40"),
    AMOUNT_GOODS_AND_SERVICES("41"),
    AMOUNT_SURCHARGE("42"),

    // 5x - Electronic benefit amounts
    BEGINNING_BALANCE("50"),
    PRE_AUTH_AMOUNT("51"),

    // custom CMF
    GRATUITY("80"),
    AMOUNT_TAXABLE("81"),


    // PRIVATE RESERVED
    PRIVATE_RESERVED_1S("1S"),
    PRIVATE_RESERVED_1T("1T"),
    PRIVATE_RESERVED_1U("1U"),
    PRIVATE_RESERVED_1V("1V"),
    PRIVATE_RESERVED_1W("1W"),
    PRIVATE_RESERVED_1X("1X"),
    PRIVATE_RESERVED_1Y("1Y"),
    PRIVATE_RESERVED_1Z("1Z"),

    PRIVATE_RESERVED_2S("2S"),
    PRIVATE_RESERVED_2T("2T"),
    PRIVATE_RESERVED_2U("2U"),
    PRIVATE_RESERVED_2V("2V"),
    PRIVATE_RESERVED_2W("2W"),
    PRIVATE_RESERVED_2X("2X"),
    PRIVATE_RESERVED_2Y("2Y"),
    PRIVATE_RESERVED_2Z("2Z"),

    PRIVATE_RESERVED_3S("3S"),
    PRIVATE_RESERVED_3T("3T"),
    PRIVATE_RESERVED_3U("3U"),
    PRIVATE_RESERVED_3V("3V"),
    PRIVATE_RESERVED_3W("3W"),
    PRIVATE_RESERVED_3X("3X"),
    PRIVATE_RESERVED_3Y("3Y"),
    PRIVATE_RESERVED_3Z("3Z"),

    PRIVATE_RESERVED_4S("4S"),
    PRIVATE_RESERVED_4T("4T"),
    PRIVATE_RESERVED_4U("4U"),
    PRIVATE_RESERVED_4V("4V"),
    PRIVATE_RESERVED_4W("4W"),
    PRIVATE_RESERVED_4X("4X"),
    PRIVATE_RESERVED_4Y("4Y"),
    PRIVATE_RESERVED_4Z("4Z"),

    PRIVATE_RESERVED_5S("5S"),
    PRIVATE_RESERVED_5T("5T"),
    PRIVATE_RESERVED_5U("5U"),
    PRIVATE_RESERVED_5V("5V"),
    PRIVATE_RESERVED_5W("5W"),
    PRIVATE_RESERVED_5X("5X"),
    PRIVATE_RESERVED_5Y("5Y"),
    PRIVATE_RESERVED_5Z("5Z"),
    ;

    private static final Map<String, AmountType> byCode = new HashMap<>();
    static {
        for (AmountType t : values()){
            byCode.put(t.code, t);
        }
    }

    private final String code;

    AmountType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
    public String getCode() {
        return code;
    }

    public static AmountType fromCode(String code) {
        Objects.requireNonNull(code);
        AmountType ret = byCode.get(code.toUpperCase());
        if (ret == null) throw new IllegalArgumentException("Invalid amount type: " + code);
        return ret;
    }
}
