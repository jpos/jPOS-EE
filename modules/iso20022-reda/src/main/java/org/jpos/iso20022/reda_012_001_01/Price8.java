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

package org.jpos.iso20022.reda_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Price8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}PriceValueType3Code" minOccurs="0"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}PriceRateOrAmount3Choice"/>
 *         <element name="PricTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}TypeOfPrice1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price8", propOrder = {
    "valTp",
    "val",
    "pricTp"
})
public class Price8 {

    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType3Code valTp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmount3Choice val;
    @XmlElement(name = "PricTp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice1Code pricTp;

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType3Code }
     *     
     */
    public PriceValueType3Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType3Code }
     *     
     */
    public void setValTp(PriceValueType3Code value) {
        this.valTp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public void setVal(PriceRateOrAmount3Choice value) {
        this.val = value;
    }

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice1Code }
     *     
     */
    public TypeOfPrice1Code getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice1Code }
     *     
     */
    public void setPricTp(TypeOfPrice1Code value) {
        this.pricTp = value;
    }

}
