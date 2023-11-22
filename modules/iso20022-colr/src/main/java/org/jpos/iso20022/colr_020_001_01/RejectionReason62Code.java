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
 * <p>Java class for RejectionReason62Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason62Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFE"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CCIX"/>
 *     <enumeration value="CCTI"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="PTYA"/>
 *     <enumeration value="PTYB"/>
 *     <enumeration value="ITPA"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SAFA"/>
 *     <enumeration value="SAFB"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="SEPR"/>
 *     <enumeration value="LBDR"/>
 *     <enumeration value="DCBR"/>
 *     <enumeration value="CSAC"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="IESP"/>
 *     <enumeration value="IEXT"/>
 *     <enumeration value="IPBI"/>
 *     <enumeration value="IRIT"/>
 *     <enumeration value="TMAC"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="TXAC"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="TABC"/>
 *     <enumeration value="ICTT"/>
 *     <enumeration value="NRJN"/>
 *     <enumeration value="NFCA"/>
 *     <enumeration value="CTRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason62Code")
@XmlEnum
public enum RejectionReason62Code {

    REFE,
    ADEA,
    CCIX,
    CCTI,
    IIND,
    PTYA,
    PTYB,
    ITPA,
    LATE,
    SAFA,
    SAFB,
    REDT,
    SEPR,
    LBDR,
    DCBR,
    CSAC,
    TERM,
    DTRD,
    DDAT,
    NCRR,
    IESP,
    IEXT,
    IPBI,
    IRIT,
    TMAC,
    REPA,
    TXAC,
    NRGM,
    TABC,
    ICTT,
    NRJN,
    NFCA,
    CTRA;

    public String value() {
        return name();
    }

    public static RejectionReason62Code fromValue(String v) {
        return valueOf(v);
    }

}
