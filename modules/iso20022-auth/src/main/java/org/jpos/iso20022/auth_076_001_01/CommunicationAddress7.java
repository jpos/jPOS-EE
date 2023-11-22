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

package org.jpos.iso20022.auth_076_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationAddress7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunicationAddress7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max2048Text" minOccurs="0"/>
 *         <element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="MobNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="TlxAdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max35Text" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max2048Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress7", propOrder = {
    "email",
    "phneNb",
    "mobNb",
    "faxNb",
    "tlxAdr",
    "urlAdr"
})
public class CommunicationAddress7 {

    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "MobNb")
    protected String mobNb;
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
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Gets the value of the mobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNb() {
        return mobNb;
    }

    /**
     * Sets the value of the mobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNb(String value) {
        this.mobNb = value;
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
