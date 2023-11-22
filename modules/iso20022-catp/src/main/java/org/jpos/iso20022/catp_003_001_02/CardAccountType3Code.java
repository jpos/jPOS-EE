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

package org.jpos.iso20022.catp_003_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccountType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardAccountType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CTDP"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="CDBT"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="EPRS"/>
 *     <enumeration value="HEQL"/>
 *     <enumeration value="ISTL"/>
 *     <enumeration value="INVS"/>
 *     <enumeration value="LCDT"/>
 *     <enumeration value="MBNW"/>
 *     <enumeration value="MNMK"/>
 *     <enumeration value="MNMC"/>
 *     <enumeration value="MTGL"/>
 *     <enumeration value="RTRM"/>
 *     <enumeration value="RVLV"/>
 *     <enumeration value="SVNG"/>
 *     <enumeration value="STBD"/>
 *     <enumeration value="UVRL"/>
 *     <enumeration value="PRPD"/>
 *     <enumeration value="FLTC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardAccountType3Code")
@XmlEnum
public enum CardAccountType3Code {

    CTDP,
    CHCK,
    CRDT,
    CURR,
    CDBT,
    DFLT,
    EPRS,
    HEQL,
    ISTL,
    INVS,
    LCDT,
    MBNW,
    MNMK,
    MNMC,
    MTGL,
    RTRM,
    RVLV,
    SVNG,
    STBD,
    UVRL,
    PRPD,
    FLTC;

    public String value() {
        return name();
    }

    public static CardAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
