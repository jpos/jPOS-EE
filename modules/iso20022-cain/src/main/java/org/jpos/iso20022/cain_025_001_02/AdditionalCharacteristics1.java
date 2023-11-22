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

package org.jpos.iso20022.cain_025_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalCharacteristics1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalCharacteristics1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BizTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}AdditionalCharacteristicDetails1" minOccurs="0"/>
 *         <element name="Ownr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}AdditionalCharacteristicDetails1" minOccurs="0"/>
 *         <element name="Certfctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}AdditionalCharacteristicDetails1" minOccurs="0"/>
 *         <element name="OwnrEthncty" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}AdditionalCharacteristicDetails1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCharacteristics1", propOrder = {
    "bizTp",
    "ownr",
    "certfctn",
    "ownrEthncty"
})
public class AdditionalCharacteristics1 {

    @XmlElement(name = "BizTp")
    protected AdditionalCharacteristicDetails1 bizTp;
    @XmlElement(name = "Ownr")
    protected AdditionalCharacteristicDetails1 ownr;
    @XmlElement(name = "Certfctn")
    protected AdditionalCharacteristicDetails1 certfctn;
    @XmlElement(name = "OwnrEthncty")
    protected AdditionalCharacteristicDetails1 ownrEthncty;

    /**
     * Gets the value of the bizTp property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getBizTp() {
        return bizTp;
    }

    /**
     * Sets the value of the bizTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public void setBizTp(AdditionalCharacteristicDetails1 value) {
        this.bizTp = value;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public void setOwnr(AdditionalCharacteristicDetails1 value) {
        this.ownr = value;
    }

    /**
     * Gets the value of the certfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getCertfctn() {
        return certfctn;
    }

    /**
     * Sets the value of the certfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public void setCertfctn(AdditionalCharacteristicDetails1 value) {
        this.certfctn = value;
    }

    /**
     * Gets the value of the ownrEthncty property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public AdditionalCharacteristicDetails1 getOwnrEthncty() {
        return ownrEthncty;
    }

    /**
     * Sets the value of the ownrEthncty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristicDetails1 }
     *     
     */
    public void setOwnrEthncty(AdditionalCharacteristicDetails1 value) {
        this.ownrEthncty = value;
    }

}
