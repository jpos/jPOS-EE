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

package org.jpos.iso20022.fxtr_034_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDateCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDateCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGU"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="NXTD"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="TTWO"/>
 *     <enumeration value="TTRE"/>
 *     <enumeration value="TFOR"/>
 *     <enumeration value="TFIV"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="ASAP"/>
 *     <enumeration value="ENDC"/>
 *     <enumeration value="WHIF"/>
 *     <enumeration value="WDIS"/>
 *     <enumeration value="WHID"/>
 *     <enumeration value="TBAT"/>
 *     <enumeration value="MONT"/>
 *     <enumeration value="CLEA"/>
 *     <enumeration value="SAVE"/>
 *     <enumeration value="WISS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDateCode")
@XmlEnum
public enum SettlementDateCode {

    REGU,
    CASH,
    NXTD,
    TONE,
    TTWO,
    TTRE,
    TFOR,
    TFIV,
    SELL,
    FUTU,
    ASAP,
    ENDC,
    WHIF,
    WDIS,
    WHID,
    TBAT,
    MONT,
    CLEA,
    SAVE,
    WISS;

    public String value() {
        return name();
    }

    public static SettlementDateCode fromValue(String v) {
        return valueOf(v);
    }

}
