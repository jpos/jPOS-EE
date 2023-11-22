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

package org.jpos.iso20022.casp_006_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyUsage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KeyUsage1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENCR"/>
 *     <enumeration value="DCPT"/>
 *     <enumeration value="DENC"/>
 *     <enumeration value="DDEC"/>
 *     <enumeration value="TRNI"/>
 *     <enumeration value="TRNX"/>
 *     <enumeration value="MACG"/>
 *     <enumeration value="MACV"/>
 *     <enumeration value="SIGG"/>
 *     <enumeration value="SUGV"/>
 *     <enumeration value="PINE"/>
 *     <enumeration value="PIND"/>
 *     <enumeration value="PINV"/>
 *     <enumeration value="KEYG"/>
 *     <enumeration value="KEYI"/>
 *     <enumeration value="KEYX"/>
 *     <enumeration value="KEYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KeyUsage1Code")
@XmlEnum
public enum KeyUsage1Code {

    ENCR,
    DCPT,
    DENC,
    DDEC,
    TRNI,
    TRNX,
    MACG,
    MACV,
    SIGG,
    SUGV,
    PINE,
    PIND,
    PINV,
    KEYG,
    KEYI,
    KEYX,
    KEYD;

    public String value() {
        return name();
    }

    public static KeyUsage1Code fromValue(String v) {
        return valueOf(v);
    }

}
