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

package org.jpos.iso20022.sese_001_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceTypeAndText6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceTypeAndText6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgPlcTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}SafekeepingPlace2Code"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceTypeAndText6", propOrder = {
    "sfkpgPlcTp",
    "id"
})
public class SafekeepingPlaceTypeAndText6 {

    @XmlElement(name = "SfkpgPlcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace2Code sfkpgPlcTp;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the sfkpgPlcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace2Code }
     *     
     */
    public SafekeepingPlace2Code getSfkpgPlcTp() {
        return sfkpgPlcTp;
    }

    /**
     * Sets the value of the sfkpgPlcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace2Code }
     *     
     */
    public void setSfkpgPlcTp(SafekeepingPlace2Code value) {
        this.sfkpgPlcTp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
