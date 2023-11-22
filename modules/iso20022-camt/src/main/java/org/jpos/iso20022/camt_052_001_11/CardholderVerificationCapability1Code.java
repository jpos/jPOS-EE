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

package org.jpos.iso20022.camt_052_001_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MNSG"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="MNVR"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="APKI"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="CHDT"/>
 *     <enumeration value="SCEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability1Code")
@XmlEnum
public enum CardholderVerificationCapability1Code {

    MNSG,
    NPIN,
    FCPN,
    FEPN,
    FDSG,
    FBIO,
    MNVR,
    FBIG,
    APKI,
    PKIS,
    CHDT,
    SCEC;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability1Code fromValue(String v) {
        return valueOf(v);
    }

}
