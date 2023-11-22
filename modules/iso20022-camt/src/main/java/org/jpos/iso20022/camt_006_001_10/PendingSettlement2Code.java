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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlement2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingSettlement2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="TAMM"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="GUAD"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="NMAS"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="PCAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingSettlement2Code")
@XmlEnum
public enum PendingSettlement2Code {

    AWMO,
    CAIS,
    REFU,
    AWSH,
    PHSE,
    TAMM,
    DOCY,
    DOCC,
    BLOC,
    CHAS,
    NEWI,
    CLAC,
    MUNO,
    GLOB,
    PREA,
    GUAD,
    PART,
    NMAS,
    CMON,
    YCOL,
    COLL,
    DEPO,
    FLIM,
    NOFX,
    INCA,
    LINK,
    FUTU,
    LACK,
    LALO,
    MONY,
    NCON,
    REFS,
    SDUT,
    BATC,
    CYCL,
    SBLO,
    CPEC,
    MINO,
    PCAP;

    public String value() {
        return name();
    }

    public static PendingSettlement2Code fromValue(String v) {
        return valueOf(v);
    }

}
