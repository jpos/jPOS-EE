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

package org.jpos.iso20022.caaa_020_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction42Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction42Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTQ"/>
 *     <enumeration value="AUTP"/>
 *     <enumeration value="CCAV"/>
 *     <enumeration value="CCAK"/>
 *     <enumeration value="CCAQ"/>
 *     <enumeration value="CCAP"/>
 *     <enumeration value="CMPV"/>
 *     <enumeration value="CMPK"/>
 *     <enumeration value="DCAV"/>
 *     <enumeration value="DCRR"/>
 *     <enumeration value="DCCQ"/>
 *     <enumeration value="DCCP"/>
 *     <enumeration value="DGNP"/>
 *     <enumeration value="DGNQ"/>
 *     <enumeration value="FAUQ"/>
 *     <enumeration value="FAUP"/>
 *     <enumeration value="FCMV"/>
 *     <enumeration value="FCMK"/>
 *     <enumeration value="FRVA"/>
 *     <enumeration value="FRVR"/>
 *     <enumeration value="RCLQ"/>
 *     <enumeration value="RCLP"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="RVRR"/>
 *     <enumeration value="CDDQ"/>
 *     <enumeration value="CDDK"/>
 *     <enumeration value="CDDR"/>
 *     <enumeration value="CDDP"/>
 *     <enumeration value="TRNR"/>
 *     <enumeration value="TRNA"/>
 *     <enumeration value="NFRQ"/>
 *     <enumeration value="NFRP"/>
 *     <enumeration value="TRPQ"/>
 *     <enumeration value="TRPP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction42Code")
@XmlEnum
public enum MessageFunction42Code {

    AUTQ,
    AUTP,
    CCAV,
    CCAK,
    CCAQ,
    CCAP,
    CMPV,
    CMPK,
    DCAV,
    DCRR,
    DCCQ,
    DCCP,
    DGNP,
    DGNQ,
    FAUQ,
    FAUP,
    FCMV,
    FCMK,
    FRVA,
    FRVR,
    RCLQ,
    RCLP,
    RVRA,
    RVRR,
    CDDQ,
    CDDK,
    CDDR,
    CDDP,
    TRNR,
    TRNA,
    NFRQ,
    NFRP,
    TRPQ,
    TRPP;

    public String value() {
        return name();
    }

    public static MessageFunction42Code fromValue(String v) {
        return valueOf(v);
    }

}
