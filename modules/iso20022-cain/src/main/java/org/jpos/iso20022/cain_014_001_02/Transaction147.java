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

package org.jpos.iso20022.cain_014_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction147 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction147">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ISO8583TransactionTypeCode" minOccurs="0"/>
 *         <element name="TxSubTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TxAttr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}TransactionAttribute2Code" minOccurs="0"/>
 *         <element name="OthrTxAttr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PreAuthstnTmLmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max6NumericText" minOccurs="0"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalService2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssoctdDataRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max70Text" minOccurs="0"/>
 *         <element name="SpclPrgrmmQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}SpecialProgrammeQualification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}TransactionIdentification18" minOccurs="0"/>
 *         <element name="DsptData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}DisputeData3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}TransactionAmounts2" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalAmounts3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlAddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DpstDtls" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}DepositDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FndsSvcs" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}FundingService2" minOccurs="0"/>
 *         <element name="AcctFr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AccountDetails3" minOccurs="0"/>
 *         <element name="AcctTo" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AccountDetails3" minOccurs="0"/>
 *         <element name="TxDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max1000Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction147", propOrder = {
    "txTp",
    "txSubTp",
    "txAttr",
    "othrTxAttr",
    "msgRsn",
    "altrnMsgRsn",
    "preAuthstnTmLmt",
    "addtlSvc",
    "assoctdDataRef",
    "spclPrgrmmQlfctn",
    "txId",
    "dsptData",
    "txAmts",
    "addtlAmt",
    "addtlFee",
    "orgnlAddtlFee",
    "dpstDtls",
    "fndsSvcs",
    "acctFr",
    "acctTo",
    "txDesc",
    "addtlData"
})
public class Transaction147 {

    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "TxAttr")
    @XmlSchemaType(name = "string")
    protected TransactionAttribute2Code txAttr;
    @XmlElement(name = "OthrTxAttr")
    protected String othrTxAttr;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "PreAuthstnTmLmt")
    protected String preAuthstnTmLmt;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "AssoctdDataRef")
    protected String assoctdDataRef;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId")
    protected TransactionIdentification18 txId;
    @XmlElement(name = "DsptData")
    protected List<DisputeData3> dsptData;
    @XmlElement(name = "TxAmts")
    protected TransactionAmounts2 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "OrgnlAddtlFee")
    protected List<AdditionalFee2> orgnlAddtlFee;
    @XmlElement(name = "DpstDtls")
    protected List<DepositDetails2> dpstDtls;
    @XmlElement(name = "FndsSvcs")
    protected FundingService2 fndsSvcs;
    @XmlElement(name = "AcctFr")
    protected AccountDetails3 acctFr;
    @XmlElement(name = "AcctTo")
    protected AccountDetails3 acctTo;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
     * Gets the value of the txAttr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAttribute2Code }
     *     
     */
    public TransactionAttribute2Code getTxAttr() {
        return txAttr;
    }

    /**
     * Sets the value of the txAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAttribute2Code }
     *     
     */
    public void setTxAttr(TransactionAttribute2Code value) {
        this.txAttr = value;
    }

    /**
     * Gets the value of the othrTxAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTxAttr() {
        return othrTxAttr;
    }

    /**
     * Sets the value of the othrTxAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTxAttr(String value) {
        this.othrTxAttr = value;
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
     * Gets the value of the preAuthstnTmLmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAuthstnTmLmt() {
        return preAuthstnTmLmt;
    }

    /**
     * Sets the value of the preAuthstnTmLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAuthstnTmLmt(String value) {
        this.preAuthstnTmLmt = value;
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
     *     {@link TransactionIdentification18 }
     *     
     */
    public TransactionIdentification18 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification18 }
     *     
     */
    public void setTxId(TransactionIdentification18 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the dsptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeData3 }
     * 
     * 
     * @return
     *     The value of the dsptData property.
     */
    public List<DisputeData3> getDsptData() {
        if (dsptData == null) {
            dsptData = new ArrayList<>();
        }
        return this.dsptData;
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
     * Gets the value of the orgnlAddtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlAddtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     * @return
     *     The value of the orgnlAddtlFee property.
     */
    public List<AdditionalFee2> getOrgnlAddtlFee() {
        if (orgnlAddtlFee == null) {
            orgnlAddtlFee = new ArrayList<>();
        }
        return this.orgnlAddtlFee;
    }

    /**
     * Gets the value of the dpstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositDetails2 }
     * 
     * 
     * @return
     *     The value of the dpstDtls property.
     */
    public List<DepositDetails2> getDpstDtls() {
        if (dpstDtls == null) {
            dpstDtls = new ArrayList<>();
        }
        return this.dpstDtls;
    }

    /**
     * Gets the value of the fndsSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link FundingService2 }
     *     
     */
    public FundingService2 getFndsSvcs() {
        return fndsSvcs;
    }

    /**
     * Sets the value of the fndsSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingService2 }
     *     
     */
    public void setFndsSvcs(FundingService2 value) {
        this.fndsSvcs = value;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails3 }
     *     
     */
    public AccountDetails3 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails3 }
     *     
     */
    public void setAcctFr(AccountDetails3 value) {
        this.acctFr = value;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails3 }
     *     
     */
    public AccountDetails3 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails3 }
     *     
     */
    public void setAcctTo(AccountDetails3 value) {
        this.acctTo = value;
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
