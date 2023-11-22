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

package org.jpos.iso20022.sese_011_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferUnmatchedReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferUnmatchedReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMIS"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="SAFE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferUnmatchedReason3Code")
@XmlEnum
public enum TransferUnmatchedReason3Code {

    CMIS,
    CPCA,
    DELN,
    DSEC,
    PHYS,
    PODU,
    DEPT,
    DDAT,
    DQUA,
    ICUS,
    SAFE;

    public String value() {
        return name();
    }

    public static TransferUnmatchedReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
