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

package org.jpos.iso20022.colr_009_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionType2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeResolutionType2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}DisputeResolutionType2Code"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}GenericIdentification30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeResolutionType2Choice", propOrder = {
    "cd",
    "prtryId"
})
public class DisputeResolutionType2Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected DisputeResolutionType2Code cd;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification30 prtryId;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionType2Code }
     *     
     */
    public DisputeResolutionType2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionType2Code }
     *     
     */
    public void setCd(DisputeResolutionType2Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtryId(GenericIdentification30 value) {
        this.prtryId = value;
    }

}
