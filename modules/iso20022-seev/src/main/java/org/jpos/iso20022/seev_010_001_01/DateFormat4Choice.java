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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateFormat4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateAndDateTimeChoice"/>
 *         <element name="NotSpcfdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateType6Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}GenericIdentification13"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat4Choice", propOrder = {
    "dt",
    "notSpcfdDt",
    "prtry"
})
public class DateFormat4Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "NotSpcfdDt")
    @XmlSchemaType(name = "string")
    protected DateType6Code notSpcfdDt;
    @XmlElement(name = "Prtry")
    protected GenericIdentification13 prtry;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setDt(DateAndDateTimeChoice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the notSpcfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateType6Code }
     *     
     */
    public DateType6Code getNotSpcfdDt() {
        return notSpcfdDt;
    }

    /**
     * Sets the value of the notSpcfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType6Code }
     *     
     */
    public void setNotSpcfdDt(DateType6Code value) {
        this.notSpcfdDt = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public void setPrtry(GenericIdentification13 value) {
        this.prtry = value;
    }

}
