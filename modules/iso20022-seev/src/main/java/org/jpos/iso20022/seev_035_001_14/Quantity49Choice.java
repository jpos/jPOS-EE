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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity49Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity49Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QtyChc" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}Quantity50Choice"/>
 *         <element name="PrtryQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}ProprietaryQuantity7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity49Choice", propOrder = {
    "qtyChc",
    "prtryQty"
})
public class Quantity49Choice {

    @XmlElement(name = "QtyChc")
    protected Quantity50Choice qtyChc;
    @XmlElement(name = "PrtryQty")
    protected ProprietaryQuantity7 prtryQty;

    /**
     * Gets the value of the qtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity50Choice }
     *     
     */
    public Quantity50Choice getQtyChc() {
        return qtyChc;
    }

    /**
     * Sets the value of the qtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity50Choice }
     *     
     */
    public void setQtyChc(Quantity50Choice value) {
        this.qtyChc = value;
    }

    /**
     * Gets the value of the prtryQty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity7 }
     *     
     */
    public ProprietaryQuantity7 getPrtryQty() {
        return prtryQty;
    }

    /**
     * Sets the value of the prtryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity7 }
     *     
     */
    public void setPrtryQty(ProprietaryQuantity7 value) {
        this.prtryQty = value;
    }

}
