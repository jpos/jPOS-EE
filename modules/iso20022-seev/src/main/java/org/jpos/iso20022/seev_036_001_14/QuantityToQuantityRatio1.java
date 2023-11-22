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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityToQuantityRatio1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityToQuantityRatio1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty1" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DecimalNumber"/>
 *         <element name="Qty2" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}DecimalNumber"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityToQuantityRatio1", propOrder = {
    "qty1",
    "qty2"
})
public class QuantityToQuantityRatio1 {

    @XmlElement(name = "Qty1", required = true)
    protected BigDecimal qty1;
    @XmlElement(name = "Qty2", required = true)
    protected BigDecimal qty2;

    /**
     * Gets the value of the qty1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty1() {
        return qty1;
    }

    /**
     * Sets the value of the qty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty1(BigDecimal value) {
        this.qty1 = value;
    }

    /**
     * Gets the value of the qty2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty2() {
        return qty2;
    }

    /**
     * Sets the value of the qty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty2(BigDecimal value) {
        this.qty2 = value;
    }

}
