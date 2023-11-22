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

package org.jpos.iso20022.colr_002_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RequestType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RT01"/>
 *     <enumeration value="RT02"/>
 *     <enumeration value="RT03"/>
 *     <enumeration value="RT04"/>
 *     <enumeration value="RT05"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestType1Code")
@XmlEnum
public enum RequestType1Code {

    @XmlEnumValue("RT01")
    RT_01("RT01"),
    @XmlEnumValue("RT02")
    RT_02("RT02"),
    @XmlEnumValue("RT03")
    RT_03("RT03"),
    @XmlEnumValue("RT04")
    RT_04("RT04"),
    @XmlEnumValue("RT05")
    RT_05("RT05");
    private final String value;

    RequestType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType1Code fromValue(String v) {
        for (RequestType1Code c: RequestType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
