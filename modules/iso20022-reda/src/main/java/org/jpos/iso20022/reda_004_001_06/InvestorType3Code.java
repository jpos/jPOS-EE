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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RETL"/>
 *     <enumeration value="PRF2"/>
 *     <enumeration value="NEI1"/>
 *     <enumeration value="BOT2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorType3Code")
@XmlEnum
public enum InvestorType3Code {

    RETL("RETL"),
    @XmlEnumValue("PRF2")
    PRF_2("PRF2"),
    @XmlEnumValue("NEI1")
    NEI_1("NEI1"),
    @XmlEnumValue("BOT2")
    BOT_2("BOT2");
    private final String value;

    InvestorType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestorType3Code fromValue(String v) {
        for (InvestorType3Code c: InvestorType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
