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

package org.jpos.iso20022.tsmt_002_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActivityDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}ISODateTime"/>
 *         <element name="Actvty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}Activity1"/>
 *         <element name="Initr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04}BICIdentification1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityDetails1", propOrder = {
    "dtTm",
    "actvty",
    "initr"
})
public class ActivityDetails1 {

    @XmlElement(name = "DtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "Actvty", required = true)
    protected Activity1 actvty;
    @XmlElement(name = "Initr", required = true)
    protected BICIdentification1 initr;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the actvty property.
     * 
     * @return
     *     possible object is
     *     {@link Activity1 }
     *     
     */
    public Activity1 getActvty() {
        return actvty;
    }

    /**
     * Sets the value of the actvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity1 }
     *     
     */
    public void setActvty(Activity1 value) {
        this.actvty = value;
    }

    /**
     * Gets the value of the initr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getInitr() {
        return initr;
    }

    /**
     * Sets the value of the initr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setInitr(BICIdentification1 value) {
        this.initr = value;
    }

}
