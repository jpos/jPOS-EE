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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proxy5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Proxy5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ProxyAppointmentInformation6"/>
 *         <element name="PrxyNotAllwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ProxyNotAllowed1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy5Choice", propOrder = {
    "prxy",
    "prxyNotAllwd"
})
public class Proxy5Choice {

    @XmlElement(name = "Prxy")
    protected ProxyAppointmentInformation6 prxy;
    @XmlElement(name = "PrxyNotAllwd")
    @XmlSchemaType(name = "string")
    protected ProxyNotAllowed1Code prxyNotAllwd;

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAppointmentInformation6 }
     *     
     */
    public ProxyAppointmentInformation6 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAppointmentInformation6 }
     *     
     */
    public void setPrxy(ProxyAppointmentInformation6 value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the prxyNotAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyNotAllowed1Code }
     *     
     */
    public ProxyNotAllowed1Code getPrxyNotAllwd() {
        return prxyNotAllwd;
    }

    /**
     * Sets the value of the prxyNotAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyNotAllowed1Code }
     *     
     */
    public void setPrxyNotAllwd(ProxyNotAllowed1Code value) {
        this.prxyNotAllwd = value;
    }

}
