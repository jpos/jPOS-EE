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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndDateTimeSearch3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateAndDateTimeSearch3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DtTmSch" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DateTimePeriod1Choice"/>
 *         <element name="DtSch" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DatePeriodSearch1Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeSearch3Choice", propOrder = {
    "dtTmSch",
    "dtSch"
})
public class DateAndDateTimeSearch3Choice {

    @XmlElement(name = "DtTmSch")
    protected DateTimePeriod1Choice dtTmSch;
    @XmlElement(name = "DtSch")
    protected DatePeriodSearch1Choice dtSch;

    /**
     * Gets the value of the dtTmSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getDtTmSch() {
        return dtTmSch;
    }

    /**
     * Sets the value of the dtTmSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setDtTmSch(DateTimePeriod1Choice value) {
        this.dtTmSch = value;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setDtSch(DatePeriodSearch1Choice value) {
        this.dtSch = value;
    }

}
