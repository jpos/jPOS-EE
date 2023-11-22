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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proxy12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Proxy12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrxyTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}ProxyType3Code"/>
 *         <element name="PrsnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}IndividualPerson42" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy12", propOrder = {
    "prxyTp",
    "prsnDtls"
})
public class Proxy12 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProxyType3Code prxyTp;
    @XmlElement(name = "PrsnDtls")
    protected IndividualPerson42 prsnDtls;

    /**
     * Gets the value of the prxyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyType3Code }
     *     
     */
    public ProxyType3Code getPrxyTp() {
        return prxyTp;
    }

    /**
     * Sets the value of the prxyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyType3Code }
     *     
     */
    public void setPrxyTp(ProxyType3Code value) {
        this.prxyTp = value;
    }

    /**
     * Gets the value of the prsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson42 }
     *     
     */
    public IndividualPerson42 getPrsnDtls() {
        return prsnDtls;
    }

    /**
     * Sets the value of the prsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson42 }
     *     
     */
    public void setPrsnDtls(IndividualPerson42 value) {
        this.prsnDtls = value;
    }

}
