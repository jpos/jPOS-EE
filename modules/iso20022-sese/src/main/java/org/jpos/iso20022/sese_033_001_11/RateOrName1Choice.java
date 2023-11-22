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

package org.jpos.iso20022.sese_033_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateOrName1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateOrName1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}Rate2"/>
 *         <element name="RateNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}RateName1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateOrName1Choice", propOrder = {
    "rate",
    "rateNm"
})
public class RateOrName1Choice {

    @XmlElement(name = "Rate")
    protected Rate2 rate;
    @XmlElement(name = "RateNm")
    protected RateName1 rateNm;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setRate(Rate2 value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateNm property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getRateNm() {
        return rateNm;
    }

    /**
     * Sets the value of the rateNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public void setRateNm(RateName1 value) {
        this.rateNm = value;
    }

}
