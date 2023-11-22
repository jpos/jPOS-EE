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

package org.jpos.iso20022.reda_001_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventFrequency1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YEAR"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="QUTR"/>
 *     <enumeration value="TOMN"/>
 *     <enumeration value="MNTH"/>
 *     <enumeration value="TWMN"/>
 *     <enumeration value="TOWK"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="DAIL"/>
 *     <enumeration value="ADHO"/>
 *     <enumeration value="INDA"/>
 *     <enumeration value="OVNG"/>
 *     <enumeration value="ONDE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventFrequency1Code")
@XmlEnum
public enum EventFrequency1Code {

    YEAR,
    SEMI,
    QUTR,
    TOMN,
    MNTH,
    TWMN,
    TOWK,
    WEEK,
    DAIL,
    ADHO,
    INDA,
    OVNG,
    ONDE;

    public String value() {
        return name();
    }

    public static EventFrequency1Code fromValue(String v) {
        return valueOf(v);
    }

}
