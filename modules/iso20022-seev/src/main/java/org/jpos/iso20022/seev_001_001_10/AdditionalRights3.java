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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalRights3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalRights3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlRght" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}AdditionalRightCode1Choice"/>
 *         <element name="AddtlRghtInfURLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max2048Text" minOccurs="0"/>
 *         <element name="AddtlRghtDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="AddtlRghtMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateFormat58Choice" minOccurs="0"/>
 *         <element name="AddtlRghtThrshld" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}AdditionalRightThreshold1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRights3", propOrder = {
    "addtlRght",
    "addtlRghtInfURLAdr",
    "addtlRghtDdln",
    "addtlRghtMktDdln",
    "addtlRghtThrshld"
})
public class AdditionalRights3 {

    @XmlElement(name = "AddtlRght", required = true)
    protected AdditionalRightCode1Choice addtlRght;
    @XmlElement(name = "AddtlRghtInfURLAdr")
    protected String addtlRghtInfURLAdr;
    @XmlElement(name = "AddtlRghtDdln")
    protected DateFormat58Choice addtlRghtDdln;
    @XmlElement(name = "AddtlRghtMktDdln")
    protected DateFormat58Choice addtlRghtMktDdln;
    @XmlElement(name = "AddtlRghtThrshld")
    protected AdditionalRightThreshold1Choice addtlRghtThrshld;

    /**
     * Gets the value of the addtlRght property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRightCode1Choice }
     *     
     */
    public AdditionalRightCode1Choice getAddtlRght() {
        return addtlRght;
    }

    /**
     * Sets the value of the addtlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRightCode1Choice }
     *     
     */
    public void setAddtlRght(AdditionalRightCode1Choice value) {
        this.addtlRght = value;
    }

    /**
     * Gets the value of the addtlRghtInfURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRghtInfURLAdr() {
        return addtlRghtInfURLAdr;
    }

    /**
     * Sets the value of the addtlRghtInfURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRghtInfURLAdr(String value) {
        this.addtlRghtInfURLAdr = value;
    }

    /**
     * Gets the value of the addtlRghtDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getAddtlRghtDdln() {
        return addtlRghtDdln;
    }

    /**
     * Sets the value of the addtlRghtDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setAddtlRghtDdln(DateFormat58Choice value) {
        this.addtlRghtDdln = value;
    }

    /**
     * Gets the value of the addtlRghtMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getAddtlRghtMktDdln() {
        return addtlRghtMktDdln;
    }

    /**
     * Sets the value of the addtlRghtMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public void setAddtlRghtMktDdln(DateFormat58Choice value) {
        this.addtlRghtMktDdln = value;
    }

    /**
     * Gets the value of the addtlRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRightThreshold1Choice }
     *     
     */
    public AdditionalRightThreshold1Choice getAddtlRghtThrshld() {
        return addtlRghtThrshld;
    }

    /**
     * Sets the value of the addtlRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRightThreshold1Choice }
     *     
     */
    public void setAddtlRghtThrshld(AdditionalRightThreshold1Choice value) {
        this.addtlRghtThrshld = value;
    }

}
