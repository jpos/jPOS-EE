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

package org.jpos.iso20022.camt_080_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndDateTimeSearch5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateAndDateTimeSearch5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}DatePeriodSearch1Choice"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.080.001.01}DateTimeSearch2Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeSearch5Choice", propOrder = {
    "dt",
    "dtTm"
})
public class DateAndDateTimeSearch5Choice {

    @XmlElement(name = "Dt")
    protected DatePeriodSearch1Choice dt;
    @XmlElement(name = "DtTm")
    protected DateTimeSearch2Choice dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setDt(DatePeriodSearch1Choice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public DateTimeSearch2Choice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public void setDtTm(DateTimeSearch2Choice value) {
        this.dtTm = value;
    }

}
