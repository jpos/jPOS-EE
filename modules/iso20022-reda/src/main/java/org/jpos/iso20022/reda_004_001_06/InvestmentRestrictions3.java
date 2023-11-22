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

package org.jpos.iso20022.reda_004_001_06;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentRestrictions3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentRestrictions3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MinInitlSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinInitlSbcptUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="MinSbsqntSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinSbsqntSbcptUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="MaxRedAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MaxRedUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber" minOccurs="0"/>
 *         <element name="MinRedPctg" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber" minOccurs="0"/>
 *         <element name="OthrRedRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="MinSwtchSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinSwtchSbcptUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber" minOccurs="0"/>
 *         <element name="MaxSwtchRedAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MaxSwtchRedUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber" minOccurs="0"/>
 *         <element name="OthrSwtchRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="MinHldgAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinHldgUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber" minOccurs="0"/>
 *         <element name="MinHldgPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max70Text" minOccurs="0"/>
 *         <element name="HldgTrfbl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}HoldingTransferable1Code" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentRestrictions3", propOrder = {
    "minInitlSbcptAmt",
    "minInitlSbcptUnits",
    "minSbsqntSbcptAmt",
    "minSbsqntSbcptUnits",
    "maxRedAmt",
    "maxRedUnits",
    "minRedPctg",
    "othrRedRstrctns",
    "minSwtchSbcptAmt",
    "minSwtchSbcptUnits",
    "maxSwtchRedAmt",
    "maxSwtchRedUnits",
    "othrSwtchRstrctns",
    "minHldgAmt",
    "minHldgUnits",
    "minHldgPrd",
    "hldgTrfbl",
    "addtlInf"
})
public class InvestmentRestrictions3 {

    @XmlElement(name = "MinInitlSbcptAmt")
    protected ActiveCurrencyAndAmount minInitlSbcptAmt;
    @XmlElement(name = "MinInitlSbcptUnits")
    protected BigDecimal minInitlSbcptUnits;
    @XmlElement(name = "MinSbsqntSbcptAmt")
    protected ActiveCurrencyAndAmount minSbsqntSbcptAmt;
    @XmlElement(name = "MinSbsqntSbcptUnits")
    protected BigDecimal minSbsqntSbcptUnits;
    @XmlElement(name = "MaxRedAmt")
    protected ActiveCurrencyAndAmount maxRedAmt;
    @XmlElement(name = "MaxRedUnits")
    protected BigDecimal maxRedUnits;
    @XmlElement(name = "MinRedPctg")
    protected BigDecimal minRedPctg;
    @XmlElement(name = "OthrRedRstrctns")
    protected String othrRedRstrctns;
    @XmlElement(name = "MinSwtchSbcptAmt")
    protected ActiveCurrencyAndAmount minSwtchSbcptAmt;
    @XmlElement(name = "MinSwtchSbcptUnits")
    protected BigDecimal minSwtchSbcptUnits;
    @XmlElement(name = "MaxSwtchRedAmt")
    protected ActiveCurrencyAndAmount maxSwtchRedAmt;
    @XmlElement(name = "MaxSwtchRedUnits")
    protected BigDecimal maxSwtchRedUnits;
    @XmlElement(name = "OthrSwtchRstrctns")
    protected String othrSwtchRstrctns;
    @XmlElement(name = "MinHldgAmt")
    protected ActiveCurrencyAndAmount minHldgAmt;
    @XmlElement(name = "MinHldgUnits")
    protected BigDecimal minHldgUnits;
    @XmlElement(name = "MinHldgPrd")
    protected String minHldgPrd;
    @XmlElement(name = "HldgTrfbl")
    @XmlSchemaType(name = "string")
    protected HoldingTransferable1Code hldgTrfbl;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the minInitlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinInitlSbcptAmt() {
        return minInitlSbcptAmt;
    }

