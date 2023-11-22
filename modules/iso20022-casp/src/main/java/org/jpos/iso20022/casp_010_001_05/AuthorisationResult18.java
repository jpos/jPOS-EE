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

package org.jpos.iso20022.casp_010_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationResult18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuthorisationResult18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthstnNtty" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}GenericIdentification90" minOccurs="0"/>
 *         <element name="RspnToAuthstn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ResponseType10"/>
 *         <element name="AuthstnCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max8Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult18", propOrder = {
    "authstnNtty",
    "rspnToAuthstn",
    "authstnCd"
})
public class AuthorisationResult18 {

    @XmlElement(name = "AuthstnNtty")
    protected GenericIdentification90 authstnNtty;
    @XmlElement(name = "RspnToAuthstn", required = true)
    protected ResponseType10 rspnToAuthstn;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification90 }
     *     
     */
    public GenericIdentification90 getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification90 }
     *     
     */
    public void setAuthstnNtty(GenericIdentification90 value) {
        this.authstnNtty = value;
    }

    /**
     * Gets the value of the rspnToAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getRspnToAuthstn() {
        return rspnToAuthstn;
    }

    /**
     * Sets the value of the rspnToAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public void setRspnToAuthstn(ResponseType10 value) {
        this.rspnToAuthstn = value;
    }

    /**
     * Gets the value of the authstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Sets the value of the authstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthstnCd(String value) {
        this.authstnCd = value;
    }

}
