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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rating2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Rating2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ratg" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max10Text"/>
 *         <element name="SrcOfRatg" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}MarketIdentification89"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rating2", propOrder = {
    "ratg",
    "srcOfRatg"
})
public class Rating2 {

    @XmlElement(name = "Ratg", required = true)
    protected String ratg;
    @XmlElement(name = "SrcOfRatg", required = true)
    protected MarketIdentification89 srcOfRatg;

    /**
     * Gets the value of the ratg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatg(String value) {
        this.ratg = value;
    }

    /**
     * Gets the value of the srcOfRatg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification89 }
     *     
     */
    public MarketIdentification89 getSrcOfRatg() {
        return srcOfRatg;
    }

    /**
     * Sets the value of the srcOfRatg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification89 }
     *     
     */
    public void setSrcOfRatg(MarketIdentification89 value) {
        this.srcOfRatg = value;
    }

}
