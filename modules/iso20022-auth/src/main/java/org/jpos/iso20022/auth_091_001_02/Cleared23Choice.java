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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cleared23Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cleared23Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Clrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ClearingPartyAndTime21Choice"/>
 *         <element name="IntndToClear" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ClearingPartyAndTime22Choice"/>
 *         <element name="NonClrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ClearingExceptionOrExemption3Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cleared23Choice", propOrder = {
    "clrd",
    "intndToClear",
    "nonClrd"
})
public class Cleared23Choice {

    @XmlElement(name = "Clrd")
    protected ClearingPartyAndTime21Choice clrd;
    @XmlElement(name = "IntndToClear")
    protected ClearingPartyAndTime22Choice intndToClear;
    @XmlElement(name = "NonClrd")
    protected ClearingExceptionOrExemption3Choice nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime21Choice }
     *     
     */
    public ClearingPartyAndTime21Choice getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime21Choice }
     *     
     */
    public void setClrd(ClearingPartyAndTime21Choice value) {
        this.clrd = value;
    }

    /**
     * Gets the value of the intndToClear property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime22Choice }
     *     
     */
    public ClearingPartyAndTime22Choice getIntndToClear() {
        return intndToClear;
    }

    /**
     * Sets the value of the intndToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime22Choice }
     *     
     */
    public void setIntndToClear(ClearingPartyAndTime22Choice value) {
        this.intndToClear = value;
    }

    /**
     * Gets the value of the nonClrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionOrExemption3Choice }
     *     
     */
    public ClearingExceptionOrExemption3Choice getNonClrd() {
        return nonClrd;
    }

    /**
     * Sets the value of the nonClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionOrExemption3Choice }
     *     
     */
    public void setNonClrd(ClearingExceptionOrExemption3Choice value) {
        this.nonClrd = value;
    }

}
