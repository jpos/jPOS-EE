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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeMinimus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeMinimus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DeMnmsAplbl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DeMinimusApplicable1"/>
 *         <element name="DeMnmsNotAplbl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DeMinimusNotApplicable1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeMinimus1Choice", propOrder = {
    "deMnmsAplbl",
    "deMnmsNotAplbl"
})
public class DeMinimus1Choice {

    @XmlElement(name = "DeMnmsAplbl")
    protected DeMinimusApplicable1 deMnmsAplbl;
    @XmlElement(name = "DeMnmsNotAplbl")
    protected DeMinimusNotApplicable1 deMnmsNotAplbl;

    /**
     * Gets the value of the deMnmsAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public DeMinimusApplicable1 getDeMnmsAplbl() {
        return deMnmsAplbl;
    }

    /**
     * Sets the value of the deMnmsAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public void setDeMnmsAplbl(DeMinimusApplicable1 value) {
        this.deMnmsAplbl = value;
    }

    /**
     * Gets the value of the deMnmsNotAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public DeMinimusNotApplicable1 getDeMnmsNotAplbl() {
        return deMnmsNotAplbl;
    }

    /**
     * Sets the value of the deMnmsNotAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public void setDeMnmsNotAplbl(DeMinimusNotApplicable1 value) {
        this.deMnmsNotAplbl = value;
    }

}
