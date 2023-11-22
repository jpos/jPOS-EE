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

package org.jpos.iso20022.seev_034_001_13;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason23Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="DQCS"/>
 *     <enumeration value="ITAX"/>
 *     <enumeration value="NTAX"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="SNAV"/>
 *     <enumeration value="BSTR"/>
 *     <enumeration value="IPAW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason23Code")
@XmlEnum
public enum PendingReason23Code {

    ADEA,
    OTHR,
    FULL,
    MCER,
    MONY,
    LACK,
    LATE,
    DQUA,
    PENR,
    CERT,
    DQCS,
    ITAX,
    NTAX,
    MTAX,
    SNAV,
    BSTR,
    IPAW;

    public String value() {
        return name();
    }

    public static PendingReason23Code fromValue(String v) {
        return valueOf(v);
    }

}
