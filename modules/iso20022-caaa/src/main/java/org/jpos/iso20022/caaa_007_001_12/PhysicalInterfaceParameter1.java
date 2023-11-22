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

package org.jpos.iso20022.caaa_007_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalInterfaceParameter1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PhysicalInterfaceParameter1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrfcNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text"/>
 *         <element name="IntrfcTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}POICommunicationType2Code" minOccurs="0"/>
 *         <element name="UsrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *         <element name="AccsCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Binary" minOccurs="0"/>
 *         <element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *         <element name="AddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max2KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalInterfaceParameter1", propOrder = {
    "intrfcNm",
    "intrfcTp",
    "usrNm",
    "accsCd",
    "sctyPrfl",
    "addtlParams"
})
public class PhysicalInterfaceParameter1 {

    @XmlElement(name = "IntrfcNm", required = true)
    protected String intrfcNm;
    @XmlElement(name = "IntrfcTp")
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code intrfcTp;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "AddtlParams")
    protected byte[] addtlParams;

    /**
     * Gets the value of the intrfcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrfcNm() {
        return intrfcNm;
    }

    /**
     * Sets the value of the intrfcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrfcNm(String value) {
        this.intrfcNm = value;
    }

    /**
     * Gets the value of the intrfcTp property.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getIntrfcTp() {
        return intrfcTp;
    }

    /**
     * Sets the value of the intrfcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public void setIntrfcTp(POICommunicationType2Code value) {
        this.intrfcTp = value;
    }

    /**
     * Gets the value of the usrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Sets the value of the usrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

    /**
     * Gets the value of the accsCd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Sets the value of the accsCd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAccsCd(byte[] value) {
        this.accsCd = value;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyPrfl(String value) {
        this.sctyPrfl = value;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlParams(byte[] value) {
        this.addtlParams = value;
    }

}
