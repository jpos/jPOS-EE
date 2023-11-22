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

package org.jpos.iso20022.catp_014_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailureReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDCP"/>
 *     <enumeration value="CDCL"/>
 *     <enumeration value="CDER"/>
 *     <enumeration value="CUCL"/>
 *     <enumeration value="CUDC"/>
 *     <enumeration value="CDFG"/>
 *     <enumeration value="FILL"/>
 *     <enumeration value="MALF"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SFRD"/>
 *     <enumeration value="TIMO"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="UCPT"/>
 *     <enumeration value="UCMP"/>
 *     <enumeration value="USND"/>
 *     <enumeration value="CSRV"/>
 *     <enumeration value="CDRT"/>
 *     <enumeration value="CUTO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailureReason7Code")
@XmlEnum
public enum FailureReason7Code {

    CDCP,
    CDCL,
    CDER,
    CUCL,
    CUDC,
    CDFG,
    FILL,
    MALF,
    NDCL,
    SECU,
    SFRD,
    TIMO,
    LATE,
    UCPT,
    UCMP,
    USND,
    CSRV,
    CDRT,
    CUTO;

    public String value() {
        return name();
    }

    public static FailureReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
