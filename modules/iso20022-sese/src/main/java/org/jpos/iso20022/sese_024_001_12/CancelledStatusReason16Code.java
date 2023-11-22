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

package org.jpos.iso20022.sese_024_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="4"/>
 *     <enumeration value="SCEX"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CXLR"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CTHP"/>
 *     <enumeration value="CANZ"/>
 *     <enumeration value="CANT"/>
 *     <enumeration value="CSUB"/>
 *     <enumeration value="CANS"/>
 *     <enumeration value="CANI"/>
 *     <enumeration value="CORP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason16Code")
@XmlEnum
public enum CancelledStatusReason16Code {

    SCEX,
    OTHR,
    CXLR,
    BYIY,
    CTHP,
    CANZ,
    CANT,
    CSUB,
    CANS,
    CANI,
    CORP;

    public String value() {
        return name();
    }

    public static CancelledStatusReason16Code fromValue(String v) {
        return valueOf(v);
    }

}
