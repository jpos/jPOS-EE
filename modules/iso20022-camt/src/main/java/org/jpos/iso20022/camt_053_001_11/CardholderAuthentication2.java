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

package org.jpos.iso20022.camt_053_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderAuthentication2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardholderAuthentication2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}AuthenticationMethod1Code"/>
 *         <element name="AuthntcnNtty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}AuthenticationEntity1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication2", propOrder = {
    "authntcnMtd",
    "authntcnNtty"
})
public class CardholderAuthentication2 {

    @XmlElement(name = "AuthntcnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod1Code authntcnMtd;
    @XmlElement(name = "AuthntcnNtty", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity1Code authntcnNtty;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod1Code }
     *     
     */
    public AuthenticationMethod1Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod1Code }
     *     
     */
    public void setAuthntcnMtd(AuthenticationMethod1Code value) {
        this.authntcnMtd = value;
    }

    /**
     * Gets the value of the authntcnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationEntity1Code }
     *     
     */
    public AuthenticationEntity1Code getAuthntcnNtty() {
        return authntcnNtty;
    }

    /**
     * Sets the value of the authntcnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity1Code }
     *     
     */
    public void setAuthntcnNtty(AuthenticationEntity1Code value) {
        this.authntcnNtty = value;
    }

}
