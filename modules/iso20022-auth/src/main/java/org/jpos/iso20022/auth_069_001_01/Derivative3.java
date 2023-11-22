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

package org.jpos.iso20022.auth_069_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Derivative3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Derivative3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DerivClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}DerivativeClassification1"/>
 *         <element name="DerivUndrlygLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}DerivativeUnderlyingLeg1" maxOccurs="2"/>
 *         <element name="OptnAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Option14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative3", propOrder = {
    "derivClssfctn",
    "derivUndrlygLeg",
    "optnAttrbts"
})
public class Derivative3 {

    @XmlElement(name = "DerivClssfctn", required = true)
    protected DerivativeClassification1 derivClssfctn;
    @XmlElement(name = "DerivUndrlygLeg", required = true)
    protected List<DerivativeUnderlyingLeg1> derivUndrlygLeg;
    @XmlElement(name = "OptnAttrbts")
    protected Option14 optnAttrbts;

    /**
     * Gets the value of the derivClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeClassification1 }
     *     
     */
    public DerivativeClassification1 getDerivClssfctn() {
        return derivClssfctn;
    }

    /**
     * Sets the value of the derivClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeClassification1 }
     *     
     */
    public void setDerivClssfctn(DerivativeClassification1 value) {
        this.derivClssfctn = value;
    }

    /**
     * Gets the value of the derivUndrlygLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the derivUndrlygLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivUndrlygLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeUnderlyingLeg1 }
     * 
     * 
     * @return
     *     The value of the derivUndrlygLeg property.
     */
    public List<DerivativeUnderlyingLeg1> getDerivUndrlygLeg() {
        if (derivUndrlygLeg == null) {
            derivUndrlygLeg = new ArrayList<>();
        }
        return this.derivUndrlygLeg;
    }

    /**
     * Gets the value of the optnAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link Option14 }
     *     
     */
    public Option14 getOptnAttrbts() {
        return optnAttrbts;
    }

    /**
     * Sets the value of the optnAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option14 }
     *     
     */
    public void setOptnAttrbts(Option14 value) {
        this.optnAttrbts = value;
    }

}
