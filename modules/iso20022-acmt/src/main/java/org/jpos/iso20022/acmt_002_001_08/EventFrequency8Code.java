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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADHO"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="FOMN"/>
 *     <enumeration value="TOMN"/>
 *     <enumeration value="TOWK"/>
 *     <enumeration value="TYEA"/>
 *     <enumeration value="INDA"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="ONDE"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="QUTR"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="TWMN"/>
 *     <enumeration value="WEEK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency8Code")
@XmlEnum
public enum EventFrequency8Code {

    ADHO,
    YEAR,
    DAIL,
    FOMN,
    TOMN,
    TOWK,
    TYEA,
    INDA,
    MNTH,
    ONDE,
    OVNG,
    QUTR,
    SEMI,
    TWMN,
    WEEK;

    public String value() {
        return name();
    }

    public static EventFrequency8Code fromValue(String v) {
        return valueOf(v);
    }

}
