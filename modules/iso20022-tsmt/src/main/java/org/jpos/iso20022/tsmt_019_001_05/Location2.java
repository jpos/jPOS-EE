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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Location2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}CountryCode" minOccurs="0"/>
 *         <element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}CountrySubdivision1Choice" minOccurs="0"/>
 *         <element name="Txt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location2", propOrder = {
    "ctry",
    "ctrySubDvsn",
    "txt"
})
public class Location2 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsn")
    protected CountrySubdivision1Choice ctrySubDvsn;
    @XmlElement(name = "Txt")
    protected String txt;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public CountrySubdivision1Choice getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public void setCtrySubDvsn(CountrySubdivision1Choice value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

}
