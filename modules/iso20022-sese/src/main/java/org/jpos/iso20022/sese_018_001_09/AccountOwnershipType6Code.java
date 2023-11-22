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

package org.jpos.iso20022.sese_018_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOwnershipType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOWN"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="EURE"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="TRUS"/>
 *     <enumeration value="GOVO"/>
 *     <enumeration value="JOIT"/>
 *     <enumeration value="COMO"/>
 *     <enumeration value="JOIN"/>
 *     <enumeration value="LLCO"/>
 *     <enumeration value="LIPA"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="NFPO"/>
 *     <enumeration value="ONIS"/>
 *     <enumeration value="OWNR"/>
 *     <enumeration value="RGIC"/>
 *     <enumeration value="SIGL"/>
 *     <enumeration value="UNCO"/>
 *     <enumeration value="USUF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOwnershipType6Code")
@XmlEnum
public enum AccountOwnershipType6Code {

    BOWN,
    CORP,
    CUST,
    ENTR,
    EURE,
    PART,
    TRUS,
    GOVO,
    JOIT,
    COMO,
    JOIN,
    LLCO,
    LIPA,
    NOMI,
    NFPO,
    ONIS,
    OWNR,
    RGIC,
    SIGL,
    UNCO,
    USUF;

    public String value() {
        return name();
    }

    public static AccountOwnershipType6Code fromValue(String v) {
        return valueOf(v);
    }

}
