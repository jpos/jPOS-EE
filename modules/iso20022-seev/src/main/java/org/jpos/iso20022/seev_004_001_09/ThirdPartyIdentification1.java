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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ThirdPartyIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}PartyRole3Code"/>
 *         <element name="LglPrsnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}PartyIdentification221" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyIdentification1", propOrder = {
    "role",
    "lglPrsnId"
})
public class ThirdPartyIdentification1 {

    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "string")
    protected PartyRole3Code role;
    @XmlElement(name = "LglPrsnId")
    protected PartyIdentification221 lglPrsnId;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole3Code }
     *     
     */
    public PartyRole3Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole3Code }
     *     
     */
    public void setRole(PartyRole3Code value) {
        this.role = value;
    }

    /**
     * Gets the value of the lglPrsnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification221 }
     *     
     */
    public PartyIdentification221 getLglPrsnId() {
        return lglPrsnId;
    }

    /**
     * Sets the value of the lglPrsnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification221 }
     *     
     */
    public void setLglPrsnId(PartyIdentification221 value) {
        this.lglPrsnId = value;
    }

}
