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

package org.jpos.iso20022.caaa_002_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TOKA"/>
 *     <enumeration value="ADDB"/>
 *     <enumeration value="BYPS"/>
 *     <enumeration value="BIOM"/>
 *     <enumeration value="CDHI"/>
 *     <enumeration value="CRYP"/>
 *     <enumeration value="CSCV"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="MOBL"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="NPIN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PPSG"/>
 *     <enumeration value="PSVE"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="TOKP"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="SNCT"/>
 *     <enumeration value="ADDS"/>
 *     <enumeration value="CPSG"/>
 *     <enumeration value="TOKN"/>
 *     <enumeration value="UKNW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod8Code")
@XmlEnum
public enum AuthenticationMethod8Code {

    TOKA,
    ADDB,
    BYPS,
    BIOM,
    CDHI,
    CRYP,
    CSCV,
    MANU,
    MERC,
    MOBL,
    FPIN,
    NPIN,
    OTHR,
    PPSG,
    PSVE,
    PSWD,
    TOKP,
    SCRT,
    SCNL,
    CSEC,
    SNCT,
    ADDS,
    CPSG,
    TOKN,
    UKNW;

    public String value() {
        return name();
    }

    public static AuthenticationMethod8Code fromValue(String v) {
        return valueOf(v);
    }

}
