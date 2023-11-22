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
 * <p>Java class for CardAcquisitionRequest3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardAcquisitionRequest3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="AllwdPmtBrnd" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AllwdLltyBrnd" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ForceCstmrSelctnFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentServiceType13Code" minOccurs="0"/>
 *         <element name="CshBckFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SaleToPOIData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SaleToAcqrrData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SaleToIssrData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcquisitionRequest3", propOrder = {
    "saleTxId",
    "allwdPmtBrnd",
    "allwdLltyBrnd",
    "forceCstmrSelctnFlg",
    "ttlAmt",
    "pmtTp",
    "cshBckFlg",
    "saleToPOIData",
    "saleToAcqrrData",
    "saleToIssrData"
})
public class CardAcquisitionRequest3 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "AllwdPmtBrnd")
    protected List<String> allwdPmtBrnd;
    @XmlElement(name = "AllwdLltyBrnd")
    protected List<String> allwdLltyBrnd;
    @XmlElement(name = "ForceCstmrSelctnFlg")
    protected Boolean forceCstmrSelctnFlg;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "PmtTp")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType13Code pmtTp;
    @XmlElement(name = "CshBckFlg")
    protected Boolean cshBckFlg;
    @XmlElement(name = "SaleToPOIData")
    protected String saleToPOIData;
    @XmlElement(name = "SaleToAcqrrData")
    protected String saleToAcqrrData;
    @XmlElement(name = "SaleToIssrData")
    protected String saleToIssrData;

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
     * Gets the value of the allwdPmtBrnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdPmtBrnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPmtBrnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the allwdPmtBrnd property.
     */
    public List<String> getAllwdPmtBrnd() {
        if (allwdPmtBrnd == null) {
            allwdPmtBrnd = new ArrayList<>();
        }
        return this.allwdPmtBrnd;
    }

    /**
     * Gets the value of the allwdLltyBrnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdLltyBrnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdLltyBrnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the allwdLltyBrnd property.
     */
    public List<String> getAllwdLltyBrnd() {
        if (allwdLltyBrnd == null) {
            allwdLltyBrnd = new ArrayList<>();
        }
        return this.allwdLltyBrnd;
    }

    /**
     * Gets the value of the forceCstmrSelctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceCstmrSelctnFlg() {
        return forceCstmrSelctnFlg;
    }

    /**
     * Sets the value of the forceCstmrSelctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceCstmrSelctnFlg(Boolean value) {
        this.forceCstmrSelctnFlg = value;
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
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType13Code }
     *     
     */
    public CardPaymentServiceType13Code getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType13Code }
     *     
     */
    public void setPmtTp(CardPaymentServiceType13Code value) {
        this.pmtTp = value;
    }

    /**
     * Gets the value of the cshBckFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshBckFlg() {
        return cshBckFlg;
    }

    /**
     * Sets the value of the cshBckFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshBckFlg(Boolean value) {
        this.cshBckFlg = value;
    }

    /**
     * Gets the value of the saleToPOIData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToPOIData() {
        return saleToPOIData;
    }

    /**
     * Sets the value of the saleToPOIData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToPOIData(String value) {
        this.saleToPOIData = value;
    }

    /**
     * Gets the value of the saleToAcqrrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToAcqrrData() {
        return saleToAcqrrData;
    }

    /**
     * Sets the value of the saleToAcqrrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToAcqrrData(String value) {
        this.saleToAcqrrData = value;
    }

    /**
     * Gets the value of the saleToIssrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToIssrData() {
        return saleToIssrData;
    }

    /**
     * Sets the value of the saleToIssrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToIssrData(String value) {
        this.saleToIssrData = value;
    }

}
