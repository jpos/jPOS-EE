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

package org.jpos.iso20022.colr_016_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportParameters6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportParameters6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Max35Text"/>
 *         <element name="RptDtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}DateAndDateTime2Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}EventFrequency6Code"/>
 *         <element name="RptCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyCode"/>
 *         <element name="ClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameters6", propOrder = {
    "rptId",
    "rptDtAndTm",
    "frqcy",
    "rptCcy",
    "clctnDt"
})
public class ReportParameters6 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptDtAndTm", required = true)
    protected DateAndDateTime2Choice rptDtAndTm;
    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency6Code frqcy;
    @XmlElement(name = "RptCcy", required = true)
    protected String rptCcy;
    @XmlElement(name = "ClctnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clctnDt;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptId(String value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the rptDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRptDtAndTm() {
        return rptDtAndTm;
    }

    /**
     * Sets the value of the rptDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setRptDtAndTm(DateAndDateTime2Choice value) {
        this.rptDtAndTm = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency6Code }
     *     
     */
    public EventFrequency6Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency6Code }
     *     
     */
    public void setFrqcy(EventFrequency6Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the rptCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCcy() {
        return rptCcy;
    }

    /**
     * Sets the value of the rptCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptCcy(String value) {
        this.rptCcy = value;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
    }

}
