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

package org.jpos.iso20022.cain_024_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionContext8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionContext8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}ISO18245MerchantCategoryCode" minOccurs="0"/>
 *         <element name="MrchntCtgySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FeeColltnInitr" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}FeeCollectionInitiator1Code" minOccurs="0"/>
 *         <element name="TxInitr" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TransactionInitiator1Code" minOccurs="0"/>
 *         <element name="PrtlShipmntInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DelydChrgsInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReauthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReSubmissnInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}CardProgrammeMode3" minOccurs="0"/>
 *         <element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Jurisdiction2" minOccurs="0"/>
 *         <element name="SttlmSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}SettlementService4" minOccurs="0"/>
 *         <element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Reconciliation3" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext8", propOrder = {
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "feeColltnInitr",
    "txInitr",
    "prtlShipmntInd",
    "delydChrgsInd",
    "noShowInd",
    "reauthstnInd",
    "reSubmissnInd",
    "cardPrgrmmApld",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "addtlData"
})
public class TransactionContext8 {

    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "FeeColltnInitr")
    @XmlSchemaType(name = "string")
    protected FeeCollectionInitiator1Code feeColltnInitr;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
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
    @XmlElement(name = "CardPrgrmmApld")
    protected CardProgrammeMode3 cardPrgrmmApld;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService4 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
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
     * Gets the value of the feeColltnInitr property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionInitiator1Code }
     *     
     */
    public FeeCollectionInitiator1Code getFeeColltnInitr() {
        return feeColltnInitr;
    }

    /**
     * Sets the value of the feeColltnInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionInitiator1Code }
     *     
     */
    public void setFeeColltnInitr(FeeCollectionInitiator1Code value) {
        this.feeColltnInitr = value;
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
     * Gets the value of the cardPrgrmmApld property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public CardProgrammeMode3 getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Sets the value of the cardPrgrmmApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public void setCardPrgrmmApld(CardProgrammeMode3 value) {
        this.cardPrgrmmApld = value;
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
     *     {@link SettlementService4 }
     *     
     */
    public SettlementService4 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService4 }
     *     
     */
    public void setSttlmSvc(SettlementService4 value) {
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
