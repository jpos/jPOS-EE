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

package org.jpos.iso20022.seev_009_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceRate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceRate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PriceRateType3FormatChoice"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PercentageRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRate1", propOrder = {
    "rateTp",
    "rate"
})
public class PriceRate1 {

    @XmlElement(name = "RateTp", required = true)
    protected PriceRateType3FormatChoice rateTp;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateType3FormatChoice }
     *     
     */
    public PriceRateType3FormatChoice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateType3FormatChoice }
     *     
     */
    public void setRateTp(PriceRateType3FormatChoice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
