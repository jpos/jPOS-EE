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

package org.jpos.iso20022.casp_006_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoginResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIDtTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}ISODateTime"/>
 *         <element name="POISftwr" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}PointOfInteractionComponent14" maxOccurs="unbounded"/>
 *         <element name="POICpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}PointOfInteractionCapabilities9" minOccurs="0"/>
 *         <element name="OutptDisp" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}ActionMessage10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse5", propOrder = {
    "poiDtTm",
    "poiSftwr",
    "poiCpblties",
    "outptDisp"
})
public class LoginResponse5 {

    @XmlElement(name = "POIDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "POISftwr", required = true)
    protected List<PointOfInteractionComponent14> poiSftwr;
    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities9 poiCpblties;
    @XmlElement(name = "OutptDisp")
    protected ActionMessage10 outptDisp;

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
    }

    /**
     * Gets the value of the poiSftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiSftwr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOISftwr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent14 }
     * 
     * 
     * @return
     *     The value of the poiSftwr property.
     */
    public List<PointOfInteractionComponent14> getPOISftwr() {
        if (poiSftwr == null) {
            poiSftwr = new ArrayList<>();
        }
        return this.poiSftwr;
    }

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public void setPOICpblties(PointOfInteractionCapabilities9 value) {
        this.poiCpblties = value;
    }

    /**
     * Gets the value of the outptDisp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getOutptDisp() {
        return outptDisp;
    }

    /**
     * Sets the value of the outptDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setOutptDisp(ActionMessage10 value) {
        this.outptDisp = value;
    }

}
