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

package org.jpos.iso20022.sese_009_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLCA"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="IAQD"/>
 *     <enumeration value="ICTN"/>
 *     <enumeration value="CYPA"/>
 *     <enumeration value="TREF"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FTAX"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="INPM"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="LEGL"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="PTNS"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="ISTP"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ISAT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="ACLO"/>
 *     <enumeration value="NASS"/>
 *     <enumeration value="NQTY"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="DINV"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="URSC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason12Code")
@XmlEnum
public enum RejectedStatusReason12Code {

    BLCA,
    DOCC,
    IAQD,
    ICTN,
    CYPA,
    TREF,
    DSEC,
    IDNA,
    DQUA,
    FTAX,
    INID,
    INAC,
    CASH,
    INPM,
    INNA,
    SAFE,
    INUK,
    LEGL,
    NSLA,
    SECU,
    PTNS,
    DLVY,
    DDAT,
    ISTP,
    DEPT,
    ISAT,
    OTHR,
    NCON,
    ACLO,
    NASS,
    NQTY,
    BLTR,
    COSE,
    ILLI,
    BMRV,
    DINV,
    ICAG,
    IPAC,
    INTE,
    DMON,
    PRCT,
    IVAG,
    NCRR,
    DTRD,
    UPAY,
    URSC;

    public String value() {
        return name();
    }

    public static RejectedStatusReason12Code fromValue(String v) {
        return valueOf(v);
    }

}
