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

package org.jpos.iso20022.semt_019_002_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType24Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType24Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTO"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="BSBK"/>
 *     <enumeration value="CNCB"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="RELE"/>
 *     <enumeration value="ETFT"/>
 *     <enumeration value="OWNE"/>
 *     <enumeration value="OWNI"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="NSYN"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="REAL"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REPU"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="SBBK"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SWIF"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="SYND"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="TRPO"/>
 *     <enumeration value="TRVO"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="REDI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType24Code")
@XmlEnum
public enum SecuritiesTransactionType24Code {

    AUTO,
    BYIY,
    BSBK,
    CNCB,
    COLI,
    COLO,
    CORP,
    CONV,
    RELE,
    ETFT,
    OWNE,
    OWNI,
    ISSU,
    MKDW,
    CLAI,
    MKUP,
    NETT,
    NSYN,
    PAIR,
    PLAC,
    PORT,
    REAL,
    REDM,
    REPU,
    RVPO,
    SECB,
    SECL,
    SBBK,
    SUBS,
    SWIF,
    SWIT,
    SYND,
    TRAD,
    TRPO,
    TRVO,
    TURN,
    REDI;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType24Code fromValue(String v) {
        return valueOf(v);
    }

}
