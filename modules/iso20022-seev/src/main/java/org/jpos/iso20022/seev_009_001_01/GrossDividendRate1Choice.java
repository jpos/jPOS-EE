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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrossDividendRate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GrossDividendRate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NotSpcfdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateValueType2FormatChoice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="RateTpAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}GrossDividendRate2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossDividendRate1Choice", propOrder = {
    "notSpcfdRate",
    "amt",
    "rateTpAmt"
})
public class GrossDividendRate1Choice {

    @XmlElement(name = "NotSpcfdRate")
    protected RateValueType2FormatChoice notSpcfdRate;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "RateTpAmt")
    protected GrossDividendRate2 rateTpAmt;

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType2FormatChoice }
     *     
     */
    public RateValueType2FormatChoice getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType2FormatChoice }
     *     
     */
    public void setNotSpcfdRate(RateValueType2FormatChoice value) {
        this.notSpcfdRate = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rateTpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link GrossDividendRate2 }
     *     
     */
    public GrossDividendRate2 getRateTpAmt() {
        return rateTpAmt;
    }

    /**
     * Sets the value of the rateTpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossDividendRate2 }
     *     
     */
    public void setRateTpAmt(GrossDividendRate2 value) {
        this.rateTpAmt = value;
    }

}
