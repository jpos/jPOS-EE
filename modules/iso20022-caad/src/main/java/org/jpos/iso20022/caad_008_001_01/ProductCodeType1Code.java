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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCodeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductCodeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EA13"/>
 *     <enumeration value="EAN8"/>
 *     <enumeration value="GTIN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLUP"/>
 *     <enumeration value="RS14"/>
 *     <enumeration value="UPCA"/>
 *     <enumeration value="UPCE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductCodeType1Code")
@XmlEnum
public enum ProductCodeType1Code {

    @XmlEnumValue("EA13")
    EA_13("EA13"),
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),
    GTIN("GTIN"),
    OTHR("OTHR"),
    PLUP("PLUP"),
    @XmlEnumValue("RS14")
    RS_14("RS14"),
    UPCA("UPCA"),
    UPCE("UPCE");
    private final String value;

    ProductCodeType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCodeType1Code fromValue(String v) {
        for (ProductCodeType1Code c: ProductCodeType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
