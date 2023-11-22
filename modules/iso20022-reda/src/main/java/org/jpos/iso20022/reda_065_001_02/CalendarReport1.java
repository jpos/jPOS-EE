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

package org.jpos.iso20022.reda_065_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarReport1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CalendarReport1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Svc" type="{urn:iso:std:iso:20022:tech:xsd:reda.065.001.02}SystemAndCurrency1" minOccurs="0"/>
 *         <element name="CalOrErr" type="{urn:iso:std:iso:20022:tech:xsd:reda.065.001.02}CalendarOrBusinessError1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarReport1", propOrder = {
    "svc",
    "calOrErr"
})
public class CalendarReport1 {

    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;
    @XmlElement(name = "CalOrErr", required = true)
    protected CalendarOrBusinessError1Choice calOrErr;

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public void setSvc(SystemAndCurrency1 value) {
        this.svc = value;
    }

    /**
     * Gets the value of the calOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarOrBusinessError1Choice }
     *     
     */
    public CalendarOrBusinessError1Choice getCalOrErr() {
        return calOrErr;
    }

    /**
     * Sets the value of the calOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarOrBusinessError1Choice }
     *     
     */
    public void setCalOrErr(CalendarOrBusinessError1Choice value) {
        this.calOrErr = value;
    }

}
