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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PDMT"/>
 *     <enumeration value="PRMT"/>
 *     <enumeration value="PRUM"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="PDUM"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="WDOC"/>
 *     <enumeration value="BTRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType1Code")
@XmlEnum
public enum SecuritiesBalanceType1Code {

    BLOK,
    BORR,
    COLI,
    COLO,
    LOAN,
    MARG,
    PDMT,
    PRMT,
    PRUM,
    PECA,
    PEND,
    PENR,
    PLED,
    PDUM,
    REGO,
    RSTR,
    OTHR,
    TRAN,
    DRAW,
    WDOC,
    BTRA;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
