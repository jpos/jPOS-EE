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

package org.jpos.iso20022.seev_003_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification241 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification241">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyIdentification231Choice"/>
 *         <element name="AddtlIdInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyAdditionalIdentification2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification241", propOrder = {
    "id",
    "addtlIdInf"
})
public class PartyIdentification241 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification231Choice id;
    @XmlElement(name = "AddtlIdInf")
    protected PartyAdditionalIdentification2Choice addtlIdInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public PartyIdentification231Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public void setId(PartyIdentification231Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the addtlIdInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAdditionalIdentification2Choice }
     *     
     */
    public PartyAdditionalIdentification2Choice getAddtlIdInf() {
        return addtlIdInf;
    }

    /**
     * Sets the value of the addtlIdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAdditionalIdentification2Choice }
     *     
     */
    public void setAddtlIdInf(PartyAdditionalIdentification2Choice value) {
        this.addtlIdInf = value;
    }

}
