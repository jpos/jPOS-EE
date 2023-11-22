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

package org.jpos.iso20022.fxtr_034_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTradeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QueryTradeStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QAST"/>
 *     <enumeration value="QCTR"/>
 *     <enumeration value="QCIR"/>
 *     <enumeration value="QETR"/>
 *     <enumeration value="QNTR"/>
 *     <enumeration value="QRTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QueryTradeStatus1Code")
@XmlEnum
public enum QueryTradeStatus1Code {

    QAST,
    QCTR,
    QCIR,
    QETR,
    QNTR,
    QRTR;

    public String value() {
        return name();
    }

    public static QueryTradeStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
