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

package org.jpos.iso20022.cafm_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction157 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction157">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}TransactionIdentification12" minOccurs="0"/>
 *         <element name="FileActnScp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}FileActionScope1Code" minOccurs="0"/>
 *         <element name="FileActnTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}FileActionType2Code" minOccurs="0"/>
 *         <element name="OthrFileActnTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FileActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}FileActionDetails2"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}CorrectionIdentification1" minOccurs="0"/>
 *         <element name="ConttnInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction157", propOrder = {
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "fileActnScp",
    "fileActnTp",
    "othrFileActnTp",
    "fileActnDtls",
    "addtlFee",
    "addtlData",
    "crrctn",
    "conttnInd"
})
public class Transaction157 {

    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "FileActnScp")
    @XmlSchemaType(name = "string")
    protected FileActionScope1Code fileActnScp;
    @XmlElement(name = "FileActnTp")
    @XmlSchemaType(name = "string")
    protected FileActionType2Code fileActnTp;
    @XmlElement(name = "OthrFileActnTp")
    protected String othrFileActnTp;
    @XmlElement(name = "FileActnDtls", required = true)
    protected FileActionDetails2 fileActnDtls;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;

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
     * Gets the value of the fileActnScp property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionScope1Code }
     *     
     */
    public FileActionScope1Code getFileActnScp() {
        return fileActnScp;
    }

    /**
     * Sets the value of the fileActnScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionScope1Code }
     *     
     */
    public void setFileActnScp(FileActionScope1Code value) {
        this.fileActnScp = value;
    }

    /**
     * Gets the value of the fileActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionType2Code }
     *     
     */
    public FileActionType2Code getFileActnTp() {
        return fileActnTp;
    }

    /**
     * Sets the value of the fileActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionType2Code }
     *     
     */
    public void setFileActnTp(FileActionType2Code value) {
        this.fileActnTp = value;
    }

    /**
     * Gets the value of the othrFileActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFileActnTp() {
        return othrFileActnTp;
    }

    /**
     * Sets the value of the othrFileActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFileActnTp(String value) {
        this.othrFileActnTp = value;
    }

    /**
     * Gets the value of the fileActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionDetails2 }
     *     
     */
    public FileActionDetails2 getFileActnDtls() {
        return fileActnDtls;
    }

    /**
     * Sets the value of the fileActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionDetails2 }
     *     
     */
    public void setFileActnDtls(FileActionDetails2 value) {
        this.fileActnDtls = value;
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
