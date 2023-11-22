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

package org.jpos.iso20022.reda_001_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitPrice15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnitPrice15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Tp" type="{urn:swift:xsd:reda.001.001.04}TypeOfPrice9Code"/>
 *           <element name="XtndedTp" type="{urn:swift:xsd:reda.001.001.04}Extended350Code"/>
 *         </choice>
 *         <element name="PricMtd" type="{urn:swift:xsd:reda.001.001.04}PriceMethod1Code" minOccurs="0"/>
 *         <element name="ValInInvstmtCcy" type="{urn:swift:xsd:reda.001.001.04}PriceValue1" maxOccurs="unbounded"/>
 *         <element name="ValInAltrntvCcy" type="{urn:swift:xsd:reda.001.001.04}PriceValue1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ForExctnInd" type="{urn:swift:xsd:reda.001.001.04}YesNoIndicator"/>
 *         <element name="CumDvddInd" type="{urn:swift:xsd:reda.001.001.04}YesNoIndicator"/>
 *         <element name="ClctnBsis" type="{urn:swift:xsd:reda.001.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="EstmtdPricInd" type="{urn:swift:xsd:reda.001.001.04}YesNoIndicator"/>
 *         <element name="NbOfDaysAcrd" type="{urn:swift:xsd:reda.001.001.04}Number" minOccurs="0"/>
 *         <element name="TaxblIncmPerShr" type="{urn:swift:xsd:reda.001.001.04}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <choice>
 *           <element name="TaxblIncmPerShrClctd" type="{urn:swift:xsd:reda.001.001.04}TaxableIncomePerShareCalculated2Code" minOccurs="0"/>
 *           <element name="XtndedTaxblIncmPerShrClctd" type="{urn:swift:xsd:reda.001.001.04}Extended350Code" minOccurs="0"/>
 *         </choice>
 *         <element name="TaxblIncmPerDvdd" type="{urn:swift:xsd:reda.001.001.04}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <choice>
 *           <element name="EUDvddSts" type="{urn:swift:xsd:reda.001.001.04}EUDividendStatus1Code" minOccurs="0"/>
 *           <element name="XtndedEUDvddSts" type="{urn:swift:xsd:reda.001.001.04}Extended350Code" minOccurs="0"/>
 *         </choice>
 *         <element name="ChrgDtls" type="{urn:swift:xsd:reda.001.001.04}Charge15" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxLbltyDtls" type="{urn:swift:xsd:reda.001.001.04}Tax17" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxRfndDtls" type="{urn:swift:xsd:reda.001.001.04}Tax17" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice15", propOrder = {
    "tp",
    "xtndedTp",
    "pricMtd",
    "valInInvstmtCcy",
    "valInAltrntvCcy",
    "forExctnInd",
    "cumDvddInd",
    "clctnBsis",
    "estmtdPricInd",
    "nbOfDaysAcrd",
    "taxblIncmPerShr",
    "taxblIncmPerShrClctd",
    "xtndedTaxblIncmPerShrClctd",
    "taxblIncmPerDvdd",
    "euDvddSts",
    "xtndedEUDvddSts",
    "chrgDtls",
    "taxLbltyDtls",
    "taxRfndDtls"
})
public class UnitPrice15 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice9Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "ValInInvstmtCcy", required = true)
    protected List<PriceValue1> valInInvstmtCcy;
    @XmlElement(name = "ValInAltrntvCcy")
    protected List<PriceValue1> valInAltrntvCcy;
    @XmlElement(name = "ForExctnInd")
    protected boolean forExctnInd;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "ClctnBsis")
    protected BigDecimal clctnBsis;
    @XmlElement(name = "EstmtdPricInd")
    protected boolean estmtdPricInd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TaxblIncmPerShr")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerShr;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "XtndedTaxblIncmPerShrClctd")
    protected String xtndedTaxblIncmPerShrClctd;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    @XmlSchemaType(name = "string")
    protected EUDividendStatus1Code euDvddSts;
    @XmlElement(name = "XtndedEUDvddSts")
    protected String xtndedEUDvddSts;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge15> chrgDtls;
    @XmlElement(name = "TaxLbltyDtls")
    protected List<Tax17> taxLbltyDtls;
    @XmlElement(name = "TaxRfndDtls")
    protected List<Tax17> taxRfndDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice9Code }
     *     
     */
    public TypeOfPrice9Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice9Code }
     *     
     */
    public void setTp(TypeOfPrice9Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedTp(String value) {
        this.xtndedTp = value;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public void setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
    }

    /**
     * Gets the value of the valInInvstmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valInInvstmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValInInvstmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValue1 }
     * 
     * 
     * @return
     *     The value of the valInInvstmtCcy property.
     */
    public List<PriceValue1> getValInInvstmtCcy() {
        if (valInInvstmtCcy == null) {
            valInInvstmtCcy = new ArrayList<>();
        }
        return this.valInInvstmtCcy;
    }

    /**
     * Gets the value of the valInAltrntvCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valInAltrntvCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValInAltrntvCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValue1 }
     * 
     * 
     * @return
     *     The value of the valInAltrntvCcy property.
     */
    public List<PriceValue1> getValInAltrntvCcy() {
        if (valInAltrntvCcy == null) {
            valInAltrntvCcy = new ArrayList<>();
        }
        return this.valInAltrntvCcy;
    }

    /**
     * Gets the value of the forExctnInd property.
     * 
     */
    public boolean isForExctnInd() {
        return forExctnInd;
    }

    /**
     * Sets the value of the forExctnInd property.
     * 
     */
    public void setForExctnInd(boolean value) {
        this.forExctnInd = value;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public void setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
    }

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClctnBsis(BigDecimal value) {
        this.clctnBsis = value;
    }

    /**
     * Gets the value of the estmtdPricInd property.
     * 
     */
    public boolean isEstmtdPricInd() {
        return estmtdPricInd;
    }

    /**
     * Sets the value of the estmtdPricInd property.
     * 
     */
    public void setEstmtdPricInd(boolean value) {
        this.estmtdPricInd = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTaxblIncmPerShr(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerShr = value;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculated2Code getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public void setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
        this.taxblIncmPerShrClctd = value;
    }

    /**
     * Gets the value of the xtndedTaxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTaxblIncmPerShrClctd() {
        return xtndedTaxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the xtndedTaxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedTaxblIncmPerShrClctd(String value) {
        this.xtndedTaxblIncmPerShrClctd = value;
    }

    /**
     * Gets the value of the taxblIncmPerDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxblIncmPerDvdd() {
        return taxblIncmPerDvdd;
    }

    /**
     * Sets the value of the taxblIncmPerDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTaxblIncmPerDvdd(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerDvdd = value;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public EUDividendStatus1Code getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public void setEUDvddSts(EUDividendStatus1Code value) {
        this.euDvddSts = value;
    }

    /**
     * Gets the value of the xtndedEUDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUDvddSts() {
        return xtndedEUDvddSts;
    }

    /**
     * Sets the value of the xtndedEUDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedEUDvddSts(String value) {
        this.xtndedEUDvddSts = value;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge15 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge15> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the taxLbltyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxLbltyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLbltyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax17 }
     * 
     * 
     * @return
     *     The value of the taxLbltyDtls property.
     */
    public List<Tax17> getTaxLbltyDtls() {
        if (taxLbltyDtls == null) {
            taxLbltyDtls = new ArrayList<>();
        }
        return this.taxLbltyDtls;
    }

    /**
     * Gets the value of the taxRfndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRfndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRfndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax17 }
     * 
     * 
     * @return
     *     The value of the taxRfndDtls property.
     */
    public List<Tax17> getTaxRfndDtls() {
        if (taxRfndDtls == null) {
            taxRfndDtls = new ArrayList<>();
        }
        return this.taxRfndDtls;
    }

}
