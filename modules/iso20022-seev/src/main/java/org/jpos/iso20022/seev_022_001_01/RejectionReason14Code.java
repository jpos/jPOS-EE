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

package org.jpos.iso20022.seev_022_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="LATT"/>
 *     <enumeration value="INET"/>
 *     <enumeration value="INUS"/>
 *     <enumeration value="INPT"/>
 *     <enumeration value="INMV"/>
 *     <enumeration value="INDE"/>
 *     <enumeration value="AGIN"/>
 *     <enumeration value="INMO"/>
 *     <enumeration value="SAID"/>
 *     <enumeration value="INID"/>
 *     <enumeration value="MOSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason14Code")
@XmlEnum
public enum RejectionReason14Code {

    FAIL,
    LATT,
    INET,
    INUS,
    INPT,
    INMV,
    INDE,
    AGIN,
    INMO,
    SAID,
    INID,
    MOSE;

    public String value() {
        return name();
    }

    public static RejectionReason14Code fromValue(String v) {
        return valueOf(v);
    }

}
