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

package org.jpos.iso20022.tsmt_009_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportDescription1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AirportDescription1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Twn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max35Text"/>
 *         <element name="AirprtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportDescription1", propOrder = {
    "twn",
    "airprtNm"
})
public class AirportDescription1 {

    @XmlElement(name = "Twn", required = true)
    protected String twn;
    @XmlElement(name = "AirprtNm")
    protected String airprtNm;

    /**
     * Gets the value of the twn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwn() {
        return twn;
    }

    /**
     * Sets the value of the twn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwn(String value) {
        this.twn = value;
    }

    /**
     * Gets the value of the airprtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirprtNm() {
        return airprtNm;
    }

    /**
     * Sets the value of the airprtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirprtNm(String value) {
        this.airprtNm = value;
    }

}
