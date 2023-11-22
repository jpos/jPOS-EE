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

package org.jpos.iso20022.caaa_014_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionVerificationResult4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionVerificationResult4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}AuthenticationMethod6Code"/>
 *         <element name="VrfctnNtty" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}AuthenticationEntity2Code" minOccurs="0"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Verification1Code" minOccurs="0"/>
 *         <element name="AddtlRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max500Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionVerificationResult4", propOrder = {
    "mtd",
    "vrfctnNtty",
    "rslt",
    "addtlRslt"
})
public class TransactionVerificationResult4 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod6Code mtd;
    @XmlElement(name = "VrfctnNtty")
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity2Code vrfctnNtty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification1Code rslt;
    @XmlElement(name = "AddtlRslt")
    protected String addtlRslt;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod6Code }
     *     
     */
    public AuthenticationMethod6Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod6Code }
     *     
     */
    public void setMtd(AuthenticationMethod6Code value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the vrfctnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public AuthenticationEntity2Code getVrfctnNtty() {
        return vrfctnNtty;
    }

    /**
     * Sets the value of the vrfctnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public void setVrfctnNtty(AuthenticationEntity2Code value) {
        this.vrfctnNtty = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Verification1Code }
     *     
     */
    public Verification1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification1Code }
     *     
     */
    public void setRslt(Verification1Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the addtlRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRslt() {
        return addtlRslt;
    }

    /**
     * Sets the value of the addtlRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRslt(String value) {
        this.addtlRslt = value;
    }

}
