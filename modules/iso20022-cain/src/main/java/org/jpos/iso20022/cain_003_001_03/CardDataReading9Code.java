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

package org.jpos.iso20022.cain_003_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNKW"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="ICPY"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="CDFL"/>
 *     <enumeration value="MBNK"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="ICCY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading9Code")
@XmlEnum
public enum CardDataReading9Code {

    UNKW,
    OTHN,
    OTHP,
    CAMR,
    KEEN,
    ICPY,
    OPTC,
    CDFL,
    MBNK,
    TOKN,
    ICCY;

    public String value() {
        return name();
    }

    public static CardDataReading9Code fromValue(String v) {
        return valueOf(v);
    }

}
