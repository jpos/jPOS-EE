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

package org.jpos.iso20022.semt_003_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pledgee3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Pledgee3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PldgeeTpAndId" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}PledgeeFormat5Choice" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pledgee3", propOrder = {
    "pldgeeTpAndId",
    "lei"
})
public class Pledgee3 {

    @XmlElement(name = "PldgeeTpAndId")
    protected PledgeeFormat5Choice pldgeeTpAndId;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the pldgeeTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeeFormat5Choice }
     *     
     */
    public PledgeeFormat5Choice getPldgeeTpAndId() {
        return pldgeeTpAndId;
    }

    /**
     * Sets the value of the pldgeeTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeeFormat5Choice }
     *     
     */
    public void setPldgeeTpAndId(PledgeeFormat5Choice value) {
        this.pldgeeTpAndId = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

}
