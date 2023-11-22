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

package org.jpos.iso20022.camt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactIdentificationAndAddress2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContactIdentificationAndAddress2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}Max35Text" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}PaymentRole1Choice"/>
 *         <element name="ComAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.014.001.05}CommunicationAddress10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactIdentificationAndAddress2", propOrder = {
    "nm",
    "role",
    "comAdr"
})
public class ContactIdentificationAndAddress2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Role", required = true)
    protected PaymentRole1Choice role;
    @XmlElement(name = "ComAdr", required = true)
    protected CommunicationAddress10 comAdr;

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
     *     {@link PaymentRole1Choice }
     *     
     */
    public PaymentRole1Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRole1Choice }
     *     
     */
    public void setRole(PaymentRole1Choice value) {
        this.role = value;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public CommunicationAddress10 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public void setComAdr(CommunicationAddress10 value) {
        this.comAdr = value;
    }

}
