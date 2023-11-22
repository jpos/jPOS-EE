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

package org.jpos.iso20022.casp_005_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionFormat2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EncryptionFormat2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TR31"/>
 *     <enumeration value="TR34"/>
 *     <enumeration value="I238"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EncryptionFormat2Code")
@XmlEnum
public enum EncryptionFormat2Code {

    @XmlEnumValue("TR31")
    TR_31("TR31"),
    @XmlEnumValue("TR34")
    TR_34("TR34"),
    @XmlEnumValue("I238")
    I_238("I238");
    private final String value;

    EncryptionFormat2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat2Code fromValue(String v) {
        for (EncryptionFormat2Code c: EncryptionFormat2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
