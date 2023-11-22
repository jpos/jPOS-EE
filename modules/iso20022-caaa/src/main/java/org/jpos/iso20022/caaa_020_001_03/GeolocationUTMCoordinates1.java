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

package org.jpos.iso20022.caaa_020_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeolocationUTMCoordinates1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeolocationUTMCoordinates1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UTMZone" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text"/>
 *         <element name="UTMEstwrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text"/>
 *         <element name="UTMNrthwrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeolocationUTMCoordinates1", propOrder = {
    "utmZone",
    "utmEstwrd",
    "utmNrthwrd"
})
public class GeolocationUTMCoordinates1 {

    @XmlElement(name = "UTMZone", required = true)
    protected String utmZone;
    @XmlElement(name = "UTMEstwrd", required = true)
    protected String utmEstwrd;
    @XmlElement(name = "UTMNrthwrd", required = true)
    protected String utmNrthwrd;

    /**
     * Gets the value of the utmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMZone() {
        return utmZone;
    }

    /**
     * Sets the value of the utmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMZone(String value) {
        this.utmZone = value;
    }

    /**
     * Gets the value of the utmEstwrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMEstwrd() {
        return utmEstwrd;
    }

    /**
     * Sets the value of the utmEstwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMEstwrd(String value) {
        this.utmEstwrd = value;
    }

    /**
     * Gets the value of the utmNrthwrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMNrthwrd() {
        return utmNrthwrd;
    }

    /**
     * Sets the value of the utmNrthwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMNrthwrd(String value) {
        this.utmNrthwrd = value;
    }

}
