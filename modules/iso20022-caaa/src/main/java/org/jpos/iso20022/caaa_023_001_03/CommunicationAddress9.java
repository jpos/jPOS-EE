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

package org.jpos.iso20022.caaa_023_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationAddress9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunicationAddress9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}PostalAddress22" minOccurs="0"/>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max256Text" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max256Text" minOccurs="0"/>
 *         <element name="Phne" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="CstmrSvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress9", propOrder = {
    "pstlAdr",
    "email",
    "urlAdr",
    "phne",
    "cstmrSvc",
    "addtlCtctInf"
})
public class CommunicationAddress9 {

    @XmlElement(name = "PstlAdr")
    protected PostalAddress22 pstlAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setPstlAdr(PostalAddress22 value) {
        this.pstlAdr = value;
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
     * Gets the value of the cstmrSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSvc() {
        return cstmrSvc;
    }

    /**
     * Sets the value of the cstmrSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrSvc(String value) {
        this.cstmrSvc = value;
    }

    /**
     * Gets the value of the addtlCtctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCtctInf() {
        return addtlCtctInf;
    }

    /**
     * Sets the value of the addtlCtctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCtctInf(String value) {
        this.addtlCtctInf = value;
    }

}
