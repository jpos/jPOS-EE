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

package org.jpos.iso20022.casp_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Acquirer10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Acquirer10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}GenericIdentification177" minOccurs="0"/>
 *         <element name="ParamsVrsn" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acquirer10", propOrder = {
    "id",
    "paramsVrsn"
})
public class Acquirer10 {

    @XmlElement(name = "Id")
    protected GenericIdentification177 id;
    @XmlElement(name = "ParamsVrsn")
    protected String paramsVrsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setId(GenericIdentification177 value) {
        this.id = value;
    }

    /**
     * Gets the value of the paramsVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamsVrsn() {
        return paramsVrsn;
    }

    /**
     * Sets the value of the paramsVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamsVrsn(String value) {
        this.paramsVrsn = value;
    }

}
