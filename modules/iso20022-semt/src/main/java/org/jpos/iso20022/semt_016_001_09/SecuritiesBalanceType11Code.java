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

package org.jpos.iso20022.semt_016_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="AWAS"/>
 *     <enumeration value="AVAI"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLOT"/>
 *     <enumeration value="BLOV"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="COLA"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEDA"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="SPOS"/>
 *     <enumeration value="UNRG"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="QUAS"/>
 *     <enumeration value="LODE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType11Code")
@XmlEnum
public enum SecuritiesBalanceType11Code {

    BLOK,
    AWAS,
    AVAI,
    BLCA,
    BLOT,
    BLOV,
    BORR,
    COLI,
    COLO,
    COLA,
    LOAN,
    MARG,
    PECA,
    PEDA,
    PLED,
    REGO,
    RSTR,
    OTHR,
    TRAN,
    DRAW,
    CLEN,
    DIRT,
    NOMI,
    SPOS,
    UNRG,
    ISSU,
    QUAS,
    LODE;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType11Code fromValue(String v) {
        return valueOf(v);
    }

}
