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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPD"/>
 *     <enumeration value="VALD"/>
 *     <enumeration value="MATD"/>
 *     <enumeration value="AUTD"/>
 *     <enumeration value="INVD"/>
 *     <enumeration value="UMAC"/>
 *     <enumeration value="STLE"/>
 *     <enumeration value="STLM"/>
 *     <enumeration value="SSPD"/>
 *     <enumeration value="PCAN"/>
 *     <enumeration value="PSTL"/>
 *     <enumeration value="PFST"/>
 *     <enumeration value="SMLR"/>
 *     <enumeration value="RMLR"/>
 *     <enumeration value="SRBL"/>
 *     <enumeration value="AVLB"/>
 *     <enumeration value="SRML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingStatus4Code")
@XmlEnum
public enum PendingStatus4Code {

    ACPD,
    VALD,
    MATD,
    AUTD,
    INVD,
    UMAC,
    STLE,
    STLM,
    SSPD,
    PCAN,
    PSTL,
    PFST,
    SMLR,
    RMLR,
    SRBL,
    AVLB,
    SRML;

    public String value() {
        return name();
    }

    public static PendingStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
