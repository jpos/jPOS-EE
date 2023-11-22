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

package org.jpos.iso20022.caaa_018_001_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKeyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CryptographicKeyType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AES2"/>
 *     <enumeration value="EDE3"/>
 *     <enumeration value="DKP9"/>
 *     <enumeration value="AES9"/>
 *     <enumeration value="AES5"/>
 *     <enumeration value="EDE4"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CryptographicKeyType3Code")
@XmlEnum
public enum CryptographicKeyType3Code {

    @XmlEnumValue("AES2")
    AES_2("AES2"),
    @XmlEnumValue("EDE3")
    EDE_3("EDE3"),
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),
    @XmlEnumValue("AES9")
    AES_9("AES9"),
    @XmlEnumValue("AES5")
    AES_5("AES5"),
    @XmlEnumValue("EDE4")
    EDE_4("EDE4");
    private final String value;

    CryptographicKeyType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptographicKeyType3Code fromValue(String v) {
        for (CryptographicKeyType3Code c: CryptographicKeyType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
