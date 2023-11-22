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

package org.jpos.iso20022.camt_043_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitPrice19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnitPrice19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricTp" type="{urn:swift:xsd:camt.043.001.04}UnitPriceType2Choice"/>
 *         <element name="Val" type="{urn:swift:xsd:camt.043.001.04}PriceValue1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice19", propOrder = {
    "pricTp",
    "val"
})
public class UnitPrice19 {

    @XmlElement(name = "PricTp", required = true)
    protected UnitPriceType2Choice pricTp;
    @XmlElement(name = "Val", required = true)
    protected PriceValue1 val;

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType2Choice }
     *     
     */
    public UnitPriceType2Choice getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType2Choice }
     *     
     */
    public void setPricTp(UnitPriceType2Choice value) {
        this.pricTp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public void setVal(PriceValue1 value) {
        this.val = value;
    }

}
