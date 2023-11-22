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

package org.jpos.iso20022.seev_020_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxVoucher1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxVoucher1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxVchrRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}BaseOneRate"/>
 *         <choice>
 *           <element name="TaxCdt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount"/>
 *           <element name="TaxDdctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount"/>
 *         </choice>
 *         <element name="GrssAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="RcrdDtHldg" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}UnitOrFaceAmount1Choice"/>
 *         <element name="TaxCdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="ScripDvddRinvstmtPricPerShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}PriceValue1" minOccurs="0"/>
 *         <element name="CshAmtBrghtFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AlltdShrsCost" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}PriceValue1" minOccurs="0"/>
 *         <element name="CshAmtCrrdFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlDvddPybl" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="BrgnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ISODate" minOccurs="0"/>
 *         <element name="BrgnSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ISODate" minOccurs="0"/>
 *         <element name="StmpDtyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}ForeignExchangeTerms9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxVoucher1", propOrder = {
    "taxVchrRate",
    "taxCdt",
    "taxDdctn",
    "grssAmt",
    "netAmt",
    "rcrdDtHldg",
    "taxCdtRate",
    "whldgTaxAmt",
    "whldgTaxRate",
    "scripDvddRinvstmtPricPerShr",
    "cshAmtBrghtFwd",
    "alltdShrsCost",
    "cshAmtCrrdFwd",
    "ntnlTax",
    "ntnlDvddPybl",
    "brgnDt",
    "brgnSttlmDt",
    "stmpDtyAmt",
    "chrgAmt",
    "comssnAmt",
    "fxDtls"
})
public class TaxVoucher1 {

    @XmlElement(name = "TaxVchrRate", required = true)
    protected BigDecimal taxVchrRate;
    @XmlElement(name = "TaxCdt")
    protected ActiveCurrencyAndAmount taxCdt;
    @XmlElement(name = "TaxDdctn")
    protected ActiveCurrencyAndAmount taxDdctn;
    @XmlElement(name = "GrssAmt", required = true)
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "NetAmt", required = true)
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "RcrdDtHldg", required = true)
    protected UnitOrFaceAmount1Choice rcrdDtHldg;
    @XmlElement(name = "TaxCdtRate")
    protected BigDecimal taxCdtRate;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "WhldgTaxRate")
    protected BigDecimal whldgTaxRate;
    @XmlElement(name = "ScripDvddRinvstmtPricPerShr")
    protected PriceValue1 scripDvddRinvstmtPricPerShr;
    @XmlElement(name = "CshAmtBrghtFwd")
    protected ActiveCurrencyAndAmount cshAmtBrghtFwd;
    @XmlElement(name = "AlltdShrsCost")
    protected PriceValue1 alltdShrsCost;
    @XmlElement(name = "CshAmtCrrdFwd")
    protected ActiveCurrencyAndAmount cshAmtCrrdFwd;
    @XmlElement(name = "NtnlTax")
    protected ActiveCurrencyAndAmount ntnlTax;
    @XmlElement(name = "NtnlDvddPybl")
    protected ActiveCurrencyAndAmount ntnlDvddPybl;
    @XmlElement(name = "BrgnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar brgnDt;
    @XmlElement(name = "BrgnSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar brgnSttlmDt;
    @XmlElement(name = "StmpDtyAmt")
    protected ActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "ChrgAmt")
    protected ActiveCurrencyAndAmount chrgAmt;
    @XmlElement(name = "ComssnAmt")
    protected ActiveCurrencyAndAmount comssnAmt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms9 fxDtls;

    /**
     * Gets the value of the taxVchrRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxVchrRate() {
        return taxVchrRate;
    }

    /**
     * Sets the value of the taxVchrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxVchrRate(BigDecimal value) {
        this.taxVchrRate = value;
    }

    /**
     * Gets the value of the taxCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxCdt() {
        return taxCdt;
    }

    /**
     * Sets the value of the taxCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxCdt(ActiveCurrencyAndAmount value) {
        this.taxCdt = value;
    }

    /**
     * Gets the value of the taxDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDdctn() {
        return taxDdctn;
    }

    /**
     * Sets the value of the taxDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxDdctn(ActiveCurrencyAndAmount value) {
        this.taxDdctn = value;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the rcrdDtHldg property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getRcrdDtHldg() {
        return rcrdDtHldg;
    }

    /**
     * Sets the value of the rcrdDtHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setRcrdDtHldg(UnitOrFaceAmount1Choice value) {
        this.rcrdDtHldg = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxCdtRate(BigDecimal value) {
        this.taxCdtRate = value;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWhldgTaxRate(BigDecimal value) {
        this.whldgTaxRate = value;
    }

    /**
     * Gets the value of the scripDvddRinvstmtPricPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getScripDvddRinvstmtPricPerShr() {
        return scripDvddRinvstmtPricPerShr;
    }

    /**
     * Sets the value of the scripDvddRinvstmtPricPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public void setScripDvddRinvstmtPricPerShr(PriceValue1 value) {
        this.scripDvddRinvstmtPricPerShr = value;
    }

    /**
     * Gets the value of the cshAmtBrghtFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtBrghtFwd() {
        return cshAmtBrghtFwd;
    }

    /**
     * Sets the value of the cshAmtBrghtFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtBrghtFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtBrghtFwd = value;
    }

    /**
     * Gets the value of the alltdShrsCost property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getAlltdShrsCost() {
        return alltdShrsCost;
    }

    /**
     * Sets the value of the alltdShrsCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public void setAlltdShrsCost(PriceValue1 value) {
        this.alltdShrsCost = value;
    }

    /**
     * Gets the value of the cshAmtCrrdFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtCrrdFwd() {
        return cshAmtCrrdFwd;
    }

    /**
     * Sets the value of the cshAmtCrrdFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtCrrdFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtCrrdFwd = value;
    }

    /**
     * Gets the value of the ntnlTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlTax() {
        return ntnlTax;
    }

    /**
     * Sets the value of the ntnlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlTax(ActiveCurrencyAndAmount value) {
        this.ntnlTax = value;
    }

    /**
     * Gets the value of the ntnlDvddPybl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlDvddPybl() {
        return ntnlDvddPybl;
    }

    /**
     * Sets the value of the ntnlDvddPybl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlDvddPybl(ActiveCurrencyAndAmount value) {
        this.ntnlDvddPybl = value;
    }

    /**
     * Gets the value of the brgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBrgnDt() {
        return brgnDt;
    }

    /**
     * Sets the value of the brgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBrgnDt(XMLGregorianCalendar value) {
        this.brgnDt = value;
    }

    /**
     * Gets the value of the brgnSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBrgnSttlmDt() {
        return brgnSttlmDt;
    }

    /**
     * Sets the value of the brgnSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBrgnSttlmDt(XMLGregorianCalendar value) {
        this.brgnSttlmDt = value;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStmpDtyAmt(ActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
    }

    /**
     * Gets the value of the chrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgAmt() {
        return chrgAmt;
    }

    /**
     * Sets the value of the chrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setChrgAmt(ActiveCurrencyAndAmount value) {
        this.chrgAmt = value;
    }

    /**
     * Gets the value of the comssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getComssnAmt() {
        return comssnAmt;
    }

    /**
     * Sets the value of the comssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setComssnAmt(ActiveCurrencyAndAmount value) {
        this.comssnAmt = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms9 }
     *     
     */
    public ForeignExchangeTerms9 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms9 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms9 value) {
        this.fxDtls = value;
    }

}
