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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyTransaction5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyTransaction5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="LltyTxTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyTransactionType1Code"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlPOITx" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentTransaction127" minOccurs="0"/>
 *         <element name="SaleItm" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Product6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransaction5", propOrder = {
    "saleTxId",
    "lltyTxTp",
    "ccy",
    "ttlAmt",
    "orgnlPOITx",
    "saleItm"
})
public class LoyaltyTransaction5 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "LltyTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyTransactionType1Code lltyTxTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "OrgnlPOITx")
    protected CardPaymentTransaction127 orgnlPOITx;
    @XmlElement(name = "SaleItm")
    protected List<Product6> saleItm;

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
     * Gets the value of the lltyTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTransactionType1Code }
     *     
     */
    public LoyaltyTransactionType1Code getLltyTxTp() {
        return lltyTxTp;
    }

    /**
     * Sets the value of the lltyTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTransactionType1Code }
     *     
     */
    public void setLltyTxTp(LoyaltyTransactionType1Code value) {
        this.lltyTxTp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the orgnlPOITx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getOrgnlPOITx() {
        return orgnlPOITx;
    }

    /**
     * Sets the value of the orgnlPOITx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public void setOrgnlPOITx(CardPaymentTransaction127 value) {
        this.orgnlPOITx = value;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product6 }
     * 
     * 
     * @return
     *     The value of the saleItm property.
     */
    public List<Product6> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<>();
        }
        return this.saleItm;
    }

}
