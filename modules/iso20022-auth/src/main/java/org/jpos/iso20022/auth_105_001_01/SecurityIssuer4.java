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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIssuer4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIssuer4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="JursdctnCtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CountryCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIssuer4", propOrder = {
    "id",
    "jursdctnCtry"
})
public class SecurityIssuer4 {

    @XmlElement(name = "Id")
    protected OrganisationIdentification15Choice id;
    @XmlElement(name = "JursdctnCtry", required = true)
    protected String jursdctnCtry;

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
     * Gets the value of the jursdctnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJursdctnCtry() {
        return jursdctnCtry;
    }

    /**
     * Sets the value of the jursdctnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJursdctnCtry(String value) {
        this.jursdctnCtry = value;
    }

}
