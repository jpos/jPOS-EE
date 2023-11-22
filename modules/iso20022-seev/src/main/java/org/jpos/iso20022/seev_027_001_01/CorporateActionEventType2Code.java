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

package org.jpos.iso20022.seev_027_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="ATTI"/>
 *     <enumeration value="BIDS"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="BPUT"/>
 *     <enumeration value="BRUP"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="CAPI"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="CHAN"/>
 *     <enumeration value="CLSA"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="COOP"/>
 *     <enumeration value="DECR"/>
 *     <enumeration value="DETI"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="DLST"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DSCL"/>
 *     <enumeration value="DTCH"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="EXTM"/>
 *     <enumeration value="EXWA"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MCAL"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="PARI"/>
 *     <enumeration value="PCAL"/>
 *     <enumeration value="PDEF"/>
 *     <enumeration value="PINK"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PPMT"/>
 *     <enumeration value="PRED"/>
 *     <enumeration value="PRII"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="REMK"/>
 *     <enumeration value="RHDI"/>
 *     <enumeration value="RHTS"/>
 *     <enumeration value="SHPR"/>
 *     <enumeration value="SMAL"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="TREC"/>
 *     <enumeration value="WRTH"/>
 *     <enumeration value="WTRC"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType2Code")
@XmlEnum
public enum CorporateActionEventType2Code {

    ACTV,
    ATTI,
    BIDS,
    BONU,
    BPUT,
    BRUP,
    CAPG,
    CAPI,
    CERT,
    CHAN,
    CLSA,
    CONS,
    CONV,
    COOP,
    DECR,
    DETI,
    DFLT,
    DLST,
    DRAW,
    DRIP,
    DSCL,
    DTCH,
    DVCA,
    DVOP,
    DVSC,
    DVSE,
    EXOF,
    EXRI,
    EXTM,
    EXWA,
    INCR,
    INTR,
    LIQU,
    MCAL,
    MRGR,
    ODLT,
    PARI,
    PCAL,
    PDEF,
    PINK,
    PLAC,
    PPMT,
    PRED,
    PRII,
    PRIO,
    REDM,
    REDO,
    REMK,
    RHDI,
    RHTS,
    SHPR,
    SMAL,
    SOFF,
    SPLF,
    SPLR,
    SUSP,
    TEND,
    TREC,
    WRTH,
    WTRC,
    OTHR;

    public String value() {
        return name();
    }

    public static CorporateActionEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
