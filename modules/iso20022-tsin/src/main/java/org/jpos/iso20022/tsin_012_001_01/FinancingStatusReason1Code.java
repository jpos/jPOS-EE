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

package org.jpos.iso20022.tsin_012_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancingStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CA01"/>
 *     <enumeration value="CA02"/>
 *     <enumeration value="AC01"/>
 *     <enumeration value="AC04"/>
 *     <enumeration value="AC06"/>
 *     <enumeration value="BE08"/>
 *     <enumeration value="BE09"/>
 *     <enumeration value="BE10"/>
 *     <enumeration value="BE11"/>
 *     <enumeration value="DT02"/>
 *     <enumeration value="ID01"/>
 *     <enumeration value="ID02"/>
 *     <enumeration value="ID03"/>
 *     <enumeration value="MI01"/>
 *     <enumeration value="NA01"/>
 *     <enumeration value="CA03"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancingStatusReason1Code")
@XmlEnum
public enum FinancingStatusReason1Code {

    @XmlEnumValue("CA01")
    CA_01("CA01"),
    @XmlEnumValue("CA02")
    CA_02("CA02"),
    @XmlEnumValue("AC01")
    AC_01("AC01"),
    @XmlEnumValue("AC04")
    AC_04("AC04"),
    @XmlEnumValue("AC06")
    AC_06("AC06"),
    @XmlEnumValue("BE08")
    BE_08("BE08"),
    @XmlEnumValue("BE09")
    BE_09("BE09"),
    @XmlEnumValue("BE10")
    BE_10("BE10"),
    @XmlEnumValue("BE11")
    BE_11("BE11"),
    @XmlEnumValue("DT02")
    DT_02("DT02"),
    @XmlEnumValue("ID01")
    ID_01("ID01"),
    @XmlEnumValue("ID02")
    ID_02("ID02"),
    @XmlEnumValue("ID03")
    ID_03("ID03"),
    @XmlEnumValue("MI01")
    MI_01("MI01"),
    @XmlEnumValue("NA01")
    NA_01("NA01"),
    @XmlEnumValue("CA03")
    CA_03("CA03");
    private final String value;

    FinancingStatusReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinancingStatusReason1Code fromValue(String v) {
        for (FinancingStatusReason1Code c: FinancingStatusReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
