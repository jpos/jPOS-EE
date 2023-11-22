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
 * <p>Java class for UnmatchedReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DCBS"/>
 *     <enumeration value="TMOP"/>
 *     <enumeration value="OPTP"/>
 *     <enumeration value="OFRF"/>
 *     <enumeration value="SPRD"/>
 *     <enumeration value="RITP"/>
 *     <enumeration value="RATE"/>
 *     <enumeration value="TMCY"/>
 *     <enumeration value="TXCY"/>
 *     <enumeration value="TXAM"/>
 *     <enumeration value="MNTP"/>
 *     <enumeration value="EGSP"/>
 *     <enumeration value="EXPO"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="TFRT"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="INPD"/>
 *     <enumeration value="PYFQ"/>
 *     <enumeration value="CSAC"/>
 *     <enumeration value="LBKD"/>
 *     <enumeration value="CRYD"/>
 *     <enumeration value="TENO"/>
 *     <enumeration value="SEPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason15Code")
@XmlEnum
public enum UnmatchedReason15Code {

    CPCA,
    DCBS,
    TMOP,
    OPTP,
    OFRF,
    SPRD,
    RITP,
    RATE,
    TMCY,
    TXCY,
    TXAM,
    MNTP,
    EGSP,
    EXPO,
    DTRD,
    REDT,
    CMIS,
    TFRT,
    TERM,
    INPD,
    PYFQ,
    CSAC,
    LBKD,
    CRYD,
    TENO,
    SEPR;

    public String value() {
        return name();
    }

    public static UnmatchedReason15Code fromValue(String v) {
        return valueOf(v);
    }

}
