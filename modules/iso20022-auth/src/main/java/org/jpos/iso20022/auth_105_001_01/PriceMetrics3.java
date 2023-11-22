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

package org.jpos.iso20022.auth_105_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMetrics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceMetrics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rates" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}Rates3" minOccurs="0"/>
 *         <element name="LndgFee" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceMetrics3", propOrder = {
    "rates",
    "lndgFee"
})
public class PriceMetrics3 {

    @XmlElement(name = "Rates")
    protected Rates3 rates;
    @XmlElement(name = "LndgFee")
    protected BigDecimal lndgFee;

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates3 }
     *     
     */
    public Rates3 getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates3 }
     *     
     */
    public void setRates(Rates3 value) {
        this.rates = value;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLndgFee(BigDecimal value) {
        this.lndgFee = value;
    }

}
