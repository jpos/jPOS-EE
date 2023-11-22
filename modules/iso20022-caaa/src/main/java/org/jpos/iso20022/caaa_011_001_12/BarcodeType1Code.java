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

package org.jpos.iso20022.caaa_011_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BarcodeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COQR"/>
 *     <enumeration value="C128"/>
 *     <enumeration value="C025"/>
 *     <enumeration value="C039"/>
 *     <enumeration value="EA13"/>
 *     <enumeration value="EAN8"/>
 *     <enumeration value="P417"/>
 *     <enumeration value="UPCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BarcodeType1Code")
@XmlEnum
public enum BarcodeType1Code {

    COQR("COQR"),
    @XmlEnumValue("C128")
    C_128("C128"),
    @XmlEnumValue("C025")
    C_025("C025"),
    @XmlEnumValue("C039")
    C_039("C039"),
    @XmlEnumValue("EA13")
    EA_13("EA13"),
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),
    @XmlEnumValue("P417")
    P_417("P417"),
    UPCA("UPCA");
    private final String value;

    BarcodeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeType1Code fromValue(String v) {
        for (BarcodeType1Code c: BarcodeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
