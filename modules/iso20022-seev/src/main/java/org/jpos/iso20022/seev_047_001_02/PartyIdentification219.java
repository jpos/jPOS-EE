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

package org.jpos.iso20022.seev_047_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification219 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification219">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PersonName2"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification195Choice"/>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}ContactIdentification2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification219", propOrder = {
    "nmAndAdr",
    "id",
    "ctctPrsn"
})
public class PartyIdentification219 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName2 nmAndAdr;
    @XmlElement(name = "Id", required = true)
    protected PartyIdentification195Choice id;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName2 }
     *     
     */
    public PersonName2 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName2 }
     *     
     */
    public void setNmAndAdr(PersonName2 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public PartyIdentification195Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public void setId(PartyIdentification195Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public void setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
    }

}
