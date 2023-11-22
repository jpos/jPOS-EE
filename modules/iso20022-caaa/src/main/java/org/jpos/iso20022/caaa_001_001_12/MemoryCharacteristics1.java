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

package org.jpos.iso20022.caaa_001_001_12;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemoryCharacteristics1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MemoryCharacteristics1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text"/>
 *         <element name="TtlSz" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}DecimalNumber"/>
 *         <element name="FreeSz" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}DecimalNumber"/>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}MemoryUnit1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoryCharacteristics1", propOrder = {
    "id",
    "ttlSz",
    "freeSz",
    "unit"
})
public class MemoryCharacteristics1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TtlSz", required = true)
    protected BigDecimal ttlSz;
    @XmlElement(name = "FreeSz", required = true)
    protected BigDecimal freeSz;
    @XmlElement(name = "Unit", required = true)
    @XmlSchemaType(name = "string")
    protected MemoryUnit1Code unit;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ttlSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSz() {
        return ttlSz;
    }

    /**
     * Sets the value of the ttlSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlSz(BigDecimal value) {
        this.ttlSz = value;
    }

    /**
     * Gets the value of the freeSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreeSz() {
        return freeSz;
    }

    /**
     * Sets the value of the freeSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreeSz(BigDecimal value) {
        this.freeSz = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public MemoryUnit1Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public void setUnit(MemoryUnit1Code value) {
        this.unit = value;
    }

}
