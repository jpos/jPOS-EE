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

package org.jpos.iso20022.canm_002_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInterface6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UserInterface6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDSP"/>
 *     <enumeration value="CRCP"/>
 *     <enumeration value="MDSP"/>
 *     <enumeration value="MRCP"/>
 *     <enumeration value="CRDO"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="CHAP"/>
 *     <enumeration value="MRAP"/>
 *     <enumeration value="MRIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UserInterface6Code")
@XmlEnum
public enum UserInterface6Code {

    CDSP,
    CRCP,
    MDSP,
    MRCP,
    CRDO,
    FILE,
    CHAP,
    MRAP,
    MRIN;

    public String value() {
        return name();
    }

    public static UserInterface6Code fromValue(String v) {
        return valueOf(v);
    }

}
