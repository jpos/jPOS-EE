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

package org.jpos.iso20022.sese_026_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionCondition10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionCondition10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="ASGN"/>
 *     <enumeration value="BUTC"/>
 *     <enumeration value="CLEN"/>
 *     <enumeration value="DLWM"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="FRCL"/>
 *     <enumeration value="KNOC"/>
 *     <enumeration value="NOMC"/>
 *     <enumeration value="NACT"/>
 *     <enumeration value="PENS"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="RHYP"/>
 *     <enumeration value="RPTO"/>
 *     <enumeration value="RESI"/>
 *     <enumeration value="SHOR"/>
 *     <enumeration value="SPDL"/>
 *     <enumeration value="SPST"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="TRIP"/>
 *     <enumeration value="UNEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition10Code")
@XmlEnum
public enum SettlementTransactionCondition10Code {

    ADEA,
    ASGN,
    BUTC,
    CLEN,
    DLWM,
    DIRT,
    DRAW,
    EXER,
    EXPI,
    FRCL,
    KNOC,
    NOMC,
    NACT,
    PENS,
    PHYS,
    RHYP,
    RPTO,
    RESI,
    SHOR,
    SPDL,
    SPST,
    TRAN,
    TRIP,
    UNEX;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition10Code fromValue(String v) {
        return valueOf(v);
    }

}
