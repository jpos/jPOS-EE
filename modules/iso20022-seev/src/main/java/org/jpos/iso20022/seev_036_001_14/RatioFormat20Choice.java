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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatioFormat20Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RatioFormat20Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QtyToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}QuantityToQuantityRatio1"/>
 *         <element name="AmtToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}AmountToAmountRatio2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat20Choice", propOrder = {
    "qtyToQty",
    "amtToAmt"
})
public class RatioFormat20Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio1 qtyToQty;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio2 amtToAmt;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setQtyToQty(QuantityToQuantityRatio1 value) {
        this.qtyToQty = value;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio2 }
     *     
     */
    public AmountToAmountRatio2 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio2 }
     *     
     */
    public void setAmtToAmt(AmountToAmountRatio2 value) {
        this.amtToAmt = value;
    }

}
