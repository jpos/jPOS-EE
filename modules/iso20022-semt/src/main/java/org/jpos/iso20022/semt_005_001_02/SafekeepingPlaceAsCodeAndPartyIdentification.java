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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceAsCodeAndPartyIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceAsCodeAndPartyIdentification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcSfkpg" type="{urn:swift:xsd:semt.005.001.02}SafekeepingPlace1Code"/>
 *         <element name="Nrrtv" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Pty" type="{urn:swift:xsd:semt.005.001.02}PartyIdentification3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceAsCodeAndPartyIdentification", propOrder = {
    "plcSfkpg",
    "nrrtv",
    "pty"
})
public class SafekeepingPlaceAsCodeAndPartyIdentification {

    @XmlElement(name = "PlcSfkpg", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace1Code plcSfkpg;
    @XmlElement(name = "Nrrtv")
    protected String nrrtv;
    @XmlElement(name = "Pty")
    protected PartyIdentification3 pty;

    /**
     * Gets the value of the plcSfkpg property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlace1Code getPlcSfkpg() {
        return plcSfkpg;
    }

    /**
     * Sets the value of the plcSfkpg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public void setPlcSfkpg(SafekeepingPlace1Code value) {
        this.plcSfkpg = value;
    }

    /**
     * Gets the value of the nrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrrtv() {
        return nrrtv;
    }

    /**
     * Sets the value of the nrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrrtv(String value) {
        this.nrrtv = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification3 }
     *     
     */
    public PartyIdentification3 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification3 }
     *     
     */
    public void setPty(PartyIdentification3 value) {
        this.pty = value;
    }

}
