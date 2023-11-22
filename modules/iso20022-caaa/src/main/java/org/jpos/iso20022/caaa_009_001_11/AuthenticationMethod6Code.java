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

package org.jpos.iso20022.caaa_009_001_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PPSG"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *     <enumeration value="SNCT"/>
 *     <enumeration value="CPSG"/>
 *     <enumeration value="ADDB"/>
 *     <enumeration value="BIOM"/>
 *     <enumeration value="CDHI"/>
 *     <enumeration value="CRYP"/>
 *     <enumeration value="CSCV"/>
 *     <enumeration value="PSVE"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="ADDS"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="TOKP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod6Code")
@XmlEnum
public enum AuthenticationMethod6Code {

    NPIN,
    PPSG,
    PSWD,
    SCRT,
    SCNL,
    SNCT,
    CPSG,
    ADDB,
    BIOM,
    CDHI,
    CRYP,
    CSCV,
    PSVE,
    CSEC,
    ADDS,
    MANU,
    FPIN,
    TOKP;

    public String value() {
        return name();
    }

    public static AuthenticationMethod6Code fromValue(String v) {
        return valueOf(v);
    }

}
