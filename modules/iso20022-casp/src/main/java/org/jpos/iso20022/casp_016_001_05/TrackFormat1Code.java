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

package org.jpos.iso20022.casp_016_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TrackFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AAMV"/>
 *     <enumeration value="CMC7"/>
 *     <enumeration value="E13B"/>
 *     <enumeration value="ISOF"/>
 *     <enumeration value="JIS1"/>
 *     <enumeration value="JIS2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackFormat1Code")
@XmlEnum
public enum TrackFormat1Code {

    AAMV("AAMV"),
    @XmlEnumValue("CMC7")
    CMC_7("CMC7"),
    @XmlEnumValue("E13B")
    E_13_B("E13B"),
    ISOF("ISOF"),
    @XmlEnumValue("JIS1")
    JIS_1("JIS1"),
    @XmlEnumValue("JIS2")
    JIS_2("JIS2");
    private final String value;

    TrackFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackFormat1Code fromValue(String v) {
        for (TrackFormat1Code c: TrackFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
