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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="WhldgOfFrgnTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="WhldgOfLclTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="GrmnLclTax1" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="GrmnLclTax2" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="GrmnLclTax3" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="GrmnLclTax4" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="TaxOnIncm" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="TaxOnPrft" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="TaxRclm" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="FsclStmp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="Prratn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="NewToOd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RatioFormat2Choice" minOccurs="0"/>
 *         <element name="NewSctiesToUndrlygScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RatioFormat2Choice" minOccurs="0"/>
 *         <element name="AddtlQtyForExstgScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RatioFormat1Choice" minOccurs="0"/>
 *         <element name="AddtlQtyForSbcbdRsltntScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RatioFormat1Choice" minOccurs="0"/>
 *         <element name="RltdTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RelatedTaxType1" minOccurs="0"/>
 *         <element name="NonResdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="IntrstForUsdPmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="IndxFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="FullyFrnkd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="GrssDvdd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}GrossDividendRate1Choice" minOccurs="0"/>
 *         <element name="NetDvdd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}NetDividendRate1Choice" minOccurs="0"/>
 *         <element name="FnlDvdd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}AmountAndRateFormat2Choice" minOccurs="0"/>
 *         <element name="PrvsnlDvdd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}AmountAndRateFormat2Choice" minOccurs="0"/>
 *         <element name="CshIncntiv" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="SlctnFee" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="MaxAllwdOvrsbcpt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="AddtlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ForeignExchangeTerms8" minOccurs="0"/>
 *         <element name="AplblRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RateFormat1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate2", propOrder = {
    "whldgTax",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "grmnLclTax1",
    "grmnLclTax2",
    "grmnLclTax3",
    "grmnLclTax4",
    "taxOnIncm",
    "taxOnPrft",
    "taxRclm",
    "fsclStmp",
    "prratn",
    "newToOd",
    "newSctiesToUndrlygScties",
    "addtlQtyForExstgScties",
    "addtlQtyForSbcbdRsltntScties",
    "rltdTax",
    "nonResdtRate",
    "chrgs",
    "intrstForUsdPmt",
    "indxFctr",
    "fullyFrnkd",
    "grssDvdd",
    "netDvdd",
    "fnlDvdd",
    "prvsnlDvdd",
    "cshIncntiv",
    "slctnFee",
    "maxAllwdOvrsbcpt",
    "addtlTax",
    "orgnlAmt",
    "xchgRate",
    "aplblRate"
})
public class CorporateActionRate2 {

