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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOwnershipType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNCO"/>
 *     <enumeration value="LIPA"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="EURE"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="TRUS"/>
 *     <enumeration value="GOVO"/>
 *     <enumeration value="JOIT"/>
 *     <enumeration value="COMO"/>
 *     <enumeration value="JOIN"/>
 *     <enumeration value="LLCO"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="NFPO"/>
 *     <enumeration value="ONIS"/>
 *     <enumeration value="RGIC"/>
 *     <enumeration value="SIGL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOwnershipType4Code")
@XmlEnum
public enum AccountOwnershipType4Code {

    UNCO,
    LIPA,
    ENTR,
    CORP,
    CUST,
    EURE,
    PART,
    TRUS,
    GOVO,
    JOIT,
    COMO,
    JOIN,
    LLCO,
    NOMI,
    NFPO,
    ONIS,
    RGIC,
    SIGL;

    public String value() {
        return name();
    }

    public static AccountOwnershipType4Code fromValue(String v) {
        return valueOf(v);
    }

}
