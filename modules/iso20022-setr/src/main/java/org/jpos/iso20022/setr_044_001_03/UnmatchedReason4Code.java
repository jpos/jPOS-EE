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
 * <p>Java class for UnmatchedReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CADE"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DEAL"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="LEOG"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="REPA"/>
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
 *     <enumeration value="VASU"/>
 *     <enumeration value="POSE"/>
 *     <enumeration value="BORT"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="OTHI"/>
 *     <enumeration value="BOFE"/>
 *     <enumeration value="TACR"/>
 *     <enumeration value="SDAT"/>
 *     <enumeration value="COID"/>
 *     <enumeration value="SCRA"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="SHAI"/>
 *     <enumeration value="ACRS"/>
 *     <enumeration value="DEAS"/>
 *     <enumeration value="CATI"/>
 *     <enumeration value="TACS"/>
 *     <enumeration value="DBNM"/>
 *     <enumeration value="MADA"/>
 *     <enumeration value="OLID"/>
 *     <enumeration value="TRSA"/>
 *     <enumeration value="TRTE"/>
 *     <enumeration value="BOIA"/>
 *     <enumeration value="OPLI"/>
 *     <enumeration value="TRTR"/>
 *     <enumeration value="LWCO"/>
 *     <enumeration value="INTT"/>
 *     <enumeration value="CUFC"/>
 *     <enumeration value="LTME"/>
 *     <enumeration value="ENFC"/>
 *     <enumeration value="CLSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason4Code")
@XmlEnum
public enum UnmatchedReason4Code {

    ADEA,
    CADE,
    CHAR,
    CMIS,
    CPCA,
    DDAT,
    DDEA,
    DEAL,
    DELN,
    DEPT,
    DMON,
    DQUA,
    DSEC,
    DTRD,
    EXEC,
    FORF,
    LATE,
    LEOG,
    MCAN,
    NARR,
    PHYS,
    PLCE,
    PODU,
    REPA,
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
    VASU,
    POSE,
    BORT,
    COAX,
    OTHI,
    BOFE,
    TACR,
    SDAT,
    COID,
    SCRA,
    ACRU,
    SHAI,
    ACRS,
    DEAS,
    CATI,
    TACS,
    DBNM,
    MADA,
    OLID,
    TRSA,
    TRTE,
    BOIA,
    OPLI,
    TRTR,
    LWCO,
    INTT,
    CUFC,
    LTME,
    ENFC,
    CLSE;

    public String value() {
        return name();
    }

    public static UnmatchedReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
