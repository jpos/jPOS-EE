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

package org.jpos.iso20022.reda_043_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAuditTrail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyAuditTrail1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}UpdateLogPartyRecord1Choice" maxOccurs="unbounded"/>
 *         <element name="OprTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}ISODateTime"/>
 *         <element name="InstgUsr" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}Max256Text"/>
 *         <element name="ApprvgUsr" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuditTrail1", propOrder = {
    "rcrd",
    "oprTmStmp",
    "instgUsr",
    "apprvgUsr"
})
public class PartyAuditTrail1 {

    @XmlElement(name = "Rcrd", required = true)
    protected List<UpdateLogPartyRecord1Choice> rcrd;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;
    @XmlElement(name = "InstgUsr", required = true)
    protected String instgUsr;
    @XmlElement(name = "ApprvgUsr")
    protected String apprvgUsr;

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateLogPartyRecord1Choice }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<UpdateLogPartyRecord1Choice> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<>();
        }
        return this.rcrd;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
    }

    /**
     * Gets the value of the instgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgUsr() {
        return instgUsr;
    }

    /**
     * Sets the value of the instgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgUsr(String value) {
        this.instgUsr = value;
    }

    /**
     * Gets the value of the apprvgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvgUsr() {
        return apprvgUsr;
    }

    /**
     * Sets the value of the apprvgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprvgUsr(String value) {
        this.apprvgUsr = value;
    }

}
