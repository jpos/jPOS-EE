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

package org.jpos.iso20022.cain_021_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTI"/>
 *     <enumeration value="CNIS"/>
 *     <enumeration value="CNTA"/>
 *     <enumeration value="CNAS"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="CHDV"/>
 *     <enumeration value="VIPM"/>
 *     <enumeration value="TRCK"/>
 *     <enumeration value="TRXR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SIGN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType11Code")
@XmlEnum
public enum ActionType11Code {

    CNTI,
    CNIS,
    CNTA,
    CNAS,
    CPTR,
    CHDV,
    VIPM,
    TRCK,
    TRXR,
    OTHN,
    OTHP,
    SIGN;

    public String value() {
        return name();
    }

    public static ActionType11Code fromValue(String v) {
        return valueOf(v);
    }

}
