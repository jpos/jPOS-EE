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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason78Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason78Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTM"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="ODNP"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="QUNP"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="CTRA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TNAR"/>
 *     <enumeration value="TNIU"/>
 *     <enumeration value="TQHI"/>
 *     <enumeration value="TQNP"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="EXLI"/>
 *     <enumeration value="INPR"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="EQTY"/>
 *     <enumeration value="SIDE"/>
 *     <enumeration value="CADI"/>
 *     <enumeration value="CPTY"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="DISE"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="INDT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="ICAG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason78Code")
@XmlEnum
public enum RejectionReason78Code {

    ASTM,
    BUSE,
    CADE,
    COMC,
    DDAT,
    DDEA,
    DMON,
    DQUA,
    DSEC,
    DTRD,
    FEEE,
    FORF,
    IEXE,
    IIND,
    INNA,
    NARR,
    NCRR,
    ODNP,
    PLCE,
    QUNP,
    REFE,
    CTRA,
    REPO,
    REPP,
    RERT,
    RSPR,
    SAFE,
    SETR,
    SETS,
    TERM,
    TNAR,
    TNIU,
    TQHI,
    TQNP,
    TXST,
    ULNK,
    VASU,
    INIR,
    OPNM,
    OPTY,
    UKWN,
    EXLI,
    INPR,
    PRIC,
    EQTY,
    SIDE,
    CADI,
    CPTY,
    DISC,
    DISE,
    RESU,
    XRAT,
    ACRU,
    GAMN,
    DFLT,
    FAIL,
    INDT,
    OTHR,
    DEPT,
    ICUS,
    ICAG;

    public String value() {
        return name();
    }

    public static RejectionReason78Code fromValue(String v) {
        return valueOf(v);
    }

}
