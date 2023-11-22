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

package org.jpos.iso20022.seev_036_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification137Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification137Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AnyBICDec2014Identifier"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification84"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}NameAndAddress12"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification137Choice", propOrder = {
    "anyBIC",
    "prtryId",
    "nmAndAdr"
})
public class PartyIdentification137Choice {

    @XmlElement(name = "AnyBIC")
    protected String anyBIC;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification84 prtryId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress12 nmAndAdr;

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

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification84 }
     *     
     */
    public GenericIdentification84 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification84 }
     *     
     */
    public void setPrtryId(GenericIdentification84 value) {
        this.prtryId = value;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress12 }
     *     
     */
    public NameAndAddress12 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress12 }
     *     
     */
    public void setNmAndAdr(NameAndAddress12 value) {
        this.nmAndAdr = value;
    }

}
