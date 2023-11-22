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

package org.jpos.iso20022.tsmt_014_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}UnitOfMeasure3Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DecimalNumber"/>
 *         <element name="Fctr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max15NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity9", propOrder = {
    "unitOfMeasr",
    "val",
    "fctr"
})
public class Quantity9 {

    @XmlElement(name = "UnitOfMeasr", required = true)
    protected UnitOfMeasure3Choice unitOfMeasr;
    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "Fctr")
    protected String fctr;

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure3Choice }
     *     
     */
    public UnitOfMeasure3Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure3Choice }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure3Choice value) {
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
     * Gets the value of the fctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctr() {
        return fctr;
    }

    /**
     * Sets the value of the fctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctr(String value) {
        this.fctr = value;
    }

}
