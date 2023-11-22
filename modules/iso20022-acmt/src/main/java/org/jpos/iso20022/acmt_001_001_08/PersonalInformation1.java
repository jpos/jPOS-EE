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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonalInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmOfFthr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="MdnNmOfMthr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="NmOfPrtnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInformation1", propOrder = {
    "nmOfFthr",
    "mdnNmOfMthr",
    "nmOfPrtnr"
})
public class PersonalInformation1 {

    @XmlElement(name = "NmOfFthr")
    protected String nmOfFthr;
    @XmlElement(name = "MdnNmOfMthr")
    protected String mdnNmOfMthr;
    @XmlElement(name = "NmOfPrtnr")
    protected String nmOfPrtnr;

    /**
     * Gets the value of the nmOfFthr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOfFthr() {
        return nmOfFthr;
    }

    /**
     * Sets the value of the nmOfFthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmOfFthr(String value) {
        this.nmOfFthr = value;
    }

    /**
     * Gets the value of the mdnNmOfMthr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnNmOfMthr() {
        return mdnNmOfMthr;
    }

    /**
     * Sets the value of the mdnNmOfMthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnNmOfMthr(String value) {
        this.mdnNmOfMthr = value;
    }

    /**
     * Gets the value of the nmOfPrtnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOfPrtnr() {
        return nmOfPrtnr;
    }

    /**
     * Sets the value of the nmOfPrtnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmOfPrtnr(String value) {
        this.nmOfPrtnr = value;
    }

}
