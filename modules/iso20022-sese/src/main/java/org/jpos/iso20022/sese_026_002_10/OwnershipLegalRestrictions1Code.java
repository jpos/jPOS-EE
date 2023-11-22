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

package org.jpos.iso20022.sese_026_002_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipLegalRestrictions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OwnershipLegalRestrictions1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A144"/>
 *     <enumeration value="NRST"/>
 *     <enumeration value="RSTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OwnershipLegalRestrictions1Code")
@XmlEnum
public enum OwnershipLegalRestrictions1Code {

    @XmlEnumValue("A144")
    A_144("A144"),
    NRST("NRST"),
    RSTR("RSTR");
    private final String value;

    OwnershipLegalRestrictions1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipLegalRestrictions1Code fromValue(String v) {
        for (OwnershipLegalRestrictions1Code c: OwnershipLegalRestrictions1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
