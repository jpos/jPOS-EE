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

package org.jpos.iso20022.semt_002_002_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="AWAS"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLOT"/>
 *     <enumeration value="BLOV"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="BODE"/>
 *     <enumeration value="BORE"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="LODE"/>
 *     <enumeration value="LORE"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEDA"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PLED"/>
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
@XmlType(name = "SecuritiesBalanceType12Code")
@XmlEnum
public enum SecuritiesBalanceType12Code {

    BLOK,
    AWAS,
    BLCA,
    BLOT,
    BLOV,
    BORR,
    BODE,
    BORE,
    COLI,
    COLO,
    LOAN,
    LODE,
    LORE,
    MARG,
    PECA,
    PEDA,
    PEND,
    PENR,
    PLED,
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

    public static SecuritiesBalanceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
