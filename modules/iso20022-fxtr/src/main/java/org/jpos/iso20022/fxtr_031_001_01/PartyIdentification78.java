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

package org.jpos.iso20022.fxtr_031_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification78 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification78">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtySrc" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}IdentificationType1Code" minOccurs="0"/>
 *         <element name="TradPtyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification78", propOrder = {
    "ptySrc",
    "tradPtyId"
})
public class PartyIdentification78 {

    @XmlElement(name = "PtySrc")
    @XmlSchemaType(name = "string")
    protected IdentificationType1Code ptySrc;
    @XmlElement(name = "TradPtyId", required = true)
    protected String tradPtyId;

    /**
     * Gets the value of the ptySrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType1Code }
     *     
     */
    public IdentificationType1Code getPtySrc() {
        return ptySrc;
    }

    /**
     * Sets the value of the ptySrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType1Code }
     *     
     */
    public void setPtySrc(IdentificationType1Code value) {
        this.ptySrc = value;
    }

    /**
     * Gets the value of the tradPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPtyId() {
        return tradPtyId;
    }

    /**
     * Sets the value of the tradPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradPtyId(String value) {
        this.tradPtyId = value;
    }

}
