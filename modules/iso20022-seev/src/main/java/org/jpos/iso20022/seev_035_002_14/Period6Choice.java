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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Period6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period11"/>
 *         <element name="PrdCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}DateType8Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period6Choice", propOrder = {
    "prd",
    "prdCd"
})
public class Period6Choice {

    @XmlElement(name = "Prd")
    protected Period11 prd;
    @XmlElement(name = "PrdCd")
    @XmlSchemaType(name = "string")
    protected DateType8Code prdCd;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setPrd(Period11 value) {
        this.prd = value;
    }

    /**
     * Gets the value of the prdCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType8Code }
     *     
     */
    public DateType8Code getPrdCd() {
        return prdCd;
    }

    /**
     * Sets the value of the prdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType8Code }
     *     
     */
    public void setPrdCd(DateType8Code value) {
        this.prdCd = value;
    }

}
