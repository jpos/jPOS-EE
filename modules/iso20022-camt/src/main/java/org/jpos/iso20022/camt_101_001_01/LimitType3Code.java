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

package org.jpos.iso20022.camt_101_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LimitType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MULT"/>
 *     <enumeration value="BILI"/>
 *     <enumeration value="MAND"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="NELI"/>
 *     <enumeration value="INBI"/>
 *     <enumeration value="GLBL"/>
 *     <enumeration value="DIDB"/>
 *     <enumeration value="SPLC"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="TDLC"/>
 *     <enumeration value="TDLF"/>
 *     <enumeration value="UCDT"/>
 *     <enumeration value="ACOL"/>
 *     <enumeration value="EXGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LimitType3Code")
@XmlEnum
public enum LimitType3Code {

    MULT,
    BILI,
    MAND,
    DISC,
    NELI,
    INBI,
    GLBL,
    DIDB,
    SPLC,
    SPLF,
    TDLC,
    TDLF,
    UCDT,
    ACOL,
    EXGT;

    public String value() {
        return name();
    }

    public static LimitType3Code fromValue(String v) {
        return valueOf(v);
    }

}
