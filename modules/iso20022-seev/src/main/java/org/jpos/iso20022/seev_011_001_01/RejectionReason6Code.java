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

package org.jpos.iso20022.seev_011_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="SECT"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="BDAY"/>
 *     <enumeration value="PDAY"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="NPAT"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="RDTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason6Code")
@XmlEnum
public enum RejectionReason6Code {

    FAIL,
    SECO,
    AGID,
    ENDP,
    STAR,
    RESU,
    SECT,
    DISP,
    ELIG,
    XRAT,
    VALU,
    ACRU,
    NOAC,
    MCER,
    BDAY,
    PDAY,
    GAMN,
    DFLT,
    NPAT,
    PERI,
    RDTE;

    public String value() {
        return name();
    }

    public static RejectionReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
