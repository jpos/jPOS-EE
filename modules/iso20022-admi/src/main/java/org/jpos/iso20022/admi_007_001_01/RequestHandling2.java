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

package org.jpos.iso20022.admi_007_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHandling2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestHandling2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsCd" type="{urn:iso:std:iso:20022:tech:xsd:admi.007.001.01}Max4AlphaNumericText"/>
 *         <element name="StsDtTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.007.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:admi.007.001.01}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHandling2", propOrder = {
    "stsCd",
    "stsDtTm",
    "desc"
})
public class RequestHandling2 {

    @XmlElement(name = "StsCd", required = true)
    protected String stsCd;
    @XmlElement(name = "StsDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDtTm;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the stsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * Sets the value of the stsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsCd(String value) {
        this.stsCd = value;
    }

    /**
     * Gets the value of the stsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDtTm() {
        return stsDtTm;
    }

    /**
     * Sets the value of the stsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDtTm(XMLGregorianCalendar value) {
        this.stsDtTm = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
