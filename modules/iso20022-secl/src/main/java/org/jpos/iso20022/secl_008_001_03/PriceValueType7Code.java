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

package org.jpos.iso20022.secl_008_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceValueType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISC"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PARV"/>
 *     <enumeration value="YIEL"/>
 *     <enumeration value="SPRE"/>
 *     <enumeration value="PEUN"/>
 *     <enumeration value="ABSO"/>
 *     <enumeration value="TEDP"/>
 *     <enumeration value="TEDY"/>
 *     <enumeration value="FICT"/>
 *     <enumeration value="VACT"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceValueType7Code")
@XmlEnum
public enum PriceValueType7Code {

    DISC,
    PREM,
    PARV,
    YIEL,
    SPRE,
    PEUN,
    ABSO,
    TEDP,
    TEDY,
    FICT,
    VACT,
    PRCT,
    ACTU;

    public String value() {
        return name();
    }

    public static PriceValueType7Code fromValue(String v) {
        return valueOf(v);
    }

}
