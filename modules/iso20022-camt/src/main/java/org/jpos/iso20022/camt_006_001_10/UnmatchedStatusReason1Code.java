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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMIS"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="VASU"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="RSPR"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="RERT"/>
 *     <enumeration value="REPA"/>
 *     <enumeration value="REPP"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="FRAP"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="REGD"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="ICUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedStatusReason1Code")
@XmlEnum
public enum UnmatchedStatusReason1Code {

    CMIS,
    DDAT,
    DELN,
    DEPT,
    DMON,
    DDEA,
    DQUA,
    CADE,
    SETR,
    DSEC,
    VASU,
    DTRA,
    RSPR,
    REPO,
    CLAT,
    RERT,
    REPA,
    REPP,
    PHYS,
    IIND,
    FRAP,
    PLCE,
    PODU,
    FORF,
    REGD,
    RTGS,
    ICAG,
    CPCA,
    CHAR,
    IEXE,
    NCRR,
    NMAS,
    SAFE,
    DTRD,
    LATE,
    TERM,
    ICUS;

    public String value() {
        return name();
    }

    public static UnmatchedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
