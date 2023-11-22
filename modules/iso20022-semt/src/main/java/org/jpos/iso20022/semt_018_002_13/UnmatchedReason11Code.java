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

package org.jpos.iso20022.semt_018_002_13;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DMCT"/>
 *     <enumeration value="DCMX"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MIME"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLIS"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="TXST"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="UNBR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason11Code")
@XmlEnum
public enum UnmatchedReason11Code {

    ADEA,
    ACRU,
    IIND,
    CPCA,
    CLAT,
    NCRR,
    DDEA,
    DMCT,
    DCMX,
    DSEC,
    DQUA,
    INVE,
    LEOG,
    LATE,
    MIME,
    CMIS,
    NMAS,
    DTRA,
    OTHR,
    FRAP,
    PHYS,
    PLIS,
    INPS,
    PLCE,
    PODU,
    DEPT,
    ICAG,
    ICUS,
    IEXE,
    REGD,
    RTGS,
    SAFE,
    DMON,
    DDAT,
    SETS,
    SETR,
    TXST,
    DTRD,
    DELN,
    UNBR;

    public String value() {
        return name();
    }

    public static UnmatchedReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
