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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLinePIN9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OnLinePIN9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NcrptdPINBlck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}ContentInformationType32"/>
 *         <element name="PINFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}PINFormat3Code"/>
 *         <element name="AddtlInpt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnLinePIN9", propOrder = {
    "ncrptdPINBlck",
    "pinFrmt",
    "addtlInpt"
})
public class OnLinePIN9 {

    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected ContentInformationType32 ncrptdPINBlck;
    @XmlElement(name = "PINFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected PINFormat3Code pinFrmt;
    @XmlElement(name = "AddtlInpt")
    protected String addtlInpt;

    /**
     * Gets the value of the ncrptdPINBlck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType32 }
     *     
     */
    public ContentInformationType32 getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Sets the value of the ncrptdPINBlck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType32 }
     *     
     */
    public void setNcrptdPINBlck(ContentInformationType32 value) {
        this.ncrptdPINBlck = value;
    }

    /**
     * Gets the value of the pinFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link PINFormat3Code }
     *     
     */
    public PINFormat3Code getPINFrmt() {
        return pinFrmt;
    }

    /**
     * Sets the value of the pinFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINFormat3Code }
     *     
     */
    public void setPINFrmt(PINFormat3Code value) {
        this.pinFrmt = value;
    }

    /**
     * Gets the value of the addtlInpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInpt() {
        return addtlInpt;
    }

    /**
     * Sets the value of the addtlInpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInpt(String value) {
        this.addtlInpt = value;
    }

}
