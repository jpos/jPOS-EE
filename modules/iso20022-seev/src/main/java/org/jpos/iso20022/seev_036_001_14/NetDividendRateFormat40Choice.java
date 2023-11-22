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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDividendRateFormat40Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetDividendRateFormat40Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="AmtAndRateSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}AmountAndRateStatus1"/>
 *         <element name="RateTpAndAmtAndRateSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateTypeAndAmountAndStatus58"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDividendRateFormat40Choice", propOrder = {
    "amt",
    "amtAndRateSts",
    "rateTpAndAmtAndRateSts"
})
public class NetDividendRateFormat40Choice {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "AmtAndRateSts")
    protected AmountAndRateStatus1 amtAndRateSts;
    @XmlElement(name = "RateTpAndAmtAndRateSts")
    protected RateTypeAndAmountAndStatus58 rateTpAndAmtAndRateSts;

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
     * Gets the value of the amtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateStatus1 }
     *     
     */
    public AmountAndRateStatus1 getAmtAndRateSts() {
        return amtAndRateSts;
    }

    /**
     * Sets the value of the amtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateStatus1 }
     *     
     */
    public void setAmtAndRateSts(AmountAndRateStatus1 value) {
        this.amtAndRateSts = value;
    }

    /**
     * Gets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndAmountAndStatus58 }
     *     
     */
    public RateTypeAndAmountAndStatus58 getRateTpAndAmtAndRateSts() {
        return rateTpAndAmtAndRateSts;
    }

    /**
     * Sets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndAmountAndStatus58 }
     *     
     */
    public void setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus58 value) {
        this.rateTpAndAmtAndRateSts = value;
    }

}
