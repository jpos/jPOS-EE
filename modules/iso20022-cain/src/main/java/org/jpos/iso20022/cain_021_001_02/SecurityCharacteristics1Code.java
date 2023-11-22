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

package org.jpos.iso20022.cain_021_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCharacteristics1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecurityCharacteristics1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CETE"/>
 *     <enumeration value="CPTE"/>
 *     <enumeration value="CENC"/>
 *     <enumeration value="CMAC"/>
 *     <enumeration value="ETEE"/>
 *     <enumeration value="METE"/>
 *     <enumeration value="MPTE"/>
 *     <enumeration value="OPNN"/>
 *     <enumeration value="PMAC"/>
 *     <enumeration value="PKIE"/>
 *     <enumeration value="PRAE"/>
 *     <enumeration value="PRAM"/>
 *     <enumeration value="PRVN"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="APTE"/>
 *     <enumeration value="AETE"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecurityCharacteristics1Code")
@XmlEnum
public enum SecurityCharacteristics1Code {

    CETE,
    CPTE,
    CENC,
    CMAC,
    ETEE,
    METE,
    MPTE,
    OPNN,
    PMAC,
    PKIE,
    PRAE,
    PRAM,
    PRVN,
    STAM,
    APTE,
    AETE,
    OTHN,
    OTHP;

    public String value() {
        return name();
    }

    public static SecurityCharacteristics1Code fromValue(String v) {
        return valueOf(v);
    }

}
