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
 * <p>Java class for AMFDoctrine1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AMFDoctrine1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMF1"/>
 *     <enumeration value="AMF3"/>
 *     <enumeration value="AMF2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AMFDoctrine1Code")
@XmlEnum
public enum AMFDoctrine1Code {

    @XmlEnumValue("AMF1")
    AMF_1("AMF1"),
    @XmlEnumValue("AMF3")
    AMF_3("AMF3"),
    @XmlEnumValue("AMF2")
    AMF_2("AMF2");
    private final String value;

    AMFDoctrine1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AMFDoctrine1Code fromValue(String v) {
        for (AMFDoctrine1Code c: AMFDoctrine1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
