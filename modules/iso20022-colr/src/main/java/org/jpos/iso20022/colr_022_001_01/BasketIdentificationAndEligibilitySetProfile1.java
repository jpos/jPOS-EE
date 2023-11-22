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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketIdentificationAndEligibilitySetProfile1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BasketIdentificationAndEligibilitySetProfile1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrfrntlBsktIdNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="FllbckStartgBsktId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="ExclsnBsktId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketIdentificationAndEligibilitySetProfile1", propOrder = {
    "prfrntlBsktIdNb",
    "fllbckStartgBsktId",
    "exclsnBsktId",
    "elgbltySetPrfl"
})
public class BasketIdentificationAndEligibilitySetProfile1 {

    @XmlElement(name = "PrfrntlBsktIdNb")
    protected GenericIdentification1 prfrntlBsktIdNb;
    @XmlElement(name = "FllbckStartgBsktId")
    protected GenericIdentification1 fllbckStartgBsktId;
    @XmlElement(name = "ExclsnBsktId")
    protected GenericIdentification1 exclsnBsktId;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;

    /**
     * Gets the value of the prfrntlBsktIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrfrntlBsktIdNb() {
        return prfrntlBsktIdNb;
    }

    /**
     * Sets the value of the prfrntlBsktIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrfrntlBsktIdNb(GenericIdentification1 value) {
        this.prfrntlBsktIdNb = value;
    }

    /**
     * Gets the value of the fllbckStartgBsktId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getFllbckStartgBsktId() {
        return fllbckStartgBsktId;
    }

    /**
     * Sets the value of the fllbckStartgBsktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setFllbckStartgBsktId(GenericIdentification1 value) {
        this.fllbckStartgBsktId = value;
    }

    /**
     * Gets the value of the exclsnBsktId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getExclsnBsktId() {
        return exclsnBsktId;
    }

    /**
     * Sets the value of the exclsnBsktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setExclsnBsktId(GenericIdentification1 value) {
        this.exclsnBsktId = value;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
    }

}
