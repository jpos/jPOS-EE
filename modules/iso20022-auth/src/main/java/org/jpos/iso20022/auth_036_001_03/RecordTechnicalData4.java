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

package org.jpos.iso20022.auth_036_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordTechnicalData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecordTechnicalData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncnsstncyInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="LastUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="SubmissnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="RlvntCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}CountryCode" minOccurs="0"/>
 *         <element name="PblctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}Period4Choice" minOccurs="0"/>
 *         <element name="NvrPblshd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RlvntTradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}MICIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData4", propOrder = {
    "incnsstncyInd",
    "lastUpd",
    "submissnDtTm",
    "rlvntCmptntAuthrty",
    "pblctnPrd",
    "nvrPblshd",
    "rlvntTradgVn"
})
public class RecordTechnicalData4 {

    @XmlElement(name = "IncnsstncyInd")
    protected Boolean incnsstncyInd;
    @XmlElement(name = "LastUpd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpd;
    @XmlElement(name = "SubmissnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissnDtTm;
    @XmlElement(name = "RlvntCmptntAuthrty")
    protected String rlvntCmptntAuthrty;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;
    @XmlElement(name = "NvrPblshd")
    protected Boolean nvrPblshd;
    @XmlElement(name = "RlvntTradgVn")
    protected String rlvntTradgVn;

    /**
     * Gets the value of the incnsstncyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncnsstncyInd() {
        return incnsstncyInd;
    }

    /**
     * Sets the value of the incnsstncyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncnsstncyInd(Boolean value) {
        this.incnsstncyInd = value;
    }

    /**
     * Gets the value of the lastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpd() {
        return lastUpd;
    }

    /**
     * Sets the value of the lastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpd(XMLGregorianCalendar value) {
        this.lastUpd = value;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissnDtTm(XMLGregorianCalendar value) {
        this.submissnDtTm = value;
    }

    /**
     * Gets the value of the rlvntCmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRlvntCmptntAuthrty() {
        return rlvntCmptntAuthrty;
    }

    /**
     * Sets the value of the rlvntCmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRlvntCmptntAuthrty(String value) {
        this.rlvntCmptntAuthrty = value;
    }

    /**
     * Gets the value of the pblctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getPblctnPrd() {
        return pblctnPrd;
    }

    /**
     * Sets the value of the pblctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setPblctnPrd(Period4Choice value) {
        this.pblctnPrd = value;
    }

    /**
     * Gets the value of the nvrPblshd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvrPblshd() {
        return nvrPblshd;
    }

    /**
     * Sets the value of the nvrPblshd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvrPblshd(Boolean value) {
        this.nvrPblshd = value;
    }

    /**
     * Gets the value of the rlvntTradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRlvntTradgVn() {
        return rlvntTradgVn;
    }

    /**
     * Sets the value of the rlvntTradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRlvntTradgVn(String value) {
        this.rlvntTradgVn = value;
    }

}
