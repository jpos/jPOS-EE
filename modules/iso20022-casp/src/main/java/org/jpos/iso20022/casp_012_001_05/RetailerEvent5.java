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

package org.jpos.iso20022.casp_012_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerEvent5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerEvent5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}ISODateTime"/>
 *         <element name="EvtToNtfy" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}EventToNotify2Code"/>
 *         <element name="EvtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}EventContext5" minOccurs="0"/>
 *         <element name="AddtlEvtInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerEvent5", propOrder = {
    "evtTmStmp",
    "evtToNtfy",
    "evtCntxt",
    "addtlEvtInf"
})
public class RetailerEvent5 {

    @XmlElement(name = "EvtTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtTmStmp;
    @XmlElement(name = "EvtToNtfy", required = true)
    @XmlSchemaType(name = "string")
    protected EventToNotify2Code evtToNtfy;
    @XmlElement(name = "EvtCntxt")
    protected EventContext5 evtCntxt;
    @XmlElement(name = "AddtlEvtInf")
    protected String addtlEvtInf;

    /**
     * Gets the value of the evtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtTmStmp() {
        return evtTmStmp;
    }

    /**
     * Sets the value of the evtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtTmStmp(XMLGregorianCalendar value) {
        this.evtTmStmp = value;
    }

    /**
     * Gets the value of the evtToNtfy property.
     * 
     * @return
     *     possible object is
     *     {@link EventToNotify2Code }
     *     
     */
    public EventToNotify2Code getEvtToNtfy() {
        return evtToNtfy;
    }

    /**
     * Sets the value of the evtToNtfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventToNotify2Code }
     *     
     */
    public void setEvtToNtfy(EventToNotify2Code value) {
        this.evtToNtfy = value;
    }

    /**
     * Gets the value of the evtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link EventContext5 }
     *     
     */
    public EventContext5 getEvtCntxt() {
        return evtCntxt;
    }

    /**
     * Sets the value of the evtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventContext5 }
     *     
     */
    public void setEvtCntxt(EventContext5 value) {
        this.evtCntxt = value;
    }

    /**
     * Gets the value of the addtlEvtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlEvtInf() {
        return addtlEvtInf;
    }

    /**
     * Sets the value of the addtlEvtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlEvtInf(String value) {
        this.addtlEvtInf = value;
    }

}
