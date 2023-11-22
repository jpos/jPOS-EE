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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialProgrammeQualification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SpecialProgrammeQualification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prgrmm" type="{urn:iso:std:iso:20022:tech:xsd:cain.015.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Dtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.015.001.02}SpecialProgrammeDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialProgrammeQualification1", propOrder = {
    "prgrmm",
    "dtl"
})
public class SpecialProgrammeQualification1 {

    @XmlElement(name = "Prgrmm")
    protected String prgrmm;
    @XmlElement(name = "Dtl")
    protected List<SpecialProgrammeDetails1> dtl;

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrmm(String value) {
        this.prgrmm = value;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeDetails1 }
     * 
     * 
     * @return
     *     The value of the dtl property.
     */
    public List<SpecialProgrammeDetails1> getDtl() {
        if (dtl == null) {
            dtl = new ArrayList<>();
        }
        return this.dtl;
    }

}
