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
 * <p>Java class for TerminalManagementActionResult5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminalManagementActionResult5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCD"/>
 *     <enumeration value="CNTE"/>
 *     <enumeration value="FMTE"/>
 *     <enumeration value="INVC"/>
 *     <enumeration value="LENE"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="NSUP"/>
 *     <enumeration value="SIGE"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="SYNE"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="UKDT"/>
 *     <enumeration value="UKRF"/>
 *     <enumeration value="INDP"/>
 *     <enumeration value="IDMP"/>
 *     <enumeration value="DPRU"/>
 *     <enumeration value="AERR"/>
 *     <enumeration value="CMER"/>
 *     <enumeration value="ULER"/>
 *     <enumeration value="SUCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminalManagementActionResult5Code")
@XmlEnum
public enum TerminalManagementActionResult5Code {

    ACCD,
    CNTE,
    FMTE,
    INVC,
    LENE,
    OVER,
    MISS,
    NSUP,
    SIGE,
    WARN,
    SYNE,
    TIMO,
    UKDT,
    UKRF,
    INDP,
    IDMP,
    DPRU,
    AERR,
    CMER,
    ULER,
    SUCC;

    public String value() {
        return name();
    }

    public static TerminalManagementActionResult5Code fromValue(String v) {
        return valueOf(v);
    }

}
