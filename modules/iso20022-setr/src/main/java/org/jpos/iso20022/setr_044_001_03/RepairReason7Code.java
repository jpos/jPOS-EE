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
 * <p>Java class for RepairReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepairReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="BUSE"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="CTRA"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="VASU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepairReason7Code")
@XmlEnum
public enum RepairReason7Code {

    ADEA,
    BATC,
    BUSE,
    CADE,
    CASH,
    CASY,
    COMC,
    DDAT,
    DDEA,
    DEPT,
    DMON,
    DQUA,
    DSEC,
    DTRD,
    FEEE,
    FORF,
    ICAG,
    ICUS,
    IEXE,
    IIND,
    INNA,
    LEOG,
    NARR,
    NCRR,
    NRGM,
    NRGN,
    PHYS,
    PLCE,
    CTRA,
    REPO,
    REPP,
    RERT,
    RSPR,
    RTGS,
    SAFE,
    SETR,
    SETS,
    TERM,
    TXST,
    ULNK,
    VASU;

    public String value() {
        return name();
    }

    public static RepairReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
