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

package org.jpos.iso20022.sese_009_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intermediary48 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Intermediary48">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}PartyIdentification132"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Account34" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Role8Choice" minOccurs="0"/>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}ContactIdentification2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary48", propOrder = {
    "id",
    "acct",
    "role",
    "ctctPrsn"
})
public class Intermediary48 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification132 id;
    @XmlElement(name = "Acct")
    protected Account34 acct;
    @XmlElement(name = "Role")
    protected Role8Choice role;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setId(PartyIdentification132 value) {
        this.id = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account34 }
     *     
     */
    public Account34 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account34 }
     *     
     */
    public void setAcct(Account34 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Role8Choice }
     *     
     */
    public Role8Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role8Choice }
     *     
     */
    public void setRole(Role8Choice value) {
        this.role = value;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public void setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
    }

}
