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

package org.jpos.iso20022.semt_042_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingAccountLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingAccountLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="LVL1"/>
 *     <enumeration value="LVL2"/>
 *     <enumeration value="LVL3"/>
 *     <enumeration value="LVL4"/>
 *     <enumeration value="LVL5"/>
 *     <enumeration value="LVL6"/>
 *     <enumeration value="LVL7"/>
 *     <enumeration value="LVL8"/>
 *     <enumeration value="LVL9"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingAccountLevel1Code")
@XmlEnum
public enum HoldingAccountLevel1Code {

    SAFE("SAFE"),
    @XmlEnumValue("LVL1")
    LVL_1("LVL1"),
    @XmlEnumValue("LVL2")
    LVL_2("LVL2"),
    @XmlEnumValue("LVL3")
    LVL_3("LVL3"),
    @XmlEnumValue("LVL4")
    LVL_4("LVL4"),
    @XmlEnumValue("LVL5")
    LVL_5("LVL5"),
    @XmlEnumValue("LVL6")
    LVL_6("LVL6"),
    @XmlEnumValue("LVL7")
    LVL_7("LVL7"),
    @XmlEnumValue("LVL8")
    LVL_8("LVL8"),
    @XmlEnumValue("LVL9")
    LVL_9("LVL9");
    private final String value;

    HoldingAccountLevel1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldingAccountLevel1Code fromValue(String v) {
        for (HoldingAccountLevel1Code c: HoldingAccountLevel1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
