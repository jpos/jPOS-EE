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

package org.jpos.iso20022.caaa_009_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geolocation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Geolocation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GeogcCordints" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}GeolocationGeographicCoordinates1" minOccurs="0"/>
 *         <element name="UTMCordints" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}GeolocationUTMCoordinates1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geolocation1", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class Geolocation1 {

    @XmlElement(name = "GeogcCordints")
    protected GeolocationGeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected GeolocationUTMCoordinates1 utmCordints;

    /**
     * Gets the value of the geogcCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public GeolocationGeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Sets the value of the geogcCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public void setGeogcCordints(GeolocationGeographicCoordinates1 value) {
        this.geogcCordints = value;
    }

    /**
     * Gets the value of the utmCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public GeolocationUTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Sets the value of the utmCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public void setUTMCordints(GeolocationUTMCoordinates1 value) {
        this.utmCordints = value;
    }

}
