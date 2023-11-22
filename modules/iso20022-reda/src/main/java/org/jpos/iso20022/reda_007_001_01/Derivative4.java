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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Derivative4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Derivative4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Futr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Future4" minOccurs="0"/>
 *         <element name="Optn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Option15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative4", propOrder = {
    "futr",
    "optn"
})
public class Derivative4 {

    @XmlElement(name = "Futr")
    protected Future4 futr;
    @XmlElement(name = "Optn")
    protected Option15 optn;

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link Future4 }
     *     
     */
    public Future4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Future4 }
     *     
     */
    public void setFutr(Future4 value) {
        this.futr = value;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option15 }
     *     
     */
    public Option15 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option15 }
     *     
     */
    public void setOptn(Option15 value) {
        this.optn = value;
    }

}
