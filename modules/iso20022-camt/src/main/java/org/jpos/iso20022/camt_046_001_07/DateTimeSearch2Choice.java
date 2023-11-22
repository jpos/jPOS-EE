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

package org.jpos.iso20022.camt_046_001_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeSearch2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateTimeSearch2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ISODateTime"/>
 *         <element name="ToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ISODateTime"/>
 *         <element name="FrToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}DateTimePeriod1"/>
 *         <element name="EQDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ISODateTime"/>
 *         <element name="NEQDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ISODateTime"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSearch2Choice", propOrder = {
    "frDtTm",
    "toDtTm",
    "frToDtTm",
    "eqDtTm",
    "neqDtTm"
})
public class DateTimeSearch2Choice {

    @XmlElement(name = "FrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frDtTm;
    @XmlElement(name = "ToDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDtTm;
    @XmlElement(name = "FrToDtTm")
    protected DateTimePeriod1 frToDtTm;
    @XmlElement(name = "EQDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eqDtTm;
    @XmlElement(name = "NEQDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar neqDtTm;

    /**
     * Gets the value of the frDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrDtTm() {
        return frDtTm;
    }

    /**
     * Sets the value of the frDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrDtTm(XMLGregorianCalendar value) {
        this.frDtTm = value;
    }

    /**
     * Gets the value of the toDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDtTm() {
        return toDtTm;
    }

    /**
     * Sets the value of the toDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDtTm(XMLGregorianCalendar value) {
        this.toDtTm = value;
    }

    /**
     * Gets the value of the frToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDtTm() {
        return frToDtTm;
    }

    /**
     * Sets the value of the frToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDtTm(DateTimePeriod1 value) {
        this.frToDtTm = value;
    }

    /**
     * Gets the value of the eqDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEQDtTm() {
        return eqDtTm;
    }

    /**
     * Sets the value of the eqDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEQDtTm(XMLGregorianCalendar value) {
        this.eqDtTm = value;
    }

    /**
     * Gets the value of the neqDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEQDtTm() {
        return neqDtTm;
    }

    /**
     * Sets the value of the neqDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEQDtTm(XMLGregorianCalendar value) {
        this.neqDtTm = value;
    }

}
