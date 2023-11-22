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

package org.jpos.iso20022.semt_001_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedMessage6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LinkedMessage6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrvsRef" type="{urn:swift:xsd:semt.001.001.04}AdditionalReference14"/>
 *         <element name="OthrRef" type="{urn:swift:xsd:semt.001.001.04}AdditionalReference14"/>
 *         <element name="RltdRef" type="{urn:swift:xsd:semt.001.001.04}AdditionalReference14"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedMessage6Choice", propOrder = {
    "prvsRef",
    "othrRef",
    "rltdRef"
})
public class LinkedMessage6Choice {

    @XmlElement(name = "PrvsRef")
    protected AdditionalReference14 prvsRef;
    @XmlElement(name = "OthrRef")
    protected AdditionalReference14 othrRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference14 rltdRef;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference14 }
     *     
     */
    public AdditionalReference14 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference14 }
     *     
     */
    public void setPrvsRef(AdditionalReference14 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the othrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference14 }
     *     
     */
    public AdditionalReference14 getOthrRef() {
        return othrRef;
    }

    /**
     * Sets the value of the othrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference14 }
     *     
     */
    public void setOthrRef(AdditionalReference14 value) {
        this.othrRef = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference14 }
     *     
     */
    public AdditionalReference14 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference14 }
     *     
     */
    public void setRltdRef(AdditionalReference14 value) {
        this.rltdRef = value;
    }

}
