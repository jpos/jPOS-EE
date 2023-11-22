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

package org.jpos.iso20022.auth_016_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordTechnicalData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecordTechnicalData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ISODateTime"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}CancelledStatusReason15Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData2", propOrder = {
    "rctDtTm",
    "cxlRsn"
})
public class RecordTechnicalData2 {

    @XmlElement(name = "RctDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rctDtTm;
    @XmlElement(name = "CxlRsn", required = true)
    @XmlSchemaType(name = "string")
    protected CancelledStatusReason15Code cxlRsn;

    /**
     * Gets the value of the rctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRctDtTm() {
        return rctDtTm;
    }

    /**
     * Sets the value of the rctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRctDtTm(XMLGregorianCalendar value) {
        this.rctDtTm = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason15Code }
     *     
     */
    public CancelledStatusReason15Code getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason15Code }
     *     
     */
    public void setCxlRsn(CancelledStatusReason15Code value) {
        this.cxlRsn = value;
    }

}
