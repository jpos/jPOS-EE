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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalProductInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalProductInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AMFDctrn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AMFDoctrine1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInformation2", propOrder = {
    "amfDctrn"
})
public class AdditionalProductInformation2 {

    @XmlElement(name = "AMFDctrn")
    @XmlSchemaType(name = "string")
    protected AMFDoctrine1Code amfDctrn;

    /**
     * Gets the value of the amfDctrn property.
     * 
     * @return
     *     possible object is
     *     {@link AMFDoctrine1Code }
     *     
     */
    public AMFDoctrine1Code getAMFDctrn() {
        return amfDctrn;
    }

    /**
     * Sets the value of the amfDctrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMFDoctrine1Code }
     *     
     */
    public void setAMFDctrn(AMFDoctrine1Code value) {
        this.amfDctrn = value;
    }

}
