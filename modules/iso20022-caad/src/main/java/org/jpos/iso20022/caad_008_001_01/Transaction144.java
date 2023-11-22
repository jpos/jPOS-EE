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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction144 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction144">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdmstvTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdministrativeType1Code"/>
 *         <element name="OthrAdmstvTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalService2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssoctdDataInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AssoctdDataRef" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max70Text" minOccurs="0"/>
 *         <element name="AssoctdDataDstn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SpclPrgrmmQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}SpecialProgrammeQualification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TransactionIdentification12"/>
 *         <element name="TxtMsg" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max20KText" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LocalData9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxDesc" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max1000Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}AdditionalData2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction144", propOrder = {
    "admstvTp",
    "othrAdmstvTp",
    "msgRsn",
    "altrnMsgRsn",
    "addtlSvc",
    "assoctdDataInd",
    "assoctdDataRef",
    "assoctdDataDstn",
    "spclPrgrmmQlfctn",
    "txId",
    "txtMsg",
    "lclData",
    "txDesc",
    "addtlData"
})
public class Transaction144 {

    @XmlElement(name = "AdmstvTp", required = true)
    @XmlSchemaType(name = "string")
    protected AdministrativeType1Code admstvTp;
    @XmlElement(name = "OthrAdmstvTp")
    protected String othrAdmstvTp;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "AssoctdDataInd")
    protected Boolean assoctdDataInd;
    @XmlElement(name = "AssoctdDataRef")
    protected String assoctdDataRef;
    @XmlElement(name = "AssoctdDataDstn")
    protected String assoctdDataDstn;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "TxtMsg")
    protected String txtMsg;
    @XmlElement(name = "LclData")
    protected List<LocalData9> lclData;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;

    /**
     * Gets the value of the admstvTp property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeType1Code }
     *     
     */
    public AdministrativeType1Code getAdmstvTp() {
        return admstvTp;
    }

    /**
     * Sets the value of the admstvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeType1Code }
     *     
     */
    public void setAdmstvTp(AdministrativeType1Code value) {
        this.admstvTp = value;
    }

    /**
     * Gets the value of the othrAdmstvTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAdmstvTp() {
        return othrAdmstvTp;
    }

    /**
     * Sets the value of the othrAdmstvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAdmstvTp(String value) {
        this.othrAdmstvTp = value;
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
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalService2 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService2> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the assoctdDataInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssoctdDataInd() {
        return assoctdDataInd;
    }

    /**
     * Sets the value of the assoctdDataInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssoctdDataInd(Boolean value) {
        this.assoctdDataInd = value;
    }

    /**
     * Gets the value of the assoctdDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssoctdDataRef() {
        return assoctdDataRef;
    }

    /**
     * Sets the value of the assoctdDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssoctdDataRef(String value) {
        this.assoctdDataRef = value;
    }

    /**
     * Gets the value of the assoctdDataDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssoctdDataDstn() {
        return assoctdDataDstn;
    }

    /**
     * Sets the value of the assoctdDataDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssoctdDataDstn(String value) {
        this.assoctdDataDstn = value;
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
     * Gets the value of the txtMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtMsg() {
        return txtMsg;
    }

    /**
     * Sets the value of the txtMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtMsg(String value) {
        this.txtMsg = value;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData9 }
     * 
     * 
     * @return
     *     The value of the lclData property.
     */
    public List<LocalData9> getLclData() {
        if (lclData == null) {
            lclData = new ArrayList<>();
        }
        return this.lclData;
    }

    /**
     * Gets the value of the txDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDesc() {
        return txDesc;
    }

    /**
     * Sets the value of the txDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxDesc(String value) {
        this.txDesc = value;
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
     * {@link AdditionalData2 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
