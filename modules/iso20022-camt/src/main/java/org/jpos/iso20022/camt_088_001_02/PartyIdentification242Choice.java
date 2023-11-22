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

package org.jpos.iso20022.camt_088_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification242Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification242Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}NameAndAddress8"/>
 *         <element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification265"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification266"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification242Choice", propOrder = {
    "nmAndAdr",
    "anyBIC",
    "ptyId"
})
public class PartyIdentification242Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "PtyId")
    protected PartyIdentification266 ptyId;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress8 }
     *     
     */
    public NameAndAddress8 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress8 }
     *     
     */
    public void setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public void setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification266 }
     *     
     */
    public PartyIdentification266 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification266 }
     *     
     */
    public void setPtyId(PartyIdentification266 value) {
        this.ptyId = value;
    }

}
