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

package org.jpos.iso20022.colr_021_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateOrName4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateOrName4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}PercentageRate"/>
 *         <element name="RateIndxDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}RateTypeAndLookback2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateOrName4Choice", propOrder = {
    "rate",
    "rateIndxDtls"
})
public class RateOrName4Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateIndxDtls")
    protected RateTypeAndLookback2 rateIndxDtls;

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

    /**
     * Gets the value of the rateIndxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndLookback2 }
     *     
     */
    public RateTypeAndLookback2 getRateIndxDtls() {
        return rateIndxDtls;
    }

    /**
     * Sets the value of the rateIndxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndLookback2 }
     *     
     */
    public void setRateIndxDtls(RateTypeAndLookback2 value) {
        this.rateIndxDtls = value;
    }

}
