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

package org.jpos.iso20022.cain_016_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POICommunicationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POICommunicationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLTH"/>
 *     <enumeration value="ETHR"/>
 *     <enumeration value="GPRS"/>
 *     <enumeration value="GSMF"/>
 *     <enumeration value="PSTN"/>
 *     <enumeration value="RS23"/>
 *     <enumeration value="USBD"/>
 *     <enumeration value="USBH"/>
 *     <enumeration value="WIFI"/>
 *     <enumeration value="WT2G"/>
 *     <enumeration value="WT3G"/>
 *     <enumeration value="WT4G"/>
 *     <enumeration value="WT5G"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POICommunicationType2Code")
@XmlEnum
public enum POICommunicationType2Code {

    BLTH("BLTH"),
    ETHR("ETHR"),
    GPRS("GPRS"),
    GSMF("GSMF"),
    PSTN("PSTN"),
    @XmlEnumValue("RS23")
    RS_23("RS23"),
    USBD("USBD"),
    USBH("USBH"),
    WIFI("WIFI"),
    @XmlEnumValue("WT2G")
    WT_2_G("WT2G"),
    @XmlEnumValue("WT3G")
    WT_3_G("WT3G"),
    @XmlEnumValue("WT4G")
    WT_4_G("WT4G"),
    @XmlEnumValue("WT5G")
    WT_5_G("WT5G");
    private final String value;

    POICommunicationType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POICommunicationType2Code fromValue(String v) {
        for (POICommunicationType2Code c: POICommunicationType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
