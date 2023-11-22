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

package org.jpos.iso20022.seev_052_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason22Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="BOTH"/>
 *     <enumeration value="PRCY"/>
 *     <enumeration value="FUTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason22Code")
@XmlEnum
public enum PendingReason22Code {

    ADEA,
    OTHR,
    MONY,
    LACK,
    LATE,
    CLAC,
    CMON,
    PREA,
    LINK,
    CYCL,
    BOTH,
    PRCY,
    FUTU;

    public String value() {
        return name();
    }

    public static PendingReason22Code fromValue(String v) {
        return valueOf(v);
    }

}