    /**
     * Sets the value of the minInitlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinInitlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minInitlSbcptAmt = value;
    }

    /**
     * Gets the value of the minInitlSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinInitlSbcptUnits() {
        return minInitlSbcptUnits;
    }

    /**
     * Sets the value of the minInitlSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinInitlSbcptUnits(BigDecimal value) {
        this.minInitlSbcptUnits = value;
    }

    /**
     * Gets the value of the minSbsqntSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSbsqntSbcptAmt() {
        return minSbsqntSbcptAmt;
    }

    /**
     * Sets the value of the minSbsqntSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinSbsqntSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minSbsqntSbcptAmt = value;
    }

    /**
     * Gets the value of the minSbsqntSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSbsqntSbcptUnits() {
        return minSbsqntSbcptUnits;
    }

    /**
     * Sets the value of the minSbsqntSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinSbsqntSbcptUnits(BigDecimal value) {
        this.minSbsqntSbcptUnits = value;
    }

    /**
     * Gets the value of the maxRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxRedAmt() {
        return maxRedAmt;
    }

    /**
     * Sets the value of the maxRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMaxRedAmt(ActiveCurrencyAndAmount value) {
        this.maxRedAmt = value;
    }

    /**
     * Gets the value of the maxRedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRedUnits() {
        return maxRedUnits;
    }

    /**
     * Sets the value of the maxRedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRedUnits(BigDecimal value) {
        this.maxRedUnits = value;
    }

    /**
     * Gets the value of the minRedPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinRedPctg() {
        return minRedPctg;
    }

    /**
     * Sets the value of the minRedPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinRedPctg(BigDecimal value) {
        this.minRedPctg = value;
    }

    /**
     * Gets the value of the othrRedRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRedRstrctns() {
        return othrRedRstrctns;
    }

    /**
     * Sets the value of the othrRedRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRedRstrctns(String value) {
        this.othrRedRstrctns = value;
    }

    /**
     * Gets the value of the minSwtchSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSwtchSbcptAmt() {
        return minSwtchSbcptAmt;
    }

    /**
     * Sets the value of the minSwtchSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinSwtchSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minSwtchSbcptAmt = value;
    }

    /**
     * Gets the value of the minSwtchSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSwtchSbcptUnits() {
        return minSwtchSbcptUnits;
    }

    /**
     * Sets the value of the minSwtchSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinSwtchSbcptUnits(BigDecimal value) {
        this.minSwtchSbcptUnits = value;
    }

    /**
     * Gets the value of the maxSwtchRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxSwtchRedAmt() {
        return maxSwtchRedAmt;
    }

    /**
     * Sets the value of the maxSwtchRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMaxSwtchRedAmt(ActiveCurrencyAndAmount value) {
        this.maxSwtchRedAmt = value;
    }

    /**
     * Gets the value of the maxSwtchRedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSwtchRedUnits() {
        return maxSwtchRedUnits;
    }

    /**
     * Sets the value of the maxSwtchRedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSwtchRedUnits(BigDecimal value) {
        this.maxSwtchRedUnits = value;
    }

    /**
     * Gets the value of the othrSwtchRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSwtchRstrctns() {
        return othrSwtchRstrctns;
    }

    /**
     * Sets the value of the othrSwtchRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrSwtchRstrctns(String value) {
        this.othrSwtchRstrctns = value;
    }

    /**
     * Gets the value of the minHldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinHldgAmt() {
        return minHldgAmt;
    }

    /**
     * Sets the value of the minHldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinHldgAmt(ActiveCurrencyAndAmount value) {
        this.minHldgAmt = value;
    }

    /**
     * Gets the value of the minHldgUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinHldgUnits() {
        return minHldgUnits;
    }

    /**
     * Sets the value of the minHldgUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinHldgUnits(BigDecimal value) {
        this.minHldgUnits = value;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHldgPrd(String value) {
        this.minHldgPrd = value;
    }

    /**
     * Gets the value of the hldgTrfbl property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingTransferable1Code }
     *     
     */
    public HoldingTransferable1Code getHldgTrfbl() {
        return hldgTrfbl;
    }

    /**
     * Sets the value of the hldgTrfbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingTransferable1Code }
     *     
     */
    public void setHldgTrfbl(HoldingTransferable1Code value) {
        this.hldgTrfbl = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
