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

package org.jpos.iso20022.fxtr_035_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat18Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateFormat18Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}DateAndDateTimeChoice"/>
 *         <element name="NotSpcfdDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}DateType8Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat18Choice", propOrder = {
    "dt",
    "notSpcfdDt"
})
public class DateFormat18Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "NotSpcfdDt")
    @XmlSchemaType(name = "string")
    protected DateType8Code notSpcfdDt;

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
     *     {@link DateType8Code }
     *     
     */
    public DateType8Code getNotSpcfdDt() {
        return notSpcfdDt;
    }

    /**
     * Sets the value of the notSpcfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType8Code }
     *     
     */
    public void setNotSpcfdDt(DateType8Code value) {
        this.notSpcfdDt = value;
    }

}
