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

package org.jpos.iso20022.catp_007_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EA2C"/>
 *     <enumeration value="E3DC"/>
 *     <enumeration value="DKP9"/>
 *     <enumeration value="UKPT"/>
 *     <enumeration value="UKA1"/>
 *     <enumeration value="EA9C"/>
 *     <enumeration value="EA5C"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm13Code")
@XmlEnum
public enum Algorithm13Code {

    @XmlEnumValue("EA2C")
    EA_2_C("EA2C"),
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),
    UKPT("UKPT"),
    @XmlEnumValue("UKA1")
    UKA_1("UKA1"),
    @XmlEnumValue("EA9C")
    EA_9_C("EA9C"),
    @XmlEnumValue("EA5C")
    EA_5_C("EA5C");
    private final String value;

    Algorithm13Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm13Code fromValue(String v) {
        for (Algorithm13Code c: Algorithm13Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
