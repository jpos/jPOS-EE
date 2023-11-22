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

package org.jpos.iso20022.acmt_006_001_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLL"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="TRIN"/>
 *     <enumeration value="TOUT"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="CDEP"/>
 *     <enumeration value="CWIT"/>
 *     <enumeration value="DIVP"/>
 *     <enumeration value="CAEV"/>
 *     <enumeration value="CROI"/>
 *     <enumeration value="CROO"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="REAA"/>
 *     <enumeration value="RWPL"/>
 *     <enumeration value="RDIV"/>
 *     <enumeration value="SSPL"/>
 *     <enumeration value="SUAA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionType1Code")
@XmlEnum
public enum InvestmentFundTransactionType1Code {

    ALLL,
    SELL,
    BUYI,
    SWIO,
    TRIN,
    TOUT,
    SUBS,
    REDM,
    CDEP,
    CWIT,
    DIVP,
    CAEV,
    CROI,
    CROO,
    DIVI,
    INSP,
    OTHR,
    REAA,
    RWPL,
    RDIV,
    SSPL,
    SUAA;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
