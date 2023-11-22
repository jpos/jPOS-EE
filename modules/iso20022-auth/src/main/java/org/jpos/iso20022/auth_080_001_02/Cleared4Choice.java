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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cleared4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cleared4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Clrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}NoReasonCode"/>
 *         <element name="NonClrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cleared4Choice", propOrder = {
    "clrd",
    "nonClrd"
})
public class Cleared4Choice {

    @XmlElement(name = "Clrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode clrd;
    @XmlElement(name = "NonClrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setClrd(NoReasonCode value) {
        this.clrd = value;
    }

    /**
     * Gets the value of the nonClrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNonClrd() {
        return nonClrd;
    }

    /**
     * Sets the value of the nonClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNonClrd(NoReasonCode value) {
        this.nonClrd = value;
    }

}
