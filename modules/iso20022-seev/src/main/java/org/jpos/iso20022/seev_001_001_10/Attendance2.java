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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attendance2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Attendance2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdmssnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}AttendanceAdmissionConditions2" maxOccurs="7" minOccurs="0"/>
 *         <element name="ConfInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max350Text" minOccurs="0"/>
 *         <element name="ConfDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="ConfMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attendance2", propOrder = {
    "admssnConds",
    "confInf",
    "confDdln",
    "confMktDdln"
})
public class Attendance2 {

    @XmlElement(name = "AdmssnConds")
    protected List<AttendanceAdmissionConditions2> admssnConds;
    @XmlElement(name = "ConfInf")
    protected String confInf;
    @XmlElement(name = "ConfDdln")
    protected DateFormat58Choice confDdln;
    @XmlElement(name = "ConfMktDdln")
    protected DateFormat58Choice confMktDdln;

    /**
     * Gets the value of the admssnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the admssnConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmssnConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendanceAdmissionConditions2 }
     * 
     * 
     * @return
     *     The value of the admssnConds property.
     */
    public List<AttendanceAdmissionConditions2> getAdmssnConds() {
        if (admssnConds == null) {
            admssnConds = new ArrayList<>();
        }
        return this.admssnConds;
    }

    /**
     * Gets the value of the confInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfInf() {
        return confInf;
    }

    /**
     * Sets the value of the confInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfInf(String value) {
        this.confInf = value;
    }

    /**
     * Gets the value of the confDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getConfDdln() {
        return confDdln;
    }

    /**
     * Sets the value of the confDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setConfDdln(DateFormat58Choice value) {
        this.confDdln = value;
    }

    /**
     * Gets the value of the confMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getConfMktDdln() {
        return confMktDdln;
    }

    /**
     * Sets the value of the confMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setConfMktDdln(DateFormat58Choice value) {
        this.confMktDdln = value;
    }

}
