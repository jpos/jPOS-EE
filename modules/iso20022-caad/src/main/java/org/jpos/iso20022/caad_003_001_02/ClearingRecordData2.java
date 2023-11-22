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

package org.jpos.iso20022.caad_003_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingRecordData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingRecordData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Originator1" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Destination1" minOccurs="0"/>
 *         <element name="ClrMtd" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}ClearingMethod2Code"/>
 *         <element name="OthrClrMtd" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ClrPrty" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ClrDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}ISODate" minOccurs="0"/>
 *         <element name="ClrAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Amount17" minOccurs="0"/>
 *         <element name="IntrchngFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Amount17" minOccurs="0"/>
 *         <element name="AgtFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Amount17" minOccurs="0"/>
 *         <element name="OthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}OtherAmount4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingRecordData2", propOrder = {
    "orgtr",
    "dstn",
    "clrMtd",
    "othrClrMtd",
    "clrPrty",
    "clrDt",
    "clrAmt",
    "intrchngFee",
    "agtFee",
    "othrAmt"
})
public class ClearingRecordData2 {

    @XmlElement(name = "Orgtr")
    protected Originator1 orgtr;
    @XmlElement(name = "Dstn")
    protected Destination1 dstn;
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
    @XmlElement(name = "ClrAmt")
    protected Amount17 clrAmt;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount17 agtFee;
    @XmlElement(name = "OthrAmt")
    protected OtherAmount4 othrAmt;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link Originator1 }
     *     
     */
    public Originator1 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Originator1 }
     *     
     */
    public void setOrgtr(Originator1 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link Destination1 }
     *     
     */
    public Destination1 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination1 }
     *     
     */
    public void setDstn(Destination1 value) {
        this.dstn = value;
    }

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
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setClrAmt(Amount17 value) {
        this.clrAmt = value;
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

    /**
     * Gets the value of the othrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmount4 }
     *     
     */
    public OtherAmount4 getOthrAmt() {
        return othrAmt;
    }

    /**
     * Sets the value of the othrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmount4 }
     *     
     */
    public void setOthrAmt(OtherAmount4 value) {
        this.othrAmt = value;
    }

}
