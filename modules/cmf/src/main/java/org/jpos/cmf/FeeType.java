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
 * See jPOS-CMF.pdf DE-046 <br>
 * Some extra entries are based on ISO-8583:2003
 */
public enum FeeType {
    TRANSACTION_FEE("00"),
    TRANSACTION_PROCESSING_FEE("01"),
    FEE_COLLECTION_FEE("02"),
    LOST_CARD_REPORT_FEE("06"),   // lost/stolen
    ACQUIRER_FEE("07"),
    INVALID_CHARGEBACK_FEE("09"),
    CURRENCY_CONVERSION_FEE("15"),

    // Reserved for private use
    PRIVATE_70("70"),
    PRIVATE_71("71"),
    PRIVATE_72("72"),
    PRIVATE_73("73"),
    PRIVATE_74("74"),
    PRIVATE_75("75"),
    PRIVATE_76("76"),
    PRIVATE_77("77"),
    PRIVATE_78("78"),
    PRIVATE_79("79"),

    PRIVATE_80("80"),
    PRIVATE_81("81"),
    PRIVATE_82("82"),
    PRIVATE_83("83"),
    PRIVATE_84("84"),
    PRIVATE_85("85"),
    PRIVATE_86("86"),
    PRIVATE_87("87"),
    PRIVATE_88("88"),
    PRIVATE_89("89"),

    PRIVATE_90("90"),
    PRIVATE_91("91"),
    PRIVATE_92("92"),
    PRIVATE_93("93"),
    PRIVATE_94("94"),
    PRIVATE_95("95"),
    PRIVATE_96("96"),
    PRIVATE_97("97"),
    PRIVATE_98("98"),
    PRIVATE_99("99"),
    ;


    private static final Map<String, FeeType> byCode = new HashMap<>();
    static {
        for (FeeType t : values()){
            byCode.put(t.code, t);
        }
    }


    private final String code;

    FeeType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
    public String getCode() {
        return code;
    }

    public static FeeType fromCode(String code) {
        Objects.requireNonNull(code);
        FeeType ret = byCode.get(code);
        if (ret == null) throw new IllegalArgumentException("Unknown fee type: " + code);
        return ret;
    }

}
