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

package org.jpos.iso20022.tsmt_046_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportLine1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportLine1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.046.001.01}Max35Text"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.046.001.01}TransactionStatus4"/>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.046.001.01}DocumentIdentification7"/>
 *         <element name="PurchsOrdrTtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.046.001.01}CurrencyAndAmount"/>
 *         <element name="AcmltdNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.046.001.01}CurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportLine1", propOrder = {
    "txId",
    "txSts",
    "purchsOrdrRef",
    "purchsOrdrTtlNetAmt",
    "acmltdNetAmt"
})
public class ReportLine1 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "PurchsOrdrTtlNetAmt", required = true)
    protected CurrencyAndAmount purchsOrdrTtlNetAmt;
    @XmlElement(name = "AcmltdNetAmt", required = true)
    protected CurrencyAndAmount acmltdNetAmt;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public void setTxSts(TransactionStatus4 value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the purchsOrdrTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPurchsOrdrTtlNetAmt() {
        return purchsOrdrTtlNetAmt;
    }

    /**
     * Sets the value of the purchsOrdrTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPurchsOrdrTtlNetAmt(CurrencyAndAmount value) {
        this.purchsOrdrTtlNetAmt = value;
    }

    /**
     * Gets the value of the acmltdNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAcmltdNetAmt() {
        return acmltdNetAmt;
    }

    /**
     * Sets the value of the acmltdNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAcmltdNetAmt(CurrencyAndAmount value) {
        this.acmltdNetAmt = value;
    }

}
