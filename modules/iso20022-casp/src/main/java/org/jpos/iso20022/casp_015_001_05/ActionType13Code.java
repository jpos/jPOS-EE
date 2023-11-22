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

package org.jpos.iso20022.casp_015_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUSY"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="NOVR"/>
 *     <enumeration value="RQID"/>
 *     <enumeration value="PINL"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PRNT"/>
 *     <enumeration value="RFRL"/>
 *     <enumeration value="RQDT"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="FLFW"/>
 *     <enumeration value="PINQ"/>
 *     <enumeration value="CDCV"/>
 *     <enumeration value="CHDA"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="ACUP"/>
 *     <enumeration value="TALT"/>
 *     <enumeration value="DNTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType13Code")
@XmlEnum
public enum ActionType13Code {

    BUSY,
    CPTR,
    DISP,
    NOVR,
    RQID,
    PINL,
    PINR,
    PRNT,
    RFRL,
    RQDT,
    DCCQ,
    FLFW,
    PINQ,
    CDCV,
    CHDA,
    STAR,
    STOR,
    ACUP,
    TALT,
    DNTA;

    public String value() {
        return name();
    }

    public static ActionType13Code fromValue(String v) {
        return valueOf(v);
    }

}
