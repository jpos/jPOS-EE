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

package org.jpos.iso20022.seev_037_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity48Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity48Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.001.14}FinancialInstrumentQuantity33Choice"/>
 *         <element name="PrtryQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.001.14}ProprietaryQuantity8"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity48Choice", propOrder = {
    "qty",
    "prtryQty"
})
public class Quantity48Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "PrtryQty")
    protected ProprietaryQuantity8 prtryQty;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the prtryQty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity8 }
     *     
     */
    public ProprietaryQuantity8 getPrtryQty() {
        return prtryQty;
    }

    /**
     * Sets the value of the prtryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity8 }
     *     
     */
    public void setPrtryQty(ProprietaryQuantity8 value) {
        this.prtryQty = value;
    }

}
