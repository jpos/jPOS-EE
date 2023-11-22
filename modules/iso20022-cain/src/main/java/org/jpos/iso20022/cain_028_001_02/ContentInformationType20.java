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

package org.jpos.iso20022.cain_028_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentInformationType20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContentInformationType20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MACData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}MACData1"/>
 *         <element name="MAC" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max8HexBinaryText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType20", propOrder = {
    "macData",
    "mac"
})
public class ContentInformationType20 {

    @XmlElement(name = "MACData", required = true)
    protected MACData1 macData;
    @XmlElement(name = "MAC", required = true)
    protected String mac;

    /**
     * Gets the value of the macData property.
     * 
     * @return
     *     possible object is
     *     {@link MACData1 }
     *     
     */
    public MACData1 getMACData() {
        return macData;
    }

    /**
     * Sets the value of the macData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACData1 }
     *     
     */
    public void setMACData(MACData1 value) {
        this.macData = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

}
