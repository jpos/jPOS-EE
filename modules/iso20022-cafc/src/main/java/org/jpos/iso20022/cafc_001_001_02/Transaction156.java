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

package org.jpos.iso20022.cafc_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction156 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction156">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ISO8583TransactionTypeCode"/>
 *         <element name="TxSubTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CxlInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpclPrgrmmQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}SpecialProgrammeQualification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}TransactionIdentification51"/>
 *         <element name="TxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}TransactionAmounts2"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}AdditionalAmounts3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FeeColltnCycl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}Exact1NumericText" minOccurs="0"/>
 *         <element name="FeeColltnRef" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}FeeCollectionReference1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction156", propOrder = {
    "txTp",
    "txSubTp",
    "cxlInd",
    "msgRsn",
    "altrnMsgRsn",
    "spclPrgrmmQlfctn",
    "txId",
    "txAmts",
    "addtlAmt",
    "addtlFee",
    "addtlData",
    "feeColltnCycl",
    "feeColltnRef"
})
public class Transaction156 {

    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "CxlInd")
    protected Boolean cxlInd;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification51 txId;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts2 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "FeeColltnCycl")
    protected String feeColltnCycl;
    @XmlElement(name = "FeeColltnRef")
    protected FeeCollectionReference1 feeColltnRef;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the txSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSubTp() {
        return txSubTp;
    }

    /**
     * Sets the value of the txSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSubTp(String value) {
        this.txSubTp = value;
    }

    /**
     * Gets the value of the cxlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCxlInd() {
        return cxlInd;
    }

    /**
     * Sets the value of the cxlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCxlInd(Boolean value) {
        this.cxlInd = value;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgRsn property.
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrnMsgRsn property.
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spclPrgrmmQlfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclPrgrmmQlfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeQualification1 }
     * 
     * 
     * @return
     *     The value of the spclPrgrmmQlfctn property.
     */
    public List<SpecialProgrammeQualification1> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification51 }
     *     
     */
    public TransactionIdentification51 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification51 }
     *     
     */
    public void setTxId(TransactionIdentification51 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public TransactionAmounts2 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public void setTxAmts(TransactionAmounts2 value) {
        this.txAmts = value;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts3 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<AdditionalAmounts3> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the feeColltnCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeColltnCycl() {
        return feeColltnCycl;
    }

    /**
     * Sets the value of the feeColltnCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeColltnCycl(String value) {
        this.feeColltnCycl = value;
    }

    /**
     * Gets the value of the feeColltnRef property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionReference1 }
     *     
     */
    public FeeCollectionReference1 getFeeColltnRef() {
        return feeColltnRef;
    }

    /**
     * Sets the value of the feeColltnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionReference1 }
     *     
     */
    public void setFeeColltnRef(FeeCollectionReference1 value) {
        this.feeColltnRef = value;
    }

}
