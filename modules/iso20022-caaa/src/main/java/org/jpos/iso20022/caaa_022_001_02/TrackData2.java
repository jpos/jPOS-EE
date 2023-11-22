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

package org.jpos.iso20022.caaa_022_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TrackData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrckNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Number" minOccurs="0"/>
 *         <element name="TrckFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}TrackFormat1Code" minOccurs="0"/>
 *         <element name="TrckVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData2", propOrder = {
    "trckNb",
    "trckFrmt",
    "trckVal"
})
public class TrackData2 {

    @XmlElement(name = "TrckNb")
    protected BigDecimal trckNb;
    @XmlElement(name = "TrckFrmt")
    @XmlSchemaType(name = "string")
    protected TrackFormat1Code trckFrmt;
    @XmlElement(name = "TrckVal", required = true)
    protected String trckVal;

    /**
     * Gets the value of the trckNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrckNb() {
        return trckNb;
    }

    /**
     * Sets the value of the trckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrckNb(BigDecimal value) {
        this.trckNb = value;
    }

    /**
     * Gets the value of the trckFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackFormat1Code }
     *     
     */
    public TrackFormat1Code getTrckFrmt() {
        return trckFrmt;
    }

    /**
     * Sets the value of the trckFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackFormat1Code }
     *     
     */
    public void setTrckFrmt(TrackFormat1Code value) {
        this.trckFrmt = value;
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
