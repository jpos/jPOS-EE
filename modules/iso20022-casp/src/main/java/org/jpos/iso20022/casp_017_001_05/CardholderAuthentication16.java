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

package org.jpos.iso20022.casp_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderAuthentication16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardholderAuthentication16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}AuthenticationMethod8Code" minOccurs="0"/>
 *         <element name="AuthntcnXmptn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Exemption1Code" minOccurs="0"/>
 *         <element name="AuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max5000Binary" minOccurs="0"/>
 *         <element name="PrtctdAuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}ContentInformationType35" minOccurs="0"/>
 *         <element name="CrdhldrOnLinePIN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}OnLinePIN10" minOccurs="0"/>
 *         <element name="CrdhldrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}PersonIdentification15" minOccurs="0"/>
 *         <element name="AdrVrfctn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}AddressVerification1" minOccurs="0"/>
 *         <element name="AuthntcnTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AuthntcnLvl" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AuthntcnRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}AuthenticationResult1Code" minOccurs="0"/>
 *         <element name="AuthntcnAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}ExternallyDefinedData4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication16", propOrder = {
    "authntcnMtd",
    "authntcnXmptn",
    "authntcnVal",
    "prtctdAuthntcnVal",
    "crdhldrOnLinePIN",
    "crdhldrId",
    "adrVrfctn",
    "authntcnTp",
    "authntcnLvl",
    "authntcnRslt",
    "authntcnAddtlInf"
})
public class CardholderAuthentication16 {

    @XmlElement(name = "AuthntcnMtd")
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod8Code authntcnMtd;
    @XmlElement(name = "AuthntcnXmptn")
    @XmlSchemaType(name = "string")
    protected Exemption1Code authntcnXmptn;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "PrtctdAuthntcnVal")
    protected ContentInformationType35 prtctdAuthntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN10 crdhldrOnLinePIN;
    @XmlElement(name = "CrdhldrId")
    protected PersonIdentification15 crdhldrId;
    @XmlElement(name = "AdrVrfctn")
    protected AddressVerification1 adrVrfctn;
    @XmlElement(name = "AuthntcnTp")
    protected String authntcnTp;
    @XmlElement(name = "AuthntcnLvl")
    protected String authntcnLvl;
    @XmlElement(name = "AuthntcnRslt")
    @XmlSchemaType(name = "string")
    protected AuthenticationResult1Code authntcnRslt;
    @XmlElement(name = "AuthntcnAddtlInf")
    protected ExternallyDefinedData4 authntcnAddtlInf;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public AuthenticationMethod8Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public void setAuthntcnMtd(AuthenticationMethod8Code value) {
        this.authntcnMtd = value;
    }

    /**
     * Gets the value of the authntcnXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Exemption1Code }
     *     
     */
    public Exemption1Code getAuthntcnXmptn() {
        return authntcnXmptn;
    }

    /**
     * Sets the value of the authntcnXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemption1Code }
     *     
     */
    public void setAuthntcnXmptn(Exemption1Code value) {
        this.authntcnXmptn = value;
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
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getPrtctdAuthntcnVal() {
        return prtctdAuthntcnVal;
    }

    /**
     * Sets the value of the prtctdAuthntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public void setPrtctdAuthntcnVal(ContentInformationType35 value) {
        this.prtctdAuthntcnVal = value;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN10 }
     *     
     */
    public OnLinePIN10 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN10 }
     *     
     */
    public void setCrdhldrOnLinePIN(OnLinePIN10 value) {
        this.crdhldrOnLinePIN = value;
    }

    /**
     * Gets the value of the crdhldrId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getCrdhldrId() {
        return crdhldrId;
    }

    /**
     * Sets the value of the crdhldrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public void setCrdhldrId(PersonIdentification15 value) {
        this.crdhldrId = value;
    }

    /**
     * Gets the value of the adrVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerification1 }
     *     
     */
    public AddressVerification1 getAdrVrfctn() {
        return adrVrfctn;
    }

    /**
     * Sets the value of the adrVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerification1 }
     *     
     */
    public void setAdrVrfctn(AddressVerification1 value) {
        this.adrVrfctn = value;
    }

    /**
     * Gets the value of the authntcnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTp() {
        return authntcnTp;
    }

    /**
     * Sets the value of the authntcnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnTp(String value) {
        this.authntcnTp = value;
    }

    /**
     * Gets the value of the authntcnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnLvl() {
        return authntcnLvl;
    }

    /**
     * Sets the value of the authntcnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnLvl(String value) {
        this.authntcnLvl = value;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public AuthenticationResult1Code getAuthntcnRslt() {
        return authntcnRslt;
    }

    /**
     * Sets the value of the authntcnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public void setAuthntcnRslt(AuthenticationResult1Code value) {
        this.authntcnRslt = value;
    }

    /**
     * Gets the value of the authntcnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExternallyDefinedData4 }
     *     
     */
    public ExternallyDefinedData4 getAuthntcnAddtlInf() {
        return authntcnAddtlInf;
    }

    /**
     * Sets the value of the authntcnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternallyDefinedData4 }
     *     
     */
    public void setAuthntcnAddtlInf(ExternallyDefinedData4 value) {
        this.authntcnAddtlInf = value;
    }

}
