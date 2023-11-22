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

package org.jpos.iso20022.sese_032_002_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBNS"/>
 *     <enumeration value="XBNS"/>
 *     <enumeration value="CCPN"/>
 *     <enumeration value="XCPN"/>
 *     <enumeration value="CDIV"/>
 *     <enumeration value="XDIV"/>
 *     <enumeration value="CRTS"/>
 *     <enumeration value="XRTS"/>
 *     <enumeration value="CWAR"/>
 *     <enumeration value="XWAR"/>
 *     <enumeration value="SPCU"/>
 *     <enumeration value="SPEX"/>
 *     <enumeration value="GTDL"/>
 *     <enumeration value="BCRO"/>
 *     <enumeration value="BCRP"/>
 *     <enumeration value="BCFD"/>
 *     <enumeration value="BCBL"/>
 *     <enumeration value="BCBN"/>
 *     <enumeration value="MAPR"/>
 *     <enumeration value="NEGO"/>
 *     <enumeration value="NMPR"/>
 *     <enumeration value="BCPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition4Code")
@XmlEnum
public enum TradeTransactionCondition4Code {

    CBNS,
    XBNS,
    CCPN,
    XCPN,
    CDIV,
    XDIV,
    CRTS,
    XRTS,
    CWAR,
    XWAR,
    SPCU,
    SPEX,
    GTDL,
    BCRO,
    BCRP,
    BCFD,
    BCBL,
    BCBN,
    MAPR,
    NEGO,
    NMPR,
    BCPD;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition4Code fromValue(String v) {
        return valueOf(v);
    }

}
