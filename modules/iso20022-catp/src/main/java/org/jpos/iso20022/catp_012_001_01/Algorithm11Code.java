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

package org.jpos.iso20022.catp_012_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HS25"/>
 *     <enumeration value="HS38"/>
 *     <enumeration value="HS51"/>
 *     <enumeration value="HS01"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm11Code")
@XmlEnum
public enum Algorithm11Code {

    @XmlEnumValue("HS25")
    HS_25("HS25"),
    @XmlEnumValue("HS38")
    HS_38("HS38"),
    @XmlEnumValue("HS51")
    HS_51("HS51"),
    @XmlEnumValue("HS01")
    HS_01("HS01");
    private final String value;

    Algorithm11Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm11Code fromValue(String v) {
        for (Algorithm11Code c: Algorithm11Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
