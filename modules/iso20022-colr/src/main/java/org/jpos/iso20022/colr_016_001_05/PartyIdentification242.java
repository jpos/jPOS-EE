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

package org.jpos.iso20022.colr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification242 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification242">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}PartyIdentification178Choice"/>
 *         <element name="CCPMmbTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CCPMemberType1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification242", propOrder = {
    "id",
    "ccpMmbTp"
})
public class PartyIdentification242 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification178Choice id;
    @XmlElement(name = "CCPMmbTp")
    @XmlSchemaType(name = "string")
    protected CCPMemberType1Code ccpMmbTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setId(PartyIdentification178Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the ccpMmbTp property.
     * 
     * @return
     *     possible object is
     *     {@link CCPMemberType1Code }
     *     
     */
    public CCPMemberType1Code getCCPMmbTp() {
        return ccpMmbTp;
    }

    /**
     * Sets the value of the ccpMmbTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPMemberType1Code }
     *     
     */
    public void setCCPMmbTp(CCPMemberType1Code value) {
        this.ccpMmbTp = value;
    }

}
