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

package org.jpos.iso20022.caad_001_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction151 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction151">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BtchMgmtTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}BatchManagementType2Code"/>
 *         <element name="OthrBtchMgmtTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}TransactionIdentification12" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ColltnId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" minOccurs="0"/>
 *         <element name="BtchId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" minOccurs="0"/>
 *         <element name="ColltnSz" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Number" minOccurs="0"/>
 *         <element name="OrgnlColltnId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" minOccurs="0"/>
 *         <element name="OrgnlBtchId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" minOccurs="0"/>
 *         <element name="NbOfBtchsInColltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Number" minOccurs="0"/>
 *         <element name="NbOfMsgs" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Number" minOccurs="0"/>
 *         <element name="RmngMsgsInColltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Number" minOccurs="0"/>
 *         <element name="MsgSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max15NumericText" minOccurs="0"/>
 *         <element name="ColltnIdList" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BtchIdList" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChckptId" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max70Text" minOccurs="0"/>
 *         <element name="ColltnChcksm" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max35Binary" minOccurs="0"/>
 *         <element name="BtchChcksm" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Max35Binary" minOccurs="0"/>
 *         <element name="ReqAck" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MsgsBfrAck" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}Number" minOccurs="0"/>
 *         <element name="PostvAck" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}CorrectionIdentification1" minOccurs="0"/>
 *         <element name="ConttnInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction151", propOrder = {
    "btchMgmtTp",
    "othrBtchMgmtTp",
    "txId",
    "addtlFee",
    "colltnId",
    "btchId",
    "colltnSz",
    "orgnlColltnId",
    "orgnlBtchId",
    "nbOfBtchsInColltn",
    "nbOfMsgs",
    "rmngMsgsInColltn",
    "msgSeqNb",
    "colltnIdList",
    "btchIdList",
    "chckptId",
    "colltnChcksm",
    "btchChcksm",
    "reqAck",
    "msgsBfrAck",
    "postvAck",
    "addtlData",
    "crrctn",
    "conttnInd"
})
public class Transaction151 {

    @XmlElement(name = "BtchMgmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected BatchManagementType2Code btchMgmtTp;
    @XmlElement(name = "OthrBtchMgmtTp")
    protected String othrBtchMgmtTp;
    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "ColltnSz")
    protected BigDecimal colltnSz;
    @XmlElement(name = "OrgnlColltnId")
    protected String orgnlColltnId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfBtchsInColltn")
    protected BigDecimal nbOfBtchsInColltn;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "RmngMsgsInColltn")
    protected BigDecimal rmngMsgsInColltn;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "ColltnIdList")
    protected List<String> colltnIdList;
    @XmlElement(name = "BtchIdList")
    protected List<String> btchIdList;
    @XmlElement(name = "ChckptId")
    protected String chckptId;
    @XmlElement(name = "ColltnChcksm")
    protected byte[] colltnChcksm;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "MsgsBfrAck")
    protected BigDecimal msgsBfrAck;
    @XmlElement(name = "PostvAck")
    protected Boolean postvAck;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;

    /**
     * Gets the value of the btchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public BatchManagementType2Code getBtchMgmtTp() {
        return btchMgmtTp;
    }

    /**
     * Sets the value of the btchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public void setBtchMgmtTp(BatchManagementType2Code value) {
        this.btchMgmtTp = value;
    }

    /**
     * Gets the value of the othrBtchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrBtchMgmtTp() {
        return othrBtchMgmtTp;
    }

    /**
     * Sets the value of the othrBtchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrBtchMgmtTp(String value) {
        this.othrBtchMgmtTp = value;
    }

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
     * Gets the value of the colltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Sets the value of the colltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColltnId(String value) {
        this.colltnId = value;
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
     * Gets the value of the colltnSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColltnSz() {
        return colltnSz;
    }

    /**
     * Sets the value of the colltnSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColltnSz(BigDecimal value) {
        this.colltnSz = value;
    }

    /**
     * Gets the value of the orgnlColltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlColltnId() {
        return orgnlColltnId;
    }

    /**
     * Sets the value of the orgnlColltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlColltnId(String value) {
        this.orgnlColltnId = value;
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
     * Gets the value of the nbOfBtchsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfBtchsInColltn() {
        return nbOfBtchsInColltn;
    }

    /**
     * Sets the value of the nbOfBtchsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfBtchsInColltn(BigDecimal value) {
        this.nbOfBtchsInColltn = value;
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
     * Gets the value of the rmngMsgsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngMsgsInColltn() {
        return rmngMsgsInColltn;
    }

    /**
     * Sets the value of the rmngMsgsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRmngMsgsInColltn(BigDecimal value) {
        this.rmngMsgsInColltn = value;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSeqNb(String value) {
        this.msgSeqNb = value;
    }

    /**
     * Gets the value of the colltnIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the colltnIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColltnIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the colltnIdList property.
     */
    public List<String> getColltnIdList() {
        if (colltnIdList == null) {
            colltnIdList = new ArrayList<>();
        }
        return this.colltnIdList;
    }

    /**
     * Gets the value of the btchIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the btchIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the btchIdList property.
     */
    public List<String> getBtchIdList() {
        if (btchIdList == null) {
            btchIdList = new ArrayList<>();
        }
        return this.btchIdList;
    }

    /**
     * Gets the value of the chckptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckptId() {
        return chckptId;
    }

    /**
     * Sets the value of the chckptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckptId(String value) {
        this.chckptId = value;
    }

    /**
     * Gets the value of the colltnChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getColltnChcksm() {
        return colltnChcksm;
    }

    /**
     * Sets the value of the colltnChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setColltnChcksm(byte[] value) {
        this.colltnChcksm = value;
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
     * Gets the value of the msgsBfrAck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgsBfrAck() {
        return msgsBfrAck;
    }

    /**
     * Sets the value of the msgsBfrAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsgsBfrAck(BigDecimal value) {
        this.msgsBfrAck = value;
    }

    /**
     * Gets the value of the postvAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostvAck() {
        return postvAck;
    }

    /**
     * Sets the value of the postvAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostvAck(Boolean value) {
        this.postvAck = value;
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
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public void setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the conttnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttnInd() {
        return conttnInd;
    }

    /**
     * Sets the value of the conttnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConttnInd(Boolean value) {
        this.conttnInd = value;
    }

}
