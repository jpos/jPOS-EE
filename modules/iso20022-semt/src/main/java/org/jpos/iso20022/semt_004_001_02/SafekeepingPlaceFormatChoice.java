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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceFormatChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceFormatChoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Id" type="{urn:swift:xsd:semt.004.001.02}SafekeepingPlaceAsCodeAndPartyIdentification"/>
 *           <element name="IdAsDSS" type="{urn:swift:xsd:semt.004.001.02}GenericIdentification5"/>
 *           <element name="IdAsCtry" type="{urn:swift:xsd:semt.004.001.02}CountryCode"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormatChoice", propOrder = {
    "id",
    "idAsDSS",
    "idAsCtry"
})
public class SafekeepingPlaceFormatChoice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceAsCodeAndPartyIdentification id;
    @XmlElement(name = "IdAsDSS")
    protected GenericIdentification5 idAsDSS;
    @XmlElement(name = "IdAsCtry")
    protected String idAsCtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     *     
     */
    public SafekeepingPlaceAsCodeAndPartyIdentification getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     *     
     */
    public void setId(SafekeepingPlaceAsCodeAndPartyIdentification value) {
        this.id = value;
    }

    /**
     * Gets the value of the idAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification5 }
     *     
     */
    public GenericIdentification5 getIdAsDSS() {
        return idAsDSS;
    }

    /**
     * Sets the value of the idAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification5 }
     *     
     */
    public void setIdAsDSS(GenericIdentification5 value) {
        this.idAsDSS = value;
    }

    /**
     * Gets the value of the idAsCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsCtry() {
        return idAsCtry;
    }

    /**
     * Sets the value of the idAsCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAsCtry(String value) {
        this.idAsCtry = value;
    }

}
