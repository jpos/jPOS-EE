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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubBalanceQuantity1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubBalanceQuantity1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Qty" type="{urn:swift:xsd:semt.004.001.02}FinancialInstrumentQuantityChoice"/>
 *           <element name="QtyAsDSS" type="{urn:swift:xsd:semt.004.001.02}GenericIdentification6"/>
 *           <element name="QtyAndAvlbty" type="{urn:swift:xsd:semt.004.001.02}QuantityAndAvailability"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceQuantity1Choice", propOrder = {
    "qty",
    "qtyAsDSS",
    "qtyAndAvlbty"
})
public class SubBalanceQuantity1Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "QtyAsDSS")
    protected GenericIdentification6 qtyAsDSS;
    @XmlElement(name = "QtyAndAvlbty")
    protected QuantityAndAvailability qtyAndAvlbty;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public void setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the qtyAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification6 }
     *     
     */
    public GenericIdentification6 getQtyAsDSS() {
        return qtyAsDSS;
    }

    /**
     * Sets the value of the qtyAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification6 }
     *     
     */
    public void setQtyAsDSS(GenericIdentification6 value) {
        this.qtyAsDSS = value;
    }

    /**
     * Gets the value of the qtyAndAvlbty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAvailability }
     *     
     */
    public QuantityAndAvailability getQtyAndAvlbty() {
        return qtyAndAvlbty;
    }

    /**
     * Sets the value of the qtyAndAvlbty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAvailability }
     *     
     */
    public void setQtyAndAvlbty(QuantityAndAvailability value) {
        this.qtyAndAvlbty = value;
    }

}
