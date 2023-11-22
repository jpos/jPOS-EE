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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType27Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType27Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSBK"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CNCB"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="FCTA"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="NSYN"/>
 *     <enumeration value="OWNE"/>
 *     <enumeration value="OWNI"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="REAL"/>
 *     <enumeration value="REDI"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="RELE"/>
 *     <enumeration value="REPU"/>
 *     <enumeration value="RODE"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SBBK"/>
 *     <enumeration value="SBRE"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="SLRE"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SYND"/>
 *     <enumeration value="TBAC"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="TRPO"/>
 *     <enumeration value="TRVO"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="AUTO"/>
 *     <enumeration value="SWIF"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="ETFT"/>
 *     <enumeration value="REBL"/>
 *     <enumeration value="TRIN"/>
 *     <enumeration value="TOUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType27Code")
@XmlEnum
public enum SecuritiesTransactionType27Code {

    BSBK,
    BYIY,
    CNCB,
    COLI,
    COLO,
    CONV,
    FCTA,
    INSP,
    ISSU,
    MKDW,
    MKUP,
    NETT,
    NSYN,
    OWNE,
    OWNI,
    PAIR,
    PLAC,
    PORT,
    REAL,
    REDI,
    REDM,
    RELE,
    REPU,
    RODE,
    RVPO,
    SBBK,
    SBRE,
    SECB,
    SECL,
    SLRE,
    SUBS,
    SYND,
    TBAC,
    TRAD,
    TRPO,
    TRVO,
    TURN,
    CLAI,
    CORP,
    AUTO,
    SWIF,
    SWIT,
    ETFT,
    REBL,
    TRIN,
    TOUT;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType27Code fromValue(String v) {
        return valueOf(v);
    }

}
