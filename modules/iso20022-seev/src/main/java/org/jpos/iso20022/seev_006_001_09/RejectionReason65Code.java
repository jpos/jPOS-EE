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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason65Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason65Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ADDM"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DREM"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="EVNM"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="IPOA"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="IREG"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="NPOS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="RBIS"/>
 *     <enumeration value="RESN"/>
 *     <enumeration value="SAFE"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="OPTY"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="NOSL"/>
 *     <enumeration value="PMNS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason65Code")
@XmlEnum
public enum RejectionReason65Code {

    ADEA,
    ADDM,
    MCAN,
    DQUA,
    DREM,
    DSEC,
    EVNM,
    FULL,
    IPOA,
    IPOS,
    IREG,
    LATE,
    NPOS,
    OTHR,
    PART,
    PRXY,
    RBIS,
    RESN,
    SAFE,
    SPLT,
    ULNK,
    OPTY,
    LACK,
    LIST,
    NOSL,
    PMNS;

    public String value() {
        return name();
    }

    public static RejectionReason65Code fromValue(String v) {
        return valueOf(v);
    }

}
