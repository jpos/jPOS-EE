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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Forms1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Forms1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplForm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator"/>
 *         <element name="SgntrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}SignatureType1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forms1", propOrder = {
    "applForm",
    "sgntrTp"
})
public class Forms1 {

    @XmlElement(name = "ApplForm")
    protected boolean applForm;
    @XmlElement(name = "SgntrTp", required = true)
    @XmlSchemaType(name = "string")
    protected SignatureType1Code sgntrTp;

    /**
     * Gets the value of the applForm property.
     * 
     */
    public boolean isApplForm() {
        return applForm;
    }

    /**
     * Sets the value of the applForm property.
     * 
     */
    public void setApplForm(boolean value) {
        this.applForm = value;
    }

    /**
     * Gets the value of the sgntrTp property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType1Code }
     *     
     */
    public SignatureType1Code getSgntrTp() {
        return sgntrTp;
    }

    /**
     * Sets the value of the sgntrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType1Code }
     *     
     */
    public void setSgntrTp(SignatureType1Code value) {
        this.sgntrTp = value;
    }

}
