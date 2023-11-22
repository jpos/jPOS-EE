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

package org.jpos.iso20022.sese_007_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COAX"/>
 *     <enumeration value="CTAX"/>
 *     <enumeration value="EUTR"/>
 *     <enumeration value="LEVY"/>
 *     <enumeration value="LOCL"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="PROV"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="STEX"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="TRAX"/>
 *     <enumeration value="VATA"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="NKAP"/>
 *     <enumeration value="KAPA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxType16Code")
@XmlEnum
public enum TaxType16Code {

    COAX,
    CTAX,
    EUTR,
    LEVY,
    LOCL,
    NATI,
    PROV,
    STAM,
    STAT,
    STEX,
    TRAN,
    TRAX,
    VATA,
    WITH,
    NKAP,
    KAPA;

    public String value() {
        return name();
    }

    public static TaxType16Code fromValue(String v) {
        return valueOf(v);
    }

}
