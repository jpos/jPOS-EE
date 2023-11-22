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

package org.jpos.iso20022.semt_021_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason76Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason76Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ULNK"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DADR"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="SHAR"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="MLEG"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="OWNT"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="REQW"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RREA"/>
 *     <enumeration value="REQM"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="ICOL"/>
 *     <enumeration value="BPAR"/>
 *     <enumeration value="BREF"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="CONL"/>
 *     <enumeration value="CPTY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="DISE"/>
 *     <enumeration value="DORD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="PLIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason76Code")
@XmlEnum
public enum RejectionReason76Code {

    ULNK,
    SAFE,
    DQUA,
    ADEA,
    RTGS,
    NCRR,
    DSEC,
    DADR,
    INIR,
    CANC,
    INTV,
    INVA,
    REFT,
    PHYS,
    REFE,
    LACK,
    LATE,
    NMTY,
    OPNM,
    DMON,
    OPTY,
    DCAN,
    DPRG,
    EVNM,
    STAT,
    STAM,
    SIGN,
    SHAR,
    MINO,
    NRGM,
    MLEG,
    BATC,
    CADE,
    CASH,
    DDEA,
    OWNT,
    NRGN,
    MUNO,
    REQW,
    TXST,
    REPA,
    REPO,
    REPP,
    RREA,
    REQM,
    RERT,
    RSPR,
    SETS,
    DTRD,
    IIND,
    PLCE,
    INNA,
    ICOL,
    BPAR,
    BREF,
    BUSE,
    CAEV,
    CASY,
    COMC,
    CONL,
    CPTY,
    DDAT,
    DISC,
    DISE,
    DORD,
    FEEE,
    SETR,
    TERM,
    VASU,
    INPS,
    SDUT,
    FORF,
    ICUS,
    ICAG,
    DEPT,
    OTHR,
    IEXE,
    INVE,
    PLIS;

    public String value() {
        return name();
    }

    public static RejectionReason76Code fromValue(String v) {
        return valueOf(v);
    }

}
