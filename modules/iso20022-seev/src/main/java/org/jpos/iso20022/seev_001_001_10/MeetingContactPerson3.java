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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingContactPerson3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingContactPerson3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ContactIdentification1" minOccurs="0"/>
 *         <element name="EmplngPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PartyIdentification129Choice" minOccurs="0"/>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MICIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingContactPerson3", propOrder = {
    "ctctPrsn",
    "emplngPty",
    "plcOfListg"
})
public class MeetingContactPerson3 {

    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification1 ctctPrsn;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification129Choice emplngPty;
    @XmlElement(name = "PlcOfListg")
    protected String plcOfListg;

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification1 }
     *     
     */
    public ContactIdentification1 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification1 }
     *     
     */
    public void setCtctPrsn(ContactIdentification1 value) {
        this.ctctPrsn = value;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public void setEmplngPty(PartyIdentification129Choice value) {
        this.emplngPty = value;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfListg(String value) {
        this.plcOfListg = value;
    }

}
