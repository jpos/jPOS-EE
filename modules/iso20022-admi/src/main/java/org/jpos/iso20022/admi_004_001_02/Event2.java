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

package org.jpos.iso20022.admi_004_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Event2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Event2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtCd" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max4AlphaNumericText"/>
 *         <element name="EvtParam" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EvtDesc" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max1000Text" minOccurs="0"/>
 *         <element name="EvtTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event2", propOrder = {
    "evtCd",
    "evtParam",
    "evtDesc",
    "evtTm"
})
public class Event2 {

    @XmlElement(name = "EvtCd", required = true)
    protected String evtCd;
    @XmlElement(name = "EvtParam")
    protected List<String> evtParam;
    @XmlElement(name = "EvtDesc")
    protected String evtDesc;
    @XmlElement(name = "EvtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtTm;

    /**
     * Gets the value of the evtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCd() {
        return evtCd;
    }

    /**
     * Sets the value of the evtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCd(String value) {
        this.evtCd = value;
    }

    /**
     * Gets the value of the evtParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the evtParam property.
     */
    public List<String> getEvtParam() {
        if (evtParam == null) {
            evtParam = new ArrayList<>();
        }
        return this.evtParam;
    }

    /**
     * Gets the value of the evtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtDesc() {
        return evtDesc;
    }

    /**
     * Sets the value of the evtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtDesc(String value) {
        this.evtDesc = value;
    }

    /**
     * Gets the value of the evtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtTm() {
        return evtTm;
    }

    /**
     * Sets the value of the evtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtTm(XMLGregorianCalendar value) {
        this.evtTm = value;
    }

}
