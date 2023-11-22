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

package org.jpos.iso20022.catp_002_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CmpltnReqrd" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}CardAccount8" minOccurs="0"/>
 *         <element name="PrtctdAcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ContentInformationType10" minOccurs="0"/>
 *         <element name="TtlAuthrsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}AmountAndCurrency1"/>
 *         <element name="TtlReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}DetailedAmount12" minOccurs="0"/>
 *         <element name="CcyConvsElgblty" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}CurrencyConversion9" minOccurs="0"/>
 *         <element name="AddtlChrg" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}DetailedAmount13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Lmts" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ATMTransactionAmounts6" minOccurs="0"/>
 *         <element name="MixTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Mix" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ATMMediaMix1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AuthstnRslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}AuthorisationResult13"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Max10000Binary" minOccurs="0"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction14", propOrder = {
    "txId",
    "rcncltnId",
    "cmpltnReqrd",
    "acctData",
    "prtctdAcctData",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "ccyConvsElgblty",
    "addtlChrg",
    "lmts",
    "mixTp",
    "mix",
    "authstnRslt",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction14 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CmpltnReqrd")
    protected Boolean cmpltnReqrd;
    @XmlElement(name = "AcctData")
    protected CardAccount8 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlAuthrsdAmt", required = true)
    protected AmountAndCurrency1 ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount12 dtldReqdAmt;
    @XmlElement(name = "CcyConvsElgblty")
    protected CurrencyConversion9 ccyConvsElgblty;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount13> addtlChrg;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts6 lmts;
    @XmlElement(name = "MixTp")
    protected String mixTp;
    @XmlElement(name = "Mix")
    protected List<ATMMediaMix1> mix;
    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult13 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

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
     * Gets the value of the cmpltnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmpltnReqrd() {
        return cmpltnReqrd;
    }

    /**
     * Sets the value of the cmpltnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmpltnReqrd(Boolean value) {
        this.cmpltnReqrd = value;
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
     * Gets the value of the ttlAuthrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Sets the value of the ttlAuthrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public void setTtlAuthrsdAmt(AmountAndCurrency1 value) {
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
     *     {@link DetailedAmount12 }
     *     
     */
    public DetailedAmount12 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount12 }
     *     
     */
    public void setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
    }

    /**
     * Gets the value of the ccyConvsElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public CurrencyConversion9 getCcyConvsElgblty() {
        return ccyConvsElgblty;
    }

    /**
     * Sets the value of the ccyConvsElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public void setCcyConvsElgblty(CurrencyConversion9 value) {
        this.ccyConvsElgblty = value;
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
     * Gets the value of the lmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransactionAmounts6 getLmts() {
        return lmts;
    }

    /**
     * Sets the value of the lmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public void setLmts(ATMTransactionAmounts6 value) {
        this.lmts = value;
    }

    /**
     * Gets the value of the mixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixTp() {
        return mixTp;
    }

    /**
     * Sets the value of the mixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMixTp(String value) {
        this.mixTp = value;
    }

    /**
     * Gets the value of the mix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix1 }
     * 
     * 
     * @return
     *     The value of the mix property.
     */
    public List<ATMMediaMix1> getMix() {
        if (mix == null) {
            mix = new ArrayList<>();
        }
        return this.mix;
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

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
    }

}
