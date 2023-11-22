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

package org.jpos.iso20022.caad_004_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingBatchData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingBatchData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrMtd" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ClearingMethod2Code"/>
 *         <element name="OthrClrMtd" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ClrPrty" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ClrDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ISODate" minOccurs="0"/>
 *         <element name="ClrTtls" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}ClearingTotals2" minOccurs="0"/>
 *         <element name="IntrchngFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17" minOccurs="0"/>
 *         <element name="AgtFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingBatchData2", propOrder = {
    "clrMtd",
    "othrClrMtd",
    "clrPrty",
    "clrDt",
    "clrTtls",
    "intrchngFee",
    "agtFee"
})
public class ClearingBatchData2 {

    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod2Code clrMtd;
    @XmlElement(name = "OthrClrMtd")
    protected String othrClrMtd;
    @XmlElement(name = "ClrPrty")
    protected String clrPrty;
    @XmlElement(name = "ClrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clrDt;
    @XmlElement(name = "ClrTtls")
    protected ClearingTotals2 clrTtls;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount17 agtFee;

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public ClearingMethod2Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod2Code }
     *     
     */
    public void setClrMtd(ClearingMethod2Code value) {
        this.clrMtd = value;
    }

    /**
     * Gets the value of the othrClrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrMtd() {
        return othrClrMtd;
    }

    /**
     * Sets the value of the othrClrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrClrMtd(String value) {
        this.othrClrMtd = value;
    }

    /**
     * Gets the value of the clrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrPrty() {
        return clrPrty;
    }

    /**
     * Sets the value of the clrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrPrty(String value) {
        this.clrPrty = value;
    }

    /**
     * Gets the value of the clrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClrDt() {
        return clrDt;
    }

    /**
     * Sets the value of the clrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClrDt(XMLGregorianCalendar value) {
        this.clrDt = value;
    }

    /**
     * Gets the value of the clrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingTotals2 }
     *     
     */
    public ClearingTotals2 getClrTtls() {
        return clrTtls;
    }

    /**
     * Sets the value of the clrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingTotals2 }
     *     
     */
    public void setClrTtls(ClearingTotals2 value) {
        this.clrTtls = value;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setIntrchngFee(Amount17 value) {
        this.intrchngFee = value;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setAgtFee(Amount17 value) {
        this.agtFee = value;
    }

}
