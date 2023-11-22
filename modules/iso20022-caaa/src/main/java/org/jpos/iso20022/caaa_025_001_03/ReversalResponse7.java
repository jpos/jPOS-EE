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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalResponse7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReversalResponse7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="POITxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1"/>
 *         <element name="POIRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="IssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max140Text" minOccurs="0"/>
 *         <element name="RvslTxRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}RetailerReversalResult5"/>
 *         <element name="RvsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Rct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PaymentReceipt5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalResponse7", propOrder = {
    "saleTxId",
    "saleRefId",
    "poiTxId",
    "poiRcncltnId",
    "issrRefData",
    "rvslTxRslt",
    "rvsdAmt",
    "rct"
})
public class ReversalResponse7 {

    @XmlElement(name = "SaleTxId", required = true)
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "RvslTxRslt", required = true)
    protected RetailerReversalResult5 rvslTxRslt;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt5> rct;

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
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
    }

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
    }

    /**
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrRefData(String value) {
        this.issrRefData = value;
    }

    /**
     * Gets the value of the rvslTxRslt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerReversalResult5 }
     *     
     */
    public RetailerReversalResult5 getRvslTxRslt() {
        return rvslTxRslt;
    }

    /**
     * Sets the value of the rvslTxRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerReversalResult5 }
     *     
     */
    public void setRvslTxRslt(RetailerReversalResult5 value) {
        this.rvslTxRslt = value;
    }

    /**
     * Gets the value of the rvsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvsdAmt() {
        return rvsdAmt;
    }

    /**
     * Sets the value of the rvsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRvsdAmt(BigDecimal value) {
        this.rvsdAmt = value;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt5 }
     * 
     * 
     * @return
     *     The value of the rct property.
     */
    public List<PaymentReceipt5> getRct() {
        if (rct == null) {
            rct = new ArrayList<>();
        }
        return this.rct;
    }

}
