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

package org.jpos.iso20022.semt_041_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubBalanceBreakdown1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubBalanceBreakdown1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SubBalanceType9Choice"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SubBalanceQuantity5Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceBreakdown1", propOrder = {
    "subBalTp",
    "qty"
})
public class SubBalanceBreakdown1 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType9Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity5Choice qty;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType9Choice }
     *     
     */
    public SubBalanceType9Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType9Choice }
     *     
     */
    public void setSubBalTp(SubBalanceType9Choice value) {
        this.subBalTp = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity5Choice }
     *     
     */
    public SubBalanceQuantity5Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity5Choice }
     *     
     */
    public void setQty(SubBalanceQuantity5Choice value) {
        this.qty = value;
    }

}
