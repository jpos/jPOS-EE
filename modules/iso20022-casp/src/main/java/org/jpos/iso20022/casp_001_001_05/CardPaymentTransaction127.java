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

package org.jpos.iso20022.casp_001_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransaction127 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransaction127">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxCaptr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentServiceType5Code"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentServiceType9Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcAttr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentServiceType14Code" minOccurs="0"/>
 *         <element name="LastTxFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Min3Max4Text" minOccurs="0"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionIdentifier1"/>
 *         <element name="OrgnlTx" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentTransaction126" minOccurs="0"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="IssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max140Text" minOccurs="0"/>
 *         <element name="IssrCITId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max140Text" minOccurs="0"/>
 *         <element name="MrchntCITId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max140Text" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentTransactionDetails52"/>
 *         <element name="AuthstnRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}AuthorisationResult18" minOccurs="0"/>
 *         <element name="MrchntRefData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CustomerOrder1" minOccurs="0"/>
 *         <element name="CstmrTkn" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentToken5" minOccurs="0"/>
 *         <element name="CstmrCnsnt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmmPropsd" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SaleToPOIData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SaleToAcqrrData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SaleToIssrData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" minOccurs="0"/>
 *         <element name="AddtlTxData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction127", propOrder = {
    "txCaptr",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "lastTxFlg",
    "mrchntCtgyCd",
    "saleRefId",
    "txId",
    "orgnlTx",
    "rcncltnId",
    "issrRefData",
    "issrCITId",
    "mrchntCITId",
    "txDtls",
    "authstnRslt",
    "mrchntRefData",
    "cstmrOrdr",
    "cstmrTkn",
    "cstmrCnsnt",
    "cardPrgrmmPropsd",
    "cardPrgrmmApld",
    "saleToPOIData",
    "saleToAcqrrData",
    "saleToIssrData",
    "addtlTxData"
})
public class CardPaymentTransaction127 {

    @XmlElement(name = "TxCaptr")
    protected Boolean txCaptr;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType5Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType14Code svcAttr;
    @XmlElement(name = "LastTxFlg")
    protected Boolean lastTxFlg;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "OrgnlTx")
    protected CardPaymentTransaction126 orgnlTx;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "IssrCITId")
    protected String issrCITId;
    @XmlElement(name = "MrchntCITId")
    protected String mrchntCITId;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails52 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult18 authstnRslt;
    @XmlElement(name = "MrchntRefData")
    protected String mrchntRefData;
    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;
    @XmlElement(name = "CstmrTkn")
    protected CardPaymentToken5 cstmrTkn;
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
    @XmlElement(name = "CardPrgrmmPropsd")
    protected List<String> cardPrgrmmPropsd;
    @XmlElement(name = "CardPrgrmmApld")
    protected String cardPrgrmmApld;
    @XmlElement(name = "SaleToPOIData")
    protected String saleToPOIData;
    @XmlElement(name = "SaleToAcqrrData")
    protected String saleToAcqrrData;
    @XmlElement(name = "SaleToIssrData")
    protected String saleToIssrData;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

    /**
     * Gets the value of the txCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxCaptr() {
        return txCaptr;
    }

    /**
     * Sets the value of the txCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxCaptr(Boolean value) {
        this.txCaptr = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType5Code }
     *     
     */
    public CardPaymentServiceType5Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType5Code }
     *     
     */
    public void setTxTp(CardPaymentServiceType5Code value) {
        this.txTp = value;
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
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CardPaymentServiceType14Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public void setSvcAttr(CardPaymentServiceType14Code value) {
        this.svcAttr = value;
    }

    /**
     * Gets the value of the lastTxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTxFlg() {
        return lastTxFlg;
    }

    /**
     * Sets the value of the lastTxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastTxFlg(Boolean value) {
        this.lastTxFlg = value;
    }

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
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

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
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction126 }
     *     
     */
    public CardPaymentTransaction126 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction126 }
     *     
     */
    public void setOrgnlTx(CardPaymentTransaction126 value) {
        this.orgnlTx = value;
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
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrRefData(String value) {
        this.issrRefData = value;
    }

    /**
     * Gets the value of the issrCITId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCITId() {
        return issrCITId;
    }

    /**
     * Sets the value of the issrCITId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrCITId(String value) {
        this.issrCITId = value;
    }

    /**
     * Gets the value of the mrchntCITId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCITId() {
        return mrchntCITId;
    }

    /**
     * Sets the value of the mrchntCITId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCITId(String value) {
        this.mrchntCITId = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails52 }
     *     
     */
    public CardPaymentTransactionDetails52 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails52 }
     *     
     */
    public void setTxDtls(CardPaymentTransactionDetails52 value) {
        this.txDtls = value;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult18 }
     *     
     */
    public AuthorisationResult18 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult18 }
     *     
     */
    public void setAuthstnRslt(AuthorisationResult18 value) {
        this.authstnRslt = value;
    }

    /**
     * Gets the value of the mrchntRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntRefData() {
        return mrchntRefData;
    }

    /**
     * Sets the value of the mrchntRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntRefData(String value) {
        this.mrchntRefData = value;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public void setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
    }

    /**
     * Gets the value of the cstmrTkn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentToken5 }
     *     
     */
    public CardPaymentToken5 getCstmrTkn() {
        return cstmrTkn;
    }

    /**
     * Sets the value of the cstmrTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentToken5 }
     *     
     */
    public void setCstmrTkn(CardPaymentToken5 value) {
        this.cstmrTkn = value;
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
     * Gets the value of the cardPrgrmmPropsd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardPrgrmmPropsd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPrgrmmPropsd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cardPrgrmmPropsd property.
     */
    public List<String> getCardPrgrmmPropsd() {
        if (cardPrgrmmPropsd == null) {
            cardPrgrmmPropsd = new ArrayList<>();
        }
        return this.cardPrgrmmPropsd;
    }

    /**
     * Gets the value of the cardPrgrmmApld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Sets the value of the cardPrgrmmApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrgrmmApld(String value) {
        this.cardPrgrmmApld = value;
    }

    /**
     * Gets the value of the saleToPOIData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToPOIData() {
        return saleToPOIData;
    }

    /**
     * Sets the value of the saleToPOIData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToPOIData(String value) {
        this.saleToPOIData = value;
    }

    /**
     * Gets the value of the saleToAcqrrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToAcqrrData() {
        return saleToAcqrrData;
    }

    /**
     * Sets the value of the saleToAcqrrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToAcqrrData(String value) {
        this.saleToAcqrrData = value;
    }

    /**
     * Gets the value of the saleToIssrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToIssrData() {
        return saleToIssrData;
    }

    /**
     * Sets the value of the saleToIssrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleToIssrData(String value) {
        this.saleToIssrData = value;
    }

    /**
     * Gets the value of the addtlTxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlTxData property.
     */
    public List<String> getAddtlTxData() {
        if (addtlTxData == null) {
            addtlTxData = new ArrayList<>();
        }
        return this.addtlTxData;
    }

}
