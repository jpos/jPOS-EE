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

package org.jpos.iso20022.catp_014_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}TransactionIdentifier1"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMTransactionStatus1Code"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Incdnt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}FailureReason7Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IncdntDtl" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}CardAccount8" minOccurs="0"/>
 *         <element name="PrtctdAcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="TtlDpstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}AmountAndCurrency1"/>
 *         <element name="TtlAuthrsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ImpliedCurrencyAndAmount"/>
 *         <element name="TtlReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}DetailedAmount16" minOccurs="0"/>
 *         <element name="AddtlChrg" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}DetailedAmount13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdRct" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RctPrtd" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AuthstnRslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}AuthorisationResult13" minOccurs="0"/>
 *         <element name="DpstdMdia" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMDepositedMedia1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ToBeRcncldMdiaCntrs" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMDepositedMedia3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ATMTtls" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMTotals1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Csstt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMCassette2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction19", propOrder = {
    "txId",
    "txSts",
    "rcncltnId",
    "incdnt",
    "incdntDtl",
    "acctData",
    "prtctdAcctData",
    "ttlDpstdAmt",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "addtlChrg",
    "reqdRct",
    "rctPrtd",
    "authstnRslt",
    "dpstdMdia",
    "toBeRcncldMdiaCntrs",
    "atmTtls",
    "csstt",
    "iccRltdData"
})
public class ATMTransaction19 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "TxSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMTransactionStatus1Code txSts;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected List<FailureReason7Code> incdnt;
    @XmlElement(name = "IncdntDtl")
    protected List<String> incdntDtl;
    @XmlElement(name = "AcctData")
    protected CardAccount8 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlDpstdAmt", required = true)
    protected AmountAndCurrency1 ttlDpstdAmt;
    @XmlElement(name = "TtlAuthrsdAmt", required = true)
    protected BigDecimal ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount16 dtldReqdAmt;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount13> addtlChrg;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "RctPrtd")
    protected Boolean rctPrtd;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult13 authstnRslt;
    @XmlElement(name = "DpstdMdia")
    protected List<ATMDepositedMedia1> dpstdMdia;
    @XmlElement(name = "ToBeRcncldMdiaCntrs")
    protected List<ATMDepositedMedia3> toBeRcncldMdiaCntrs;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals1> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette2> csstt;
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
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public ATMTransactionStatus1Code getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public void setTxSts(ATMTransactionStatus1Code value) {
        this.txSts = value;
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
     * Gets the value of the incdnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incdnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason7Code }
     * 
     * 
     * @return
     *     The value of the incdnt property.
     */
    public List<FailureReason7Code> getIncdnt() {
        if (incdnt == null) {
            incdnt = new ArrayList<>();
        }
        return this.incdnt;
    }

    /**
     * Gets the value of the incdntDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incdntDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdntDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the incdntDtl property.
     */
    public List<String> getIncdntDtl() {
        if (incdntDtl == null) {
            incdntDtl = new ArrayList<>();
        }
        return this.incdntDtl;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount8 }
     *     
     */
    public CardAccount8 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount8 }
     *     
     */
    public void setAcctData(CardAccount8 value) {
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
     * Gets the value of the ttlDpstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlDpstdAmt() {
        return ttlDpstdAmt;
    }

    /**
     * Sets the value of the ttlDpstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public void setTtlDpstdAmt(AmountAndCurrency1 value) {
        this.ttlDpstdAmt = value;
    }

    /**
     * Gets the value of the ttlAuthrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Sets the value of the ttlAuthrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAuthrsdAmt(BigDecimal value) {
        this.ttlAuthrsdAmt = value;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlReqdAmt(BigDecimal value) {
        this.ttlReqdAmt = value;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount16 }
     *     
     */
    public DetailedAmount16 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount16 }
     *     
     */
    public void setDtldReqdAmt(DetailedAmount16 value) {
        this.dtldReqdAmt = value;
    }

    /**
     * Gets the value of the addtlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the addtlChrg property.
     */
    public List<DetailedAmount13> getAddtlChrg() {
        if (addtlChrg == null) {
            addtlChrg = new ArrayList<>();
        }
        return this.addtlChrg;
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
     * Gets the value of the rctPrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctPrtd() {
        return rctPrtd;
    }

    /**
     * Sets the value of the rctPrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRctPrtd(Boolean value) {
        this.rctPrtd = value;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public AuthorisationResult13 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public void setAuthstnRslt(AuthorisationResult13 value) {
        this.authstnRslt = value;
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
     * Gets the value of the toBeRcncldMdiaCntrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the toBeRcncldMdiaCntrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToBeRcncldMdiaCntrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDepositedMedia3 }
     * 
     * 
     * @return
     *     The value of the toBeRcncldMdiaCntrs property.
     */
    public List<ATMDepositedMedia3> getToBeRcncldMdiaCntrs() {
        if (toBeRcncldMdiaCntrs == null) {
            toBeRcncldMdiaCntrs = new ArrayList<>();
        }
        return this.toBeRcncldMdiaCntrs;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the atmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals1 }
     * 
     * 
     * @return
     *     The value of the atmTtls property.
     */
    public List<ATMTotals1> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the csstt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsstt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassette2 }
     * 
     * 
     * @return
     *     The value of the csstt property.
     */
    public List<ATMCassette2> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<>();
        }
        return this.csstt;
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
