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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVER"/>
 *     <enumeration value="AVOV"/>
 *     <enumeration value="GREX"/>
 *     <enumeration value="NET2"/>
 *     <enumeration value="NET1"/>
 *     <enumeration value="PARV"/>
 *     <enumeration value="RDAV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice3Code")
@XmlEnum
public enum TypeOfPrice3Code {

    AVER("AVER"),
    AVOV("AVOV"),
    GREX("GREX"),
    @XmlEnumValue("NET2")
    NET_2("NET2"),
    @XmlEnumValue("NET1")
    NET_1("NET1"),
    PARV("PARV"),
    RDAV("RDAV");
    private final String value;

    TypeOfPrice3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfPrice3Code fromValue(String v) {
        for (TypeOfPrice3Code c: TypeOfPrice3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
