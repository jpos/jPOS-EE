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
 * <p>Java class for PerformedTransaction5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformedTransaction5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ResponseType11"/>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="POITxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="POIRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PmtRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}RetailerPaymentResult5" minOccurs="0"/>
 *         <element name="LltyRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyResult3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RvsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformedTransaction5", propOrder = {
    "rspn",
    "saleTxId",
    "poiTxId",
    "poiRcncltnId",
    "pmtRslt",
    "lltyRslt",
    "rvsdAmt"
})
public class PerformedTransaction5 {

    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "POITxId")
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "PmtRslt")
    protected RetailerPaymentResult5 pmtRslt;
    @XmlElement(name = "LltyRslt")
    protected List<LoyaltyResult3> lltyRslt;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
    }

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
     * Gets the value of the pmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerPaymentResult5 }
     *     
     */
    public RetailerPaymentResult5 getPmtRslt() {
        return pmtRslt;
    }

    /**
     * Sets the value of the pmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerPaymentResult5 }
     *     
     */
    public void setPmtRslt(RetailerPaymentResult5 value) {
        this.pmtRslt = value;
    }

    /**
     * Gets the value of the lltyRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResult3 }
     * 
     * 
     * @return
     *     The value of the lltyRslt property.
     */
    public List<LoyaltyResult3> getLltyRslt() {
        if (lltyRslt == null) {
            lltyRslt = new ArrayList<>();
        }
        return this.lltyRslt;
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

}
