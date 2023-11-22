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

package org.jpos.iso20022.caad_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vehicle4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Clss" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Make" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="RegnNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle4", propOrder = {
    "clss",
    "make",
    "mdl",
    "regnNb"
})
public class Vehicle4 {

    @XmlElement(name = "Clss")
    protected String clss;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "RegnNb")
    protected String regnNb;

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClss(String value) {
        this.clss = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the regnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNb() {
        return regnNb;
    }

    /**
     * Sets the value of the regnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnNb(String value) {
        this.regnNb = value;
    }

}
