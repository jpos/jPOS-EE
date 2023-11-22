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

package org.jpos.iso20022.cain_017_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMOH"/>
 *     <enumeration value="AMTO"/>
 *     <enumeration value="AMTD"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="AVLB"/>
 *     <enumeration value="CLRI"/>
 *     <enumeration value="LDGR"/>
 *     <enumeration value="PNTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceType15Code")
@XmlEnum
public enum BalanceType15Code {

    AMOH,
    AMTO,
    AMTD,
    CRDL,
    OTHN,
    OTHP,
    AVLB,
    CLRI,
    LDGR,
    PNTS;

    public String value() {
        return name();
    }

    public static BalanceType15Code fromValue(String v) {
        return valueOf(v);
    }

}
