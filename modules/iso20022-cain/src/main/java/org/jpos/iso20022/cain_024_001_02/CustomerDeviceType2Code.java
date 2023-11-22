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

package org.jpos.iso20022.cain_024_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDeviceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerDeviceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MOBL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PECR"/>
 *     <enumeration value="TBLT"/>
 *     <enumeration value="NSCR"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="EMBD"/>
 *     <enumeration value="VHCL"/>
 *     <enumeration value="WRBL"/>
 *     <enumeration value="WATC"/>
 *     <enumeration value="GAMB"/>
 *     <enumeration value="JEWL"/>
 *     <enumeration value="KFOB"/>
 *     <enumeration value="STIC"/>
 *     <enumeration value="UNKW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerDeviceType2Code")
@XmlEnum
public enum CustomerDeviceType2Code {

    MOBL,
    OTHN,
    OTHP,
    PECR,
    TBLT,
    NSCR,
    SECR,
    EMBD,
    VHCL,
    WRBL,
    WATC,
    GAMB,
    JEWL,
    KFOB,
    STIC,
    UNKW;

    public String value() {
        return name();
    }

    public static CustomerDeviceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
