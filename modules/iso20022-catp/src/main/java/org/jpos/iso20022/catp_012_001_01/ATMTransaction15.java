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

package org.jpos.iso20022.catp_012_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}CardAccount9" minOccurs="0"/>
 *         <element name="PrtctdAcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}AmountAndCurrency1" minOccurs="0"/>
 *         <element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}DetailedAmount16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DpstdMdia" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ATMDepositedMedia1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdRct" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction15", propOrder = {
    "txId",
    "rcncltnId",
    "acctData",
    "prtctdAcctData",
    "ttlAmt",
    "dtldReqdAmt",
    "dpstdMdia",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction15 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount9 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlAmt")
    protected AmountAndCurrency1 ttlAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected List<DetailedAmount16> dtldReqdAmt;
    @XmlElement(name = "DpstdMdia")
    protected List<ATMDepositedMedia1> dpstdMdia;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcncltnId(String value) {
        this.rcncltnId = value;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount9 }
     *     
     */
    public CardAccount9 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount9 }
     *     
     */
    public void setAcctData(CardAccount9 value) {
        this.acctData = value;
    }

    /**
     * Gets the value of the prtctdAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctData() {
        return prtctdAcctData;
    }

    /**
     * Sets the value of the prtctdAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public void setTtlAmt(AmountAndCurrency1 value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldReqdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldReqdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount16 }
     * 
     * 
     * @return
     *     The value of the dtldReqdAmt property.
     */
    public List<DetailedAmount16> getDtldReqdAmt() {
        if (dtldReqdAmt == null) {
            dtldReqdAmt = new ArrayList<>();
        }
        return this.dtldReqdAmt;
    }

    /**
     * Gets the value of the dpstdMdia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstdMdia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstdMdia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDepositedMedia1 }
     * 
     * 
     * @return
     *     The value of the dpstdMdia property.
     */
    public List<ATMDepositedMedia1> getDpstdMdia() {
        if (dpstdMdia == null) {
            dpstdMdia = new ArrayList<>();
        }
        return this.dpstdMdia;
    }

    /**
     * Gets the value of the reqdRct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdRct() {
        return reqdRct;
    }

    /**
     * Sets the value of the reqdRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqdRct(Boolean value) {
        this.reqdRct = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

}
