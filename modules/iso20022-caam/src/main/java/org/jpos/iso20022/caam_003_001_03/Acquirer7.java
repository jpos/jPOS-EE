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

package org.jpos.iso20022.caam_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Acquirer7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Acquirer7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcqrgInstn" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Brnch" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acquirer7", propOrder = {
    "acqrgInstn",
    "brnch"
})
public class Acquirer7 {

    @XmlElement(name = "AcqrgInstn")
    protected String acqrgInstn;
    @XmlElement(name = "Brnch")
    protected String brnch;

    /**
     * Gets the value of the acqrgInstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrgInstn() {
        return acqrgInstn;
    }

    /**
     * Sets the value of the acqrgInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrgInstn(String value) {
        this.acqrgInstn = value;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnch(String value) {
        this.brnch = value;
    }

}
