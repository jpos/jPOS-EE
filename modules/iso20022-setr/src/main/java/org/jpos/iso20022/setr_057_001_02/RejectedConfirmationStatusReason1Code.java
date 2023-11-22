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

package org.jpos.iso20022.setr_057_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedConfirmationStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedConfirmationStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSAF"/>
 *     <enumeration value="DFIN"/>
 *     <enumeration value="DBEN"/>
 *     <enumeration value="DPTD"/>
 *     <enumeration value="DORD"/>
 *     <enumeration value="DCXR"/>
 *     <enumeration value="DUNB"/>
 *     <enumeration value="DORT"/>
 *     <enumeration value="DROU"/>
 *     <enumeration value="DNAM"/>
 *     <enumeration value="DGAM"/>
 *     <enumeration value="DHRR"/>
 *     <enumeration value="DGRP"/>
 *     <enumeration value="DINP"/>
 *     <enumeration value="DLIR"/>
 *     <enumeration value="DARR"/>
 *     <enumeration value="DPDI"/>
 *     <enumeration value="DRSC"/>
 *     <enumeration value="DNAV"/>
 *     <enumeration value="DFXD"/>
 *     <enumeration value="DCHD"/>
 *     <enumeration value="DXOD"/>
 *     <enumeration value="DTAD"/>
 *     <enumeration value="DPDD"/>
 *     <enumeration value="DSCA"/>
 *     <enumeration value="DPID"/>
 *     <enumeration value="DSAM"/>
 *     <enumeration value="DSDT"/>
 *     <enumeration value="DEXD"/>
 *     <enumeration value="DIMD"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="DTSA"/>
 *     <enumeration value="DACI"/>
 *     <enumeration value="DACO"/>
 *     <enumeration value="DPSA"/>
 *     <enumeration value="DPRA"/>
 *     <enumeration value="DLID"/>
 *     <enumeration value="DORF"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DREF"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="IRCU"/>
 *     <enumeration value="IRIN"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IDCU"/>
 *     <enumeration value="IDIN"/>
 *     <enumeration value="ICTR"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="MEUT"/>
 *     <enumeration value="MCOM"/>
 *     <enumeration value="MCHA"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="NATA"/>
 *     <enumeration value="ALAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectedConfirmationStatusReason1Code")
@XmlEnum
public enum RejectedConfirmationStatusReason1Code {

    DSAF,
    DFIN,
    DBEN,
    DPTD,
    DORD,
    DCXR,
    DUNB,
    DORT,
    DROU,
    DNAM,
    DGAM,
    DHRR,
    DGRP,
    DINP,
    DLIR,
    DARR,
    DPDI,
    DRSC,
    DNAV,
    DFXD,
    DCHD,
    DXOD,
    DTAD,
    DPDD,
    DSCA,
    DPID,
    DSAM,
    DSDT,
    DEXD,
    DIMD,
    DTRA,
    DTSA,
    DACI,
    DACO,
    DPSA,
    DPRA,
    DLID,
    DORF,
    ULNK,
    DREF,
    IVAG,
    IRCU,
    IRIN,
    ICAG,
    IDCU,
    IDIN,
    ICTR,
    DMON,
    DDAT,
    NSLA,
    MEUT,
    MCOM,
    MCHA,
    MTAX,
    NATA,
    ALAT;

    public String value() {
        return name();
    }

    public static RejectedConfirmationStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
