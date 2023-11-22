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

package org.jpos.iso20022.camt_020_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationQualifierType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformationQualifierType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IsFrmtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Priority1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationQualifierType1", propOrder = {
    "isFrmtd",
    "prty"
})
public class InformationQualifierType1 {

    @XmlElement(name = "IsFrmtd")
    protected Boolean isFrmtd;
    @XmlElement(name = "Prty")
    @XmlSchemaType(name = "string")
    protected Priority1Code prty;

    /**
     * Gets the value of the isFrmtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFrmtd() {
        return isFrmtd;
    }

    /**
     * Sets the value of the isFrmtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFrmtd(Boolean value) {
        this.isFrmtd = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Code }
     *     
     */
    public Priority1Code getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Code }
     *     
     */
    public void setPrty(Priority1Code value) {
        this.prty = value;
    }

}
