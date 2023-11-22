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

package org.jpos.iso20022.cain_027_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionContext9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionContext9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}ISO18245MerchantCategoryCode" minOccurs="0"/>
 *         <element name="MrchntCtgySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DfrrdDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrtlShipmntInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DelydChrgsInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReauthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReSubmissnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxInitr" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TransactionInitiator1Code" minOccurs="0"/>
 *         <element name="AuthntcnOutgInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmm" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}CardProgramme2" minOccurs="0"/>
 *         <element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Jurisdiction2" minOccurs="0"/>
 *         <element name="SttlmSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}SettlementService3" minOccurs="0"/>
 *         <element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Reconciliation3" minOccurs="0"/>
 *         <element name="CaptrDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}ISODate" minOccurs="0"/>
 *         <element name="DtAntcptd" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}ISODate" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext9", propOrder = {
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
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
    "captrDt",
    "dtAntcptd",
    "addtlData"
})
public class TransactionContext9 {

    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
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
