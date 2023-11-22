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

package org.jpos.iso20022.seev_041_002_13;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason79Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason79Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="INIR"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="REJA"/>
 *     <enumeration value="CTCT"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="PROI"/>
 *     <enumeration value="TRTI"/>
 *     <enumeration value="DUPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason79Code")
@XmlEnum
public enum RejectionReason79Code {

    ADEA,
    INIR,
    ULNK,
    LATE,
    OTHR,
    DCAN,
    DPRG,
    REJA,
    CTCT,
    DSEC,
    DQUA,
    PROT,
    SAFE,
    PROI,
    TRTI,
    DUPL;

    public String value() {
        return name();
    }

    public static RejectionReason79Code fromValue(String v) {
        return valueOf(v);
    }

}
