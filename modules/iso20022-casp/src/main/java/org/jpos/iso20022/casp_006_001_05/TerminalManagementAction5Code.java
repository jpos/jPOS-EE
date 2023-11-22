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

package org.jpos.iso20022.casp_006_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalManagementAction5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementAction5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCTV"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="DWNL"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="UPLD"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="BIND"/>
 *     <enumeration value="RBND"/>
 *     <enumeration value="UBND"/>
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DEVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementAction5Code")
@XmlEnum
public enum TerminalManagementAction5Code {

    DCTV,
    DELT,
    DWNL,
    INST,
    RSTR,
    UPLD,
    UPDT,
    BIND,
    RBND,
    UBND,
    ACTV,
    DEVR;

    public String value() {
        return name();
    }

    public static TerminalManagementAction5Code fromValue(String v) {
        return valueOf(v);
    }

}
