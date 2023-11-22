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

package org.jpos.iso20022.caad_004_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction141 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction141">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}TransactionIdentification12" minOccurs="0"/>
 *         <element name="BtchId" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max70Text" minOccurs="0"/>
 *         <element name="OrgnlBtchId" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max70Text" minOccurs="0"/>
 *         <element name="NbOfMsgs" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Number" minOccurs="0"/>
 *         <element name="BtchChcksm" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max35Binary" minOccurs="0"/>
 *         <element name="ReqAck" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ClrBtchData" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ClearingBatchData2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClrCtrlTtls" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ClearingControlTotals2" minOccurs="0"/>
 *         <element name="AgtData" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}AdditionalInformation21" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Record2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction141", propOrder = {
    "txId",
    "btchId",
    "orgnlBtchId",
    "nbOfMsgs",
    "btchChcksm",
    "reqAck",
    "clrBtchData",
    "clrCtrlTtls",
    "agtData",
    "rcrd",
    "addtlData"
})
public class Transaction141 {

    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "ClrBtchData")
    protected List<ClearingBatchData2> clrBtchData;
    @XmlElement(name = "ClrCtrlTtls")
    protected ClearingControlTotals2 clrCtrlTtls;
    @XmlElement(name = "AgtData")
    protected List<AdditionalInformation21> agtData;
    @XmlElement(name = "Rcrd")
    protected List<Record2> rcrd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public TransactionIdentification12 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public void setTxId(TransactionIdentification12 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtchId(String value) {
        this.btchId = value;
    }

    /**
     * Gets the value of the orgnlBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlBtchId() {
        return orgnlBtchId;
    }

    /**
     * Sets the value of the orgnlBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlBtchId(String value) {
        this.orgnlBtchId = value;
    }

    /**
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
    }

    /**
     * Gets the value of the btchChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBtchChcksm() {
        return btchChcksm;
    }

    /**
     * Sets the value of the btchChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBtchChcksm(byte[] value) {
        this.btchChcksm = value;
    }

    /**
     * Gets the value of the reqAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAck() {
        return reqAck;
    }

    /**
     * Sets the value of the reqAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqAck(Boolean value) {
        this.reqAck = value;
    }

    /**
     * Gets the value of the clrBtchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrBtchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrBtchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingBatchData2 }
     * 
     * 
     * @return
     *     The value of the clrBtchData property.
     */
    public List<ClearingBatchData2> getClrBtchData() {
        if (clrBtchData == null) {
            clrBtchData = new ArrayList<>();
        }
        return this.clrBtchData;
    }

    /**
     * Gets the value of the clrCtrlTtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingControlTotals2 }
     *     
     */
    public ClearingControlTotals2 getClrCtrlTtls() {
        return clrCtrlTtls;
    }

    /**
     * Sets the value of the clrCtrlTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingControlTotals2 }
     *     
     */
    public void setClrCtrlTtls(ClearingControlTotals2 value) {
        this.clrCtrlTtls = value;
    }

    /**
     * Gets the value of the agtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation21 }
     * 
     * 
     * @return
     *     The value of the agtData property.
     */
    public List<AdditionalInformation21> getAgtData() {
        if (agtData == null) {
            agtData = new ArrayList<>();
        }
        return this.agtData;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Record2 }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<Record2> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<>();
        }
        return this.rcrd;
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

}
