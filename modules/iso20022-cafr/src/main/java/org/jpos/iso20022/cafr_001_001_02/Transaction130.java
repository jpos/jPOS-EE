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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction130 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction130">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrdTxId" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max70Text"/>
 *         <element name="RptdFrd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ReportedFraud3"/>
 *         <element name="FrdlntTxData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}FraudulentTransactionData2"/>
 *         <element name="CardNotRcvdDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}CardNotReceivedDetails2" minOccurs="0"/>
 *         <element name="CrdhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}CardholderName3" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AdditionalInformation22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}LocalData6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction130", propOrder = {
    "frdTxId",
    "rptdFrd",
    "frdlntTxData",
    "cardNotRcvdDtls",
    "crdhldrNm",
    "addtlFee",
    "addtlInf",
    "addtlData",
    "lclData"
})
public class Transaction130 {

    @XmlElement(name = "FrdTxId", required = true)
    protected String frdTxId;
    @XmlElement(name = "RptdFrd", required = true)
    protected ReportedFraud3 rptdFrd;
    @XmlElement(name = "FrdlntTxData", required = true)
    protected FraudulentTransactionData2 frdlntTxData;
    @XmlElement(name = "CardNotRcvdDtls")
    protected CardNotReceivedDetails2 cardNotRcvdDtls;
    @XmlElement(name = "CrdhldrNm")
    protected CardholderName3 crdhldrNm;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation22> addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData6 lclData;

    /**
     * Gets the value of the frdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdTxId() {
        return frdTxId;
    }

    /**
     * Sets the value of the frdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrdTxId(String value) {
        this.frdTxId = value;
    }

    /**
     * Gets the value of the rptdFrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedFraud3 }
     *     
     */
    public ReportedFraud3 getRptdFrd() {
        return rptdFrd;
    }

    /**
     * Sets the value of the rptdFrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedFraud3 }
     *     
     */
    public void setRptdFrd(ReportedFraud3 value) {
        this.rptdFrd = value;
    }

    /**
     * Gets the value of the frdlntTxData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudulentTransactionData2 }
     *     
     */
    public FraudulentTransactionData2 getFrdlntTxData() {
        return frdlntTxData;
    }

    /**
     * Sets the value of the frdlntTxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudulentTransactionData2 }
     *     
     */
    public void setFrdlntTxData(FraudulentTransactionData2 value) {
        this.frdlntTxData = value;
    }

    /**
     * Gets the value of the cardNotRcvdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardNotReceivedDetails2 }
     *     
     */
    public CardNotReceivedDetails2 getCardNotRcvdDtls() {
        return cardNotRcvdDtls;
    }

    /**
     * Sets the value of the cardNotRcvdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNotReceivedDetails2 }
     *     
     */
    public void setCardNotRcvdDtls(CardNotReceivedDetails2 value) {
        this.cardNotRcvdDtls = value;
    }

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setCrdhldrNm(CardholderName3 value) {
        this.crdhldrNm = value;
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
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation22 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation22> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData6 }
     *     
     */
    public LocalData6 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData6 }
     *     
     */
    public void setLclData(LocalData6 value) {
        this.lclData = value;
    }

}
