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

package org.jpos.iso20022.sese_005_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmountType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmountType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:sese.005.001.09}OtherAmountType1Code"/>
 *         <element name="PrtryCd" type="{urn:iso:std:iso:20022:tech:xsd:sese.005.001.09}GenericIdentification1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmountType1Choice", propOrder = {
    "cd",
    "prtryCd"
})
public class OtherAmountType1Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected OtherAmountType1Code cd;
    @XmlElement(name = "PrtryCd")
    protected GenericIdentification1 prtryCd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmountType1Code }
     *     
     */
    public OtherAmountType1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmountType1Code }
     *     
     */
    public void setCd(OtherAmountType1Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the prtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtryCd() {
        return prtryCd;
    }

    /**
     * Sets the value of the prtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrtryCd(GenericIdentification1 value) {
        this.prtryCd = value;
    }

}
