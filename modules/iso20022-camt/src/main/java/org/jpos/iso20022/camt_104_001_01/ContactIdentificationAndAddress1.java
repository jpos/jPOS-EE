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

package org.jpos.iso20022.camt_104_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactIdentificationAndAddress1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContactIdentificationAndAddress1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.104.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:camt.104.001.01}PaymentRole1Code"/>
 *         <element name="ComAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.104.001.01}CommunicationAddress8"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactIdentificationAndAddress1", propOrder = {
    "nm",
    "role",
    "comAdr"
})
public class ContactIdentificationAndAddress1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentRole1Code role;
    @XmlElement(name = "ComAdr", required = true)
    protected CommunicationAddress8 comAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRole1Code }
     *     
     */
    public PaymentRole1Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRole1Code }
     *     
     */
    public void setRole(PaymentRole1Code value) {
        this.role = value;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public CommunicationAddress8 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress8 }
     *     
     */
    public void setComAdr(CommunicationAddress8 value) {
        this.comAdr = value;
    }

}
