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

package org.jpos.iso20022.canm_002_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageError1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageError1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IDEF"/>
 *     <enumeration value="IDEL"/>
 *     <enumeration value="IDEV"/>
 *     <enumeration value="INME"/>
 *     <enumeration value="INMF"/>
 *     <enumeration value="MEPE"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRVE"/>
 *     <enumeration value="RDEM"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="UDFD"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="ITDE"/>
 *     <enumeration value="DUME"/>
 *     <enumeration value="IDWM"/>
 *     <enumeration value="IDRM"/>
 *     <enumeration value="IBAT"/>
 *     <enumeration value="ICOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageError1Code")
@XmlEnum
public enum MessageError1Code {

    IDEF,
    IDEL,
    IDEV,
    INME,
    INMF,
    MEPE,
    OTHP,
    PRVE,
    RDEM,
    SECU,
    UDFD,
    OTHN,
    ITDE,
    DUME,
    IDWM,
    IDRM,
    IBAT,
    ICOL;

    public String value() {
        return name();
    }

    public static MessageError1Code fromValue(String v) {
        return valueOf(v);
    }

}
