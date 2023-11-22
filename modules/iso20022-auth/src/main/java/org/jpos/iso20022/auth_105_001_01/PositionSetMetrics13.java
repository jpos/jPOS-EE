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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetMetrics13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetMetrics13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VolMtrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}VolumeMetrics5"/>
 *         <element name="PricMtrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PriceMetrics3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics13", propOrder = {
    "volMtrcs",
    "pricMtrcs"
})
public class PositionSetMetrics13 {

    @XmlElement(name = "VolMtrcs", required = true)
    protected VolumeMetrics5 volMtrcs;
    @XmlElement(name = "PricMtrcs")
    protected PriceMetrics3 pricMtrcs;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics5 }
     *     
     */
    public VolumeMetrics5 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics5 }
     *     
     */
    public void setVolMtrcs(VolumeMetrics5 value) {
        this.volMtrcs = value;
    }

    /**
     * Gets the value of the pricMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMetrics3 }
     *     
     */
    public PriceMetrics3 getPricMtrcs() {
        return pricMtrcs;
    }

    /**
     * Sets the value of the pricMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMetrics3 }
     *     
     */
    public void setPricMtrcs(PriceMetrics3 value) {
        this.pricMtrcs = value;
    }

}
