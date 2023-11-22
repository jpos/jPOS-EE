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

package org.jpos.iso20022.camt_054_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TrackData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrckNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Exact1NumericText" minOccurs="0"/>
 *         <element name="TrckVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData1", propOrder = {
    "trckNb",
    "trckVal"
})
public class TrackData1 {

    @XmlElement(name = "TrckNb")
    protected String trckNb;
    @XmlElement(name = "TrckVal", required = true)
    protected String trckVal;

    /**
     * Gets the value of the trckNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckNb() {
        return trckNb;
    }

    /**
     * Sets the value of the trckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckNb(String value) {
        this.trckNb = value;
    }

    /**
     * Gets the value of the trckVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckVal() {
        return trckVal;
    }

    /**
     * Sets the value of the trckVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckVal(String value) {
        this.trckVal = value;
    }

}
