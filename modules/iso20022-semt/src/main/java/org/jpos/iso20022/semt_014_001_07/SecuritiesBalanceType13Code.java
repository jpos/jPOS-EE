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

package org.jpos.iso20022.semt_014_001_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="AWAS"/>
 *     <enumeration value="AVAI"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SPOS"/>
 *     <enumeration value="UNRG"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="QUAS"/>
 *     <enumeration value="COLA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType13Code")
@XmlEnum
public enum SecuritiesBalanceType13Code {

    BLOK,
    AWAS,
    AVAI,
    NOMI,
    PLED,
    REGO,
    RSTR,
    OTHR,
    SPOS,
    UNRG,
    ISSU,
    QUAS,
    COLA;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType13Code fromValue(String v) {
        return valueOf(v);
    }

}
