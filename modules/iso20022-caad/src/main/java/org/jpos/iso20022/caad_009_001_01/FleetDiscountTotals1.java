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

package org.jpos.iso20022.caad_009_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetDiscountTotals1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FleetDiscountTotals1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FuelAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NonFuelAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetDiscountTotals1", propOrder = {
    "ttlAmt",
    "fuelAmt",
    "nonFuelAmt"
})
public class FleetDiscountTotals1 {

    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "FuelAmt")
    protected BigDecimal fuelAmt;
    @XmlElement(name = "NonFuelAmt")
    protected BigDecimal nonFuelAmt;

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the fuelAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelAmt() {
        return fuelAmt;
    }

    /**
     * Sets the value of the fuelAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelAmt(BigDecimal value) {
        this.fuelAmt = value;
    }

    /**
     * Gets the value of the nonFuelAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonFuelAmt() {
        return nonFuelAmt;
    }

    /**
     * Sets the value of the nonFuelAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonFuelAmt(BigDecimal value) {
        this.nonFuelAmt = value;
    }

}
