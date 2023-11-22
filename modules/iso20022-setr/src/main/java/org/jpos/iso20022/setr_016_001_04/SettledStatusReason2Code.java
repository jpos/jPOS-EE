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

package org.jpos.iso20022.setr_016_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettledStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettledStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPST"/>
 *     <enumeration value="GATM"/>
 *     <enumeration value="GAT1"/>
 *     <enumeration value="UCPS"/>
 *     <enumeration value="UPST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettledStatusReason2Code")
@XmlEnum
public enum SettledStatusReason2Code {

    CPST("CPST"),
    GATM("GATM"),
    @XmlEnumValue("GAT1")
    GAT_1("GAT1"),
    UCPS("UCPS"),
    UPST("UPST");
    private final String value;

    SettledStatusReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettledStatusReason2Code fromValue(String v) {
        for (SettledStatusReason2Code c: SettledStatusReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
