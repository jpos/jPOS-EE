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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAgent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAgent1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PartyIdentification2Choice"/>
 *         <element name="AgtRole" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AgentRole1FormatChoice"/>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}NameAndAddress5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAgent1", propOrder = {
    "agtId",
    "agtRole",
    "ctctPrsn"
})
public class CorporateActionAgent1 {

    @XmlElement(name = "AgtId", required = true)
    protected PartyIdentification2Choice agtId;
    @XmlElement(name = "AgtRole", required = true)
    protected AgentRole1FormatChoice agtRole;
    @XmlElement(name = "CtctPrsn")
    protected NameAndAddress5 ctctPrsn;

    /**
     * Gets the value of the agtId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAgtId() {
        return agtId;
    }

    /**
     * Sets the value of the agtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAgtId(PartyIdentification2Choice value) {
        this.agtId = value;
    }

    /**
     * Gets the value of the agtRole property.
     * 
     * @return
     *     possible object is
     *     {@link AgentRole1FormatChoice }
     *     
     */
    public AgentRole1FormatChoice getAgtRole() {
        return agtRole;
    }

    /**
     * Sets the value of the agtRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentRole1FormatChoice }
     *     
     */
    public void setAgtRole(AgentRole1FormatChoice value) {
        this.agtRole = value;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public void setCtctPrsn(NameAndAddress5 value) {
        this.ctctPrsn = value;
    }

}
