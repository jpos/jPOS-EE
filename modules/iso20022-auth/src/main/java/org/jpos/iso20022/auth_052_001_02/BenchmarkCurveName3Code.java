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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BenchmarkCurveName3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ESTR"/>
 *     <enumeration value="BBSW"/>
 *     <enumeration value="BUBO"/>
 *     <enumeration value="CDOR"/>
 *     <enumeration value="CIBO"/>
 *     <enumeration value="EONA"/>
 *     <enumeration value="EONS"/>
 *     <enumeration value="EURI"/>
 *     <enumeration value="EUUS"/>
 *     <enumeration value="EUCH"/>
 *     <enumeration value="FUSW"/>
 *     <enumeration value="GCFR"/>
 *     <enumeration value="ISDA"/>
 *     <enumeration value="JIBA"/>
 *     <enumeration value="LIBI"/>
 *     <enumeration value="LIBO"/>
 *     <enumeration value="MOSP"/>
 *     <enumeration value="MAAA"/>
 *     <enumeration value="NIBO"/>
 *     <enumeration value="PFAN"/>
 *     <enumeration value="PRBO"/>
 *     <enumeration value="STBO"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="TLBO"/>
 *     <enumeration value="TIBO"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="WIBO"/>
 *     <enumeration value="SOFR"/>
 *     <enumeration value="SONA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName3Code")
@XmlEnum
public enum BenchmarkCurveName3Code {

    ESTR,
    BBSW,
    BUBO,
    CDOR,
    CIBO,
    EONA,
    EONS,
    EURI,
    EUUS,
    EUCH,
    FUSW,
    GCFR,
    ISDA,
    JIBA,
    LIBI,
    LIBO,
    MOSP,
    MAAA,
    NIBO,
    PFAN,
    PRBO,
    STBO,
    SWAP,
    TLBO,
    TIBO,
    TREA,
    WIBO,
    SOFR,
    SONA;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName3Code fromValue(String v) {
        return valueOf(v);
    }

}
