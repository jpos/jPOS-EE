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

package org.jpos.iso20022.colr_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationMargin1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VariationMargin1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ThrshldAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="ThrshldTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ThresholdType1Code" minOccurs="0"/>
 *         <element name="MinTrfAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="RndgAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="RndgMtd" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}RoundingMethod1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationMargin1", propOrder = {
    "thrshldAmt",
    "thrshldTp",
    "minTrfAmt",
    "rndgAmt",
    "rndgMtd"
})
public class VariationMargin1 {

    @XmlElement(name = "ThrshldAmt", required = true)
    protected ActiveCurrencyAndAmount thrshldAmt;
    @XmlElement(name = "ThrshldTp")
    @XmlSchemaType(name = "string")
    protected ThresholdType1Code thrshldTp;
    @XmlElement(name = "MinTrfAmt", required = true)
    protected ActiveCurrencyAndAmount minTrfAmt;
    @XmlElement(name = "RndgAmt", required = true)
    protected ActiveCurrencyAndAmount rndgAmt;
    @XmlElement(name = "RndgMtd", required = true)
    @XmlSchemaType(name = "string")
    protected RoundingMethod1Code rndgMtd;

    /**
     * Gets the value of the thrshldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getThrshldAmt() {
        return thrshldAmt;
    }

    /**
     * Sets the value of the thrshldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setThrshldAmt(ActiveCurrencyAndAmount value) {
        this.thrshldAmt = value;
    }

    /**
     * Gets the value of the thrshldTp property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdType1Code }
     *     
     */
    public ThresholdType1Code getThrshldTp() {
        return thrshldTp;
    }

    /**
     * Sets the value of the thrshldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdType1Code }
     *     
     */
    public void setThrshldTp(ThresholdType1Code value) {
        this.thrshldTp = value;
    }

    /**
     * Gets the value of the minTrfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinTrfAmt() {
        return minTrfAmt;
    }

    /**
     * Sets the value of the minTrfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinTrfAmt(ActiveCurrencyAndAmount value) {
        this.minTrfAmt = value;
    }

    /**
     * Gets the value of the rndgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRndgAmt() {
        return rndgAmt;
    }

    /**
     * Sets the value of the rndgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRndgAmt(ActiveCurrencyAndAmount value) {
        this.rndgAmt = value;
    }

    /**
     * Gets the value of the rndgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingMethod1Code }
     *     
     */
    public RoundingMethod1Code getRndgMtd() {
        return rndgMtd;
    }

    /**
     * Sets the value of the rndgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingMethod1Code }
     *     
     */
    public void setRndgMtd(RoundingMethod1Code value) {
        this.rndgMtd = value;
    }

}
