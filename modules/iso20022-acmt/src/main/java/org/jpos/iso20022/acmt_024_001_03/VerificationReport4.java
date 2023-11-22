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

package org.jpos.iso20022.acmt_024_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationReport4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerificationReport4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.03}Max35Text"/>
 *         <element name="Vrfctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.03}IdentificationVerificationIndicator"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.03}VerificationReason1Choice" minOccurs="0"/>
 *         <element name="OrgnlPtyAndAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.03}IdentificationInformation4" minOccurs="0"/>
 *         <element name="UpdtdPtyAndAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.03}IdentificationInformation4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationReport4", propOrder = {
    "orgnlId",
    "vrfctn",
    "rsn",
    "orgnlPtyAndAcctId",
    "updtdPtyAndAcctId"
})
public class VerificationReport4 {

    @XmlElement(name = "OrgnlId", required = true)
    protected String orgnlId;
    @XmlElement(name = "Vrfctn")
    protected boolean vrfctn;
    @XmlElement(name = "Rsn")
    protected VerificationReason1Choice rsn;
    @XmlElement(name = "OrgnlPtyAndAcctId")
    protected IdentificationInformation4 orgnlPtyAndAcctId;
    @XmlElement(name = "UpdtdPtyAndAcctId")
    protected IdentificationInformation4 updtdPtyAndAcctId;

    /**
     * Gets the value of the orgnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlId() {
        return orgnlId;
    }

    /**
     * Sets the value of the orgnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlId(String value) {
        this.orgnlId = value;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     */
    public boolean isVrfctn() {
        return vrfctn;
    }

    /**
     * Sets the value of the vrfctn property.
     * 
     */
    public void setVrfctn(boolean value) {
        this.vrfctn = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationReason1Choice }
     *     
     */
    public VerificationReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReason1Choice }
     *     
     */
    public void setRsn(VerificationReason1Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the orgnlPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getOrgnlPtyAndAcctId() {
        return orgnlPtyAndAcctId;
    }

    /**
     * Sets the value of the orgnlPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public void setOrgnlPtyAndAcctId(IdentificationInformation4 value) {
        this.orgnlPtyAndAcctId = value;
    }

    /**
     * Gets the value of the updtdPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getUpdtdPtyAndAcctId() {
        return updtdPtyAndAcctId;
    }

    /**
     * Sets the value of the updtdPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public void setUpdtdPtyAndAcctId(IdentificationInformation4 value) {
        this.updtdPtyAndAcctId = value;
    }

}
