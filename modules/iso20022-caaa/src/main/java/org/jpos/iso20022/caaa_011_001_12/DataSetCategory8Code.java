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

package org.jpos.iso20022.caaa_011_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetCategory8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetCategory8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SWPK"/>
 *     <enumeration value="VDPR"/>
 *     <enumeration value="AQPR"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="TXCP"/>
 *     <enumeration value="AKCP"/>
 *     <enumeration value="STRP"/>
 *     <enumeration value="DLGT"/>
 *     <enumeration value="MGTP"/>
 *     <enumeration value="RCLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetCategory8Code")
@XmlEnum
public enum DataSetCategory8Code {

    SWPK,
    VDPR,
    AQPR,
    MRPR,
    TXCP,
    AKCP,
    STRP,
    DLGT,
    MGTP,
    RCLE;

    public String value() {
        return name();
    }

    public static DataSetCategory8Code fromValue(String v) {
        return valueOf(v);
    }

}
