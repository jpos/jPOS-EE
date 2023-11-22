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

package org.jpos.iso20022.acmt_023_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationVerification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdentificationVerification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.023.001.03}Max35Text"/>
 *         <element name="PtyAndAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.023.001.03}IdentificationInformation4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationVerification4", propOrder = {
    "id",
    "ptyAndAcctId"
})
public class IdentificationVerification4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "PtyAndAcctId", required = true)
    protected IdentificationInformation4 ptyAndAcctId;

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
     * Gets the value of the ptyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getPtyAndAcctId() {
        return ptyAndAcctId;
    }

    /**
     * Sets the value of the ptyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public void setPtyAndAcctId(IdentificationInformation4 value) {
        this.ptyAndAcctId = value;
    }

}
