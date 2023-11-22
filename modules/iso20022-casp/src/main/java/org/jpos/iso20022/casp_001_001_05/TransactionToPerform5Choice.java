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

package org.jpos.iso20022.casp_001_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionToPerform5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionToPerform5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PmtReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}PaymentRequest5" minOccurs="0"/>
 *         <element name="LltyReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyRequest5" minOccurs="0"/>
 *         <element name="RvslReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ReversalRequest5" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionToPerform5Choice", propOrder = {
    "pmtReq",
    "lltyReq",
    "rvslReq"
})
public class TransactionToPerform5Choice {

    @XmlElement(name = "PmtReq")
    protected PaymentRequest5 pmtReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest5 lltyReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest5 rvslReq;

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest5 }
     *     
     */
    public PaymentRequest5 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest5 }
     *     
     */
    public void setPmtReq(PaymentRequest5 value) {
        this.pmtReq = value;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public LoyaltyRequest5 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public void setLltyReq(LoyaltyRequest5 value) {
        this.lltyReq = value;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest5 }
     *     
     */
    public ReversalRequest5 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest5 }
     *     
     */
    public void setRvslReq(ReversalRequest5 value) {
        this.rvslReq = value;
    }

}
