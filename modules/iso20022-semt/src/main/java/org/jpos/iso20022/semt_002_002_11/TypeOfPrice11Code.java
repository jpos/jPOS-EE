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

package org.jpos.iso20022.semt_002_002_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDE"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="NAVL"/>
 *     <enumeration value="CREA"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="SWNG"/>
 *     <enumeration value="MIDD"/>
 *     <enumeration value="RINV"/>
 *     <enumeration value="SWIC"/>
 *     <enumeration value="MRKT"/>
 *     <enumeration value="INDC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice11Code")
@XmlEnum
public enum TypeOfPrice11Code {

    BIDE,
    OFFR,
    NAVL,
    CREA,
    CANC,
    INTE,
    SWNG,
    MIDD,
    RINV,
    SWIC,
    MRKT,
    INDC;

    public String value() {
        return name();
    }

    public static TypeOfPrice11Code fromValue(String v) {
        return valueOf(v);
    }

}
