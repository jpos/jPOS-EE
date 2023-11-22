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

package org.jpos.iso20022.reda_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParties4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParties4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232"/>
 *         <element name="ClntPtyB" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232" minOccurs="0"/>
 *         <element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification37" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties4", propOrder = {
    "ptyB",
    "clntPtyB",
    "elgbltySetPrfl"
})
public class CollateralParties4 {

    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification232 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentification232 clntPtyB;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification37 elgbltySetPrfl;

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setPtyB(PartyIdentification232 value) {
        this.ptyB = value;
    }

    /**
     * Gets the value of the clntPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Sets the value of the clntPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setClntPtyB(PartyIdentification232 value) {
        this.clntPtyB = value;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification37 value) {
        this.elgbltySetPrfl = value;
    }

}
