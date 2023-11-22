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

package org.jpos.iso20022.catm_005_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HS25"/>
 *     <enumeration value="HS38"/>
 *     <enumeration value="HS51"/>
 *     <enumeration value="HS01"/>
 *     <enumeration value="SH31"/>
 *     <enumeration value="SH32"/>
 *     <enumeration value="SH33"/>
 *     <enumeration value="SH35"/>
 *     <enumeration value="SHK1"/>
 *     <enumeration value="SHK2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm16Code")
@XmlEnum
public enum Algorithm16Code {

    @XmlEnumValue("HS25")
    HS_25("HS25"),
    @XmlEnumValue("HS38")
    HS_38("HS38"),
    @XmlEnumValue("HS51")
    HS_51("HS51"),
    @XmlEnumValue("HS01")
    HS_01("HS01"),
    @XmlEnumValue("SH31")
    SH_31("SH31"),
    @XmlEnumValue("SH32")
    SH_32("SH32"),
    @XmlEnumValue("SH33")
    SH_33("SH33"),
    @XmlEnumValue("SH35")
    SH_35("SH35"),
    @XmlEnumValue("SHK1")
    SHK_1("SHK1"),
    @XmlEnumValue("SHK2")
    SHK_2("SHK2");
    private final String value;

    Algorithm16Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm16Code fromValue(String v) {
        for (Algorithm16Code c: Algorithm16Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
