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
 * <p>Java class for PriceFormat1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceFormat1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountPrice1"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PercentageRate"/>
 *         <element name="AmtPricPerFinInstrmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountPricePerFinancialInstrumentQuantity1"/>
 *         <element name="AmtPricPerAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountPricePerAmount1"/>
 *         <element name="NotSpcfd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PriceValueType6FormatChoice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat1Choice", propOrder = {
    "amt",
    "rate",
    "amtPricPerFinInstrmQty",
    "amtPricPerAmt",
    "notSpcfd"
})
public class PriceFormat1Choice {

    @XmlElement(name = "Amt")
    protected AmountPrice1 amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "AmtPricPerFinInstrmQty")
    protected AmountPricePerFinancialInstrumentQuantity1 amtPricPerFinInstrmQty;
    @XmlElement(name = "AmtPricPerAmt")
    protected AmountPricePerAmount1 amtPricPerAmt;
    @XmlElement(name = "NotSpcfd")
    protected PriceValueType6FormatChoice notSpcfd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1 }
     *     
     */
    public AmountPrice1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1 }
     *     
     */
    public void setAmt(AmountPrice1 value) {
        this.amt = value;
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

    /**
     * Gets the value of the amtPricPerFinInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity1 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity1 getAmtPricPerFinInstrmQty() {
        return amtPricPerFinInstrmQty;
    }

    /**
     * Sets the value of the amtPricPerFinInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity1 }
     *     
     */
    public void setAmtPricPerFinInstrmQty(AmountPricePerFinancialInstrumentQuantity1 value) {
        this.amtPricPerFinInstrmQty = value;
    }

    /**
     * Gets the value of the amtPricPerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerAmount1 }
     *     
     */
    public AmountPricePerAmount1 getAmtPricPerAmt() {
        return amtPricPerAmt;
    }

    /**
     * Sets the value of the amtPricPerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerAmount1 }
     *     
     */
    public void setAmtPricPerAmt(AmountPricePerAmount1 value) {
        this.amtPricPerAmt = value;
    }

    /**
     * Gets the value of the notSpcfd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType6FormatChoice }
     *     
     */
    public PriceValueType6FormatChoice getNotSpcfd() {
        return notSpcfd;
    }

    /**
     * Sets the value of the notSpcfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType6FormatChoice }
     *     
     */
    public void setNotSpcfd(PriceValueType6FormatChoice value) {
        this.notSpcfd = value;
    }

}
