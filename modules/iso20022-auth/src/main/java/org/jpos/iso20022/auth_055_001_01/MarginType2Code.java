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

package org.jpos.iso20022.auth_055_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarginType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADFM"/>
 *     <enumeration value="COMA"/>
 *     <enumeration value="CEMA"/>
 *     <enumeration value="SEMA"/>
 *     <enumeration value="SCMA"/>
 *     <enumeration value="UFMA"/>
 *     <enumeration value="MARM"/>
 *     <enumeration value="SORM"/>
 *     <enumeration value="WWRM"/>
 *     <enumeration value="BARM"/>
 *     <enumeration value="LIRM"/>
 *     <enumeration value="CRAM"/>
 *     <enumeration value="CVMA"/>
 *     <enumeration value="SPMA"/>
 *     <enumeration value="JTDR"/>
 *     <enumeration value="DRAO"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarginType2Code")
@XmlEnum
public enum MarginType2Code {

    ADFM,
    COMA,
    CEMA,
    SEMA,
    SCMA,
    UFMA,
    MARM,
    SORM,
    WWRM,
    BARM,
    LIRM,
    CRAM,
    CVMA,
    SPMA,
    JTDR,
    DRAO,
    OTHR;

    public String value() {
        return name();
    }

    public static MarginType2Code fromValue(String v) {
        return valueOf(v);
    }

}
