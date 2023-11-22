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

package org.jpos.iso20022.camt_070_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderTotalAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderTotalAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SetPrdfndOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}TotalAmountAndCurrency1"/>
 *         <element name="PdgPrdfndOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}TotalAmountAndCurrency1"/>
 *         <element name="SetStgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}TotalAmountAndCurrency1"/>
 *         <element name="PdgStgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}TotalAmountAndCurrency1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderTotalAmount1", propOrder = {
    "setPrdfndOrdr",
    "pdgPrdfndOrdr",
    "setStgOrdr",
    "pdgStgOrdr"
})
public class StandingOrderTotalAmount1 {

    @XmlElement(name = "SetPrdfndOrdr", required = true)
    protected TotalAmountAndCurrency1 setPrdfndOrdr;
    @XmlElement(name = "PdgPrdfndOrdr", required = true)
    protected TotalAmountAndCurrency1 pdgPrdfndOrdr;
    @XmlElement(name = "SetStgOrdr", required = true)
    protected TotalAmountAndCurrency1 setStgOrdr;
    @XmlElement(name = "PdgStgOrdr", required = true)
    protected TotalAmountAndCurrency1 pdgStgOrdr;

    /**
     * Gets the value of the setPrdfndOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getSetPrdfndOrdr() {
        return setPrdfndOrdr;
    }

    /**
     * Sets the value of the setPrdfndOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public void setSetPrdfndOrdr(TotalAmountAndCurrency1 value) {
        this.setPrdfndOrdr = value;
    }

    /**
     * Gets the value of the pdgPrdfndOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getPdgPrdfndOrdr() {
        return pdgPrdfndOrdr;
    }

    /**
     * Sets the value of the pdgPrdfndOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public void setPdgPrdfndOrdr(TotalAmountAndCurrency1 value) {
        this.pdgPrdfndOrdr = value;
    }

    /**
     * Gets the value of the setStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getSetStgOrdr() {
        return setStgOrdr;
    }

    /**
     * Sets the value of the setStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public void setSetStgOrdr(TotalAmountAndCurrency1 value) {
        this.setStgOrdr = value;
    }

    /**
     * Gets the value of the pdgStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public TotalAmountAndCurrency1 getPdgStgOrdr() {
        return pdgStgOrdr;
    }

    /**
     * Sets the value of the pdgStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountAndCurrency1 }
     *     
     */
    public void setPdgStgOrdr(TotalAmountAndCurrency1 value) {
        this.pdgStgOrdr = value;
    }

}
