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

package org.jpos.iso20022.camt_083_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityNumeric4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriorityNumeric4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Nmrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}Exact4NumericText"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.083.001.01}GenericIdentification30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityNumeric4Choice", propOrder = {
    "nmrc",
    "prtry"
})
public class PriorityNumeric4Choice {

    @XmlElement(name = "Nmrc")
    protected String nmrc;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Gets the value of the nmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrc() {
        return nmrc;
    }

    /**
     * Sets the value of the nmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmrc(String value) {
        this.nmrc = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtry(GenericIdentification30 value) {
        this.prtry = value;
    }

}
