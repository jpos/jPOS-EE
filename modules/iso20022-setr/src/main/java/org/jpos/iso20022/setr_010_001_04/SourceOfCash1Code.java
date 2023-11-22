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

package org.jpos.iso20022.setr_010_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SourceOfCash1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALMY"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="EMIN"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="INHE"/>
 *     <enumeration value="INLQ"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REPY"/>
 *     <enumeration value="SEAQ"/>
 *     <enumeration value="SALE"/>
 *     <enumeration value="SVGS"/>
 *     <enumeration value="SELF"/>
 *     <enumeration value="WINS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SourceOfCash1Code")
@XmlEnum
public enum SourceOfCash1Code {

    ALMY,
    CASH,
    COMP,
    EMIN,
    GIFT,
    INHE,
    INLQ,
    REST,
    REDM,
    REPY,
    SEAQ,
    SALE,
    SVGS,
    SELF,
    WINS;

    public String value() {
        return name();
    }

    public static SourceOfCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
