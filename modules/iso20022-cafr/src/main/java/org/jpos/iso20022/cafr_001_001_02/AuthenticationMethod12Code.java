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

package org.jpos.iso20022.cafr_001_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APKI"/>
 *     <enumeration value="ADVF"/>
 *     <enumeration value="ARNB"/>
 *     <enumeration value="ARPC"/>
 *     <enumeration value="ARQC"/>
 *     <enumeration value="ATCC"/>
 *     <enumeration value="BTHD"/>
 *     <enumeration value="CHSA"/>
 *     <enumeration value="CHDN"/>
 *     <enumeration value="CUID"/>
 *     <enumeration value="DRVI"/>
 *     <enumeration value="DRLN"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="EMIN"/>
 *     <enumeration value="EMRN"/>
 *     <enumeration value="IDCN"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="NVSC"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="OLDA"/>
 *     <enumeration value="OLDS"/>
 *     <enumeration value="OFPE"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="OTPW"/>
 *     <enumeration value="NBIG"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="OCHI"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PPSG"/>
 *     <enumeration value="PSVE"/>
 *     <enumeration value="PASN"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="TOKP"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="PLOB"/>
 *     <enumeration value="PCDV"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="SHAF"/>
 *     <enumeration value="SHAT"/>
 *     <enumeration value="CPSG"/>
 *     <enumeration value="SSNB"/>
 *     <enumeration value="TXIN"/>
 *     <enumeration value="TOKA"/>
 *     <enumeration value="CDHI"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="QWAC"/>
 *     <enumeration value="PHOM"/>
 *     <enumeration value="PWOR"/>
 *     <enumeration value="THDS"/>
 *     <enumeration value="ADDB"/>
 *     <enumeration value="ADDS"/>
 *     <enumeration value="CSCV"/>
 *     <enumeration value="CRYP"/>
 *     <enumeration value="BIOM"/>
 *     <enumeration value="MOBL"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="NTID"/>
 *     <enumeration value="ACSN"/>
 *     <enumeration value="CHSN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod12Code")
@XmlEnum
public enum AuthenticationMethod12Code {

    APKI,
    ADVF,
    ARNB,
    ARPC,
    ARQC,
    ATCC,
    BTHD,
    CHSA,
    CHDN,
    CUID,
    DRVI,
    DRLN,
    EMAL,
    EMIN,
    EMRN,
    IDCN,
    MANU,
    NVSC,
    FBIG,
    FBIO,
    OLDA,
    OLDS,
    OFPE,
    FCPN,
    OTPW,
    NBIG,
    NPIN,
    OCHI,
    OTHN,
    OTHP,
    PPSG,
    PSVE,
    PASN,
    PSWD,
    TOKP,
    PKIS,
    PLOB,
    PCDV,
    SCRT,
    SCNL,
    CSEC,
    SHAF,
    SHAT,
    CPSG,
    SSNB,
    TXIN,
    TOKA,
    CDHI,
    TOKN,
    QWAC,
    PHOM,
    PWOR,
    THDS,
    ADDB,
    ADDS,
    CSCV,
    CRYP,
    BIOM,
    MOBL,
    FPIN,
    NTID,
    ACSN,
    CHSN;

    public String value() {
        return name();
    }

    public static AuthenticationMethod12Code fromValue(String v) {
        return valueOf(v);
    }

}
