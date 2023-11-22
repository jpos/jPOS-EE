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

package org.jpos.iso20022.cain_005_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataReading10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICPY"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="ICCY"/>
 *     <enumeration value="MICR"/>
 *     <enumeration value="MLEY"/>
 *     <enumeration value="OCRR"/>
 *     <enumeration value="MSIP"/>
 *     <enumeration value="OPTC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="RFID"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="KEEN"/>
 *     <enumeration value="DFLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataReading10Code")
@XmlEnum
public enum CardDataReading10Code {

    ICPY,
    MGST,
    ICCY,
    MICR,
    MLEY,
    OCRR,
    MSIP,
    OPTC,
    OTHN,
    RFID,
    UNSP,
    OTHP,
    KEEN,
    DFLE;

    public String value() {
        return name();
    }

    public static CardDataReading10Code fromValue(String v) {
        return valueOf(v);
    }

}
