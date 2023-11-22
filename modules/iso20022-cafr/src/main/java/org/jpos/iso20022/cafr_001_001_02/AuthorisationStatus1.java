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

package org.jpos.iso20022.cafr_001_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuthorisationStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AuthstnNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}PartyType26Code" minOccurs="0"/>
 *         <element name="OthrAuthstnNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationStatus1", propOrder = {
    "authstnInd",
    "authstnNtty",
    "othrAuthstnNtty"
})
public class AuthorisationStatus1 {

    @XmlElement(name = "AuthstnInd")
    protected Boolean authstnInd;
    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType26Code authstnNtty;
    @XmlElement(name = "OthrAuthstnNtty")
    protected String othrAuthstnNtty;

    /**
     * Gets the value of the authstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthstnInd() {
        return authstnInd;
    }

    /**
     * Sets the value of the authstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthstnInd(Boolean value) {
        this.authstnInd = value;
    }

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public void setAuthstnNtty(PartyType26Code value) {
        this.authstnNtty = value;
    }

    /**
     * Gets the value of the othrAuthstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAuthstnNtty() {
        return othrAuthstnNtty;
    }

    /**
     * Sets the value of the othrAuthstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAuthstnNtty(String value) {
        this.othrAuthstnNtty = value;
    }

}
