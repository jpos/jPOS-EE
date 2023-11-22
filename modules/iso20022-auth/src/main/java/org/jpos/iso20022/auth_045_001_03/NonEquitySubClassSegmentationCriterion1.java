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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquitySubClassSegmentationCriterion1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonEquitySubClassSegmentationCriterion1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CritNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}NonEquitySubClassSegmentationCriteria1Code"/>
 *         <element name="CritVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}Max1000Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEquitySubClassSegmentationCriterion1", propOrder = {
    "critNm",
    "critVal"
})
public class NonEquitySubClassSegmentationCriterion1 {

    @XmlElement(name = "CritNm", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquitySubClassSegmentationCriteria1Code critNm;
    @XmlElement(name = "CritVal", required = true)
    protected String critVal;

    /**
     * Gets the value of the critNm property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquitySubClassSegmentationCriteria1Code }
     *     
     */
    public NonEquitySubClassSegmentationCriteria1Code getCritNm() {
        return critNm;
    }

    /**
     * Sets the value of the critNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquitySubClassSegmentationCriteria1Code }
     *     
     */
    public void setCritNm(NonEquitySubClassSegmentationCriteria1Code value) {
        this.critNm = value;
    }

    /**
     * Gets the value of the critVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCritVal() {
        return critVal;
    }

    /**
     * Sets the value of the critVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCritVal(String value) {
        this.critVal = value;
    }

}
