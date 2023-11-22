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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationIdentification15Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrganisationIdentification15Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}LEIIdentifier"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification38"/>
 *         <element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}AnyBICDec2014Identifier"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification15Choice", propOrder = {
    "lei",
    "othr",
    "anyBIC"
})
public class OrganisationIdentification15Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Othr")
    protected OrganisationIdentification38 othr;
    @XmlElement(name = "AnyBIC")
    protected String anyBIC;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification38 }
     *     
     */
    public OrganisationIdentification38 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification38 }
     *     
     */
    public void setOthr(OrganisationIdentification38 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyBIC(String value) {
        this.anyBIC = value;
    }

}
