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

package org.jpos.iso20022.sese_023_002_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSBK"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="NSYN"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="REAL"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REPU"/>
 *     <enumeration value="RODE"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SYND"/>
 *     <enumeration value="TBAC"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="TRPO"/>
 *     <enumeration value="TRVO"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CNCB"/>
 *     <enumeration value="OWNE"/>
 *     <enumeration value="FCTA"/>
 *     <enumeration value="OWNI"/>
 *     <enumeration value="RELE"/>
 *     <enumeration value="SBRE"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="AUTO"/>
 *     <enumeration value="SWIF"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="ETFT"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="SLRE"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="SBBK"/>
 *     <enumeration value="REDI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType23Code")
@XmlEnum
public enum SecuritiesTransactionType23Code {

    BSBK,
    COLI,
    COLO,
    MKDW,
    MKUP,
    NETT,
    NSYN,
    PAIR,
    PLAC,
    PORT,
    REAL,
    REDM,
    REPU,
    RODE,
    RVPO,
    SECB,
    SECL,
    SUBS,
    SYND,
    TBAC,
    TRAD,
    TRPO,
    TRVO,
    TURN,
    BYIY,
    CNCB,
    OWNE,
    FCTA,
    OWNI,
    RELE,
    SBRE,
    CORP,
    CLAI,
    AUTO,
    SWIF,
    SWIT,
    CONV,
    ETFT,
    ISSU,
    SLRE,
    INSP,
    SBBK,
    REDI;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType23Code fromValue(String v) {
        return valueOf(v);
    }

}
