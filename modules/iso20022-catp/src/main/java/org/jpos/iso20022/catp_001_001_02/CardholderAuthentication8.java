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

package org.jpos.iso20022.catp_001_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderAuthentication8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardholderAuthentication8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}AuthenticationMethod7Code"/>
 *         <element name="TknReqd" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}Max5000Binary" minOccurs="0"/>
 *         <element name="PrtctdAuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}ContentInformationType10" minOccurs="0"/>
 *         <element name="CrdhldrOnLinePIN" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}OnLinePIN5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication8", propOrder = {
    "authntcnMtd",
    "tknReqd",
    "authntcnVal",
    "prtctdAuthntcnVal",
    "crdhldrOnLinePIN"
})
public class CardholderAuthentication8 {

    @XmlElement(name = "AuthntcnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod7Code authntcnMtd;
    @XmlElement(name = "TknReqd")
    protected Boolean tknReqd;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "PrtctdAuthntcnVal")
    protected ContentInformationType10 prtctdAuthntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN5 crdhldrOnLinePIN;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod7Code }
     *     
     */
    public AuthenticationMethod7Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod7Code }
     *     
     */
    public void setAuthntcnMtd(AuthenticationMethod7Code value) {
        this.authntcnMtd = value;
    }

    /**
     * Gets the value of the tknReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknReqd() {
        return tknReqd;
    }

    /**
     * Sets the value of the tknReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTknReqd(Boolean value) {
        this.tknReqd = value;
    }

    /**
     * Gets the value of the authntcnVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Sets the value of the authntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthntcnVal(byte[] value) {
        this.authntcnVal = value;
    }

    /**
     * Gets the value of the prtctdAuthntcnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAuthntcnVal() {
        return prtctdAuthntcnVal;
    }

    /**
     * Sets the value of the prtctdAuthntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAuthntcnVal(ContentInformationType10 value) {
        this.prtctdAuthntcnVal = value;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN5 }
     *     
     */
    public OnLinePIN5 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN5 }
     *     
     */
    public void setCrdhldrOnLinePIN(OnLinePIN5 value) {
        this.crdhldrOnLinePIN = value;
    }

}
