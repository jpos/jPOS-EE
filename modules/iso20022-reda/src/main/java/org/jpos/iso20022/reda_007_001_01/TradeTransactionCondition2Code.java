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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPCC"/>
 *     <enumeration value="SECN"/>
 *     <enumeration value="SEBN"/>
 *     <enumeration value="SCBN"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SERT"/>
 *     <enumeration value="SCCR"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="CAST"/>
 *     <enumeration value="SPPR"/>
 *     <enumeration value="SPCU"/>
 *     <enumeration value="SPEX"/>
 *     <enumeration value="GTDL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition2Code")
@XmlEnum
public enum TradeTransactionCondition2Code {

    SPCC,
    SECN,
    SEBN,
    SCBN,
    SCRT,
    SERT,
    SCCR,
    SECR,
    CAST,
    SPPR,
    SPCU,
    SPEX,
    GTDL;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition2Code fromValue(String v) {
        return valueOf(v);
    }

}
