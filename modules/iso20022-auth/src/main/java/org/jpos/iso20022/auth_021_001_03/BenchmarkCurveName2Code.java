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

package org.jpos.iso20022.auth_021_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BenchmarkCurveName2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WIBO"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="TIBO"/>
 *     <enumeration value="TLBO"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="STBO"/>
 *     <enumeration value="PRBO"/>
 *     <enumeration value="PFAN"/>
 *     <enumeration value="NIBO"/>
 *     <enumeration value="MAAA"/>
 *     <enumeration value="MOSP"/>
 *     <enumeration value="LIBO"/>
 *     <enumeration value="LIBI"/>
 *     <enumeration value="JIBA"/>
 *     <enumeration value="ISDA"/>
 *     <enumeration value="GCFR"/>
 *     <enumeration value="FUSW"/>
 *     <enumeration value="EUCH"/>
 *     <enumeration value="EUUS"/>
 *     <enumeration value="EURI"/>
 *     <enumeration value="EONS"/>
 *     <enumeration value="EONA"/>
 *     <enumeration value="CIBO"/>
 *     <enumeration value="CDOR"/>
 *     <enumeration value="BUBO"/>
 *     <enumeration value="BBSW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName2Code")
@XmlEnum
public enum BenchmarkCurveName2Code {

    WIBO,
    TREA,
    TIBO,
    TLBO,
    SWAP,
    STBO,
    PRBO,
    PFAN,
    NIBO,
    MAAA,
    MOSP,
    LIBO,
    LIBI,
    JIBA,
    ISDA,
    GCFR,
    FUSW,
    EUCH,
    EUUS,
    EURI,
    EONS,
    EONA,
    CIBO,
    CDOR,
    BUBO,
    BBSW;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName2Code fromValue(String v) {
        return valueOf(v);
    }

}
