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

package org.jpos.iso20022.camt_020_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterSearch1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CharacterSearch1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="EQ" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Max35Text"/>
 *         <element name="NEQ" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Max35Text"/>
 *         <element name="CT" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Max35Text"/>
 *         <element name="NCT" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterSearch1Choice", propOrder = {
    "eq",
    "neq",
    "ct",
    "nct"
})
public class CharacterSearch1Choice {

    @XmlElement(name = "EQ")
    protected String eq;
    @XmlElement(name = "NEQ")
    protected String neq;
    @XmlElement(name = "CT")
    protected String ct;
    @XmlElement(name = "NCT")
    protected String nct;

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQ(String value) {
        this.eq = value;
    }

    /**
     * Gets the value of the neq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEQ() {
        return neq;
    }

    /**
     * Sets the value of the neq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEQ(String value) {
        this.neq = value;
    }

    /**
     * Gets the value of the ct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCT() {
        return ct;
    }

    /**
     * Sets the value of the ct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCT(String value) {
        this.ct = value;
    }

    /**
     * Gets the value of the nct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT() {
        return nct;
    }

    /**
     * Sets the value of the nct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT(String value) {
        this.nct = value;
    }

}
