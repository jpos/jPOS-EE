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
 * <p>Java class for PositionSet20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSet20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dmnsns" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSetDimensions15"/>
 *         <element name="Mtrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSetMetrics10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSet20", propOrder = {
    "dmnsns",
    "mtrcs"
})
public class PositionSet20 {

    @XmlElement(name = "Dmnsns", required = true)
    protected PositionSetDimensions15 dmnsns;
    @XmlElement(name = "Mtrcs", required = true)
    protected PositionSetMetrics10 mtrcs;

    /**
     * Gets the value of the dmnsns property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetDimensions15 }
     *     
     */
    public PositionSetDimensions15 getDmnsns() {
        return dmnsns;
    }

    /**
     * Sets the value of the dmnsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetDimensions15 }
     *     
     */
    public void setDmnsns(PositionSetDimensions15 value) {
        this.dmnsns = value;
    }

    /**
     * Gets the value of the mtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetMetrics10 }
     *     
     */
    public PositionSetMetrics10 getMtrcs() {
        return mtrcs;
    }

    /**
     * Sets the value of the mtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetMetrics10 }
     *     
     */
    public void setMtrcs(PositionSetMetrics10 value) {
        this.mtrcs = value;
    }

}
