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

package org.jpos.iso20022.caaa_011_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OnLineReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RNDM"/>
 *     <enumeration value="ICCF"/>
 *     <enumeration value="MERF"/>
 *     <enumeration value="TRMF"/>
 *     <enumeration value="ISSF"/>
 *     <enumeration value="FRLT"/>
 *     <enumeration value="EXFL"/>
 *     <enumeration value="TAMT"/>
 *     <enumeration value="CBIN"/>
 *     <enumeration value="UBIN"/>
 *     <enumeration value="CPAN"/>
 *     <enumeration value="FLOW"/>
 *     <enumeration value="CRCY"/>
 *     <enumeration value="IFPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OnLineReason2Code")
@XmlEnum
public enum OnLineReason2Code {

    RNDM,
    ICCF,
    MERF,
    TRMF,
    ISSF,
    FRLT,
    EXFL,
    TAMT,
    CBIN,
    UBIN,
    CPAN,
    FLOW,
    CRCY,
    IFPR;

    public String value() {
        return name();
    }

    public static OnLineReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
