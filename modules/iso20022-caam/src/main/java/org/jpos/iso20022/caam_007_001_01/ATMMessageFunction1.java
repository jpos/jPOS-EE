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

package org.jpos.iso20022.caam_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Identifies the type of process related to an ATM message.
 * 
 * <p>Java class for ATMMessageFunction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMMessageFunction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}MessageFunction7Code"/>
 *         <element name="ATMSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}Max35Text" minOccurs="0"/>
 *         <element name="HstSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMMessageFunction1", propOrder = {
    "fctn",
    "atmSvcCd",
    "hstSvcCd"
})
public class ATMMessageFunction1 {

    @XmlElement(name = "Fctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction7Code fctn;
    @XmlElement(name = "ATMSvcCd")
    protected String atmSvcCd;
    @XmlElement(name = "HstSvcCd")
    protected String hstSvcCd;

    /**
     * Gets the value of the fctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction7Code }
     *     
     */
    public MessageFunction7Code getFctn() {
        return fctn;
    }

    /**
     * Sets the value of the fctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction7Code }
     *     
     */
    public void setFctn(MessageFunction7Code value) {
        this.fctn = value;
    }

    /**
     * Gets the value of the atmSvcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMSvcCd() {
        return atmSvcCd;
    }

    /**
     * Sets the value of the atmSvcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMSvcCd(String value) {
        this.atmSvcCd = value;
    }

    /**
     * Gets the value of the hstSvcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstSvcCd() {
        return hstSvcCd;
    }

    /**
     * Sets the value of the hstSvcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstSvcCd(String value) {
        this.hstSvcCd = value;
    }

}
