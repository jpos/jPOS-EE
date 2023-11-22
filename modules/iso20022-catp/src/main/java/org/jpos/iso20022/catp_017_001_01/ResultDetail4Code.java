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

package org.jpos.iso20022.catp_017_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResultDetail4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTF"/>
 *     <enumeration value="ACQS"/>
 *     <enumeration value="AMLV"/>
 *     <enumeration value="AMTA"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="BANK"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CRDF"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="CTVG"/>
 *     <enumeration value="DBER"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="TXNL"/>
 *     <enumeration value="AMTD"/>
 *     <enumeration value="NMBD"/>
 *     <enumeration value="CRDX"/>
 *     <enumeration value="FDCL"/>
 *     <enumeration value="FMTR"/>
 *     <enumeration value="TXNG"/>
 *     <enumeration value="FNDI"/>
 *     <enumeration value="ACPI"/>
 *     <enumeration value="AMTI"/>
 *     <enumeration value="ADDI"/>
 *     <enumeration value="BRHI"/>
 *     <enumeration value="CHDI"/>
 *     <enumeration value="CRDI"/>
 *     <enumeration value="CTFV"/>
 *     <enumeration value="AMTO"/>
 *     <enumeration value="PINV"/>
 *     <enumeration value="TKKO"/>
 *     <enumeration value="SGNI"/>
 *     <enumeration value="TKID"/>
 *     <enumeration value="TXNV"/>
 *     <enumeration value="DATI"/>
 *     <enumeration value="ISSP"/>
 *     <enumeration value="ISSF"/>
 *     <enumeration value="ISSO"/>
 *     <enumeration value="ISST"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="KEYS"/>
 *     <enumeration value="LBLA"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="MACR"/>
 *     <enumeration value="MACK"/>
 *     <enumeration value="ICCM"/>
 *     <enumeration value="PINN"/>
 *     <enumeration value="CRDA"/>
 *     <enumeration value="LBLU"/>
 *     <enumeration value="PINA"/>
 *     <enumeration value="NPRA"/>
 *     <enumeration value="OFFL"/>
 *     <enumeration value="ONLP"/>
 *     <enumeration value="NPRC"/>
 *     <enumeration value="TXNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BALO"/>
 *     <enumeration value="SEQO"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PIND"/>
 *     <enumeration value="PINS"/>
 *     <enumeration value="PINX"/>
 *     <enumeration value="PINE"/>
 *     <enumeration value="QMAX"/>
 *     <enumeration value="RECD"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="SECV"/>
 *     <enumeration value="SRVU"/>
 *     <enumeration value="SFWE"/>
 *     <enumeration value="SPCC"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="CNTC"/>
 *     <enumeration value="FRDS"/>
 *     <enumeration value="SYSP"/>
 *     <enumeration value="SYSM"/>
 *     <enumeration value="TRMI"/>
 *     <enumeration value="ACTT"/>
 *     <enumeration value="TTLV"/>
 *     <enumeration value="TXNU"/>
 *     <enumeration value="TXND"/>
 *     <enumeration value="ORGF"/>
 *     <enumeration value="UNBO"/>
 *     <enumeration value="UNBP"/>
 *     <enumeration value="UNBC"/>
 *     <enumeration value="CMKY"/>
 *     <enumeration value="CRDU"/>
 *     <enumeration value="SVSU"/>
 *     <enumeration value="VNDR"/>
 *     <enumeration value="VNDF"/>
 *     <enumeration value="AMTW"/>
 *     <enumeration value="NMBW"/>
 *     <enumeration value="CRDW"/>
 *     <enumeration value="MEDI"/>
 *     <enumeration value="SRVI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultDetail4Code")
@XmlEnum
public enum ResultDetail4Code {

    ACTF,
    ACQS,
    AMLV,
    AMTA,
    AUTH,
    BANK,
    CRDR,
    CRDF,
    ACTC,
    CTVG,
    DBER,
    FEES,
    TXNL,
    AMTD,
    NMBD,
    CRDX,
    FDCL,
    FMTR,
    TXNG,
    FNDI,
    ACPI,
    AMTI,
    ADDI,
    BRHI,
    CHDI,
    CRDI,
    CTFV,
    AMTO,
    PINV,
    TKKO,
    SGNI,
    TKID,
    TXNV,
    DATI,
    ISSP,
    ISSF,
    ISSO,
    ISST,
    ISSU,
    KEYS,
    LBLA,
    CRDL,
    MACR,
    MACK,
    ICCM,
    PINN,
    CRDA,
    LBLU,
    PINA,
    NPRA,
    OFFL,
    ONLP,
    NPRC,
    TXNM,
    OTHR,
    BALO,
    SEQO,
    PINC,
    PIND,
    PINS,
    PINX,
    PINE,
    QMAX,
    RECD,
    CRDT,
    SECV,
    SRVU,
    SFWE,
    SPCC,
    CRDS,
    SRCH,
    CNTC,
    FRDS,
    SYSP,
    SYSM,
    TRMI,
    ACTT,
    TTLV,
    TXNU,
    TXND,
    ORGF,
    UNBO,
    UNBP,
    UNBC,
    CMKY,
    CRDU,
    SVSU,
    VNDR,
    VNDF,
    AMTW,
    NMBW,
    CRDW,
    MEDI,
    SRVI;

    public String value() {
        return name();
    }

    public static ResultDetail4Code fromValue(String v) {
        return valueOf(v);
    }

}
