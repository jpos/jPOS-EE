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

package org.jpos.iso20022.seev_035_001_14;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateAndAmountFormat41Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateAndAmountFormat41Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PercentageRate"/>
 *         <element name="NotSpcfdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateValueType7Code"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="RateTpAndRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateTypeAndPercentageRate8"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAndAmountFormat41Choice", propOrder = {
    "rate",
    "notSpcfdRate",
    "amt",
    "rateTpAndRate"
})
public class RateAndAmountFormat41Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType7Code notSpcfdRate;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateTpAndRate")
    protected RateTypeAndPercentageRate8 rateTpAndRate;

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
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType7Code }
     *     
     */
    public RateValueType7Code getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType7Code }
     *     
     */
    public void setNotSpcfdRate(RateValueType7Code value) {
        this.notSpcfdRate = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rateTpAndRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndPercentageRate8 }
     *     
     */
    public RateTypeAndPercentageRate8 getRateTpAndRate() {
        return rateTpAndRate;
    }

    /**
     * Sets the value of the rateTpAndRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndPercentageRate8 }
     *     
     */
    public void setRateTpAndRate(RateTypeAndPercentageRate8 value) {
        this.rateTpAndRate = value;
    }

}
