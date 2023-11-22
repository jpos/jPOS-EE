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

package org.jpos.iso20022.sese_025_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Number22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Number22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Shrt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Exact3NumericText"/>
 *         <element name="Lng" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}GenericIdentification1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number22Choice", propOrder = {
    "shrt",
    "lng"
})
public class Number22Choice {

    @XmlElement(name = "Shrt")
    protected String shrt;
    @XmlElement(name = "Lng")
    protected GenericIdentification1 lng;

    /**
     * Gets the value of the shrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrt() {
        return shrt;
    }

    /**
     * Sets the value of the shrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrt(String value) {
        this.shrt = value;
    }

    /**
     * Gets the value of the lng property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setLng(GenericIdentification1 value) {
        this.lng = value;
    }

}
