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

package org.jpos.iso20022.semt_041_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Price6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateOrAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PriceRateOrAmountChoice"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}TypeOfPrice13Code"/>
 *         <element name="Src" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}PriceSource2Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price6", propOrder = {
    "rateOrAmt",
    "tp",
    "src"
})
public class Price6 {

    @XmlElement(name = "RateOrAmt", required = true)
    protected PriceRateOrAmountChoice rateOrAmt;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfPrice13Code tp;
    @XmlElement(name = "Src", required = true)
    @XmlSchemaType(name = "string")
    protected PriceSource2Code src;

    /**
     * Gets the value of the rateOrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getRateOrAmt() {
        return rateOrAmt;
    }

    /**
     * Sets the value of the rateOrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public void setRateOrAmt(PriceRateOrAmountChoice value) {
        this.rateOrAmt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice13Code }
     *     
     */
    public TypeOfPrice13Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice13Code }
     *     
     */
    public void setTp(TypeOfPrice13Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSource2Code }
     *     
     */
    public PriceSource2Code getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSource2Code }
     *     
     */
    public void setSrc(PriceSource2Code value) {
        this.src = value;
    }

}
