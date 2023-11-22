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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundRole6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CACO"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="DATP"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="FACT"/>
 *     <enumeration value="FIAD"/>
 *     <enumeration value="FIAG"/>
 *     <enumeration value="FMCO"/>
 *     <enumeration value="FNBR"/>
 *     <enumeration value="FTAG"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="INVS"/>
 *     <enumeration value="PAYI"/>
 *     <enumeration value="REGI"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundRole6Code")
@XmlEnum
public enum InvestmentFundRole6Code {

    CACO,
    CONC,
    CUST,
    DATP,
    DIST,
    FACT,
    FIAD,
    FIAG,
    FMCO,
    FNBR,
    FTAG,
    INTR,
    INVE,
    INVS,
    PAYI,
    REGI,
    TRAG,
    TRAN;

    public String value() {
        return name();
    }

    public static InvestmentFundRole6Code fromValue(String v) {
        return valueOf(v);
    }

}
