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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetMetrics14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetMetrics14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSetBuyerAndSeller2" minOccurs="0"/>
 *         <element name="Clean" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSetBuyerAndSeller2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics14", propOrder = {
    "ttl",
    "clean"
})
public class PositionSetMetrics14 {

    @XmlElement(name = "Ttl")
    protected PositionSetBuyerAndSeller2 ttl;
    @XmlElement(name = "Clean")
    protected PositionSetBuyerAndSeller2 clean;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetBuyerAndSeller2 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public void setTtl(PositionSetBuyerAndSeller2 value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the clean property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetBuyerAndSeller2 getClean() {
        return clean;
    }

    /**
     * Sets the value of the clean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public void setClean(PositionSetBuyerAndSeller2 value) {
        this.clean = value;
    }

}
