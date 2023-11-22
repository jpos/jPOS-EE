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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonOrOrganisation1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonOrOrganisation1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}LEIIdentifier"/>
 *         <element name="MIC" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}MICIdentifier"/>
 *         <element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}PersonIdentification10"/>
 *         <element name="Intl" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}InternalPartyRole1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation1Choice", propOrder = {
    "lei",
    "mic",
    "prsn",
    "intl"
})
public class PersonOrOrganisation1Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "MIC")
    protected String mic;
    @XmlElement(name = "Prsn")
    protected PersonIdentification10 prsn;
    @XmlElement(name = "Intl")
    @XmlSchemaType(name = "string")
    protected InternalPartyRole1Code intl;

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
     * Gets the value of the mic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIC() {
        return mic;
    }

    /**
     * Sets the value of the mic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIC(String value) {
        this.mic = value;
    }

    /**
     * Gets the value of the prsn property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification10 }
     *     
     */
    public PersonIdentification10 getPrsn() {
        return prsn;
    }

    /**
     * Sets the value of the prsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification10 }
     *     
     */
    public void setPrsn(PersonIdentification10 value) {
        this.prsn = value;
    }

    /**
     * Gets the value of the intl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalPartyRole1Code }
     *     
     */
    public InternalPartyRole1Code getIntl() {
        return intl;
    }

    /**
     * Sets the value of the intl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalPartyRole1Code }
     *     
     */
    public void setIntl(InternalPartyRole1Code value) {
        this.intl = value;
    }

}
