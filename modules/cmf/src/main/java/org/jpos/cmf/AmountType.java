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

package org.jpos.cmf;

import org.jpos.cmf.iso.AdditionalAmountType;
import org.jpos.cmf.iso.AdditionalAmountTypeConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * See jPOS-CMF.pdf DE-054 <br>
 * Some extra entries are based on ISO-8583:2003 and other common specs.
 */
public enum AmountType implements AdditionalAmountType {
    ISO_RESERVED("00"),

    // 0x..1x - Account related balances
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
    PREPAID_ONLINE_BILL_FEE("17"),                  // Mastercard

    // 2x - Card related amounts
    AMOUNT_REMAINING_THIS_CYCLE("20"),

    // 4x - Transaction related amounts
    AMOUNT_CASH("40"),
    AMOUNT_GOODS_AND_SERVICES("41"),
    AMOUNT_SURCHARGE("42"),
    TOTAL_CUMULATIVE_AMOUNT("43"),                  // Visa: total cumulative, for series of incremental transactions
    AMOUNT_PRE_CURRENCY_CONVERSION("45"),           // Visa

    // 5x - Electronic benefit amounts
    BEGINNING_BALANCE("50"),
    PRE_AUTH_AMOUNT("51"),
    CLIENT_PROVIDED_FEES("56"),                     // Visa

    // Visa, Mastercard, others, usually used for partials.
    // Left as reference/placeholder/pragmatism here, but in jPOS-CMF is more appropriate to use DE-030
    ORIGINAL_AMOUNT("57"),

    // other custom mappings
    GRATUITY("80"),
    AMOUNT_TAXABLE("81"),
    TRANSIT_AMOUNT("4T"),                           // Visa

    // HEALTHCARE USA
    HEALTHCARE_AMOUNT_COPAYMENT("3S"),              // Visa
    HEALTHCARE_AMOUNT_ELIGIBILITY("4S"),            // Mastercard: 10
    HEALTHCARE_AMOUNT_PRESCRIPTION("4U"),           // Mastercard: 11
    HEALTHCARE_AMOUNT_VISION("4V"),                 // Mastercard: 12
    HEALTHCARE_AMOUNT_CLINIC("4W"),                 // Visa: clinic/other qualified medical
    HEALTHCARE_AMOUNT_DENTAL("4X"),                 // Visa

    // OTHER PRIVATE RESERVED (may be repurposed/renamed in the future)
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

    PRIVATE_RESERVED_3T("3T"),
    PRIVATE_RESERVED_3U("3U"),
    PRIVATE_RESERVED_3V("3V"),
    PRIVATE_RESERVED_3W("3W"),
    PRIVATE_RESERVED_3X("3X"),
    PRIVATE_RESERVED_3Y("3Y"),
    PRIVATE_RESERVED_3Z("3Z"),

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

    public String getCode() {
        return code;
    }

    /** shorter alias for getCode, in the style of enum name(), required by {@link AdditionalAmountType} */
    @Override
    public String code() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }

    public static AmountType fromCode(String code) {
        Objects.requireNonNull(code);
        return byCode.get(code.toUpperCase());
    }


    // ----- inner converter (dummy, since this is from CMF to CMF, but left here as reference implementation)

    public static AdditionalAmountTypeConverter CONVERTER = new AdditionalAmountTypeConverter() {
        public String toCMF(String code) {
            Objects.requireNonNull(code);
            AmountType t = byCode.get(code.toUpperCase());
            return t != null ? t.code() : null;
        }

        public String fromCMF(String cmfCode) {
            Objects.requireNonNull(cmfCode);
            AmountType t = byCode.get(cmfCode.toUpperCase());
            return t != null ? t.code() : null;
        }
    };
}
