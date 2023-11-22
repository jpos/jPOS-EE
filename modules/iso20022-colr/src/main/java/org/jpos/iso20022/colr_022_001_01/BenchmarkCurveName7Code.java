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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BenchmarkCurveName7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BBSW"/>
 *     <enumeration value="BUBO"/>
 *     <enumeration value="BCOL"/>
 *     <enumeration value="CDOR"/>
 *     <enumeration value="CIBO"/>
 *     <enumeration value="CORA"/>
 *     <enumeration value="CZNA"/>
 *     <enumeration value="EONA"/>
 *     <enumeration value="EONS"/>
 *     <enumeration value="ESTR"/>
 *     <enumeration value="EURI"/>
 *     <enumeration value="EUUS"/>
 *     <enumeration value="EUCH"/>
 *     <enumeration value="EFFR"/>
 *     <enumeration value="FUSW"/>
 *     <enumeration value="GCFR"/>
 *     <enumeration value="HKIO"/>
 *     <enumeration value="ISDA"/>
 *     <enumeration value="ETIO"/>
 *     <enumeration value="JIBA"/>
 *     <enumeration value="LIBI"/>
 *     <enumeration value="LIBO"/>
 *     <enumeration value="MOSP"/>
 *     <enumeration value="MAAA"/>
 *     <enumeration value="BJUO"/>
 *     <enumeration value="NIBO"/>
 *     <enumeration value="OBFR"/>
 *     <enumeration value="PFAN"/>
 *     <enumeration value="PRBO"/>
 *     <enumeration value="RCTR"/>
 *     <enumeration value="SOFR"/>
 *     <enumeration value="SONA"/>
 *     <enumeration value="STBO"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="TLBO"/>
 *     <enumeration value="TIBO"/>
 *     <enumeration value="TOAR"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="WIBO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName7Code")
@XmlEnum
public enum BenchmarkCurveName7Code {

    BBSW,
    BUBO,
    BCOL,
    CDOR,
    CIBO,
    CORA,
    CZNA,
    EONA,
    EONS,
    ESTR,
    EURI,
    EUUS,
    EUCH,
    EFFR,
    FUSW,
    GCFR,
    HKIO,
    ISDA,
    ETIO,
    JIBA,
    LIBI,
    LIBO,
    MOSP,
    MAAA,
    BJUO,
    NIBO,
    OBFR,
    PFAN,
    PRBO,
    RCTR,
    SOFR,
    SONA,
    STBO,
    SWAP,
    TLBO,
    TIBO,
    TOAR,
    TREA,
    WIBO;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName7Code fromValue(String v) {
        return valueOf(v);
    }

}
