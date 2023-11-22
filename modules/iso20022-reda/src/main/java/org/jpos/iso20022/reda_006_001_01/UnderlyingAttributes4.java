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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingAttributes4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnderlyingAttributes4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllcnPctg" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="SttlmTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}SettlementType3Choice" minOccurs="0"/>
 *         <element name="CshAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="DrtyPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="EndPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Price8" minOccurs="0"/>
 *         <element name="StartVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CurVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EndVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AdjstdQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="CapVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingAttributes4", propOrder = {
    "allcnPctg",
    "qty",
    "sttlmTp",
    "cshAmt",
    "cshTp",
    "pric",
    "drtyPric",
    "endPric",
    "startVal",
    "curVal",
    "endVal",
    "adjstdQty",
    "xchgRate",
    "capVal"
})
public class UnderlyingAttributes4 {

    @XmlElement(name = "AllcnPctg")
    protected BigDecimal allcnPctg;
    @XmlElement(name = "Qty")
    protected UnitOrFaceAmount1Choice qty;
    @XmlElement(name = "SttlmTp")
    protected SettlementType3Choice sttlmTp;
    @XmlElement(name = "CshAmt")
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CshTp")
    protected String cshTp;
    @XmlElement(name = "Pric")
    protected Price8 pric;
    @XmlElement(name = "DrtyPric")
    protected Price8 drtyPric;
    @XmlElement(name = "EndPric")
    protected Price8 endPric;
    @XmlElement(name = "StartVal")
    protected ActiveCurrencyAndAmount startVal;
    @XmlElement(name = "CurVal")
    protected ActiveCurrencyAndAmount curVal;
    @XmlElement(name = "EndVal")
    protected ActiveCurrencyAndAmount endVal;
    @XmlElement(name = "AdjstdQty")
    protected UnitOrFaceAmount1Choice adjstdQty;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CapVal")
    protected ActiveCurrencyAndAmount capVal;

    /**
     * Gets the value of the allcnPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllcnPctg() {
        return allcnPctg;
    }

    /**
     * Sets the value of the allcnPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllcnPctg(BigDecimal value) {
        this.allcnPctg = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setQty(UnitOrFaceAmount1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType3Choice }
     *     
     */
    public SettlementType3Choice getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType3Choice }
     *     
     */
    public void setSttlmTp(SettlementType3Choice value) {
        this.sttlmTp = value;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
    }

    /**
     * Gets the value of the cshTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshTp() {
        return cshTp;
    }

    /**
     * Sets the value of the cshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshTp(String value) {
        this.cshTp = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setPric(Price8 value) {
        this.pric = value;
    }

    /**
     * Gets the value of the drtyPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getDrtyPric() {
        return drtyPric;
    }

    /**
     * Sets the value of the drtyPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setDrtyPric(Price8 value) {
        this.drtyPric = value;
    }

    /**
     * Gets the value of the endPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getEndPric() {
        return endPric;
    }

    /**
     * Sets the value of the endPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setEndPric(Price8 value) {
        this.endPric = value;
    }

    /**
     * Gets the value of the startVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStartVal() {
        return startVal;
    }

    /**
     * Sets the value of the startVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStartVal(ActiveCurrencyAndAmount value) {
        this.startVal = value;
    }

    /**
     * Gets the value of the curVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCurVal() {
        return curVal;
    }

    /**
     * Sets the value of the curVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCurVal(ActiveCurrencyAndAmount value) {
        this.curVal = value;
    }

    /**
     * Gets the value of the endVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEndVal() {
        return endVal;
    }

    /**
     * Sets the value of the endVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEndVal(ActiveCurrencyAndAmount value) {
        this.endVal = value;
    }

    /**
     * Gets the value of the adjstdQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getAdjstdQty() {
        return adjstdQty;
    }

    /**
     * Sets the value of the adjstdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setAdjstdQty(UnitOrFaceAmount1Choice value) {
        this.adjstdQty = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the capVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCapVal() {
        return capVal;
    }

    /**
     * Sets the value of the capVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCapVal(ActiveCurrencyAndAmount value) {
        this.capVal = value;
    }

}
