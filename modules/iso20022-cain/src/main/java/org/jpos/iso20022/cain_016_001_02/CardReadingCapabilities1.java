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

package org.jpos.iso20022.cain_016_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardReadingCapabilities1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardReadingCapabilities1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}CardDataReading10Code"/>
 *         <element name="OthrCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardReadingCapabilities1", propOrder = {
    "cpblty",
    "othrCpblty"
})
public class CardReadingCapabilities1 {

    @XmlElement(name = "Cpblty", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading10Code cpblty;
    @XmlElement(name = "OthrCpblty")
    protected String othrCpblty;

    /**
     * Gets the value of the cpblty property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading10Code }
     *     
     */
    public CardDataReading10Code getCpblty() {
        return cpblty;
    }

    /**
     * Sets the value of the cpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading10Code }
     *     
     */
    public void setCpblty(CardDataReading10Code value) {
        this.cpblty = value;
    }

    /**
     * Gets the value of the othrCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCpblty() {
        return othrCpblty;
    }

    /**
     * Sets the value of the othrCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCpblty(String value) {
        this.othrCpblty = value;
    }

}
