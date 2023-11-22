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

package org.jpos.iso20022.seev_005_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntryType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesEntryType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="SETD"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="SPOS"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="UNBA"/>
 *     <enumeration value="INBA"/>
 *     <enumeration value="REGO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesEntryType2Code")
@XmlEnum
public enum SecuritiesEntryType2Code {

    BLOK,
    ELIG,
    PEND,
    PENR,
    NOMI,
    SETD,
    BORR,
    LOAN,
    SPOS,
    TRAD,
    COLI,
    COLO,
    UNBA,
    INBA,
    REGO;

    public String value() {
        return name();
    }

    public static SecuritiesEntryType2Code fromValue(String v) {
        return valueOf(v);
    }

}
