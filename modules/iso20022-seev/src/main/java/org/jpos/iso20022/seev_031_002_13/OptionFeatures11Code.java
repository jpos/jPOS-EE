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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionFeatures11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASVO"/>
 *     <enumeration value="BOIS"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="MAXC"/>
 *     <enumeration value="MAXS"/>
 *     <enumeration value="NOSE"/>
 *     <enumeration value="OPLF"/>
 *     <enumeration value="CAOS"/>
 *     <enumeration value="PINS"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="VVPR"/>
 *     <enumeration value="QCAS"/>
 *     <enumeration value="SHAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionFeatures11Code")
@XmlEnum
public enum OptionFeatures11Code {

    ASVO,
    BOIS,
    COND,
    MAXC,
    MAXS,
    NOSE,
    OPLF,
    CAOS,
    PINS,
    PROR,
    VVPR,
    QCAS,
    SHAR;

    public String value() {
        return name();
    }

    public static OptionFeatures11Code fromValue(String v) {
        return valueOf(v);
    }

}
