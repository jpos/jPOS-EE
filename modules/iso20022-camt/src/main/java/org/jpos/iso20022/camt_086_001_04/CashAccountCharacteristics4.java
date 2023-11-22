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

package org.jpos.iso20022.camt_086_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountCharacteristics4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccountCharacteristics4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctLvl" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AccountLevel2Code"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}CashAccount40"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="PrntAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ParentCashAccount4" minOccurs="0"/>
 *         <element name="CompstnMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}CompensationMethod1Code"/>
 *         <element name="DbtAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="DelydDbtDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODate" minOccurs="0"/>
 *         <element name="SttlmAdvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max105Text" minOccurs="0"/>
 *         <element name="AcctBalCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode"/>
 *         <element name="SttlmCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="HstCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AccountTax1" minOccurs="0"/>
 *         <element name="AcctSvcrCtct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Contact4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountCharacteristics4", propOrder = {
    "acctLvl",
    "cshAcct",
    "acctSvcr",
    "prntAcct",
    "compstnMtd",
    "dbtAcct",
    "delydDbtDt",
    "sttlmAdvc",
    "acctBalCcyCd",
    "sttlmCcyCd",
    "hstCcyCd",
    "tax",
    "acctSvcrCtct"
})
public class CashAccountCharacteristics4 {

    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected AccountLevel2Code acctLvl;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount40 cshAcct;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "PrntAcct")
    protected ParentCashAccount4 prntAcct;
    @XmlElement(name = "CompstnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected CompensationMethod1Code compstnMtd;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "DelydDbtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delydDbtDt;
    @XmlElement(name = "SttlmAdvc")
    protected String sttlmAdvc;
    @XmlElement(name = "AcctBalCcyCd", required = true)
    protected String acctBalCcyCd;
    @XmlElement(name = "SttlmCcyCd")
    protected String sttlmCcyCd;
    @XmlElement(name = "HstCcyCd")
    protected String hstCcyCd;
    @XmlElement(name = "Tax")
    protected AccountTax1 tax;
    @XmlElement(name = "AcctSvcrCtct", required = true)
    protected Contact4 acctSvcrCtct;

    /**
     * Gets the value of the acctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLevel2Code }
     *     
     */
    public AccountLevel2Code getAcctLvl() {
        return acctLvl;
    }

    /**
     * Sets the value of the acctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLevel2Code }
     *     
     */
    public void setAcctLvl(AccountLevel2Code value) {
        this.acctLvl = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the prntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCashAccount4 }
     *     
     */
    public ParentCashAccount4 getPrntAcct() {
        return prntAcct;
    }

    /**
     * Sets the value of the prntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCashAccount4 }
     *     
     */
    public void setPrntAcct(ParentCashAccount4 value) {
        this.prntAcct = value;
    }

    /**
     * Gets the value of the compstnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationMethod1Code }
     *     
     */
    public CompensationMethod1Code getCompstnMtd() {
        return compstnMtd;
    }

    /**
     * Sets the value of the compstnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationMethod1Code }
     *     
     */
    public void setCompstnMtd(CompensationMethod1Code value) {
        this.compstnMtd = value;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
    }

    /**
     * Gets the value of the delydDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelydDbtDt() {
        return delydDbtDt;
    }

    /**
     * Sets the value of the delydDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelydDbtDt(XMLGregorianCalendar value) {
        this.delydDbtDt = value;
    }

    /**
     * Gets the value of the sttlmAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmAdvc() {
        return sttlmAdvc;
    }

    /**
     * Sets the value of the sttlmAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmAdvc(String value) {
        this.sttlmAdvc = value;
    }

    /**
     * Gets the value of the acctBalCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBalCcyCd() {
        return acctBalCcyCd;
    }

    /**
     * Sets the value of the acctBalCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctBalCcyCd(String value) {
        this.acctBalCcyCd = value;
    }

    /**
     * Gets the value of the sttlmCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcyCd() {
        return sttlmCcyCd;
    }

    /**
     * Sets the value of the sttlmCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcyCd(String value) {
        this.sttlmCcyCd = value;
    }

    /**
     * Gets the value of the hstCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCcyCd() {
        return hstCcyCd;
    }

    /**
     * Sets the value of the hstCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstCcyCd(String value) {
        this.hstCcyCd = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTax1 }
     *     
     */
    public AccountTax1 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTax1 }
     *     
     */
    public void setTax(AccountTax1 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the acctSvcrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact4 }
     *     
     */
    public Contact4 getAcctSvcrCtct() {
        return acctSvcrCtct;
    }

    /**
     * Sets the value of the acctSvcrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact4 }
     *     
     */
    public void setAcctSvcrCtct(Contact4 value) {
        this.acctSvcrCtct = value;
    }

}
