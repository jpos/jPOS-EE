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

package org.jpos.iso20022.acmt_008_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommunicationMethod3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="FAXI"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="FILE"/>
 *     <enumeration value="ONLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommunicationMethod3Code")
@XmlEnum
public enum CommunicationMethod3Code {

    EMAL,
    FAXI,
    POST,
    PHON,
    FILE,
    ONLI;

    public String value() {
        return name();
    }

    public static CommunicationMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
