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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxCalculationInformation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxCalculationInformation4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="EUCptlGn" type="{urn:swift:xsd:reda.001.001.04}EUCapitalGain2Code" minOccurs="0"/>
 *           <element name="XtndedEUCptlGn" type="{urn:swift:xsd:reda.001.001.04}Extended350Code" minOccurs="0"/>
 *         </choice>
 *         <element name="PctgOfDebtClm" type="{urn:swift:xsd:reda.001.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="PctgGrdfthdDebt" type="{urn:swift:xsd:reda.001.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="TaxblIncmPerDvdd" type="{urn:swift:xsd:reda.001.001.04}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <choice>
 *           <element name="EUDvddSts" type="{urn:swift:xsd:reda.001.001.04}EUDividendStatus1Code" minOccurs="0"/>
 *           <element name="XtndedEUDvddSts" type="{urn:swift:xsd:reda.001.001.04}Extended350Code" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculationInformation4", propOrder = {
    "euCptlGn",
    "xtndedEUCptlGn",
    "pctgOfDebtClm",
    "pctgGrdfthdDebt",
    "taxblIncmPerDvdd",
    "euDvddSts",
    "xtndedEUDvddSts"
})
public class TaxCalculationInformation4 {

    @XmlElement(name = "EUCptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code euCptlGn;
    @XmlElement(name = "XtndedEUCptlGn")
    protected String xtndedEUCptlGn;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "PctgGrdfthdDebt")
    protected BigDecimal pctgGrdfthdDebt;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    @XmlSchemaType(name = "string")
    protected EUDividendStatus1Code euDvddSts;
    @XmlElement(name = "XtndedEUDvddSts")
    protected String xtndedEUDvddSts;

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public void setEUCptlGn(EUCapitalGain2Code value) {
        this.euCptlGn = value;
    }

    /**
     * Gets the value of the xtndedEUCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUCptlGn() {
        return xtndedEUCptlGn;
    }

    /**
     * Sets the value of the xtndedEUCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedEUCptlGn(String value) {
        this.xtndedEUCptlGn = value;
    }

    /**
     * Gets the value of the pctgOfDebtClm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClm() {
        return pctgOfDebtClm;
    }

    /**
     * Sets the value of the pctgOfDebtClm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfDebtClm(BigDecimal value) {
        this.pctgOfDebtClm = value;
    }

    /**
     * Gets the value of the pctgGrdfthdDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgGrdfthdDebt() {
        return pctgGrdfthdDebt;
    }

    /**
     * Sets the value of the pctgGrdfthdDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgGrdfthdDebt(BigDecimal value) {
        this.pctgGrdfthdDebt = value;
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

}
