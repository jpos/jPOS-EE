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

package org.jpos.iso20022.camt_026_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyJustification4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnableToApplyJustification4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AnyInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.09}YesNoIndicator"/>
 *         <element name="MssngOrIncrrctInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.09}MissingOrIncorrectData1"/>
 *         <element name="PssblDplctInstr" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.09}TrueFalseIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyJustification4Choice", propOrder = {
    "anyInf",
    "mssngOrIncrrctInf",
    "pssblDplctInstr"
})
public class UnableToApplyJustification4Choice {

    @XmlElement(name = "AnyInf")
    protected Boolean anyInf;
    @XmlElement(name = "MssngOrIncrrctInf")
    protected MissingOrIncorrectData1 mssngOrIncrrctInf;
    @XmlElement(name = "PssblDplctInstr")
    protected Boolean pssblDplctInstr;

    /**
     * Gets the value of the anyInf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyInf() {
        return anyInf;
    }

    /**
     * Sets the value of the anyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnyInf(Boolean value) {
        this.anyInf = value;
    }

    /**
     * Gets the value of the mssngOrIncrrctInf property.
     * 
     * @return
     *     possible object is
     *     {@link MissingOrIncorrectData1 }
     *     
     */
    public MissingOrIncorrectData1 getMssngOrIncrrctInf() {
        return mssngOrIncrrctInf;
    }

    /**
     * Sets the value of the mssngOrIncrrctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingOrIncorrectData1 }
     *     
     */
    public void setMssngOrIncrrctInf(MissingOrIncorrectData1 value) {
        this.mssngOrIncrrctInf = value;
    }

    /**
     * Gets the value of the pssblDplctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssblDplctInstr() {
        return pssblDplctInstr;
    }

    /**
     * Sets the value of the pssblDplctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPssblDplctInstr(Boolean value) {
        this.pssblDplctInstr = value;
    }

}
