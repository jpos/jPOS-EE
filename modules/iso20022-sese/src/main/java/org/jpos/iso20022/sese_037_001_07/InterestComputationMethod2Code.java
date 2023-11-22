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

package org.jpos.iso20022.sese_037_001_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestComputationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestComputationMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A001"/>
 *     <enumeration value="A002"/>
 *     <enumeration value="A003"/>
 *     <enumeration value="A004"/>
 *     <enumeration value="A005"/>
 *     <enumeration value="A006"/>
 *     <enumeration value="A007"/>
 *     <enumeration value="A008"/>
 *     <enumeration value="A009"/>
 *     <enumeration value="A010"/>
 *     <enumeration value="A011"/>
 *     <enumeration value="A012"/>
 *     <enumeration value="A013"/>
 *     <enumeration value="A014"/>
 *     <enumeration value="NARR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestComputationMethod2Code")
@XmlEnum
public enum InterestComputationMethod2Code {

    @XmlEnumValue("A001")
    A_001("A001"),
    @XmlEnumValue("A002")
    A_002("A002"),
    @XmlEnumValue("A003")
    A_003("A003"),
    @XmlEnumValue("A004")
    A_004("A004"),
    @XmlEnumValue("A005")
    A_005("A005"),
    @XmlEnumValue("A006")
    A_006("A006"),
    @XmlEnumValue("A007")
    A_007("A007"),
    @XmlEnumValue("A008")
    A_008("A008"),
    @XmlEnumValue("A009")
    A_009("A009"),
    @XmlEnumValue("A010")
    A_010("A010"),
    @XmlEnumValue("A011")
    A_011("A011"),
    @XmlEnumValue("A012")
    A_012("A012"),
    @XmlEnumValue("A013")
    A_013("A013"),
    @XmlEnumValue("A014")
    A_014("A014"),
    NARR("NARR");
    private final String value;

    InterestComputationMethod2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestComputationMethod2Code fromValue(String v) {
        for (InterestComputationMethod2Code c: InterestComputationMethod2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
