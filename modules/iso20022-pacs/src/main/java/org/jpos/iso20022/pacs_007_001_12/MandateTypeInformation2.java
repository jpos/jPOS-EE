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

package org.jpos.iso20022.pacs_007_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateTypeInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateTypeInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ServiceLevel8Choice" minOccurs="0"/>
 *         <element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}LocalInstrument2Choice" minOccurs="0"/>
 *         <element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}CategoryPurpose1Choice" minOccurs="0"/>
 *         <element name="Clssfctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}MandateClassification1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateTypeInformation2", propOrder = {
    "svcLvl",
    "lclInstrm",
    "ctgyPurp",
    "clssfctn"
})
public class MandateTypeInformation2 {

    @XmlElement(name = "SvcLvl")
    protected ServiceLevel8Choice svcLvl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurpose1Choice ctgyPurp;
    @XmlElement(name = "Clssfctn")
    protected MandateClassification1Choice clssfctn;

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public ServiceLevel8Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel8Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public CategoryPurpose1Choice getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public void setCtgyPurp(CategoryPurpose1Choice value) {
        this.ctgyPurp = value;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateClassification1Choice }
     *     
     */
    public MandateClassification1Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateClassification1Choice }
     *     
     */
    public void setClssfctn(MandateClassification1Choice value) {
        this.clssfctn = value;
    }

}
