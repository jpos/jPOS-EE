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

package org.jpos.iso20022.semt_002_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityAndAvailability4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityAndAvailability4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}FinancialInstrumentQuantity36Choice"/>
 *         <element name="AvlbtyInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAvailability4", propOrder = {
    "qty",
    "avlbtyInd"
})
public class QuantityAndAvailability4 {

    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity36Choice qty;
    @XmlElement(name = "AvlbtyInd")
    protected boolean avlbtyInd;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity36Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the avlbtyInd property.
     * 
     */
    public boolean isAvlbtyInd() {
        return avlbtyInd;
    }

    /**
     * Sets the value of the avlbtyInd property.
     * 
     */
    public void setAvlbtyInd(boolean value) {
        this.avlbtyInd = value;
    }

}
