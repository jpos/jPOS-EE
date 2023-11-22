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

package org.jpos.iso20022.auth_105_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanData134 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanData134">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ExposureType10Code" minOccurs="0"/>
 *         <element name="Clrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}Max52Text" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TradingVenueType1Choice" minOccurs="0"/>
 *         <element name="MstrAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ExternalAgreementType1Code" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ISODate" minOccurs="0"/>
 *         <element name="GnlColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}SpecialCollateral1Code" minOccurs="0"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ContractTerm6Choice" minOccurs="0"/>
 *         <element name="Rates" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}Rates1Choice" minOccurs="0"/>
 *         <element name="PrncplAmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="PricCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}Security49" minOccurs="0"/>
 *         <element name="OutsdngMrgnLnCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData134", propOrder = {
    "ctrctTp",
    "clrd",
    "prtflCd",
    "tradgVn",
    "mstrAgrmtTp",
    "mtrtyDt",
    "gnlColl",
    "term",
    "rates",
    "prncplAmtCcy",
    "pricCcy",
    "scty",
    "outsdngMrgnLnCcy"
})
public class LoanData134 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected ExposureType10Code ctrctTp;
    @XmlElement(name = "Clrd")
    protected Boolean clrd;
    @XmlElement(name = "PrtflCd")
    protected String prtflCd;
    @XmlElement(name = "TradgVn")
    protected TradingVenueType1Choice tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected String mstrAgrmtTp;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;
    @XmlElement(name = "Term")
    protected ContractTerm6Choice term;
    @XmlElement(name = "Rates")
    protected Rates1Choice rates;
    @XmlElement(name = "PrncplAmtCcy")
    protected String prncplAmtCcy;
    @XmlElement(name = "PricCcy")
    protected String pricCcy;
    @XmlElement(name = "Scty")
    protected Security49 scty;
    @XmlElement(name = "OutsdngMrgnLnCcy")
    protected String outsdngMrgnLnCcy;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType10Code }
     *     
     */
    public ExposureType10Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType10Code }
     *     
     */
    public void setCtrctTp(ExposureType10Code value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClrd(Boolean value) {
        this.clrd = value;
    }

    /**
     * Gets the value of the prtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflCd() {
        return prtflCd;
    }

    /**
     * Sets the value of the prtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtflCd(String value) {
        this.prtflCd = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueType1Choice }
     *     
     */
    public TradingVenueType1Choice getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueType1Choice }
     *     
     */
    public void setTradgVn(TradingVenueType1Choice value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrAgrmtTp(String value) {
        this.mstrAgrmtTp = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public SpecialCollateral1Code getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public void setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public ContractTerm6Choice getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public void setTerm(ContractTerm6Choice value) {
        this.term = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates1Choice }
     *     
     */
    public Rates1Choice getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates1Choice }
     *     
     */
    public void setRates(Rates1Choice value) {
        this.rates = value;
    }

    /**
     * Gets the value of the prncplAmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrncplAmtCcy() {
        return prncplAmtCcy;
    }

    /**
     * Sets the value of the prncplAmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrncplAmtCcy(String value) {
        this.prncplAmtCcy = value;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricCcy(String value) {
        this.pricCcy = value;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link Security49 }
     *     
     */
    public Security49 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security49 }
     *     
     */
    public void setScty(Security49 value) {
        this.scty = value;
    }

    /**
     * Gets the value of the outsdngMrgnLnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsdngMrgnLnCcy() {
        return outsdngMrgnLnCcy;
    }

    /**
     * Sets the value of the outsdngMrgnLnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsdngMrgnLnCcy(String value) {
        this.outsdngMrgnLnCcy = value;
    }

}
