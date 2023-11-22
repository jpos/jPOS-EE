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

package org.jpos.iso20022.catp_013_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccount10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardAccount10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Number" minOccurs="0"/>
 *         <element name="SelctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}AccountChoiceMethod1Code" minOccurs="0"/>
 *         <element name="SelctdAcctTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}CardAccountType3Code" minOccurs="0"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Max70Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}NameAndAddress3" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="AcctIdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}AccountIdentification31Choice" minOccurs="0"/>
 *         <element name="CdtRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}PartyIdentification72Choice" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}AmountAndDirection43" minOccurs="0"/>
 *         <element name="BalDispFlg" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DfltAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Lmts" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ATMTransactionAmounts8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount10", propOrder = {
    "acctSeqNb",
    "selctnMtd",
    "selctdAcctTp",
    "acctNm",
    "acctOwnr",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "bal",
    "balDispFlg",
    "dfltAcctInd",
    "lmts"
})
public class CardAccount10 {

    @XmlElement(name = "AcctSeqNb")
    protected BigDecimal acctSeqNb;
    @XmlElement(name = "SelctnMtd")
    @XmlSchemaType(name = "string")
    protected AccountChoiceMethod1Code selctnMtd;
    @XmlElement(name = "SelctdAcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code selctdAcctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctOwnr")
    protected NameAndAddress3 acctOwnr;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification31Choice acctIdr;
    @XmlElement(name = "CdtRef")
    protected String cdtRef;
    @XmlElement(name = "Svcr")
    protected PartyIdentification72Choice svcr;
    @XmlElement(name = "Bal")
    protected AmountAndDirection43 bal;
    @XmlElement(name = "BalDispFlg")
    protected Boolean balDispFlg;
    @XmlElement(name = "DfltAcctInd")
    protected Boolean dfltAcctInd;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts8 lmts;

    /**
     * Gets the value of the acctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSeqNb() {
        return acctSeqNb;
    }

    /**
     * Sets the value of the acctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctSeqNb(BigDecimal value) {
        this.acctSeqNb = value;
    }

    /**
     * Gets the value of the selctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public AccountChoiceMethod1Code getSelctnMtd() {
        return selctnMtd;
    }

    /**
     * Sets the value of the selctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public void setSelctnMtd(AccountChoiceMethod1Code value) {
        this.selctnMtd = value;
    }

    /**
     * Gets the value of the selctdAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getSelctdAcctTp() {
        return selctdAcctTp;
    }

    /**
     * Sets the value of the selctdAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public void setSelctdAcctTp(CardAccountType3Code value) {
        this.selctdAcctTp = value;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    public NameAndAddress3 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    public void setAcctOwnr(NameAndAddress3 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public AccountIdentification31Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public void setAcctIdr(AccountIdentification31Choice value) {
        this.acctIdr = value;
    }

    /**
     * Gets the value of the cdtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRef() {
        return cdtRef;
    }

    /**
     * Sets the value of the cdtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtRef(String value) {
        this.cdtRef = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public PartyIdentification72Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public void setSvcr(PartyIdentification72Choice value) {
        this.svcr = value;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public void setBal(AmountAndDirection43 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the balDispFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalDispFlg() {
        return balDispFlg;
    }

    /**
     * Sets the value of the balDispFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalDispFlg(Boolean value) {
        this.balDispFlg = value;
    }

    /**
     * Gets the value of the dfltAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltAcctInd() {
        return dfltAcctInd;
    }

    /**
     * Sets the value of the dfltAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfltAcctInd(Boolean value) {
        this.dfltAcctInd = value;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts8 }
     *     
     */
    public ATMTransactionAmounts8 getLmts() {
        return lmts;
    }

    /**
     * Sets the value of the lmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts8 }
     *     
     */
    public void setLmts(ATMTransactionAmounts8 value) {
        this.lmts = value;
    }

}
