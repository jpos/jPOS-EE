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

package org.jpos.iso20022.setr_016_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedExecutionDetails4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpectedExecutionDetails4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpctdTradDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="XpctdCshSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedExecutionDetails4", propOrder = {
    "xpctdTradDtTm",
    "xpctdCshSttlmDt"
})
public class ExpectedExecutionDetails4 {

    @XmlElement(name = "XpctdTradDtTm")
    protected DateAndDateTimeChoice xpctdTradDtTm;
    @XmlElement(name = "XpctdCshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdCshSttlmDt;

    /**
     * Gets the value of the xpctdTradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpctdTradDtTm() {
        return xpctdTradDtTm;
    }

    /**
     * Sets the value of the xpctdTradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setXpctdTradDtTm(DateAndDateTimeChoice value) {
        this.xpctdTradDtTm = value;
    }

    /**
     * Gets the value of the xpctdCshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdCshSttlmDt() {
        return xpctdCshSttlmDt;
    }

    /**
     * Sets the value of the xpctdCshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdCshSttlmDt(XMLGregorianCalendar value) {
        this.xpctdCshSttlmDt = value;
    }

}
