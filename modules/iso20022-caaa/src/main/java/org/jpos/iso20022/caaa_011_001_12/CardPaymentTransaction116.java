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

package org.jpos.iso20022.caaa_011_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransaction116 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransaction116">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Min3Max4Text"/>
 *         <element name="CstmrCnsnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardPrgrmmPropsd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max35Text" minOccurs="0"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TransactionIdentifier1"/>
 *         <element name="OrgnlTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentTransaction122" minOccurs="0"/>
 *         <element name="TxSucss" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TrueFalseIndicator"/>
 *         <element name="Rvsl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="FailrRsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}FailureReason3Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InitrTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max35Text" minOccurs="0"/>
 *         <element name="RcptTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max140Text" minOccurs="0"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max35Text" minOccurs="0"/>
 *         <element name="IntrchngData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max140Text" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentTransactionDetails50"/>
 *         <element name="AuthstnRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}AuthorisationResult19" minOccurs="0"/>
 *         <element name="AddtlTxData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction116", propOrder = {
    "mrchntCtgyCd",
    "cstmrCnsnt",
    "cardPrgrmmPropsd",
    "cardPrgrmmApld",
    "saleRefId",
    "txId",
    "orgnlTx",
    "txSucss",
    "rvsl",
    "failrRsn",
    "initrTxId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls",
    "authstnRslt",
    "addtlTxData"
})
public class CardPaymentTransaction116 {

    @XmlElement(name = "MrchntCtgyCd", required = true)
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
    @XmlElement(name = "TxSucss")
    protected boolean txSucss;
    @XmlElement(name = "Rvsl")
    protected Boolean rvsl;
    @XmlElement(name = "FailrRsn")
    @XmlSchemaType(name = "string")
    protected List<FailureReason3Code> failrRsn;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IntrchngData")
    protected String intrchngData;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails50 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult19 authstnRslt;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

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
     * Gets the value of the txSucss property.
     * 
     */
    public boolean isTxSucss() {
        return txSucss;
    }

    /**
     * Sets the value of the txSucss property.
     * 
     */
    public void setTxSucss(boolean value) {
        this.txSucss = value;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRvsl(Boolean value) {
        this.rvsl = value;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the failrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason3Code }
     * 
     * 
     * @return
     *     The value of the failrRsn property.
     */
    public List<FailureReason3Code> getFailrRsn() {
        if (failrRsn == null) {
            failrRsn = new ArrayList<>();
        }
        return this.failrRsn;
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
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptTxId(String value) {
        this.rcptTxId = value;
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
     * Gets the value of the intrchngData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngData() {
        return intrchngData;
    }

    /**
     * Sets the value of the intrchngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrchngData(String value) {
        this.intrchngData = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails50 }
     *     
     */
    public CardPaymentTransactionDetails50 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails50 }
     *     
     */
    public void setTxDtls(CardPaymentTransactionDetails50 value) {
        this.txDtls = value;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult19 }
     *     
     */
    public AuthorisationResult19 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult19 }
     *     
     */
    public void setAuthstnRslt(AuthorisationResult19 value) {
        this.authstnRslt = value;
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
