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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Contact3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CntrlPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="PrprtyPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="TollFreePhneNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max256Text" minOccurs="0"/>
 *         <element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max256Text" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LanguageCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact3", propOrder = {
    "cntrlPhneNb",
    "prprtyPhneNb",
    "tollFreePhneNb",
    "email",
    "faxNb",
    "urlAdr",
    "lang"
})
public class Contact3 {

    @XmlElement(name = "CntrlPhneNb")
    protected String cntrlPhneNb;
    @XmlElement(name = "PrprtyPhneNb")
    protected String prprtyPhneNb;
    @XmlElement(name = "TollFreePhneNb")
    protected String tollFreePhneNb;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Lang")
    protected String lang;

    /**
     * Gets the value of the cntrlPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlPhneNb() {
        return cntrlPhneNb;
    }

    /**
     * Sets the value of the cntrlPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrlPhneNb(String value) {
        this.cntrlPhneNb = value;
    }

    /**
     * Gets the value of the prprtyPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyPhneNb() {
        return prprtyPhneNb;
    }

    /**
     * Sets the value of the prprtyPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrprtyPhneNb(String value) {
        this.prprtyPhneNb = value;
    }

    /**
     * Gets the value of the tollFreePhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreePhneNb() {
        return tollFreePhneNb;
    }

    /**
     * Sets the value of the tollFreePhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreePhneNb(String value) {
        this.tollFreePhneNb = value;
    }

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

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
