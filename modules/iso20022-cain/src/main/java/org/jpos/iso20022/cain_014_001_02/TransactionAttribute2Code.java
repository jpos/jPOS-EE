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

package org.jpos.iso20022.cain_014_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAttribute2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionAttribute2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="CADB"/>
 *     <enumeration value="CPLT"/>
 *     <enumeration value="DBRC"/>
 *     <enumeration value="DBRP"/>
 *     <enumeration value="DFRD"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="FRCP"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PAUT"/>
 *     <enumeration value="PACP"/>
 *     <enumeration value="PPYT"/>
 *     <enumeration value="RCPT"/>
 *     <enumeration value="SUBR"/>
 *     <enumeration value="TPUP"/>
 *     <enumeration value="UCOF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionAttribute2Code")
@XmlEnum
public enum TransactionAttribute2Code {

    AGGR,
    CADB,
    CPLT,
    DBRC,
    DBRP,
    DFRD,
    INCR,
    FRCP,
    INST,
    OTHN,
    OTHP,
    PAUT,
    PACP,
    PPYT,
    RCPT,
    SUBR,
    TPUP,
    UCOF;

    public String value() {
        return name();
    }

    public static TransactionAttribute2Code fromValue(String v) {
        return valueOf(v);
    }

}
