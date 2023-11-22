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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDPRDataConsent1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GDPRDataConsent1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DP00"/>
 *     <enumeration value="DP03"/>
 *     <enumeration value="DP01"/>
 *     <enumeration value="DP02"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GDPRDataConsent1Code")
@XmlEnum
public enum GDPRDataConsent1Code {

    @XmlEnumValue("DP00")
    DP_00("DP00"),
    @XmlEnumValue("DP03")
    DP_03("DP03"),
    @XmlEnumValue("DP01")
    DP_01("DP01"),
    @XmlEnumValue("DP02")
    DP_02("DP02");
    private final String value;

    GDPRDataConsent1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GDPRDataConsent1Code fromValue(String v) {
        for (GDPRDataConsent1Code c: GDPRDataConsent1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
