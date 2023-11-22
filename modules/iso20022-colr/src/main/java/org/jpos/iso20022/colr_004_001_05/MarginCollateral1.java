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

package org.jpos.iso20022.colr_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCollateral1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCollateral1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HeldByPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="HeldByPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrrAgrdToPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrrAgrdToPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InTrnstToPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InTrnstToPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCollateral1", propOrder = {
    "heldByPtyA",
    "heldByPtyB",
    "prrAgrdToPtyA",
    "prrAgrdToPtyB",
    "inTrnstToPtyA",
    "inTrnstToPtyB"
})
public class MarginCollateral1 {

    @XmlElement(name = "HeldByPtyA")
    protected ActiveCurrencyAndAmount heldByPtyA;
    @XmlElement(name = "HeldByPtyB")
    protected ActiveCurrencyAndAmount heldByPtyB;
    @XmlElement(name = "PrrAgrdToPtyA")
    protected ActiveCurrencyAndAmount prrAgrdToPtyA;
    @XmlElement(name = "PrrAgrdToPtyB")
    protected ActiveCurrencyAndAmount prrAgrdToPtyB;
    @XmlElement(name = "InTrnstToPtyA")
    protected ActiveCurrencyAndAmount inTrnstToPtyA;
    @XmlElement(name = "InTrnstToPtyB")
    protected ActiveCurrencyAndAmount inTrnstToPtyB;

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

    /**
     * Gets the value of the prrAgrdToPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrrAgrdToPtyA() {
        return prrAgrdToPtyA;
    }

    /**
     * Sets the value of the prrAgrdToPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrrAgrdToPtyA(ActiveCurrencyAndAmount value) {
        this.prrAgrdToPtyA = value;
    }

    /**
     * Gets the value of the prrAgrdToPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrrAgrdToPtyB() {
        return prrAgrdToPtyB;
    }

    /**
     * Sets the value of the prrAgrdToPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrrAgrdToPtyB(ActiveCurrencyAndAmount value) {
        this.prrAgrdToPtyB = value;
    }

    /**
     * Gets the value of the inTrnstToPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInTrnstToPtyA() {
        return inTrnstToPtyA;
    }

    /**
     * Sets the value of the inTrnstToPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInTrnstToPtyA(ActiveCurrencyAndAmount value) {
        this.inTrnstToPtyA = value;
    }

    /**
     * Gets the value of the inTrnstToPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInTrnstToPtyB() {
        return inTrnstToPtyB;
    }

    /**
     * Sets the value of the inTrnstToPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInTrnstToPtyB(ActiveCurrencyAndAmount value) {
        this.inTrnstToPtyB = value;
    }

}
