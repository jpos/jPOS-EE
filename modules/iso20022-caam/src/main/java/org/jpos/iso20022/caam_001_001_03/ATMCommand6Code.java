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

package org.jpos.iso20022.caam_001_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCommand6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABAL"/>
 *     <enumeration value="ASTS"/>
 *     <enumeration value="CFGT"/>
 *     <enumeration value="CCNT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="KACT"/>
 *     <enumeration value="KDAC"/>
 *     <enumeration value="KDWL"/>
 *     <enumeration value="KRMV"/>
 *     <enumeration value="SCFU"/>
 *     <enumeration value="SSCU"/>
 *     <enumeration value="SSTU"/>
 *     <enumeration value="SNDM"/>
 *     <enumeration value="HKCG"/>
 *     <enumeration value="HKRV"/>
 *     <enumeration value="KCHG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMCommand6Code")
@XmlEnum
public enum ATMCommand6Code {

    ABAL,
    ASTS,
    CFGT,
    CCNT,
    DISC,
    KACT,
    KDAC,
    KDWL,
    KRMV,
    SCFU,
    SSCU,
    SSTU,
    SNDM,
    HKCG,
    HKRV,
    KCHG;

    public String value() {
        return name();
    }

    public static ATMCommand6Code fromValue(String v) {
        return valueOf(v);
    }

}
