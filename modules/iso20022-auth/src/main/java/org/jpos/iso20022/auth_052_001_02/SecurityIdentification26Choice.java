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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification26Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification26Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISINOct2015Identifier"/>
 *         <element name="NotAvlbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}NotAvailable1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification26Choice", propOrder = {
    "id",
    "notAvlbl"
})
public class SecurityIdentification26Choice {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "NotAvlbl")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlbl;

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
     * Gets the value of the notAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlbl() {
        return notAvlbl;
    }

    /**
     * Sets the value of the notAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public void setNotAvlbl(NotAvailable1Code value) {
        this.notAvlbl = value;
    }

}
