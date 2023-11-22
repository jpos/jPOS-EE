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

package org.jpos.iso20022.reda_056_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EffectiveDate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EffectiveDate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}ISODate"/>
 *         <element name="FctvDtParam" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}ExternalEffectiveDateParameter1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveDate1", propOrder = {
    "fctvDt",
    "fctvDtParam"
})
public class EffectiveDate1 {

    @XmlElement(name = "FctvDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "FctvDtParam")
    protected String fctvDtParam;

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the fctvDtParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDtParam() {
        return fctvDtParam;
    }

    /**
     * Sets the value of the fctvDtParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvDtParam(String value) {
        this.fctvDtParam = value;
    }

}
