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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInstructionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementInstructionReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHI"/>
 *     <enumeration value="ALLL"/>
 *     <enumeration value="CSHO"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="SAVP"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="SAVE"/>
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="WTHP"/>
 *     <enumeration value="CORP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementInstructionReason1Code")
@XmlEnum
public enum SettlementInstructionReason1Code {

    CSHI,
    ALLL,
    CSHO,
    CHAR,
    DIVI,
    INTE,
    SAVP,
    REDM,
    SAVE,
    BUYI,
    SELL,
    SUBS,
    WTHP,
    CORP;

    public String value() {
        return name();
    }

    public static SettlementInstructionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
