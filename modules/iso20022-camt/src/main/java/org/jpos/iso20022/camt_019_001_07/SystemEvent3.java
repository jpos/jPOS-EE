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

package org.jpos.iso20022.camt_019_001_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEvent3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemEvent3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemEventType4Choice"/>
 *         <element name="SchdldTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ISODateTime"/>
 *         <element name="FctvTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="StartTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="EndTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEvent3", propOrder = {
    "tp",
    "schdldTm",
    "fctvTm",
    "startTm",
    "endTm"
})
public class SystemEvent3 {

    @XmlElement(name = "Tp", required = true)
    protected SystemEventType4Choice tp;
    @XmlElement(name = "SchdldTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar schdldTm;
    @XmlElement(name = "FctvTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fctvTm;
    @XmlElement(name = "StartTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTm;
    @XmlElement(name = "EndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType4Choice }
     *     
     */
    public SystemEventType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType4Choice }
     *     
     */
    public void setTp(SystemEventType4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the schdldTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchdldTm() {
        return schdldTm;
    }

    /**
     * Sets the value of the schdldTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchdldTm(XMLGregorianCalendar value) {
        this.schdldTm = value;
    }

    /**
     * Gets the value of the fctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvTm() {
        return fctvTm;
    }

    /**
     * Sets the value of the fctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFctvTm(XMLGregorianCalendar value) {
        this.fctvTm = value;
    }

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

}
