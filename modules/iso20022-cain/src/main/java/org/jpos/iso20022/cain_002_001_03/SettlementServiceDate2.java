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

package org.jpos.iso20022.cain_002_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementServiceDate2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementServiceDate2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}ISODate" minOccurs="0"/>
 *         <element name="DfrrdSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}ISODate" minOccurs="0"/>
 *         <element name="SttlmTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}ISOTime" minOccurs="0"/>
 *         <element name="SttlmPrd" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SttlmCutOffTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementServiceDate2", propOrder = {
    "reqdSttlmDt",
    "dfrrdSttlmInd",
    "sttlmDt",
    "sttlmTm",
    "sttlmPrd",
    "sttlmCutOffTm"
})
public class SettlementServiceDate2 {

    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "DfrrdSttlmInd")
    protected Boolean dfrrdSttlmInd;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SttlmTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sttlmTm;
    @XmlElement(name = "SttlmPrd")
    protected String sttlmPrd;
    @XmlElement(name = "SttlmCutOffTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sttlmCutOffTm;

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
    }

    /**
     * Gets the value of the dfrrdSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdSttlmInd() {
        return dfrrdSttlmInd;
    }

    /**
     * Sets the value of the dfrrdSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfrrdSttlmInd(Boolean value) {
        this.dfrrdSttlmInd = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the sttlmTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmTm() {
        return sttlmTm;
    }

    /**
     * Sets the value of the sttlmTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmTm(XMLGregorianCalendar value) {
        this.sttlmTm = value;
    }

    /**
     * Gets the value of the sttlmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmPrd() {
        return sttlmPrd;
    }

    /**
     * Sets the value of the sttlmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmPrd(String value) {
        this.sttlmPrd = value;
    }

    /**
     * Gets the value of the sttlmCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmCutOffTm() {
        return sttlmCutOffTm;
    }

    /**
     * Sets the value of the sttlmCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmCutOffTm(XMLGregorianCalendar value) {
        this.sttlmCutOffTm = value;
    }

}
