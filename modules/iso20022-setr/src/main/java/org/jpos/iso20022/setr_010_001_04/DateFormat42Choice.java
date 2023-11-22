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

package org.jpos.iso20022.setr_010_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat42Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateFormat42Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="YrMnth" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ISOYearMonth"/>
 *         <element name="YrMnthDay" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ISODate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat42Choice", propOrder = {
    "yrMnth",
    "yrMnthDay"
})
public class DateFormat42Choice {

    @XmlElement(name = "YrMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yrMnth;
    @XmlElement(name = "YrMnthDay")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yrMnthDay;

    /**
     * Gets the value of the yrMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrMnth() {
        return yrMnth;
    }

    /**
     * Sets the value of the yrMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYrMnth(XMLGregorianCalendar value) {
        this.yrMnth = value;
    }

    /**
     * Gets the value of the yrMnthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrMnthDay() {
        return yrMnthDay;
    }

    /**
     * Sets the value of the yrMnthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYrMnthDay(XMLGregorianCalendar value) {
        this.yrMnthDay = value;
    }

}
