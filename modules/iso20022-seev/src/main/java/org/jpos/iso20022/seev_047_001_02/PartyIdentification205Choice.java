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
 * <p>Java class for PartyIdentification205Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification205Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LglPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification201"/>
 *         <element name="NtrlPrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification202"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification205Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification205Choice {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification201 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected PartyIdentification202 ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification201 }
     *     
     */
    public PartyIdentification201 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification201 }
     *     
     */
    public void setLglPrsn(PartyIdentification201 value) {
        this.lglPrsn = value;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification202 }
     *     
     */
    public PartyIdentification202 getNtrlPrsn() {
        return ntrlPrsn;
    }

    /**
     * Sets the value of the ntrlPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification202 }
     *     
     */
    public void setNtrlPrsn(PartyIdentification202 value) {
        this.ntrlPrsn = value;
    }

}
