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

package org.jpos.iso20022.auth_102_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClass2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClass2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}DerivativeCommodity2" minOccurs="0"/>
 *         <element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}DerivativeInterest3" minOccurs="0"/>
 *         <element name="FX" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}DerivativeForeignExchange3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClass2", propOrder = {
    "cmmdty",
    "intrst",
    "fx"
})
public class AssetClass2 {

    @XmlElement(name = "Cmmdty")
    protected DerivativeCommodity2 cmmdty;
    @XmlElement(name = "Intrst")
    protected DerivativeInterest3 intrst;
    @XmlElement(name = "FX")
    protected DerivativeForeignExchange3 fx;

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public DerivativeCommodity2 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public void setCmmdty(DerivativeCommodity2 value) {
        this.cmmdty = value;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest3 }
     *     
     */
    public DerivativeInterest3 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest3 }
     *     
     */
    public void setIntrst(DerivativeInterest3 value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public DerivativeForeignExchange3 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public void setFX(DerivativeForeignExchange3 value) {
        this.fx = value;
    }

}
