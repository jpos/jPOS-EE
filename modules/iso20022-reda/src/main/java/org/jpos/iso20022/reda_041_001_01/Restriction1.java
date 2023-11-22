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

package org.jpos.iso20022.reda_041_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Restriction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Restriction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}CodeOrProprietary1Choice"/>
 *         <element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}ISODateTime"/>
 *         <element name="VldUntil" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction1", propOrder = {
    "rstrctnTp",
    "vldFr",
    "vldUntil"
})
public class Restriction1 {

    @XmlElement(name = "RstrctnTp", required = true)
    protected CodeOrProprietary1Choice rstrctnTp;
    @XmlElement(name = "VldFr", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "VldUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrProprietary1Choice }
     *     
     */
    public CodeOrProprietary1Choice getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrProprietary1Choice }
     *     
     */
    public void setRstrctnTp(CodeOrProprietary1Choice value) {
        this.rstrctnTp = value;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
    }

}
