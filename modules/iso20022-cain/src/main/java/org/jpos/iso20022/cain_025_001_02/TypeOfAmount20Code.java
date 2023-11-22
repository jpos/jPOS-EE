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

package org.jpos.iso20022.cain_025_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount20Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount20Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMTH"/>
 *     <enumeration value="BAGG"/>
 *     <enumeration value="CARG"/>
 *     <enumeration value="CHTC"/>
 *     <enumeration value="CLUB"/>
 *     <enumeration value="DUTY"/>
 *     <enumeration value="EXTK"/>
 *     <enumeration value="EXTF"/>
 *     <enumeration value="EXTR"/>
 *     <enumeration value="FARE"/>
 *     <enumeration value="FDBV"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PETC"/>
 *     <enumeration value="PHNE"/>
 *     <enumeration value="PRPY"/>
 *     <enumeration value="TOTL"/>
 *     <enumeration value="TOUR"/>
 *     <enumeration value="UPGD"/>
 *     <enumeration value="TKDL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount20Code")
@XmlEnum
public enum TypeOfAmount20Code {

    AMTH,
    BAGG,
    CARG,
    CHTC,
    CLUB,
    DUTY,
    EXTK,
    EXTF,
    EXTR,
    FARE,
    FDBV,
    INSU,
    MISC,
    OTHN,
    OTHP,
    PETC,
    PHNE,
    PRPY,
    TOTL,
    TOUR,
    UPGD,
    TKDL;

    public String value() {
        return name();
    }

    public static TypeOfAmount20Code fromValue(String v) {
        return valueOf(v);
    }

}
