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
 * <p>Java class for PartyIdentification232Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification232Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LglPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PartyIdentification221"/>
 *         <element name="NtrlPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PartyIdentification238"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification232Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification232Choice {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification221 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected PartyIdentification238 ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification221 }
     *     
     */
    public PartyIdentification221 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification221 }
     *     
     */
    public void setLglPrsn(PartyIdentification221 value) {
        this.lglPrsn = value;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification238 }
     *     
     */
    public PartyIdentification238 getNtrlPrsn() {
        return ntrlPrsn;
    }

    /**
     * Sets the value of the ntrlPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification238 }
     *     
     */
    public void setNtrlPrsn(PartyIdentification238 value) {
        this.ntrlPrsn = value;
    }

}
