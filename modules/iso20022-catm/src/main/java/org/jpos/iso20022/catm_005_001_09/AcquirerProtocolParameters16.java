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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcquirerProtocolParameters16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcquirerProtocolParameters16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="AcqrrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}GenericIdentification176" maxOccurs="unbounded"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max256Text"/>
 *         <element name="ApplId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Hst" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcquirerHostConfiguration9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OnLineTx" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcquirerProtocolExchangeBehavior2" minOccurs="0"/>
 *         <element name="OffLineTx" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcquirerProtocolExchangeBehavior2" minOccurs="0"/>
 *         <element name="RcncltnXchg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ExchangeConfiguration9" minOccurs="0"/>
 *         <element name="RcncltnByAcqrr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TtlsPerCcy" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SpltTtls" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SpltTtlCrit" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ReconciliationCriteria1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CmpltnAdvcMndtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AmtQlfrForRsvatn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TypeOfAmount8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RcncltnErr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardDataVrfctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NtfyOffLineCxl" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BtchTrfCntt" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}BatchTransactionType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FileTrfBtch" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BtchDgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MsgItm" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MessageItemCondition2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtctCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator"/>
 *         <element name="PrvtCardData" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MndtrySctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolParameters16", propOrder = {
    "actnTp",
    "acqrrId",
    "vrsn",
    "applId",
    "hst",
    "onLineTx",
    "offLineTx",
    "rcncltnXchg",
    "rcncltnByAcqrr",
    "ttlsPerCcy",
    "spltTtls",
    "spltTtlCrit",
    "cmpltnAdvcMndtd",
    "amtQlfrForRsvatn",
    "rcncltnErr",
    "cardDataVrfctn",
    "ntfyOffLineCxl",
    "btchTrfCntt",
    "fileTrfBtch",
    "btchDgtlSgntr",
    "msgItm",
    "prtctCardData",
    "prvtCardData",
    "mndtrySctyTrlr"
})
public class AcquirerProtocolParameters16 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "AcqrrId", required = true)
    protected List<GenericIdentification176> acqrrId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "Hst")
    protected List<AcquirerHostConfiguration9> hst;
    @XmlElement(name = "OnLineTx")
    protected AcquirerProtocolExchangeBehavior2 onLineTx;
    @XmlElement(name = "OffLineTx")
    protected AcquirerProtocolExchangeBehavior2 offLineTx;
    @XmlElement(name = "RcncltnXchg")
    protected ExchangeConfiguration9 rcncltnXchg;
    @XmlElement(name = "RcncltnByAcqrr")
    protected Boolean rcncltnByAcqrr;
    @XmlElement(name = "TtlsPerCcy")
    protected Boolean ttlsPerCcy;
    @XmlElement(name = "SpltTtls")
    protected Boolean spltTtls;
    @XmlElement(name = "SpltTtlCrit")
    @XmlSchemaType(name = "string")
    protected List<ReconciliationCriteria1Code> spltTtlCrit;
    @XmlElement(name = "CmpltnAdvcMndtd")
    protected Boolean cmpltnAdvcMndtd;
    @XmlElement(name = "AmtQlfrForRsvatn")
    @XmlSchemaType(name = "string")
    protected List<TypeOfAmount8Code> amtQlfrForRsvatn;
    @XmlElement(name = "RcncltnErr")
    protected Boolean rcncltnErr;
    @XmlElement(name = "CardDataVrfctn")
    protected Boolean cardDataVrfctn;
    @XmlElement(name = "NtfyOffLineCxl")
    protected Boolean ntfyOffLineCxl;
    @XmlElement(name = "BtchTrfCntt")
    @XmlSchemaType(name = "string")
    protected List<BatchTransactionType1Code> btchTrfCntt;
    @XmlElement(name = "FileTrfBtch")
    protected Boolean fileTrfBtch;
    @XmlElement(name = "BtchDgtlSgntr")
    protected Boolean btchDgtlSgntr;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition2> msgItm;
    @XmlElement(name = "PrtctCardData")
    protected boolean prtctCardData;
    @XmlElement(name = "PrvtCardData")
    protected Boolean prvtCardData;
    @XmlElement(name = "MndtrySctyTrlr")
    protected Boolean mndtrySctyTrlr;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acqrrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification176 }
     * 
     * 
     * @return
     *     The value of the acqrrId property.
     */
    public List<GenericIdentification176> getAcqrrId() {
        if (acqrrId == null) {
            acqrrId = new ArrayList<>();
        }
        return this.acqrrId;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerHostConfiguration9 }
     * 
     * 
     * @return
     *     The value of the hst property.
     */
    public List<AcquirerHostConfiguration9> getHst() {
        if (hst == null) {
            hst = new ArrayList<>();
        }
        return this.hst;
    }

    /**
     * Gets the value of the onLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolExchangeBehavior2 }
     *     
     */
    public AcquirerProtocolExchangeBehavior2 getOnLineTx() {
        return onLineTx;
    }

    /**
     * Sets the value of the onLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolExchangeBehavior2 }
     *     
     */
    public void setOnLineTx(AcquirerProtocolExchangeBehavior2 value) {
        this.onLineTx = value;
    }

    /**
     * Gets the value of the offLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolExchangeBehavior2 }
     *     
     */
    public AcquirerProtocolExchangeBehavior2 getOffLineTx() {
        return offLineTx;
    }

    /**
     * Sets the value of the offLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolExchangeBehavior2 }
     *     
     */
    public void setOffLineTx(AcquirerProtocolExchangeBehavior2 value) {
        this.offLineTx = value;
    }

    /**
     * Gets the value of the rcncltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration9 }
     *     
     */
    public ExchangeConfiguration9 getRcncltnXchg() {
        return rcncltnXchg;
    }

    /**
     * Sets the value of the rcncltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration9 }
     *     
     */
    public void setRcncltnXchg(ExchangeConfiguration9 value) {
        this.rcncltnXchg = value;
    }

    /**
     * Gets the value of the rcncltnByAcqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnByAcqrr() {
        return rcncltnByAcqrr;
    }

    /**
     * Sets the value of the rcncltnByAcqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcncltnByAcqrr(Boolean value) {
        this.rcncltnByAcqrr = value;
    }

    /**
     * Gets the value of the ttlsPerCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlsPerCcy() {
        return ttlsPerCcy;
    }

    /**
     * Sets the value of the ttlsPerCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTtlsPerCcy(Boolean value) {
        this.ttlsPerCcy = value;
    }

    /**
     * Gets the value of the spltTtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltTtls() {
        return spltTtls;
    }

    /**
     * Sets the value of the spltTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpltTtls(Boolean value) {
        this.spltTtls = value;
    }

    /**
     * Gets the value of the spltTtlCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spltTtlCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpltTtlCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationCriteria1Code }
     * 
     * 
     * @return
     *     The value of the spltTtlCrit property.
     */
    public List<ReconciliationCriteria1Code> getSpltTtlCrit() {
        if (spltTtlCrit == null) {
            spltTtlCrit = new ArrayList<>();
        }
        return this.spltTtlCrit;
    }

    /**
     * Gets the value of the cmpltnAdvcMndtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmpltnAdvcMndtd() {
        return cmpltnAdvcMndtd;
    }

    /**
     * Sets the value of the cmpltnAdvcMndtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmpltnAdvcMndtd(Boolean value) {
        this.cmpltnAdvcMndtd = value;
    }

    /**
     * Gets the value of the amtQlfrForRsvatn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtQlfrForRsvatn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtQlfrForRsvatn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfAmount8Code }
     * 
     * 
     * @return
     *     The value of the amtQlfrForRsvatn property.
     */
    public List<TypeOfAmount8Code> getAmtQlfrForRsvatn() {
        if (amtQlfrForRsvatn == null) {
            amtQlfrForRsvatn = new ArrayList<>();
        }
        return this.amtQlfrForRsvatn;
    }

    /**
     * Gets the value of the rcncltnErr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnErr() {
        return rcncltnErr;
    }

    /**
     * Sets the value of the rcncltnErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcncltnErr(Boolean value) {
        this.rcncltnErr = value;
    }

    /**
     * Gets the value of the cardDataVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardDataVrfctn() {
        return cardDataVrfctn;
    }

    /**
     * Sets the value of the cardDataVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardDataVrfctn(Boolean value) {
        this.cardDataVrfctn = value;
    }

    /**
     * Gets the value of the ntfyOffLineCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfyOffLineCxl() {
        return ntfyOffLineCxl;
    }

    /**
     * Sets the value of the ntfyOffLineCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtfyOffLineCxl(Boolean value) {
        this.ntfyOffLineCxl = value;
    }

    /**
     * Gets the value of the btchTrfCntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the btchTrfCntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchTrfCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchTransactionType1Code }
     * 
     * 
     * @return
     *     The value of the btchTrfCntt property.
     */
    public List<BatchTransactionType1Code> getBtchTrfCntt() {
        if (btchTrfCntt == null) {
            btchTrfCntt = new ArrayList<>();
        }
        return this.btchTrfCntt;
    }

    /**
     * Gets the value of the fileTrfBtch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileTrfBtch() {
        return fileTrfBtch;
    }

    /**
     * Sets the value of the fileTrfBtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileTrfBtch(Boolean value) {
        this.fileTrfBtch = value;
    }

    /**
     * Gets the value of the btchDgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchDgtlSgntr() {
        return btchDgtlSgntr;
    }

    /**
     * Sets the value of the btchDgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBtchDgtlSgntr(Boolean value) {
        this.btchDgtlSgntr = value;
    }

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageItemCondition2 }
     * 
     * 
     * @return
     *     The value of the msgItm property.
     */
    public List<MessageItemCondition2> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<>();
        }
        return this.msgItm;
    }

    /**
     * Gets the value of the prtctCardData property.
     * 
     */
    public boolean isPrtctCardData() {
        return prtctCardData;
    }

    /**
     * Sets the value of the prtctCardData property.
     * 
     */
    public void setPrtctCardData(boolean value) {
        this.prtctCardData = value;
    }

    /**
     * Gets the value of the prvtCardData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvtCardData() {
        return prvtCardData;
    }

    /**
     * Sets the value of the prvtCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrvtCardData(Boolean value) {
        this.prvtCardData = value;
    }

    /**
     * Gets the value of the mndtrySctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMndtrySctyTrlr() {
        return mndtrySctyTrlr;
    }

    /**
     * Sets the value of the mndtrySctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMndtrySctyTrlr(Boolean value) {
        this.mndtrySctyTrlr = value;
    }

}
