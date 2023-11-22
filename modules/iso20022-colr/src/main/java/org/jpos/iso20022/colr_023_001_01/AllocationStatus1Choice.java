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

package org.jpos.iso20022.colr_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AllocationStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FullyAllctd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="PrtlyAllctd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationStatus1Choice", propOrder = {
    "fullyAllctd",
    "prtlyAllctd",
    "prtry"
})
public class AllocationStatus1Choice {

    @XmlElement(name = "FullyAllctd")
    protected ProprietaryReason4 fullyAllctd;
    @XmlElement(name = "PrtlyAllctd")
    protected ProprietaryReason4 prtlyAllctd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the fullyAllctd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFullyAllctd() {
        return fullyAllctd;
    }

    /**
     * Sets the value of the fullyAllctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setFullyAllctd(ProprietaryReason4 value) {
        this.fullyAllctd = value;
    }

    /**
     * Gets the value of the prtlyAllctd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPrtlyAllctd() {
        return prtlyAllctd;
    }

    /**
     * Sets the value of the prtlyAllctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setPrtlyAllctd(ProprietaryReason4 value) {
        this.prtlyAllctd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

}
