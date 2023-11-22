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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyIdentification10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyIdentification10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="Sd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CollateralRole1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification10", propOrder = {
    "id",
    "sd"
})
public class CounterpartyIdentification10 {

    @XmlElement(name = "Id")
    protected OrganisationIdentification15Choice id;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code sd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setId(OrganisationIdentification15Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setSd(CollateralRole1Code value) {
        this.sd = value;
    }

}
