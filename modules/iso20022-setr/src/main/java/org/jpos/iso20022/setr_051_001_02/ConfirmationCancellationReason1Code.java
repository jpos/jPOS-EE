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

package org.jpos.iso20022.setr_051_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConfirmationCancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSHN"/>
 *     <enumeration value="REPL"/>
 *     <enumeration value="BENA"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="EXCH"/>
 *     <enumeration value="FEEE"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="FENA"/>
 *     <enumeration value="GROA"/>
 *     <enumeration value="GROC"/>
 *     <enumeration value="NETA"/>
 *     <enumeration value="NETC"/>
 *     <enumeration value="OPER"/>
 *     <enumeration value="MINI"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="SETS"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="REFE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConfirmationCancellationReason1Code")
@XmlEnum
public enum ConfirmationCancellationReason1Code {

    CSHN,
    REPL,
    BENA,
    CSHW,
    DISA,
    DISC,
    EXCH,
    FEEE,
    DQUA,
    FENA,
    GROA,
    GROC,
    NETA,
    NETC,
    OPER,
    MINI,
    DMON,
    NCRR,
    DDAT,
    SETS,
    DDEA,
    REFE;

    public String value() {
        return name();
    }

    public static ConfirmationCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
