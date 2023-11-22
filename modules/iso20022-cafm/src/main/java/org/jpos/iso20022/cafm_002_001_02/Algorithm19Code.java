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

package org.jpos.iso20022.cafm_002_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm19Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm19Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERS2"/>
 *     <enumeration value="ERS1"/>
 *     <enumeration value="RPSS"/>
 *     <enumeration value="ECC5"/>
 *     <enumeration value="ECC1"/>
 *     <enumeration value="ECC4"/>
 *     <enumeration value="ECC2"/>
 *     <enumeration value="ECC3"/>
 *     <enumeration value="ERS3"/>
 *     <enumeration value="ECP2"/>
 *     <enumeration value="ECP3"/>
 *     <enumeration value="ECP5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm19Code")
@XmlEnum
public enum Algorithm19Code {

    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),
    @XmlEnumValue("ERS1")
    ERS_1("ERS1"),
    RPSS("RPSS"),
    @XmlEnumValue("ECC5")
    ECC_5("ECC5"),
    @XmlEnumValue("ECC1")
    ECC_1("ECC1"),
    @XmlEnumValue("ECC4")
    ECC_4("ECC4"),
    @XmlEnumValue("ECC2")
    ECC_2("ECC2"),
    @XmlEnumValue("ECC3")
    ECC_3("ECC3"),
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),
    @XmlEnumValue("ECP2")
    ECP_2("ECP2"),
    @XmlEnumValue("ECP3")
    ECP_3("ECP3"),
    @XmlEnumValue("ECP5")
    ECP_5("ECP5");
    private final String value;

    Algorithm19Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm19Code fromValue(String v) {
        for (Algorithm19Code c: Algorithm19Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
