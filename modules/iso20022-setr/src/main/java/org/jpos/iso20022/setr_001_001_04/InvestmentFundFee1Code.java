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

package org.jpos.iso20022.setr_001_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundFee1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundFee1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="BRKF"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CDPL"/>
 *     <enumeration value="CDSC"/>
 *     <enumeration value="CBCH"/>
 *     <enumeration value="DLEV"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="INIT"/>
 *     <enumeration value="ADDF"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="UCIC"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="PENA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundFee1Code")
@XmlEnum
public enum InvestmentFundFee1Code {

    BEND,
    BRKF,
    COMM,
    CDPL,
    CDSC,
    CBCH,
    DLEV,
    FEND,
    INIT,
    ADDF,
    POST,
    PREM,
    CHAR,
    SHIP,
    SWIT,
    UCIC,
    REGF,
    PENA;

    public String value() {
        return name();
    }

    public static InvestmentFundFee1Code fromValue(String v) {
        return valueOf(v);
    }

}
