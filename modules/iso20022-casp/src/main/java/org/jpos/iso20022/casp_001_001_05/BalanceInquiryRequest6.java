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
 * <p>Java class for BalanceInquiryRequest6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceInquiryRequest6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="PmtAcctReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}PaymentAccountRequest1" minOccurs="0"/>
 *         <element name="LltyAcctReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyAccountRequest3" minOccurs="0"/>
 *         <element name="StordValAcctReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}StoredValueRequest6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryRequest6", propOrder = {
    "saleTxId",
    "pmtAcctReq",
    "lltyAcctReq",
    "stordValAcctReq"
})
public class BalanceInquiryRequest6 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "PmtAcctReq")
    protected PaymentAccountRequest1 pmtAcctReq;
    @XmlElement(name = "LltyAcctReq")
    protected LoyaltyAccountRequest3 lltyAcctReq;
    @XmlElement(name = "StordValAcctReq")
    protected StoredValueRequest6 stordValAcctReq;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
    }

    /**
     * Gets the value of the pmtAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAccountRequest1 }
     *     
     */
    public PaymentAccountRequest1 getPmtAcctReq() {
        return pmtAcctReq;
    }

    /**
     * Sets the value of the pmtAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAccountRequest1 }
     *     
     */
    public void setPmtAcctReq(PaymentAccountRequest1 value) {
        this.pmtAcctReq = value;
    }

    /**
     * Gets the value of the lltyAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountRequest3 }
     *     
     */
    public LoyaltyAccountRequest3 getLltyAcctReq() {
        return lltyAcctReq;
    }

    /**
     * Sets the value of the lltyAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountRequest3 }
     *     
     */
    public void setLltyAcctReq(LoyaltyAccountRequest3 value) {
        this.lltyAcctReq = value;
    }

    /**
     * Gets the value of the stordValAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public StoredValueRequest6 getStordValAcctReq() {
        return stordValAcctReq;
    }

    /**
     * Sets the value of the stordValAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public void setStordValAcctReq(StoredValueRequest6 value) {
        this.stordValAcctReq = value;
    }

}
