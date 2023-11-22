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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionContext7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionContext7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISO18245MerchantCategoryCode"/>
 *         <element name="MrchntCtgySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CstmrCnsnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PINPadInprtv" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PINNtryBpssInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ICCFllbckInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ICCFllbckRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ICCFallbackReason1Code" minOccurs="0"/>
 *         <element name="OthrICCFllbckRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="MgntcStrpFllbckInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="LatePresntmntInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="FnlAuthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DfrrdDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrtlShipmntInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DelydChrgsInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReauthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReSubmissnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxInitr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TransactionInitiator1Code" minOccurs="0"/>
 *         <element name="AuthntcnOutgInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}CardProgramme2" minOccurs="0"/>
 *         <element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Jurisdiction2" minOccurs="0"/>
 *         <element name="SttlmSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}SettlementService3" minOccurs="0"/>
 *         <element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Reconciliation3" minOccurs="0"/>
 *         <element name="XchgRateInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ExchangeRateInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CaptrDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISODate" minOccurs="0"/>
 *         <element name="DtAntcptd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISODate" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext7", propOrder = {
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "cstmrCnsnt",
    "pinPadInprtv",
    "pinNtryBpssInd",
    "iccFllbckInd",
    "iccFllbckRsnCd",
    "othrICCFllbckRsnCd",
    "mgntcStrpFllbckInd",
    "latePresntmntInd",
    "fnlAuthstnInd",
    "dfrrdDlvryInd",
    "prtlShipmntInd",
    "delydChrgsInd",
    "noShowInd",
    "reauthstnInd",
    "reSubmissnInd",
    "txInitr",
    "authntcnOutgInd",
    "cardPrgrmm",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "xchgRateInf",
    "captrDt",
    "dtAntcptd",
    "addtlData"
})
public class TransactionContext7 {

    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
    @XmlElement(name = "PINPadInprtv")
    protected Boolean pinPadInprtv;
    @XmlElement(name = "PINNtryBpssInd")
    protected Boolean pinNtryBpssInd;
    @XmlElement(name = "ICCFllbckInd")
    protected Boolean iccFllbckInd;
    @XmlElement(name = "ICCFllbckRsnCd")
    @XmlSchemaType(name = "string")
    protected ICCFallbackReason1Code iccFllbckRsnCd;
    @XmlElement(name = "OthrICCFllbckRsnCd")
    protected String othrICCFllbckRsnCd;
    @XmlElement(name = "MgntcStrpFllbckInd")
    protected Boolean mgntcStrpFllbckInd;
    @XmlElement(name = "LatePresntmntInd")
    protected Boolean latePresntmntInd;
    @XmlElement(name = "FnlAuthstnInd")
    protected Boolean fnlAuthstnInd;
    @XmlElement(name = "DfrrdDlvryInd")
    protected Boolean dfrrdDlvryInd;
    @XmlElement(name = "PrtlShipmntInd")
    protected Boolean prtlShipmntInd;
    @XmlElement(name = "DelydChrgsInd")
    protected Boolean delydChrgsInd;
    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "ReauthstnInd")
    protected Boolean reauthstnInd;
    @XmlElement(name = "ReSubmissnInd")
    protected Boolean reSubmissnInd;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "AuthntcnOutgInd")
    protected Boolean authntcnOutgInd;
    @XmlElement(name = "CardPrgrmm")
    protected CardProgramme2 cardPrgrmm;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService3 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "XchgRateInf")
    protected List<ExchangeRateInformation2> xchgRateInf;
    @XmlElement(name = "CaptrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar captrDt;
    @XmlElement(name = "DtAntcptd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtAntcptd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
    }

    /**
     * Gets the value of the mrchntCtgySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgySpcfcData() {
        return mrchntCtgySpcfcData;
    }

    /**
     * Sets the value of the mrchntCtgySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgySpcfcData(String value) {
        this.mrchntCtgySpcfcData = value;
    }

    /**
     * Gets the value of the cstmrCnsnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrCnsnt() {
        return cstmrCnsnt;
    }

    /**
     * Sets the value of the cstmrCnsnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstmrCnsnt(Boolean value) {
        this.cstmrCnsnt = value;
    }

    /**
     * Gets the value of the pinPadInprtv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINPadInprtv() {
        return pinPadInprtv;
    }

    /**
     * Sets the value of the pinPadInprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINPadInprtv(Boolean value) {
        this.pinPadInprtv = value;
    }

    /**
     * Gets the value of the pinNtryBpssInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINNtryBpssInd() {
        return pinNtryBpssInd;
    }

    /**
     * Sets the value of the pinNtryBpssInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINNtryBpssInd(Boolean value) {
        this.pinNtryBpssInd = value;
    }

    /**
     * Gets the value of the iccFllbckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICCFllbckInd() {
        return iccFllbckInd;
    }

    /**
     * Sets the value of the iccFllbckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setICCFllbckInd(Boolean value) {
        this.iccFllbckInd = value;
    }

    /**
     * Gets the value of the iccFllbckRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link ICCFallbackReason1Code }
     *     
     */
    public ICCFallbackReason1Code getICCFllbckRsnCd() {
        return iccFllbckRsnCd;
    }

    /**
     * Sets the value of the iccFllbckRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCFallbackReason1Code }
     *     
     */
    public void setICCFllbckRsnCd(ICCFallbackReason1Code value) {
        this.iccFllbckRsnCd = value;
    }

    /**
     * Gets the value of the othrICCFllbckRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrICCFllbckRsnCd() {
        return othrICCFllbckRsnCd;
    }

    /**
     * Sets the value of the othrICCFllbckRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrICCFllbckRsnCd(String value) {
        this.othrICCFllbckRsnCd = value;
    }

    /**
     * Gets the value of the mgntcStrpFllbckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMgntcStrpFllbckInd() {
        return mgntcStrpFllbckInd;
    }

    /**
     * Sets the value of the mgntcStrpFllbckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMgntcStrpFllbckInd(Boolean value) {
        this.mgntcStrpFllbckInd = value;
    }

    /**
     * Gets the value of the latePresntmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatePresntmntInd() {
        return latePresntmntInd;
    }

    /**
     * Sets the value of the latePresntmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatePresntmntInd(Boolean value) {
        this.latePresntmntInd = value;
    }

    /**
     * Gets the value of the fnlAuthstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlAuthstnInd() {
        return fnlAuthstnInd;
    }

    /**
     * Sets the value of the fnlAuthstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFnlAuthstnInd(Boolean value) {
        this.fnlAuthstnInd = value;
    }

    /**
     * Gets the value of the dfrrdDlvryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdDlvryInd() {
        return dfrrdDlvryInd;
    }

    /**
     * Sets the value of the dfrrdDlvryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfrrdDlvryInd(Boolean value) {
        this.dfrrdDlvryInd = value;
    }

    /**
     * Gets the value of the prtlShipmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlShipmntInd() {
        return prtlShipmntInd;
    }

    /**
     * Sets the value of the prtlShipmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlShipmntInd(Boolean value) {
        this.prtlShipmntInd = value;
    }

    /**
     * Gets the value of the delydChrgsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydChrgsInd() {
        return delydChrgsInd;
    }

    /**
     * Sets the value of the delydChrgsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelydChrgsInd(Boolean value) {
        this.delydChrgsInd = value;
    }

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShowInd(Boolean value) {
        this.noShowInd = value;
    }

    /**
     * Gets the value of the reauthstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReauthstnInd() {
        return reauthstnInd;
    }

    /**
     * Sets the value of the reauthstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReauthstnInd(Boolean value) {
        this.reauthstnInd = value;
    }

    /**
     * Gets the value of the reSubmissnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReSubmissnInd() {
        return reSubmissnInd;
    }

    /**
     * Sets the value of the reSubmissnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReSubmissnInd(Boolean value) {
        this.reSubmissnInd = value;
    }

    /**
     * Gets the value of the txInitr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public TransactionInitiator1Code getTxInitr() {
        return txInitr;
    }

    /**
     * Sets the value of the txInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public void setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
    }

    /**
     * Gets the value of the authntcnOutgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthntcnOutgInd() {
        return authntcnOutgInd;
    }

    /**
     * Sets the value of the authntcnOutgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthntcnOutgInd(Boolean value) {
        this.authntcnOutgInd = value;
    }

    /**
     * Gets the value of the cardPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgramme2 }
     *     
     */
    public CardProgramme2 getCardPrgrmm() {
        return cardPrgrmm;
    }

    /**
     * Sets the value of the cardPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgramme2 }
     *     
     */
    public void setCardPrgrmm(CardProgramme2 value) {
        this.cardPrgrmm = value;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Sets the value of the jursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public void setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService3 }
     *     
     */
    public SettlementService3 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService3 }
     *     
     */
    public void setSttlmSvc(SettlementService3 value) {
        this.sttlmSvc = value;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public void setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgRateInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgRateInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateInformation2 }
     * 
     * 
     * @return
     *     The value of the xchgRateInf property.
     */
    public List<ExchangeRateInformation2> getXchgRateInf() {
        if (xchgRateInf == null) {
            xchgRateInf = new ArrayList<>();
        }
        return this.xchgRateInf;
    }

    /**
     * Gets the value of the captrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaptrDt() {
        return captrDt;
    }

    /**
     * Sets the value of the captrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaptrDt(XMLGregorianCalendar value) {
        this.captrDt = value;
    }

    /**
     * Gets the value of the dtAntcptd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAntcptd() {
        return dtAntcptd;
    }

    /**
     * Sets the value of the dtAntcptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAntcptd(XMLGregorianCalendar value) {
        this.dtAntcptd = value;
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
