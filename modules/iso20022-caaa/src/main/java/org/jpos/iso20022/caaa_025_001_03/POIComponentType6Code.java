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

package org.jpos.iso20022.caaa_025_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AQPP"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="TLPR"/>
 *     <enumeration value="SCPR"/>
 *     <enumeration value="SERV"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="DVCE"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="APLI"/>
 *     <enumeration value="EMVK"/>
 *     <enumeration value="EMVO"/>
 *     <enumeration value="MDWR"/>
 *     <enumeration value="DRVR"/>
 *     <enumeration value="OPST"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="TMSP"/>
 *     <enumeration value="SACP"/>
 *     <enumeration value="SAPR"/>
 *     <enumeration value="LOGF"/>
 *     <enumeration value="MDFL"/>
 *     <enumeration value="SOFT"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="RPFL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POIComponentType6Code")
@XmlEnum
public enum POIComponentType6Code {

    AQPP,
    APPR,
    TLPR,
    SCPR,
    SERV,
    TERM,
    DVCE,
    SECM,
    APLI,
    EMVK,
    EMVO,
    MDWR,
    DRVR,
    OPST,
    MRPR,
    CRTF,
    TMSP,
    SACP,
    SAPR,
    LOGF,
    MDFL,
    SOFT,
    CONF,
    RPFL;

    public String value() {
        return name();
    }

    public static POIComponentType6Code fromValue(String v) {
        return valueOf(v);
    }

}
