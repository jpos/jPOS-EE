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

package org.jpos.iso20022.setr_016_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedStatusReason11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedStatusReason11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLTR"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ILLI"/>
 *     <enumeration value="BMIN"/>
 *     <enumeration value="BMRA"/>
 *     <enumeration value="BMRV"/>
 *     <enumeration value="CUTO"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IDDB"/>
 *     <enumeration value="ORRF"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="IDNA"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="IPAC"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="ICTR"/>
 *     <enumeration value="IOTP"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="NRGM"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="IPAY"/>
 *     <enumeration value="PRCT"/>
 *     <enumeration value="DLVY"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="ISAF"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="SHIG"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="SLOW"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="UWAI"/>
 *     <enumeration value="UDCY"/>
 *     <enumeration value="UNAV"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="URSC"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="UNSC"/>
 *     <enumeration value="POIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedStatusReason11Code")
@XmlEnum
public enum RejectedStatusReason11Code {

    BLCA,
    BLTR,
    DOCC,
    ADEA,
    ILLI,
    BMIN,
    BMRA,
    BMRV,
    CUTO,
    ICAG,
    IDDB,
    ORRF,
    FEEE,
    DSEC,
    IDNA,
    DQUA,
    CLOS,
    IPAC,
    INSU,
    INTE,
    CASH,
    ICTR,
    IOTP,
    DFOR,
    DMON,
    SAFE,
    LOCK,
    NRGM,
    NSLA,
    MONY,
    SECU,
    IPAY,
    PRCT,
    DLVY,
    PHYS,
    PLCE,
    IVAG,
    RTGS,
    ISAF,
    NCRR,
    DDAT,
    DEPT,
    SETR,
    IEXE,
    SHIG,
    LATE,
    SLOW,
    DTRD,
    UWAI,
    UDCY,
    UNAV,
    UPAY,
    URSC,
    ULNK,
    UNSC,
    POIN;

    public String value() {
        return name();
    }

    public static RejectedStatusReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
