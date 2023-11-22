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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRentalServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CarRentalServiceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADJM"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="BAST"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="DMGS"/>
 *     <enumeration value="DLVR"/>
 *     <enumeration value="DPOF"/>
 *     <enumeration value="ENTE"/>
 *     <enumeration value="EXTC"/>
 *     <enumeration value="EXDY"/>
 *     <enumeration value="EXDI"/>
 *     <enumeration value="EXHR"/>
 *     <enumeration value="FINE"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="GARA"/>
 *     <enumeration value="GPSY"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LIIN"/>
 *     <enumeration value="LDIN"/>
 *     <enumeration value="MISC"/>
 *     <enumeration value="NAVI"/>
 *     <enumeration value="NOSH"/>
 *     <enumeration value="ONEW"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PARK"/>
 *     <enumeration value="PRIN"/>
 *     <enumeration value="PFIN"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="SMOK"/>
 *     <enumeration value="TOLL"/>
 *     <enumeration value="TOWI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CarRentalServiceType2Code")
@XmlEnum
public enum CarRentalServiceType2Code {

    ADJM,
    AUTH,
    BAST,
    CLEA,
    DMGS,
    DLVR,
    DPOF,
    ENTE,
    EXTC,
    EXDY,
    EXDI,
    EXHR,
    FINE,
    FUEL,
    GARA,
    GPSY,
    INSU,
    LATE,
    LIIN,
    LDIN,
    MISC,
    NAVI,
    NOSH,
    ONEW,
    OTHN,
    OTHP,
    PARK,
    PRIN,
    PFIN,
    PHON,
    REGD,
    SMOK,
    TOLL,
    TOWI;

    public String value() {
        return name();
    }

    public static CarRentalServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