    @XmlElement(name = "WhldgTax")
    protected RateFormat1Choice whldgTax;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat1Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat1Choice whldgOfLclTax;
    @XmlElement(name = "GrmnLclTax1")
    protected RateAndAmountFormat1Choice grmnLclTax1;
    @XmlElement(name = "GrmnLclTax2")
    protected RateAndAmountFormat1Choice grmnLclTax2;
    @XmlElement(name = "GrmnLclTax3")
    protected RateAndAmountFormat1Choice grmnLclTax3;
    @XmlElement(name = "GrmnLclTax4")
    protected RateAndAmountFormat1Choice grmnLclTax4;
    @XmlElement(name = "TaxOnIncm")
    protected RateFormat1Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrft")
    protected RateFormat1Choice taxOnPrft;
    @XmlElement(name = "TaxRclm")
    protected RateFormat1Choice taxRclm;
    @XmlElement(name = "FsclStmp")
    protected RateFormat1Choice fsclStmp;
    @XmlElement(name = "Prratn")
    protected RateFormat1Choice prratn;
    @XmlElement(name = "NewToOd")
    protected RatioFormat2Choice newToOd;
    @XmlElement(name = "NewSctiesToUndrlygScties")
    protected RatioFormat2Choice newSctiesToUndrlygScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat1Choice addtlQtyForExstgScties;
    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat1Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "RltdTax")
    protected RelatedTaxType1 rltdTax;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat1Choice nonResdtRate;
    @XmlElement(name = "Chrgs")
    protected RateAndAmountFormat1Choice chrgs;
    @XmlElement(name = "IntrstForUsdPmt")
    protected RateAndAmountFormat1Choice intrstForUsdPmt;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat1Choice indxFctr;
    @XmlElement(name = "FullyFrnkd")
    protected RateAndAmountFormat1Choice fullyFrnkd;
    @XmlElement(name = "GrssDvdd")
    protected GrossDividendRate1Choice grssDvdd;
    @XmlElement(name = "NetDvdd")
    protected NetDividendRate1Choice netDvdd;
    @XmlElement(name = "FnlDvdd")
    protected AmountAndRateFormat2Choice fnlDvdd;
    @XmlElement(name = "PrvsnlDvdd")
    protected AmountAndRateFormat2Choice prvsnlDvdd;
    @XmlElement(name = "CshIncntiv")
    protected RateFormat1Choice cshIncntiv;
    @XmlElement(name = "SlctnFee")
    protected RateFormat1Choice slctnFee;
    @XmlElement(name = "MaxAllwdOvrsbcpt")
    protected RateFormat1Choice maxAllwdOvrsbcpt;
    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat1Choice addtlTax;
    @XmlElement(name = "OrgnlAmt")
    protected ActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "XchgRate")
    protected ForeignExchangeTerms8 xchgRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat1Choice aplblRate;

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setWhldgTax(RateFormat1Choice value) {
        this.whldgTax = value;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setWhldgOfFrgnTax(RateAndAmountFormat1Choice value) {
        this.whldgOfFrgnTax = value;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setWhldgOfLclTax(RateAndAmountFormat1Choice value) {
        this.whldgOfLclTax = value;
    }

    /**
     * Gets the value of the grmnLclTax1 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax1() {
        return grmnLclTax1;
    }

    /**
     * Sets the value of the grmnLclTax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setGrmnLclTax1(RateAndAmountFormat1Choice value) {
        this.grmnLclTax1 = value;
    }

    /**
     * Gets the value of the grmnLclTax2 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax2() {
        return grmnLclTax2;
    }

    /**
     * Sets the value of the grmnLclTax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setGrmnLclTax2(RateAndAmountFormat1Choice value) {
        this.grmnLclTax2 = value;
    }

    /**
     * Gets the value of the grmnLclTax3 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax3() {
        return grmnLclTax3;
    }

    /**
     * Sets the value of the grmnLclTax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setGrmnLclTax3(RateAndAmountFormat1Choice value) {
        this.grmnLclTax3 = value;
    }

    /**
     * Gets the value of the grmnLclTax4 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax4() {
        return grmnLclTax4;
    }

    /**
     * Sets the value of the grmnLclTax4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setGrmnLclTax4(RateAndAmountFormat1Choice value) {
        this.grmnLclTax4 = value;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setTaxOnIncm(RateFormat1Choice value) {
        this.taxOnIncm = value;
    }

    /**
     * Gets the value of the taxOnPrft property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxOnPrft() {
        return taxOnPrft;
    }

    /**
     * Sets the value of the taxOnPrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setTaxOnPrft(RateFormat1Choice value) {
        this.taxOnPrft = value;
    }

    /**
     * Gets the value of the taxRclm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxRclm() {
        return taxRclm;
    }

    /**
     * Sets the value of the taxRclm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setTaxRclm(RateFormat1Choice value) {
        this.taxRclm = value;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setFsclStmp(RateFormat1Choice value) {
        this.fsclStmp = value;
    }

    /**
     * Gets the value of the prratn property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getPrratn() {
        return prratn;
    }

    /**
     * Sets the value of the prratn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setPrratn(RateFormat1Choice value) {
        this.prratn = value;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public RatioFormat2Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public void setNewToOd(RatioFormat2Choice value) {
        this.newToOd = value;
    }

    /**
     * Gets the value of the newSctiesToUndrlygScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public RatioFormat2Choice getNewSctiesToUndrlygScties() {
        return newSctiesToUndrlygScties;
    }

    /**
     * Sets the value of the newSctiesToUndrlygScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public void setNewSctiesToUndrlygScties(RatioFormat2Choice value) {
        this.newSctiesToUndrlygScties = value;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public RatioFormat1Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public void setAddtlQtyForExstgScties(RatioFormat1Choice value) {
        this.addtlQtyForExstgScties = value;
    }

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public RatioFormat1Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public void setAddtlQtyForSbcbdRsltntScties(RatioFormat1Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
    }

    /**
     * Gets the value of the rltdTax property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTaxType1 }
     *     
     */
    public RelatedTaxType1 getRltdTax() {
        return rltdTax;
    }

    /**
     * Sets the value of the rltdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTaxType1 }
     *     
     */
    public void setRltdTax(RelatedTaxType1 value) {
        this.rltdTax = value;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setNonResdtRate(RateAndAmountFormat1Choice value) {
        this.nonResdtRate = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setChrgs(RateAndAmountFormat1Choice value) {
        this.chrgs = value;
    }

    /**
     * Gets the value of the intrstForUsdPmt property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIntrstForUsdPmt() {
        return intrstForUsdPmt;
    }

    /**
     * Sets the value of the intrstForUsdPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setIntrstForUsdPmt(RateAndAmountFormat1Choice value) {
        this.intrstForUsdPmt = value;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setIndxFctr(RateAndAmountFormat1Choice value) {
        this.indxFctr = value;
    }

    /**
     * Gets the value of the fullyFrnkd property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getFullyFrnkd() {
        return fullyFrnkd;
    }

    /**
     * Sets the value of the fullyFrnkd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setFullyFrnkd(RateAndAmountFormat1Choice value) {
        this.fullyFrnkd = value;
    }

    /**
     * Gets the value of the grssDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link GrossDividendRate1Choice }
     *     
     */
    public GrossDividendRate1Choice getGrssDvdd() {
        return grssDvdd;
    }

    /**
     * Sets the value of the grssDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossDividendRate1Choice }
     *     
     */
    public void setGrssDvdd(GrossDividendRate1Choice value) {
        this.grssDvdd = value;
    }

    /**
     * Gets the value of the netDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link NetDividendRate1Choice }
     *     
     */
    public NetDividendRate1Choice getNetDvdd() {
        return netDvdd;
    }

    /**
     * Sets the value of the netDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDividendRate1Choice }
     *     
     */
    public void setNetDvdd(NetDividendRate1Choice value) {
        this.netDvdd = value;
    }

    /**
     * Gets the value of the fnlDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public AmountAndRateFormat2Choice getFnlDvdd() {
        return fnlDvdd;
    }

    /**
     * Sets the value of the fnlDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public void setFnlDvdd(AmountAndRateFormat2Choice value) {
        this.fnlDvdd = value;
    }

    /**
     * Gets the value of the prvsnlDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public AmountAndRateFormat2Choice getPrvsnlDvdd() {
        return prvsnlDvdd;
    }

    /**
     * Sets the value of the prvsnlDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public void setPrvsnlDvdd(AmountAndRateFormat2Choice value) {
        this.prvsnlDvdd = value;
    }

    /**
     * Gets the value of the cshIncntiv property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getCshIncntiv() {
        return cshIncntiv;
    }

    /**
     * Sets the value of the cshIncntiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setCshIncntiv(RateFormat1Choice value) {
        this.cshIncntiv = value;
    }

    /**
     * Gets the value of the slctnFee property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getSlctnFee() {
        return slctnFee;
    }

    /**
     * Sets the value of the slctnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setSlctnFee(RateFormat1Choice value) {
        this.slctnFee = value;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getMaxAllwdOvrsbcpt() {
        return maxAllwdOvrsbcpt;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setMaxAllwdOvrsbcpt(RateFormat1Choice value) {
        this.maxAllwdOvrsbcpt = value;
    }

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat1Choice value) {
        this.addtlTax = value;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlAmt(ActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms8 }
     *     
     */
    public ForeignExchangeTerms8 getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms8 }
     *     
     */
    public void setXchgRate(ForeignExchangeTerms8 value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setAplblRate(RateFormat1Choice value) {
        this.aplblRate = value;
    }

}
