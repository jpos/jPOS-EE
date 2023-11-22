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

package org.jpos.iso20022.cain_015_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Traceability9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Traceability9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RlayId" type="{urn:iso:std:iso:20022:tech:xsd:cain.015.001.02}GenericIdentification183"/>
 *         <element name="TracDtTmIn" type="{urn:iso:std:iso:20022:tech:xsd:cain.015.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="TracDtTmOut" type="{urn:iso:std:iso:20022:tech:xsd:cain.015.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability9", propOrder = {
    "rlayId",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability9 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification183 rlayId;
    @XmlElement(name = "TracDtTmIn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Gets the value of the rlayId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getRlayId() {
        return rlayId;
    }

    /**
     * Sets the value of the rlayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setRlayId(GenericIdentification183 value) {
        this.rlayId = value;
    }

    /**
     * Gets the value of the tracDtTmIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmIn() {
        return tracDtTmIn;
    }

    /**
     * Sets the value of the tracDtTmIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmIn(XMLGregorianCalendar value) {
        this.tracDtTmIn = value;
    }

    /**
     * Gets the value of the tracDtTmOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmOut() {
        return tracDtTmOut;
    }

    /**
     * Sets the value of the tracDtTmOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmOut(XMLGregorianCalendar value) {
        this.tracDtTmOut = value;
    }

}
