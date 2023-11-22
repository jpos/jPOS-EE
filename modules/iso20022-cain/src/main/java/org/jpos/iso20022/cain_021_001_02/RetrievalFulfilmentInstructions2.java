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

package org.jpos.iso20022.cain_021_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalFulfilmentInstructions2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetrievalFulfilmentInstructions2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}RetrievalDeliveryMethod1Choice" minOccurs="0"/>
 *         <element name="DlvryInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}DeliveryInformation5" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}AdditionalInformation22" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalFulfilmentInstructions2", propOrder = {
    "mtd",
    "dlvryInf",
    "addtlInf"
})
public class RetrievalFulfilmentInstructions2 {

    @XmlElement(name = "Mtd")
    protected RetrievalDeliveryMethod1Choice mtd;
    @XmlElement(name = "DlvryInf")
    protected DeliveryInformation5 dlvryInf;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation22 addtlInf;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalDeliveryMethod1Choice }
     *     
     */
    public RetrievalDeliveryMethod1Choice getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalDeliveryMethod1Choice }
     *     
     */
    public void setMtd(RetrievalDeliveryMethod1Choice value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the dlvryInf property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation5 }
     *     
     */
    public DeliveryInformation5 getDlvryInf() {
        return dlvryInf;
    }

    /**
     * Sets the value of the dlvryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation5 }
     *     
     */
    public void setDlvryInf(DeliveryInformation5 value) {
        this.dlvryInf = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public AdditionalInformation22 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation22 }
     *     
     */
    public void setAddtlInf(AdditionalInformation22 value) {
        this.addtlInf = value;
    }

}
