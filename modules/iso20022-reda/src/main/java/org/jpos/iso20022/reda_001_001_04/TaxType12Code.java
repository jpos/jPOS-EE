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

package org.jpos.iso20022.reda_001_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INPO"/>
 *     <enumeration value="EUTR"/>
 *     <enumeration value="AKT1"/>
 *     <enumeration value="AKT2"/>
 *     <enumeration value="ZWIS"/>
 *     <enumeration value="MIET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxType12Code")
@XmlEnum
public enum TaxType12Code {

    INPO("INPO"),
    EUTR("EUTR"),
    @XmlEnumValue("AKT1")
    AKT_1("AKT1"),
    @XmlEnumValue("AKT2")
    AKT_2("AKT2"),
    ZWIS("ZWIS"),
    MIET("MIET");
    private final String value;

    TaxType12Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType12Code fromValue(String v) {
        for (TaxType12Code c: TaxType12Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
