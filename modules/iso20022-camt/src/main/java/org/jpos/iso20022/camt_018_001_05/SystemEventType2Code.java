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

package org.jpos.iso20022.camt_018_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemEventType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LVCO"/>
 *     <enumeration value="LVCC"/>
 *     <enumeration value="LVRT"/>
 *     <enumeration value="EUSU"/>
 *     <enumeration value="STSU"/>
 *     <enumeration value="LWSU"/>
 *     <enumeration value="EUCO"/>
 *     <enumeration value="FIRE"/>
 *     <enumeration value="STDY"/>
 *     <enumeration value="LTNC"/>
 *     <enumeration value="CRCO"/>
 *     <enumeration value="RECC"/>
 *     <enumeration value="LTGC"/>
 *     <enumeration value="LTDC"/>
 *     <enumeration value="CUSC"/>
 *     <enumeration value="IBKC"/>
 *     <enumeration value="SYSC"/>
 *     <enumeration value="SSSC"/>
 *     <enumeration value="REOP"/>
 *     <enumeration value="PCOT"/>
 *     <enumeration value="NPCT"/>
 *     <enumeration value="ESTF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemEventType2Code")
@XmlEnum
public enum SystemEventType2Code {

    LVCO,
    LVCC,
    LVRT,
    EUSU,
    STSU,
    LWSU,
    EUCO,
    FIRE,
    STDY,
    LTNC,
    CRCO,
    RECC,
    LTGC,
    LTDC,
    CUSC,
    IBKC,
    SYSC,
    SSSC,
    REOP,
    PCOT,
    NPCT,
    ESTF;

    public String value() {
        return name();
    }

    public static SystemEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
