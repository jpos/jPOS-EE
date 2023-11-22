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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVER"/>
 *     <enumeration value="AVOV"/>
 *     <enumeration value="COMB"/>
 *     <enumeration value="GREX"/>
 *     <enumeration value="LIMI"/>
 *     <enumeration value="NET2"/>
 *     <enumeration value="NDIS"/>
 *     <enumeration value="NET1"/>
 *     <enumeration value="NUND"/>
 *     <enumeration value="NOGR"/>
 *     <enumeration value="PARV"/>
 *     <enumeration value="RDAV"/>
 *     <enumeration value="STOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice1Code")
@XmlEnum
public enum TypeOfPrice1Code {

    AVER("AVER"),
    AVOV("AVOV"),
    COMB("COMB"),
    GREX("GREX"),
    LIMI("LIMI"),
    @XmlEnumValue("NET2")
    NET_2("NET2"),
    NDIS("NDIS"),
    @XmlEnumValue("NET1")
    NET_1("NET1"),
    NUND("NUND"),
    NOGR("NOGR"),
    PARV("PARV"),
    RDAV("RDAV"),
    STOP("STOP");
    private final String value;

    TypeOfPrice1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfPrice1Code fromValue(String v) {
        for (TypeOfPrice1Code c: TypeOfPrice1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
