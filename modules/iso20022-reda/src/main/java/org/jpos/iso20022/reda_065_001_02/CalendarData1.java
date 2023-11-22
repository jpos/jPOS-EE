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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CalendarData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.065.001.02}ISODate"/>
 *         <element name="SysSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.065.001.02}SystemStatus3Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarData1", propOrder = {
    "sysDt",
    "sysSts"
})
public class CalendarData1 {

    @XmlElement(name = "SysDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "SysSts", required = true)
    protected SystemStatus3Choice sysSts;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
    }

    /**
     * Gets the value of the sysSts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatus3Choice }
     *     
     */
    public SystemStatus3Choice getSysSts() {
        return sysSts;
    }

    /**
     * Sets the value of the sysSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatus3Choice }
     *     
     */
    public void setSysSts(SystemStatus3Choice value) {
        this.sysSts = value;
    }

}
