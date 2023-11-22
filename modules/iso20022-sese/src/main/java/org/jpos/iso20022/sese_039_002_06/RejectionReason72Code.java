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

package org.jpos.iso20022.sese_039_002_06;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason72Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason72Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="INVL"/>
 *     <enumeration value="INVB"/>
 *     <enumeration value="INVN"/>
 *     <enumeration value="VALR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason72Code")
@XmlEnum
public enum RejectionReason72Code {

    SAFE,
    DQUA,
    ADEA,
    DSEC,
    LATE,
    CASH,
    DDEA,
    DTRD,
    PLCE,
    RTGS,
    NCRR,
    PHYS,
    REFE,
    DMON,
    MINO,
    BATC,
    MUNO,
    TXST,
    SETS,
    IIND,
    CAEV,
    CASY,
    DDAT,
    SETR,
    SDUT,
    INPS,
    OTHR,
    ICUS,
    ICAG,
    DEPT,
    IEXE,
    INVL,
    INVB,
    INVN,
    VALR;

    public String value() {
        return name();
    }

    public static RejectionReason72Code fromValue(String v) {
        return valueOf(v);
    }

}
