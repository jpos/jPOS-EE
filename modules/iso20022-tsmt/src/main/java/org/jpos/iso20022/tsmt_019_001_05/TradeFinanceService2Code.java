/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeFinanceService2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeFinanceService2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEV1"/>
 *     <enumeration value="LEV2"/>
 *     <enumeration value="LEV3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeFinanceService2Code")
@XmlEnum
public enum TradeFinanceService2Code {

    @XmlEnumValue("LEV1")
    LEV_1("LEV1"),
    @XmlEnumValue("LEV2")
    LEV_2("LEV2"),
    @XmlEnumValue("LEV3")
    LEV_3("LEV3");
    private final String value;

    TradeFinanceService2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeFinanceService2Code fromValue(String v) {
        for (TradeFinanceService2Code c: TradeFinanceService2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
