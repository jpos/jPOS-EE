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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSKT"/>
 *     <enumeration value="INDX"/>
 *     <enumeration value="IPOO"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="PRAL"/>
 *     <enumeration value="PROG"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="BRBR"/>
 *     <enumeration value="RISK"/>
 *     <enumeration value="VWAP"/>
 *     <enumeration value="AGEN"/>
 *     <enumeration value="GUAR"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="BOST"/>
 *     <enumeration value="BOEN"/>
 *     <enumeration value="LABO"/>
 *     <enumeration value="BORE"/>
 *     <enumeration value="OFIT"/>
 *     <enumeration value="BOSU"/>
 *     <enumeration value="FBBT"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="FUOP"/>
 *     <enumeration value="FUTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeType3Code")
@XmlEnum
public enum TradeType3Code {

    BSKT,
    INDX,
    IPOO,
    LIST,
    PRAL,
    PROG,
    TRAD,
    BRBR,
    RISK,
    VWAP,
    AGEN,
    GUAR,
    EMTR,
    ISSU,
    BOST,
    BOEN,
    LABO,
    BORE,
    OFIT,
    BOSU,
    FBBT,
    OPTN,
    FUOP,
    FUTR;

    public String value() {
        return name();
    }

    public static TradeType3Code fromValue(String v) {
        return valueOf(v);
    }

}
