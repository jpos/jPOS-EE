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

package org.jpos.iso20022.colr_022_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationFactorBreakdown1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValuationFactorBreakdown1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValtnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="InfltnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="PoolFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BaseOneRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationFactorBreakdown1", propOrder = {
    "valtnFctr",
    "infltnFctr",
    "hrcut",
    "poolFctr"
})
public class ValuationFactorBreakdown1 {

    @XmlElement(name = "ValtnFctr")
    protected BigDecimal valtnFctr;
    @XmlElement(name = "InfltnFctr")
    protected BigDecimal infltnFctr;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "PoolFctr")
    protected BigDecimal poolFctr;

    /**
     * Gets the value of the valtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValtnFctr() {
        return valtnFctr;
    }

    /**
     * Sets the value of the valtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValtnFctr(BigDecimal value) {
        this.valtnFctr = value;
    }

    /**
     * Gets the value of the infltnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfltnFctr() {
        return infltnFctr;
    }

    /**
     * Sets the value of the infltnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfltnFctr(BigDecimal value) {
        this.infltnFctr = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

    /**
     * Gets the value of the poolFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoolFctr() {
        return poolFctr;
    }

    /**
     * Sets the value of the poolFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPoolFctr(BigDecimal value) {
        this.poolFctr = value;
    }

}
