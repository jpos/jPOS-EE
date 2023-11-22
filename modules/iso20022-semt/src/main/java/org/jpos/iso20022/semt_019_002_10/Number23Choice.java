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

package org.jpos.iso20022.semt_019_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Number23Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Number23Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Shrt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}Exact3NumericText"/>
 *         <element name="Lng" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}GenericIdentification18"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number23Choice", propOrder = {
    "shrt",
    "lng"
})
public class Number23Choice {

    @XmlElement(name = "Shrt")
    protected String shrt;
    @XmlElement(name = "Lng")
    protected GenericIdentification18 lng;

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
     *     {@link GenericIdentification18 }
     *     
     */
    public GenericIdentification18 getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification18 }
     *     
     */
    public void setLng(GenericIdentification18 value) {
        this.lng = value;
    }

}
