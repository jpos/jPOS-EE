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

package org.jpos.iso20022.sese_037_002_07;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASGN"/>
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="DLWM"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="FRCL"/>
 *     <enumeration value="KNOC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="RESI"/>
 *     <enumeration value="SPDL"/>
 *     <enumeration value="SPST"/>
 *     <enumeration value="UNEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition3Code")
@XmlEnum
public enum SettlementTransactionCondition3Code {

    ASGN,
    CLEN,
    DIRT,
    DLWM,
    DRAW,
    EXER,
    FRCL,
    KNOC,
    PHYS,
    RESI,
    SPDL,
    SPST,
    UNEX;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition3Code fromValue(String v) {
        return valueOf(v);
    }

}
