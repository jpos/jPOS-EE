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

package org.jpos.iso20022.semt_016_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Period7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FrDtTmToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.001.09}DateTimePeriod1"/>
 *         <element name="FrDtToDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.016.001.09}Period2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period7Choice", propOrder = {
    "frDtTmToDtTm",
    "frDtToDt"
})
public class Period7Choice {

    @XmlElement(name = "FrDtTmToDtTm")
    protected DateTimePeriod1 frDtTmToDtTm;
    @XmlElement(name = "FrDtToDt")
    protected Period2 frDtToDt;

    /**
     * Gets the value of the frDtTmToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrDtTmToDtTm() {
        return frDtTmToDtTm;
    }

    /**
     * Sets the value of the frDtTmToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrDtTmToDtTm(DateTimePeriod1 value) {
        this.frDtTmToDtTm = value;
    }

    /**
     * Gets the value of the frDtToDt property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getFrDtToDt() {
        return frDtToDt;
    }

    /**
     * Sets the value of the frDtToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public void setFrDtToDt(Period2 value) {
        this.frDtToDt = value;
    }

}
