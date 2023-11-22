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

package org.jpos.iso20022.sese_032_002_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepairReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BATC"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepairReason4Code")
@XmlEnum
public enum RepairReason4Code {

    BATC,
    CAEV,
    CASH,
    CASY,
    DDAT,
    DDEA,
    DMON,
    DQUA,
    DSEC,
    DTRD,
    IIND,
    MINO,
    MUNO,
    NCRR,
    PHYS,
    PLCE,
    REFE,
    RTGS,
    SAFE,
    SETR,
    SETS,
    TXST,
    INPS,
    SDUT,
    OTHR,
    IEXE,
    ICAG,
    DEPT,
    ICUS;

    public String value() {
        return name();
    }

    public static RepairReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
