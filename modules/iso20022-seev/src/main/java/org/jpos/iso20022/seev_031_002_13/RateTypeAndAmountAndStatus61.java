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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeAndAmountAndStatus61 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateTypeAndAmountAndStatus61">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateType82Choice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="RateSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateStatus4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndAmountAndStatus61", propOrder = {
    "rateTp",
    "amt",
    "rateSts"
})
public class RateTypeAndAmountAndStatus61 {

    @XmlElement(name = "RateTp", required = true)
    protected RateType82Choice rateTp;
    @XmlElement(name = "Amt", required = true)
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateSts")
    protected RateStatus4Choice rateSts;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType82Choice }
     *     
     */
    public RateType82Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType82Choice }
     *     
     */
    public void setRateTp(RateType82Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateStatus4Choice }
     *     
     */
    public RateStatus4Choice getRateSts() {
        return rateSts;
    }

    /**
     * Sets the value of the rateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateStatus4Choice }
     *     
     */
    public void setRateSts(RateStatus4Choice value) {
        this.rateSts = value;
    }

}
