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

package org.jpos.iso20022.cain_014_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClaimInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClmCrdntls" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max500Text" minOccurs="0"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInformation1", propOrder = {
    "clmCrdntls",
    "assgnr"
})
public class ClaimInformation1 {

    @XmlElement(name = "ClmCrdntls")
    protected String clmCrdntls;
    @XmlElement(name = "Assgnr")
    protected String assgnr;

    /**
     * Gets the value of the clmCrdntls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmCrdntls() {
        return clmCrdntls;
    }

    /**
     * Sets the value of the clmCrdntls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClmCrdntls(String value) {
        this.clmCrdntls = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssgnr(String value) {
        this.assgnr = value;
    }

}
