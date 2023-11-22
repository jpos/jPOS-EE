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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitPrice20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnitPrice20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricTp" type="{urn:swift:xsd:semt.007.001.03}UnitPriceType2Choice"/>
 *         <element name="Val" type="{urn:swift:xsd:semt.007.001.03}PriceValue1"/>
 *         <element name="PricMtd" type="{urn:swift:xsd:semt.007.001.03}PriceMethod1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice20", propOrder = {
    "pricTp",
    "val",
    "pricMtd"
})
public class UnitPrice20 {

    @XmlElement(name = "PricTp", required = true)
    protected UnitPriceType2Choice pricTp;
    @XmlElement(name = "Val", required = true)
    protected PriceValue1 val;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;

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

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public void setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
    }

}
