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

package org.jpos.iso20022.camt_005_001_10;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatePeriodSearch1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DatePeriodSearch1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FrDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate"/>
 *         <element name="ToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate"/>
 *         <element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DatePeriod2"/>
 *         <element name="EQDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate"/>
 *         <element name="NEQDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriodSearch1Choice", propOrder = {
    "frDt",
    "toDt",
    "frToDt",
    "eqDt",
    "neqDt"
})
public class DatePeriodSearch1Choice {

    @XmlElement(name = "FrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frDt;
    @XmlElement(name = "ToDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDt;
    @XmlElement(name = "FrToDt")
    protected DatePeriod2 frToDt;
    @XmlElement(name = "EQDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eqDt;
    @XmlElement(name = "NEQDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar neqDt;

    /**
     * Gets the value of the frDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrDt() {
        return frDt;
    }

    /**
     * Sets the value of the frDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrDt(XMLGregorianCalendar value) {
        this.frDt = value;
    }

    /**
     * Gets the value of the toDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDt() {
        return toDt;
    }

    /**
     * Sets the value of the toDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDt(XMLGregorianCalendar value) {
        this.toDt = value;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setFrToDt(DatePeriod2 value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the eqDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEQDt() {
        return eqDt;
    }

    /**
     * Sets the value of the eqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEQDt(XMLGregorianCalendar value) {
        this.eqDt = value;
    }

    /**
     * Gets the value of the neqDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEQDt() {
        return neqDt;
    }

    /**
     * Sets the value of the neqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEQDt(XMLGregorianCalendar value) {
        this.neqDt = value;
    }

}
