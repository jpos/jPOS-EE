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

package org.jpos.iso20022.catp_017_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicLocation1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeographicLocation1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="GeogcCordints" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}GeographicCoordinates1"/>
 *         <element name="UTMCordints" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}UTMCoordinates1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation1Choice", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class GeographicLocation1Choice {

    @XmlElement(name = "GeogcCordints")
    protected GeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected UTMCoordinates1 utmCordints;

    /**
     * Gets the value of the geogcCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Sets the value of the geogcCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public void setGeogcCordints(GeographicCoordinates1 value) {
        this.geogcCordints = value;
    }

    /**
     * Gets the value of the utmCordints property.
     * 
     * @return
     *     possible object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public UTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Sets the value of the utmCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public void setUTMCordints(UTMCoordinates1 value) {
        this.utmCordints = value;
    }

}
