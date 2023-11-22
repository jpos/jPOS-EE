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

package org.jpos.iso20022.auth_106_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityTerm1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityTerm1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}LongFraction19DecimalNumber" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}UnitOfMeasure8Choice" minOccurs="0"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Max3Number" minOccurs="0"/>
 *         <element name="TmUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Frequency19Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityTerm1", propOrder = {
    "qty",
    "unitOfMeasr",
    "val",
    "tmUnit"
})
public class QuantityTerm1 {

    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure8Choice unitOfMeasr;
    @XmlElement(name = "Val")
    protected BigDecimal val;
    @XmlElement(name = "TmUnit")
    @XmlSchemaType(name = "string")
    protected Frequency19Code tmUnit;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public UnitOfMeasure8Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure8Choice value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVal(BigDecimal value) {
        this.val = value;
    }

    /**
     * Gets the value of the tmUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency19Code }
     *     
     */
    public Frequency19Code getTmUnit() {
        return tmUnit;
    }

    /**
     * Sets the value of the tmUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency19Code }
     *     
     */
    public void setTmUnit(Frequency19Code value) {
        this.tmUnit = value;
    }

}
