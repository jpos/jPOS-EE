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

package org.jpos.iso20022.catm_005_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction43Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction43Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAUQ"/>
 *     <enumeration value="CCAQ"/>
 *     <enumeration value="CMPV"/>
 *     <enumeration value="DGNP"/>
 *     <enumeration value="RCLQ"/>
 *     <enumeration value="CCAV"/>
 *     <enumeration value="BTCH"/>
 *     <enumeration value="FRVA"/>
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="FCMV"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="DCAV"/>
 *     <enumeration value="TRNA"/>
 *     <enumeration value="NFRQ"/>
 *     <enumeration value="TRPQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction43Code")
@XmlEnum
public enum MessageFunction43Code {

    FAUQ,
    CCAQ,
    CMPV,
    DGNP,
    RCLQ,
    CCAV,
    BTCH,
    FRVA,
    AUTQ,
    FCMV,
    DCCQ,
    RVRA,
    DCAV,
    TRNA,
    NFRQ,
    TRPQ;

    public String value() {
        return name();
    }

    public static MessageFunction43Code fromValue(String v) {
        return valueOf(v);
    }

}
