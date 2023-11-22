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

package org.jpos.iso20022.caad_009_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryInformation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeliveryInformation4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryNoteNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Address2" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Contact6" minOccurs="0"/>
 *         <element name="Instrs" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max350Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISODate" minOccurs="0"/>
 *         <element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISOTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInformation4", propOrder = {
    "dlvryNoteNb",
    "adr",
    "ctct",
    "instrs",
    "dt",
    "tm"
})
public class DeliveryInformation4 {

    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Ctct")
    protected Contact6 ctct;
    @XmlElement(name = "Instrs")
    protected String instrs;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;

    /**
     * Gets the value of the dlvryNoteNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryNoteNb() {
        return dlvryNoteNb;
    }

    /**
     * Sets the value of the dlvryNoteNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public void setCtct(Contact6 value) {
        this.ctct = value;
    }

    /**
     * Gets the value of the instrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrs() {
        return instrs;
    }

    /**
     * Sets the value of the instrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrs(String value) {
        this.instrs = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

}
