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

package org.jpos.iso20022.catp_007_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccount12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardAccount12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CardAccountType3Code" minOccurs="0"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="AcctIdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}AccountIdentification31Choice" minOccurs="0"/>
 *         <element name="CdtRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}PartyIdentification72Choice" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}AmountAndDirection43" minOccurs="0"/>
 *         <element name="BalDispFlg" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="DfltAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AllwdSvc" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMService19" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount12", propOrder = {
    "acctTp",
    "acctNm",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "bal",
    "balDispFlg",
    "dfltAcctInd",
    "allwdSvc"
})
public class CardAccount12 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
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
    @XmlElement(name = "AllwdSvc")
    protected List<ATMService19> allwdSvc;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public void setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
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
     * Gets the value of the allwdSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService19 }
     * 
     * 
     * @return
     *     The value of the allwdSvc property.
     */
    public List<ATMService19> getAllwdSvc() {
        if (allwdSvc == null) {
            allwdSvc = new ArrayList<>();
        }
        return this.allwdSvc;
    }

}
