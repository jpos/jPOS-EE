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

package org.jpos.iso20022.semt_042_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingRejectionReason41Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingRejectionReason41Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INPR"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="BPAR"/>
 *     <enumeration value="BREF"/>
 *     <enumeration value="DADR"/>
 *     <enumeration value="DCUS"/>
 *     <enumeration value="IACT"/>
 *     <enumeration value="INVA"/>
 *     <enumeration value="INDT"/>
 *     <enumeration value="OPTI"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="INMO"/>
 *     <enumeration value="INVM"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="NOHO"/>
 *     <enumeration value="NINS"/>
 *     <enumeration value="NOAP"/>
 *     <enumeration value="NAUT"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="CORR"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="PRIC"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="QUNP"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="EQTY"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="RCUS"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="TQNP"/>
 *     <enumeration value="SETR"/>
 *     <enumeration value="UKWN"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NRGN"/>
 *     <enumeration value="INVB"/>
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="COMC"/>
 *     <enumeration value="CONL"/>
 *     <enumeration value="INHO"/>
 *     <enumeration value="ICOL"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="INVN"/>
 *     <enumeration value="INVL"/>
 *     <enumeration value="VALR"/>
 *     <enumeration value="INUK"/>
 *     <enumeration value="LATT"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="BOIS"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="INNA"/>
 *     <enumeration value="NINV"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="REFE"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="OWNT"/>
 *     <enumeration value="NTAV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingRejectionReason41Code")
@XmlEnum
public enum HoldingRejectionReason41Code {

    INPR,
    INID,
    AGIN,
    INTE,
    CERT,
    BPAR,
    BREF,
    DADR,
    DCUS,
    IACT,
    INVA,
    INDT,
    OPTI,
    OPTY,
    INMO,
    INVM,
    INUS,
    DSEC,
    ENDP,
    STAR,
    SECO,
    NOHO,
    NINS,
    NOAP,
    NAUT,
    AGID,
    DISP,
    CORR,
    INPS,
    PLCE,
    PRIC,
    IVAG,
    QUNP,
    DQUA,
    EQTY,
    DEPT,
    RCUS,
    SAFE,
    DMON,
    NCRR,
    TQNP,
    SETR,
    UKWN,
    DDEA,
    TERM,
    ULNK,
    NARR,
    NRGN,
    INVB,
    ADEA,
    CASH,
    COMC,
    CONL,
    INHO,
    ICOL,
    INVE,
    INVN,
    INVL,
    VALR,
    INUK,
    LATT,
    MINO,
    BOIS,
    MCER,
    IPOA,
    MUNO,
    INNA,
    NINV,
    ELIG,
    PERI,
    REFE,
    SAID,
    OWNT,
    NTAV;

    public String value() {
        return name();
    }

    public static HoldingRejectionReason41Code fromValue(String v) {
        return valueOf(v);
    }

}
