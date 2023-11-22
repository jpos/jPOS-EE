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

package org.jpos.iso20022.auth_107_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Schedule11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Schedule11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UadjstdFctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate"/>
 *         <element name="UadjstdEndDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AmountAndDirection106"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule11", propOrder = {
    "uadjstdFctvDt",
    "uadjstdEndDt",
    "amt"
})
public class Schedule11 {

    @XmlElement(name = "UadjstdFctvDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uadjstdFctvDt;
    @XmlElement(name = "UadjstdEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uadjstdEndDt;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection106 amt;

    /**
     * Gets the value of the uadjstdFctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUadjstdFctvDt() {
        return uadjstdFctvDt;
    }

    /**
     * Sets the value of the uadjstdFctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUadjstdFctvDt(XMLGregorianCalendar value) {
        this.uadjstdFctvDt = value;
    }

    /**
     * Gets the value of the uadjstdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUadjstdEndDt() {
        return uadjstdEndDt;
    }

    /**
     * Sets the value of the uadjstdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUadjstdEndDt(XMLGregorianCalendar value) {
        this.uadjstdEndDt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public void setAmt(AmountAndDirection106 value) {
        this.amt = value;
    }

}
