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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardholderVerificationCapability4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APKI"/>
 *     <enumeration value="CHDT"/>
 *     <enumeration value="MNSG"/>
 *     <enumeration value="MNVR"/>
 *     <enumeration value="FBIG"/>
 *     <enumeration value="FBIO"/>
 *     <enumeration value="FDSG"/>
 *     <enumeration value="FCPN"/>
 *     <enumeration value="FEPN"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PKIS"/>
 *     <enumeration value="SCEC"/>
 *     <enumeration value="NBIO"/>
 *     <enumeration value="NOVF"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability4Code")
@XmlEnum
public enum CardholderVerificationCapability4Code {

    APKI,
    CHDT,
    MNSG,
    MNVR,
    FBIG,
    FBIO,
    FDSG,
    FCPN,
    FEPN,
    NPIN,
    PKIS,
    SCEC,
    NBIO,
    NOVF,
    OTHR;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability4Code fromValue(String v) {
        return valueOf(v);
    }

}
