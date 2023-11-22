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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CalculationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFTX"/>
 *     <enumeration value="ANNU"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="AVMA"/>
 *     <enumeration value="BOOK"/>
 *     <enumeration value="YTNC"/>
 *     <enumeration value="CHCL"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="CUYI"/>
 *     <enumeration value="TRGR"/>
 *     <enumeration value="GVEQ"/>
 *     <enumeration value="FLAS"/>
 *     <enumeration value="NVFL"/>
 *     <enumeration value="LSCL"/>
 *     <enumeration value="LSMT"/>
 *     <enumeration value="LSQR"/>
 *     <enumeration value="LSYR"/>
 *     <enumeration value="LGAL"/>
 *     <enumeration value="MARK"/>
 *     <enumeration value="YTMA"/>
 *     <enumeration value="NXRF"/>
 *     <enumeration value="PNAV"/>
 *     <enumeration value="NXPT"/>
 *     <enumeration value="PRCL"/>
 *     <enumeration value="PRYL"/>
 *     <enumeration value="SEMI"/>
 *     <enumeration value="SHLF"/>
 *     <enumeration value="SPLL"/>
 *     <enumeration value="TXQV"/>
 *     <enumeration value="TTDT"/>
 *     <enumeration value="TRYL"/>
 *     <enumeration value="WRST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CalculationType1Code")
@XmlEnum
public enum CalculationType1Code {

    AFTX,
    ANNU,
    ISSU,
    AVMA,
    BOOK,
    YTNC,
    CHCL,
    CLOS,
    CMPD,
    CUYI,
    TRGR,
    GVEQ,
    FLAS,
    NVFL,
    LSCL,
    LSMT,
    LSQR,
    LSYR,
    LGAL,
    MARK,
    YTMA,
    NXRF,
    PNAV,
    NXPT,
    PRCL,
    PRYL,
    SEMI,
    SHLF,
    SPLL,
    TXQV,
    TTDT,
    TRYL,
    WRST;

    public String value() {
        return name();
    }

    public static CalculationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
