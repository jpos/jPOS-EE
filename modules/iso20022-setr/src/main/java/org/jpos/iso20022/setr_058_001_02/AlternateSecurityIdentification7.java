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

package org.jpos.iso20022.setr_058_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateSecurityIdentification7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AlternateSecurityIdentification7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text"/>
 *         <element name="IdSrc" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}IdentificationSource1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateSecurityIdentification7", propOrder = {
    "id",
    "idSrc"
})
public class AlternateSecurityIdentification7 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IdSrc", required = true)
    protected IdentificationSource1Choice idSrc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idSrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public IdentificationSource1Choice getIdSrc() {
        return idSrc;
    }

    /**
     * Sets the value of the idSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public void setIdSrc(IdentificationSource1Choice value) {
        this.idSrc = value;
    }

}
