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

package org.jpos.iso20022.tsrv_002_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixedOrRecurrentDate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FixedOrRecurrentDate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FxdDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}ISODate"/>
 *         <element name="RcrntDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}DateInformation1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedOrRecurrentDate1Choice", propOrder = {
    "fxdDt",
    "rcrntDt"
})
public class FixedOrRecurrentDate1Choice {

    @XmlElement(name = "FxdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fxdDt;
    @XmlElement(name = "RcrntDt")
    protected DateInformation1 rcrntDt;

    /**
     * Gets the value of the fxdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFxdDt() {
        return fxdDt;
    }

    /**
     * Sets the value of the fxdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFxdDt(XMLGregorianCalendar value) {
        this.fxdDt = value;
    }

    /**
     * Gets the value of the rcrntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation1 }
     *     
     */
    public DateInformation1 getRcrntDt() {
        return rcrntDt;
    }

    /**
     * Sets the value of the rcrntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation1 }
     *     
     */
    public void setRcrntDt(DateInformation1 value) {
        this.rcrntDt = value;
    }

}
