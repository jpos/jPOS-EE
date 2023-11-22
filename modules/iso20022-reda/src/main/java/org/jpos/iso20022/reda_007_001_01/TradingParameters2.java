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

package org.jpos.iso20022.reda_007_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingParameters2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradingParameters2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MktId" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="RndLot" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="TradLotSz" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="ScndryPlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}MICIdentifier" maxOccurs="5" minOccurs="0"/>
 *         <element name="MinTraddNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="MaxTraddNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="MinTradgPricgIncrmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *         <element name="PmryPlcOfListgId" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}MICIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingParameters2", propOrder = {
    "mktId",
    "rndLot",
    "tradLotSz",
    "scndryPlcOfListg",
    "minTraddNmnlQty",
    "maxTraddNmnlQty",
    "minTradgPricgIncrmt",
    "pmryPlcOfListgId"
})
public class TradingParameters2 {

    @XmlElement(name = "MktId")
    protected String mktId;
    @XmlElement(name = "RndLot")
    protected FinancialInstrumentQuantity1Choice rndLot;
    @XmlElement(name = "TradLotSz")
    protected FinancialInstrumentQuantity1Choice tradLotSz;
    @XmlElement(name = "ScndryPlcOfListg")
    protected List<String> scndryPlcOfListg;
    @XmlElement(name = "MinTraddNmnlQty")
    protected UnitOrFaceAmount1Choice minTraddNmnlQty;
    @XmlElement(name = "MaxTraddNmnlQty")
    protected UnitOrFaceAmount1Choice maxTraddNmnlQty;
    @XmlElement(name = "MinTradgPricgIncrmt")
    protected BigDecimal minTradgPricgIncrmt;
    @XmlElement(name = "PmryPlcOfListgId")
    protected String pmryPlcOfListgId;

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktId(String value) {
        this.mktId = value;
    }

    /**
     * Gets the value of the rndLot property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getRndLot() {
        return rndLot;
    }

    /**
     * Sets the value of the rndLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setRndLot(FinancialInstrumentQuantity1Choice value) {
        this.rndLot = value;
    }

    /**
     * Gets the value of the tradLotSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTradLotSz() {
        return tradLotSz;
    }

    /**
     * Sets the value of the tradLotSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setTradLotSz(FinancialInstrumentQuantity1Choice value) {
        this.tradLotSz = value;
    }

    /**
     * Gets the value of the scndryPlcOfListg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryPlcOfListg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryPlcOfListg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the scndryPlcOfListg property.
     */
    public List<String> getScndryPlcOfListg() {
        if (scndryPlcOfListg == null) {
            scndryPlcOfListg = new ArrayList<>();
        }
        return this.scndryPlcOfListg;
    }

    /**
     * Gets the value of the minTraddNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinTraddNmnlQty() {
        return minTraddNmnlQty;
    }

    /**
     * Sets the value of the minTraddNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMinTraddNmnlQty(UnitOrFaceAmount1Choice value) {
        this.minTraddNmnlQty = value;
    }

    /**
     * Gets the value of the maxTraddNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMaxTraddNmnlQty() {
        return maxTraddNmnlQty;
    }

    /**
     * Sets the value of the maxTraddNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMaxTraddNmnlQty(UnitOrFaceAmount1Choice value) {
        this.maxTraddNmnlQty = value;
    }

    /**
     * Gets the value of the minTradgPricgIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTradgPricgIncrmt() {
        return minTradgPricgIncrmt;
    }

    /**
     * Sets the value of the minTradgPricgIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinTradgPricgIncrmt(BigDecimal value) {
        this.minTradgPricgIncrmt = value;
    }

    /**
     * Gets the value of the pmryPlcOfListgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmryPlcOfListgId() {
        return pmryPlcOfListgId;
    }

    /**
     * Sets the value of the pmryPlcOfListgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmryPlcOfListgId(String value) {
        this.pmryPlcOfListgId = value;
    }

}
