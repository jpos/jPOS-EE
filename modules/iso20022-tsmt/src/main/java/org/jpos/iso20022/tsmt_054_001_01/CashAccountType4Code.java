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

package org.jpos.iso20022.tsmt_054_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashAccountType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="TAXE"/>
 *     <enumeration value="CISH"/>
 *     <enumeration value="TRAS"/>
 *     <enumeration value="SACC"/>
 *     <enumeration value="CACC"/>
 *     <enumeration value="SVGS"/>
 *     <enumeration value="ONDP"/>
 *     <enumeration value="MGLD"/>
 *     <enumeration value="NREX"/>
 *     <enumeration value="MOMA"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="SLRY"/>
 *     <enumeration value="ODFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashAccountType4Code")
@XmlEnum
public enum CashAccountType4Code {

    CASH,
    CHAR,
    COMM,
    TAXE,
    CISH,
    TRAS,
    SACC,
    CACC,
    SVGS,
    ONDP,
    MGLD,
    NREX,
    MOMA,
    LOAN,
    SLRY,
    ODFT;

    public String value() {
        return name();
    }

    public static CashAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
