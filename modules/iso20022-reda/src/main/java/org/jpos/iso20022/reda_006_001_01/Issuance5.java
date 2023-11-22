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

package org.jpos.iso20022.reda_006_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Issuance5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Issuance5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IssePlc" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="CtryOfIsse" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}CountryCode" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODate" minOccurs="0"/>
 *         <element name="AnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="ISINVldFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODate" minOccurs="0"/>
 *         <element name="IssrOrg" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Organisation38" minOccurs="0"/>
 *         <element name="IsseNmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="FullIssdAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IsseSz" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Number" minOccurs="0"/>
 *         <element name="IssePric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PriceValue1" minOccurs="0"/>
 *         <element name="IssncDstrbtn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}SecuritiesTransactionType31Choice" minOccurs="0"/>
 *         <element name="GovngLaw" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Jurisdiction1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Issuance5", propOrder = {
    "issePlc",
    "ctryOfIsse",
    "isseDt",
    "anncmntDt",
    "isinVldFr",
    "issrOrg",
    "isseNmnlAmt",
    "fullIssdAmt",
    "isseSz",
    "issePric",
    "issncDstrbtn",
    "govngLaw"
})
public class Issuance5 {

    @XmlElement(name = "IssePlc")
    protected String issePlc;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "AnncmntDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anncmntDt;
    @XmlElement(name = "ISINVldFr")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isinVldFr;
    @XmlElement(name = "IssrOrg")
    protected Organisation38 issrOrg;
    @XmlElement(name = "IsseNmnlAmt")
    protected FinancialInstrumentQuantity1Choice isseNmnlAmt;
    @XmlElement(name = "FullIssdAmt")
    protected ActiveCurrencyAndAmount fullIssdAmt;
    @XmlElement(name = "IsseSz")
    protected BigDecimal isseSz;
    @XmlElement(name = "IssePric")
    protected PriceValue1 issePric;
    @XmlElement(name = "IssncDstrbtn")
    protected SecuritiesTransactionType31Choice issncDstrbtn;
    @XmlElement(name = "GovngLaw")
    protected List<Jurisdiction1> govngLaw;

    /**
     * Gets the value of the issePlc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssePlc() {
        return issePlc;
    }

    /**
     * Sets the value of the issePlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssePlc(String value) {
        this.issePlc = value;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnncmntDt(XMLGregorianCalendar value) {
        this.anncmntDt = value;
    }

    /**
     * Gets the value of the isinVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getISINVldFr() {
        return isinVldFr;
    }

    /**
     * Sets the value of the isinVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setISINVldFr(XMLGregorianCalendar value) {
        this.isinVldFr = value;
    }

    /**
     * Gets the value of the issrOrg property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getIssrOrg() {
        return issrOrg;
    }

    /**
     * Sets the value of the issrOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setIssrOrg(Organisation38 value) {
        this.issrOrg = value;
    }

    /**
     * Gets the value of the isseNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getIsseNmnlAmt() {
        return isseNmnlAmt;
    }

    /**
     * Sets the value of the isseNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setIsseNmnlAmt(FinancialInstrumentQuantity1Choice value) {
        this.isseNmnlAmt = value;
    }

    /**
     * Gets the value of the fullIssdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFullIssdAmt() {
        return fullIssdAmt;
    }

    /**
     * Sets the value of the fullIssdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFullIssdAmt(ActiveCurrencyAndAmount value) {
        this.fullIssdAmt = value;
    }

    /**
     * Gets the value of the isseSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsseSz() {
        return isseSz;
    }

    /**
     * Sets the value of the isseSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIsseSz(BigDecimal value) {
        this.isseSz = value;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public void setIssePric(PriceValue1 value) {
        this.issePric = value;
    }

    /**
     * Gets the value of the issncDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType31Choice }
     *     
     */
    public SecuritiesTransactionType31Choice getIssncDstrbtn() {
        return issncDstrbtn;
    }

    /**
     * Sets the value of the issncDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType31Choice }
     *     
     */
    public void setIssncDstrbtn(SecuritiesTransactionType31Choice value) {
        this.issncDstrbtn = value;
    }

    /**
     * Gets the value of the govngLaw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the govngLaw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngLaw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jurisdiction1 }
     * 
     * 
     * @return
     *     The value of the govngLaw property.
     */
    public List<Jurisdiction1> getGovngLaw() {
        if (govngLaw == null) {
            govngLaw = new ArrayList<>();
        }
        return this.govngLaw;
    }

}
