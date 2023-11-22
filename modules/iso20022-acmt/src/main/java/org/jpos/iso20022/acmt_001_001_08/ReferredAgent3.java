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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferredAgent3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReferredAgent3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rfrd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Referred1Code"/>
 *         <element name="RfrdPlcmntAgt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredAgent3", propOrder = {
    "rfrd",
    "rfrdPlcmntAgt"
})
public class ReferredAgent3 {

    @XmlElement(name = "Rfrd", required = true)
    @XmlSchemaType(name = "string")
    protected Referred1Code rfrd;
    @XmlElement(name = "RfrdPlcmntAgt")
    protected PartyIdentification125Choice rfrdPlcmntAgt;

    /**
     * Gets the value of the rfrd property.
     * 
     * @return
     *     possible object is
     *     {@link Referred1Code }
     *     
     */
    public Referred1Code getRfrd() {
        return rfrd;
    }

    /**
     * Sets the value of the rfrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referred1Code }
     *     
     */
    public void setRfrd(Referred1Code value) {
        this.rfrd = value;
    }

    /**
     * Gets the value of the rfrdPlcmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRfrdPlcmntAgt() {
        return rfrdPlcmntAgt;
    }

    /**
     * Sets the value of the rfrdPlcmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setRfrdPlcmntAgt(PartyIdentification125Choice value) {
        this.rfrdPlcmntAgt = value;
    }

}
