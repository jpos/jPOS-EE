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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDay3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WeekDay3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLD"/>
 *     <enumeration value="XBHL"/>
 *     <enumeration value="IBHL"/>
 *     <enumeration value="FRID"/>
 *     <enumeration value="MOND"/>
 *     <enumeration value="SATD"/>
 *     <enumeration value="SUND"/>
 *     <enumeration value="THUD"/>
 *     <enumeration value="TUED"/>
 *     <enumeration value="WEDD"/>
 *     <enumeration value="WDAY"/>
 *     <enumeration value="WEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WeekDay3Code")
@XmlEnum
public enum WeekDay3Code {

    ALLD,
    XBHL,
    IBHL,
    FRID,
    MOND,
    SATD,
    SUND,
    THUD,
    TUED,
    WEDD,
    WDAY,
    WEND;

    public String value() {
        return name();
    }

    public static WeekDay3Code fromValue(String v) {
        return valueOf(v);
    }

}
