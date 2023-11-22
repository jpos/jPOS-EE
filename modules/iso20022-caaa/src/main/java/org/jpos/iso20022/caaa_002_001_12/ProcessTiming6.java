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

package org.jpos.iso20022.caaa_002_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessTiming6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessTiming6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}ISODateTime" minOccurs="0"/>
 *         <element name="EndTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}ISODateTime" minOccurs="0"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}Max9NumericText" minOccurs="0"/>
 *         <element name="UnitOfTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}TimeUnit1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTiming6", propOrder = {
    "startTm",
    "endTm",
    "prd",
    "unitOfTm"
})
public class ProcessTiming6 {

    @XmlElement(name = "StartTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTm;
    @XmlElement(name = "EndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTm;
    @XmlElement(name = "Prd")
    protected String prd;
    @XmlElement(name = "UnitOfTm")
    @XmlSchemaType(name = "string")
    protected TimeUnit1Code unitOfTm;

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTm(XMLGregorianCalendar value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTm(XMLGregorianCalendar value) {
        this.endTm = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrd(String value) {
        this.prd = value;
    }

    /**
     * Gets the value of the unitOfTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit1Code }
     *     
     */
    public TimeUnit1Code getUnitOfTm() {
        return unitOfTm;
    }

    /**
     * Sets the value of the unitOfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit1Code }
     *     
     */
    public void setUnitOfTm(TimeUnit1Code value) {
        this.unitOfTm = value;
    }

}
