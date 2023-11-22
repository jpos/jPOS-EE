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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification226Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification226Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LglPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PartyIdentification224"/>
 *         <element name="NtrlPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PartyIdentification222"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification226Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification226Choice {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification224 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected PartyIdentification222 ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification224 }
     *     
     */
    public PartyIdentification224 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification224 }
     *     
     */
    public void setLglPrsn(PartyIdentification224 value) {
        this.lglPrsn = value;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification222 }
     *     
     */
    public PartyIdentification222 getNtrlPrsn() {
        return ntrlPrsn;
    }

    /**
     * Sets the value of the ntrlPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification222 }
     *     
     */
    public void setNtrlPrsn(PartyIdentification222 value) {
        this.ntrlPrsn = value;
    }

}
