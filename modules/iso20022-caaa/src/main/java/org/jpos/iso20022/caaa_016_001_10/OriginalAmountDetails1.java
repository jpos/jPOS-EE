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

package org.jpos.iso20022.caaa_016_001_10;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalAmountDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalAmountDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.016.001.10}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.016.001.10}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.016.001.10}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalAmountDetails1", propOrder = {
    "actlAmt",
    "minAmt",
    "maxAmt"
})
public class OriginalAmountDetails1 {

    @XmlElement(name = "ActlAmt")
    protected BigDecimal actlAmt;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;

    /**
     * Gets the value of the actlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActlAmt() {
        return actlAmt;
    }

    /**
     * Sets the value of the actlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActlAmt(BigDecimal value) {
        this.actlAmt = value;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

}
