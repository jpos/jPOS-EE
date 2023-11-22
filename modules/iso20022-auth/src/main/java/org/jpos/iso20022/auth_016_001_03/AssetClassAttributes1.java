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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassAttributes1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassAttributes1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DerivativeInterest2"/>
 *         <element name="FX" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DerivativeForeignExchange2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAttributes1", propOrder = {
    "intrst",
    "fx"
})
public class AssetClassAttributes1 {

    @XmlElement(name = "Intrst", required = true)
    protected DerivativeInterest2 intrst;
    @XmlElement(name = "FX", required = true)
    protected DerivativeForeignExchange2 fx;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public DerivativeInterest2 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public void setIntrst(DerivativeInterest2 value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public DerivativeForeignExchange2 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public void setFX(DerivativeForeignExchange2 value) {
        this.fx = value;
    }

}
