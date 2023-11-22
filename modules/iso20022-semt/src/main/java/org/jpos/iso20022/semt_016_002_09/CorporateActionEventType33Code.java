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

package org.jpos.iso20022.semt_016_002_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType33Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType33Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="ATTI"/>
 *     <enumeration value="BRUP"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="CAPD"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="CAPI"/>
 *     <enumeration value="DRCA"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="CHAN"/>
 *     <enumeration value="COOP"/>
 *     <enumeration value="CLSA"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="CREV"/>
 *     <enumeration value="DECR"/>
 *     <enumeration value="DETI"/>
 *     <enumeration value="DSCL"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="DTCH"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="MCAL"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="PPMT"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="RHDI"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="EXTM"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="NOOF"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PARI"/>
 *     <enumeration value="PCAL"/>
 *     <enumeration value="PRED"/>
 *     <enumeration value="PINK"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PDEF"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="BPUT"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="REMK"/>
 *     <enumeration value="BIDS"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="RHTS"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="SHPR"/>
 *     <enumeration value="SMAL"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="TREC"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="DLST"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="EXWA"/>
 *     <enumeration value="WTRC"/>
 *     <enumeration value="WRTH"/>
 *     <enumeration value="ACCU"/>
 *     <enumeration value="MTNG"/>
 *     <enumeration value="INFO"/>
 *     <enumeration value="TNDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType33Code")
@XmlEnum
public enum CorporateActionEventType33Code {

    ACTV,
    ATTI,
    BRUP,
    DFLT,
    BONU,
    EXRI,
    CAPD,
    CAPG,
    CAPI,
    DRCA,
    DVCA,
    CHAN,
    COOP,
    CLSA,
    CONS,
    CONV,
    CREV,
    DECR,
    DETI,
    DSCL,
    DVOP,
    DRIP,
    DRAW,
    DTCH,
    EXOF,
    REDM,
    MCAL,
    INCR,
    PPMT,
    INTR,
    RHDI,
    LIQU,
    EXTM,
    MRGR,
    NOOF,
    CERT,
    ODLT,
    OTHR,
    PARI,
    PCAL,
    PRED,
    PINK,
    PLAC,
    PDEF,
    PRIO,
    BPUT,
    REDO,
    REMK,
    BIDS,
    SPLR,
    RHTS,
    DVSC,
    SHPR,
    SMAL,
    SOFF,
    DVSE,
    SPLF,
    TREC,
    TEND,
    DLST,
    SUSP,
    EXWA,
    WTRC,
    WRTH,
    ACCU,
    MTNG,
    INFO,
    TNDP;

    public String value() {
        return name();
    }

    public static CorporateActionEventType33Code fromValue(String v) {
        return valueOf(v);
    }

}
