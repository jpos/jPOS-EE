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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EncryptionFormat3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TR34"/>
 *     <enumeration value="TR31"/>
 *     <enumeration value="CTCE"/>
 *     <enumeration value="CBCE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EncryptionFormat3Code")
@XmlEnum
public enum EncryptionFormat3Code {

    @XmlEnumValue("TR34")
    TR_34("TR34"),
    @XmlEnumValue("TR31")
    TR_31("TR31"),
    CTCE("CTCE"),
    CBCE("CBCE");
    private final String value;

    EncryptionFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat3Code fromValue(String v) {
        for (EncryptionFormat3Code c: EncryptionFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
