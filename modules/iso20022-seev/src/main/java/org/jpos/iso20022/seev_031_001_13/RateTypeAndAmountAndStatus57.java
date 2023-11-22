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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeAndAmountAndStatus57 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateTypeAndAmountAndStatus57">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateType78Choice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="RateSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateStatus3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndAmountAndStatus57", propOrder = {
    "rateTp",
    "amt",
    "rateSts"
})
public class RateTypeAndAmountAndStatus57 {

    @XmlElement(name = "RateTp", required = true)
    protected RateType78Choice rateTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateSts")
    protected RateStatus3Choice rateSts;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType78Choice }
     *     
     */
    public RateType78Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType78Choice }
     *     
     */
    public void setRateTp(RateType78Choice value) {
        this.rateTp = value;
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
     * Gets the value of the rateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateStatus3Choice }
     *     
     */
    public RateStatus3Choice getRateSts() {
        return rateSts;
    }

    /**
     * Sets the value of the rateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateStatus3Choice }
     *     
     */
    public void setRateSts(RateStatus3Choice value) {
        this.rateSts = value;
    }

}
