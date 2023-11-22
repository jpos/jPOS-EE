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

package org.jpos.iso20022.colr_013_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HeldByPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="HeldByPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralBalance1", propOrder = {
    "heldByPtyA",
    "heldByPtyB"
})
public class CollateralBalance1 {

    @XmlElement(name = "HeldByPtyA", required = true)
    protected ActiveCurrencyAndAmount heldByPtyA;
    @XmlElement(name = "HeldByPtyB", required = true)
    protected ActiveCurrencyAndAmount heldByPtyB;

    /**
     * Gets the value of the heldByPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getHeldByPtyA() {
        return heldByPtyA;
    }

    /**
     * Sets the value of the heldByPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setHeldByPtyA(ActiveCurrencyAndAmount value) {
        this.heldByPtyA = value;
    }

    /**
     * Gets the value of the heldByPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getHeldByPtyB() {
        return heldByPtyB;
    }

    /**
     * Sets the value of the heldByPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setHeldByPtyB(ActiveCurrencyAndAmount value) {
        this.heldByPtyB = value;
    }

}
