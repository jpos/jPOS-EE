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

package org.jpos.iso20022.fxtr_034_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyIdSrc" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}IdentificationType2Code"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification18", propOrder = {
    "sctyIdSrc",
    "sctyId"
})
public class SecurityIdentification18 {

    @XmlElement(name = "SctyIdSrc", required = true)
    @XmlSchemaType(name = "string")
    protected IdentificationType2Code sctyIdSrc;
    @XmlElement(name = "SctyId", required = true)
    protected String sctyId;

    /**
     * Gets the value of the sctyIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType2Code }
     *     
     */
    public IdentificationType2Code getSctyIdSrc() {
        return sctyIdSrc;
    }

    /**
     * Sets the value of the sctyIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType2Code }
     *     
     */
    public void setSctyIdSrc(IdentificationType2Code value) {
        this.sctyIdSrc = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyId(String value) {
        this.sctyId = value;
    }

}
