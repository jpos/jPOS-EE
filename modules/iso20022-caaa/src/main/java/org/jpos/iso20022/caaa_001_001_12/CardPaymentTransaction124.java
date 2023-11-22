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

package org.jpos.iso20022.caaa_001_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransaction124 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransaction124">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxCaptr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}TrueFalseIndicator"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardPaymentServiceType12Code" minOccurs="0"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardPaymentServiceType9Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcAttr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardPaymentServiceType14Code" minOccurs="0"/>
 *         <element name="LastTxFlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Min3Max4Text" minOccurs="0"/>
 *         <element name="CstmrCnsnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmmPropsd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}TransactionIdentifier1"/>
 *         <element name="OrgnlTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardPaymentTransaction122" minOccurs="0"/>
 *         <element name="InitrTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="IssrCITId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max140Text" minOccurs="0"/>
 *         <element name="MrchntCITId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max140Text" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardPaymentTransactionDetails52"/>
 *         <element name="MrchntRefData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max70Text" minOccurs="0"/>
 *         <element name="AcctFr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardAccount16" minOccurs="0"/>
 *         <element name="AcctTo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardAccount16" minOccurs="0"/>
 *         <element name="AddtlTxData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction124", propOrder = {
    "txCaptr",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "lastTxFlg",
    "mrchntCtgyCd",
    "cstmrCnsnt",
    "cardPrgrmmPropsd",
    "cardPrgrmmApld",
    "saleRefId",
    "txId",
    "orgnlTx",
    "initrTxId",
    "rcncltnId",
    "issrCITId",
    "mrchntCITId",
    "txDtls",
    "mrchntRefData",
    "acctFr",
    "acctTo",
    "addtlTxData"
})
public class CardPaymentTransaction124 {

    @XmlElement(name = "TxCaptr")
    protected boolean txCaptr;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
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
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
    @XmlElement(name = "CardPrgrmmPropsd")
    protected List<String> cardPrgrmmPropsd;
    @XmlElement(name = "CardPrgrmmApld")
    protected String cardPrgrmmApld;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "OrgnlTx")
    protected CardPaymentTransaction122 orgnlTx;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IssrCITId")
    protected String issrCITId;
    @XmlElement(name = "MrchntCITId")
    protected String mrchntCITId;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails52 txDtls;
    @XmlElement(name = "MrchntRefData")
    protected String mrchntRefData;
    @XmlElement(name = "AcctFr")
    protected CardAccount16 acctFr;
    @XmlElement(name = "AcctTo")
    protected CardAccount16 acctTo;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

    /**
     * Gets the value of the txCaptr property.
     * 
     */
    public boolean isTxCaptr() {
        return txCaptr;
    }

    /**
     * Sets the value of the txCaptr property.
     * 
     */
    public void setTxCaptr(boolean value) {
        this.txCaptr = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public void setTxTp(CardPaymentServiceType12Code value) {
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
     *     {@link CardPaymentTransaction122 }
     *     
     */
    public CardPaymentTransaction122 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction122 }
     *     
     */
    public void setOrgnlTx(CardPaymentTransaction122 value) {
        this.orgnlTx = value;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitrTxId(String value) {
        this.initrTxId = value;
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
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount16 }
     *     
     */
    public CardAccount16 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount16 }
     *     
     */
    public void setAcctFr(CardAccount16 value) {
        this.acctFr = value;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount16 }
     *     
     */
    public CardAccount16 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount16 }
     *     
     */
    public void setAcctTo(CardAccount16 value) {
        this.acctTo = value;
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
