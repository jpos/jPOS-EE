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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticallyExposedPersonStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PoliticallyExposedPersonStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PE03"/>
 *     <enumeration value="PE01"/>
 *     <enumeration value="PE02"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PoliticallyExposedPersonStatus1Code")
@XmlEnum
public enum PoliticallyExposedPersonStatus1Code {

    @XmlEnumValue("PE03")
    PE_03("PE03"),
    @XmlEnumValue("PE01")
    PE_01("PE01"),
    @XmlEnumValue("PE02")
    PE_02("PE02");
    private final String value;

    PoliticallyExposedPersonStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoliticallyExposedPersonStatus1Code fromValue(String v) {
        for (PoliticallyExposedPersonStatus1Code c: PoliticallyExposedPersonStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
