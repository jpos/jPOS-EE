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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestComputationMethodFormat7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestComputationMethodFormat7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}InterestComputationMethod4Code"/>
 *         <element name="Nrrtv" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max1000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestComputationMethodFormat7", propOrder = {
    "cd",
    "nrrtv"
})
public class InterestComputationMethodFormat7 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod4Code cd;
    @XmlElement(name = "Nrrtv")
    protected String nrrtv;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod4Code }
     *     
     */
    public InterestComputationMethod4Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod4Code }
     *     
     */
    public void setCd(InterestComputationMethod4Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the nrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrrtv() {
        return nrrtv;
    }

    /**
     * Sets the value of the nrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrrtv(String value) {
        this.nrrtv = value;
    }

}
