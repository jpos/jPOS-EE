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

package org.jpos.iso20022.seev_034_001_13;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason66Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason66Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NMTY"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INTV"/>
 *     <enumeration value="OPNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="DQCC"/>
 *     <enumeration value="DQAM"/>
 *     <enumeration value="IRDQ"/>
 *     <enumeration value="DQBV"/>
 *     <enumeration value="DQBI"/>
 *     <enumeration value="SHAR"/>
 *     <enumeration value="ITAX"/>
 *     <enumeration value="NTAX"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="ISOL"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="CTCT"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="PROI"/>
 *     <enumeration value="PRON"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="TRTI"/>
 *     <enumeration value="IPAW"/>
 *     <enumeration value="REJA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason66Code")
@XmlEnum
public enum RejectionReason66Code {

    ADEA,
    CERT,
    INVA,
    OPTY,
    ULNK,
    DSEC,
    LACK,
    LATE,
    NMTY,
    FULL,
    CANC,
    INTV,
    OPNM,
    OTHR,
    DQUA,
    REFT,
    SAFE,
    EVNM,
    DQCS,
    DQCC,
    DQAM,
    IRDQ,
    DQBV,
    DQBI,
    SHAR,
    ITAX,
    NTAX,
    MTAX,
    ISOL,
    BSTR,
    CTCT,
    DUPL,
    PROI,
    PRON,
    PROT,
    TRTI,
    IPAW,
    REJA;

    public String value() {
        return name();
    }

    public static RejectionReason66Code fromValue(String v) {
        return valueOf(v);
    }

}
