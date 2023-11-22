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

package org.jpos.iso20022.fxtr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification60 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification60">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FndId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}Max35Text"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}NameAndAddress8" minOccurs="0"/>
 *         <element name="LglNttyIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification60", propOrder = {
    "fndId",
    "nmAndAdr",
    "lglNttyIdr"
})
public class PartyIdentification60 {

    @XmlElement(name = "FndId", required = true)
    protected String fndId;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Gets the value of the fndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndId() {
        return fndId;
    }

    /**
     * Sets the value of the fndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndId(String value) {
        this.fndId = value;
    }

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
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
    }

}
