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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CRSStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="C101"/>
 *     <enumeration value="C102"/>
 *     <enumeration value="C103"/>
 *     <enumeration value="C104"/>
 *     <enumeration value="C105"/>
 *     <enumeration value="C106"/>
 *     <enumeration value="C107"/>
 *     <enumeration value="C108"/>
 *     <enumeration value="C109"/>
 *     <enumeration value="C110"/>
 *     <enumeration value="C111"/>
 *     <enumeration value="C112"/>
 *     <enumeration value="C113"/>
 *     <enumeration value="C114"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CRSStatus1Code")
@XmlEnum
public enum CRSStatus1Code {

    @XmlEnumValue("C101")
    C_101("C101"),
    @XmlEnumValue("C102")
    C_102("C102"),
    @XmlEnumValue("C103")
    C_103("C103"),
    @XmlEnumValue("C104")
    C_104("C104"),
    @XmlEnumValue("C105")
    C_105("C105"),
    @XmlEnumValue("C106")
    C_106("C106"),
    @XmlEnumValue("C107")
    C_107("C107"),
    @XmlEnumValue("C108")
    C_108("C108"),
    @XmlEnumValue("C109")
    C_109("C109"),
    @XmlEnumValue("C110")
    C_110("C110"),
    @XmlEnumValue("C111")
    C_111("C111"),
    @XmlEnumValue("C112")
    C_112("C112"),
    @XmlEnumValue("C113")
    C_113("C113"),
    @XmlEnumValue("C114")
    C_114("C114");
    private final String value;

    CRSStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CRSStatus1Code fromValue(String v) {
        for (CRSStatus1Code c: CRSStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
