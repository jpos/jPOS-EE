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
 * <p>Java class for RequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RequestType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RT11"/>
 *     <enumeration value="RT12"/>
 *     <enumeration value="RT13"/>
 *     <enumeration value="RT14"/>
 *     <enumeration value="RT15"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestType2Code")
@XmlEnum
public enum RequestType2Code {

    @XmlEnumValue("RT11")
    RT_11("RT11"),
    @XmlEnumValue("RT12")
    RT_12("RT12"),
    @XmlEnumValue("RT13")
    RT_13("RT13"),
    @XmlEnumValue("RT14")
    RT_14("RT14"),
    @XmlEnumValue("RT15")
    RT_15("RT15");
    private final String value;

    RequestType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType2Code fromValue(String v) {
        for (RequestType2Code c: RequestType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
