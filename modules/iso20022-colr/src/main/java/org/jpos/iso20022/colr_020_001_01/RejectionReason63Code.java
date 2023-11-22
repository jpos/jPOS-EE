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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason63Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason63Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CCIX"/>
 *     <enumeration value="CCTI"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="PTYA"/>
 *     <enumeration value="PTYB"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="ITPA"/>
 *     <enumeration value="SAFA"/>
 *     <enumeration value="SAFB"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="RSET"/>
 *     <enumeration value="RREP"/>
 *     <enumeration value="NRJN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason63Code")
@XmlEnum
public enum RejectionReason63Code {

    REFE,
    ADEA,
    CCIX,
    CCTI,
    IIND,
    PTYA,
    PTYB,
    LATE,
    ITPA,
    SAFA,
    SAFB,
    REDT,
    DCAN,
    DPRG,
    RSET,
    RREP,
    NRJN;

    public String value() {
        return name();
    }

    public static RejectionReason63Code fromValue(String v) {
        return valueOf(v);
    }

}
