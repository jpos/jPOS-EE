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

package org.jpos.iso20022.cain_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recipient5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Recipient5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IssrAndSrlNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}IssuerAndSerialNumber1"/>
 *         <element name="KeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}KEKIdentifier2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient5Choice", propOrder = {
    "issrAndSrlNb",
    "keyIdr"
})
public class Recipient5Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber1 issrAndSrlNb;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier2 keyIdr;

    /**
     * Gets the value of the issrAndSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public IssuerAndSerialNumber1 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Sets the value of the issrAndSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public void setIssrAndSrlNb(IssuerAndSerialNumber1 value) {
        this.issrAndSrlNb = value;
    }

    /**
     * Gets the value of the keyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Sets the value of the keyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public void setKeyIdr(KEKIdentifier2 value) {
        this.keyIdr = value;
    }

}
