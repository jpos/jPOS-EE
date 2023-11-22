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

package org.jpos.iso20022.sese_027_001_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DREP"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CDRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason6Code")
@XmlEnum
public enum DeniedReason6Code {

    ADEA,
    CDCY,
    CDRE,
    DCAN,
    DSET,
    DPRG,
    DREP,
    LATE,
    OTHR,
    CDRG;

    public String value() {
        return name();
    }

    public static DeniedReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
