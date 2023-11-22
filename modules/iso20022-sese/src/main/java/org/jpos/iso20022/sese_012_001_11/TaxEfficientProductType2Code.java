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

package org.jpos.iso20022.sese_012_001_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxEfficientProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxEfficientProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CLIS"/>
 *     <enumeration value="FISA"/>
 *     <enumeration value="GISK"/>
 *     <enumeration value="GASK"/>
 *     <enumeration value="HISA"/>
 *     <enumeration value="INNF"/>
 *     <enumeration value="JCSH"/>
 *     <enumeration value="JISA"/>
 *     <enumeration value="LISA"/>
 *     <enumeration value="CCTF"/>
 *     <enumeration value="SCTF"/>
 *     <enumeration value="EQUI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxEfficientProductType2Code")
@XmlEnum
public enum TaxEfficientProductType2Code {

    CASH,
    CLIS,
    FISA,
    GISK,
    GASK,
    HISA,
    INNF,
    JCSH,
    JISA,
    LISA,
    CCTF,
    SCTF,
    EQUI;

    public String value() {
        return name();
    }

    public static TaxEfficientProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
