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

package org.jpos.iso20022.reda_006_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationAddress3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunicationAddress3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max256Text" minOccurs="0"/>
 *         <element name="Phne" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="Mob" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="TlxAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress3", propOrder = {
    "email",
    "phne",
    "mob",
    "faxNb",
    "tlxAdr",
    "urlAdr"
})
public class CommunicationAddress3 {

    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "Mob")
    protected String mob;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "TlxAdr")
    protected String tlxAdr;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhne() {
        return phne;
    }

    /**
     * Sets the value of the phne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhne(String value) {
        this.phne = value;
    }

    /**
     * Gets the value of the mob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMob() {
        return mob;
    }

    /**
     * Sets the value of the mob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMob(String value) {
        this.mob = value;
    }

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNb(String value) {
        this.faxNb = value;
    }

    /**
     * Gets the value of the tlxAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlxAdr() {
        return tlxAdr;
    }

    /**
     * Sets the value of the tlxAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlxAdr(String value) {
        this.tlxAdr = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

}
