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

package org.jpos.iso20022.cain_014_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExchangeRateInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ISODate" minOccurs="0"/>
 *         <element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ISOTime" minOccurs="0"/>
 *         <element name="XchgRateDtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ExchangeRateDetail1" minOccurs="0"/>
 *         <element name="RateLck" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}RateLock1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation2", propOrder = {
    "prvdr",
    "id",
    "dt",
    "tm",
    "xchgRateDtl",
    "rateLck"
})
public class ExchangeRateInformation2 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;
    @XmlElement(name = "XchgRateDtl")
    protected ExchangeRateDetail1 xchgRateDtl;
    @XmlElement(name = "RateLck")
    protected RateLock1 rateLck;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdr(String value) {
        this.prvdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

    /**
     * Gets the value of the xchgRateDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetail1 }
     *     
     */
    public ExchangeRateDetail1 getXchgRateDtl() {
        return xchgRateDtl;
    }

    /**
     * Sets the value of the xchgRateDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetail1 }
     *     
     */
    public void setXchgRateDtl(ExchangeRateDetail1 value) {
        this.xchgRateDtl = value;
    }

    /**
     * Gets the value of the rateLck property.
     * 
     * @return
     *     possible object is
     *     {@link RateLock1 }
     *     
     */
    public RateLock1 getRateLck() {
        return rateLck;
    }

    /**
     * Sets the value of the rateLck property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLock1 }
     *     
     */
    public void setRateLck(RateLock1 value) {
        this.rateLck = value;
    }

}
