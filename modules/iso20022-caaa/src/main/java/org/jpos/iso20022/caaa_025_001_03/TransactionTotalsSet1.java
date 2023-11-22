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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTotalsSet1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionTotalsSet1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtInstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PaymentInstrumentType1Code"/>
 *         <element name="AcqrrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Brnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CshrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max35Text" minOccurs="0"/>
 *         <element name="ShftNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Max2NumericText" minOccurs="0"/>
 *         <element name="SpnsrdMrchnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}Organisation26" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxTtl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionTotals8"/>
 *         <element name="LltyTxTtl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyTransactionTotals1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotalsSet1", propOrder = {
    "pmtInstrmTp",
    "acqrrId",
    "rcncltnId",
    "saleRcncltnId",
    "brnd",
    "poiId",
    "saleId",
    "cshrId",
    "shftNb",
    "spnsrdMrchnt",
    "txTtl",
    "lltyTxTtl"
})
public class TransactionTotalsSet1 {

    @XmlElement(name = "PmtInstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentType1Code pmtInstrmTp;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<Organisation26> spnsrdMrchnt;
    @XmlElement(name = "TxTtl", required = true)
    protected TransactionTotals8 txTtl;
    @XmlElement(name = "LltyTxTtl")
    protected List<LoyaltyTransactionTotals1> lltyTxTtl;

    /**
     * Gets the value of the pmtInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType1Code }
     *     
     */
    public PaymentInstrumentType1Code getPmtInstrmTp() {
        return pmtInstrmTp;
    }

    /**
     * Sets the value of the pmtInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType1Code }
     *     
     */
    public void setPmtInstrmTp(PaymentInstrumentType1Code value) {
        this.pmtInstrmTp = value;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrId(String value) {
        this.acqrrId = value;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcncltnId(String value) {
        this.rcncltnId = value;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Gets the value of the brnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnd() {
        return brnd;
    }

    /**
     * Sets the value of the brnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnd(String value) {
        this.brnd = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIId(String value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrId(String value) {
        this.cshrId = value;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShftNb(String value) {
        this.shftNb = value;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation26 }
     * 
     * 
     * @return
     *     The value of the spnsrdMrchnt property.
     */
    public List<Organisation26> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Gets the value of the txTtl property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals8 }
     *     
     */
    public TransactionTotals8 getTxTtl() {
        return txTtl;
    }

    /**
     * Sets the value of the txTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals8 }
     *     
     */
    public void setTxTtl(TransactionTotals8 value) {
        this.txTtl = value;
    }

    /**
     * Gets the value of the lltyTxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyTxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyTxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyTransactionTotals1 }
     * 
     * 
     * @return
     *     The value of the lltyTxTtl property.
     */
    public List<LoyaltyTransactionTotals1> getLltyTxTtl() {
        if (lltyTxTtl == null) {
            lltyTxTtl = new ArrayList<>();
        }
        return this.lltyTxTtl;
    }

}
