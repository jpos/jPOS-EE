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

package org.jpos.iso20022.semt_041_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatePeriod1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DatePeriod1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}ISODate"/>
 *         <element name="DtMnth" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}ISOYearMonth"/>
 *         <element name="FrDtToDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Period2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriod1Choice", propOrder = {
    "dt",
    "dtMnth",
    "frDtToDt"
})
public class DatePeriod1Choice {

    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "DtMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar dtMnth;
    @XmlElement(name = "FrDtToDt")
    protected Period2 frDtToDt;

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
     * Gets the value of the dtMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMnth() {
        return dtMnth;
    }

    /**
     * Sets the value of the dtMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtMnth(XMLGregorianCalendar value) {
        this.dtMnth = value;
    }

    /**
     * Gets the value of the frDtToDt property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getFrDtToDt() {
        return frDtToDt;
    }

    /**
     * Sets the value of the frDtToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public void setFrDtToDt(Period2 value) {
        this.frDtToDt = value;
    }

}
