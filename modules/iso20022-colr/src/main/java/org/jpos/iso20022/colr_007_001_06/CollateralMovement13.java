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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralMovement13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralMovement13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dlvr" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Collateral55"/>
 *         <element name="Rtr" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Collateral54" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement13", propOrder = {
    "dlvr",
    "rtr"
})
public class CollateralMovement13 {

    @XmlElement(name = "Dlvr", required = true)
    protected Collateral55 dlvr;
    @XmlElement(name = "Rtr")
    protected Collateral54 rtr;

    /**
     * Gets the value of the dlvr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral55 }
     *     
     */
    public Collateral55 getDlvr() {
        return dlvr;
    }

    /**
     * Sets the value of the dlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral55 }
     *     
     */
    public void setDlvr(Collateral55 value) {
        this.dlvr = value;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral54 }
     *     
     */
    public Collateral54 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral54 }
     *     
     */
    public void setRtr(Collateral54 value) {
        this.rtr = value;
    }

}
