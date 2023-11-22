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

package org.jpos.iso20022.auth_041_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FromToQuantityRange2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FromToQuantityRange2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}DecimalNumber"/>
 *         <element name="ToQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}DecimalNumber"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromToQuantityRange2", propOrder = {
    "frQty",
    "toQty"
})
public class FromToQuantityRange2 {

    @XmlElement(name = "FrQty", required = true)
    protected BigDecimal frQty;
    @XmlElement(name = "ToQty", required = true)
    protected BigDecimal toQty;

    /**
     * Gets the value of the frQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrQty() {
        return frQty;
    }

    /**
     * Sets the value of the frQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrQty(BigDecimal value) {
        this.frQty = value;
    }

    /**
     * Gets the value of the toQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToQty() {
        return toQty;
    }

    /**
     * Sets the value of the toQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToQty(BigDecimal value) {
        this.toQty = value;
    }

}
