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

package org.jpos.iso20022.auth_063_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverTwoDefaulters1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CoverTwoDefaulters1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cover1Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LEIIdentifier"/>
 *         <element name="Cover2Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LEIIdentifier"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverTwoDefaulters1", propOrder = {
    "cover1Id",
    "cover2Id"
})
public class CoverTwoDefaulters1 {

    @XmlElement(name = "Cover1Id", required = true)
    protected String cover1Id;
    @XmlElement(name = "Cover2Id", required = true)
    protected String cover2Id;

    /**
     * Gets the value of the cover1Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCover1Id() {
        return cover1Id;
    }

    /**
     * Sets the value of the cover1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCover1Id(String value) {
        this.cover1Id = value;
    }

    /**
     * Gets the value of the cover2Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCover2Id() {
        return cover2Id;
    }

    /**
     * Sets the value of the cover2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCover2Id(String value) {
        this.cover2Id = value;
    }

}
