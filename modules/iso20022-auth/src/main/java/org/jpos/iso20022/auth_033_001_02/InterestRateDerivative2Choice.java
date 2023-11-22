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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateDerivative2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestRateDerivative2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SwpRltd" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}SwapType1Code"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingInterestRateType3Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateDerivative2Choice", propOrder = {
    "swpRltd",
    "othr"
})
public class InterestRateDerivative2Choice {

    @XmlElement(name = "SwpRltd")
    @XmlSchemaType(name = "string")
    protected SwapType1Code swpRltd;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected UnderlyingInterestRateType3Code othr;

    /**
     * Gets the value of the swpRltd property.
     * 
     * @return
     *     possible object is
     *     {@link SwapType1Code }
     *     
     */
    public SwapType1Code getSwpRltd() {
        return swpRltd;
    }

    /**
     * Sets the value of the swpRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapType1Code }
     *     
     */
    public void setSwpRltd(SwapType1Code value) {
        this.swpRltd = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInterestRateType3Code }
     *     
     */
    public UnderlyingInterestRateType3Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInterestRateType3Code }
     *     
     */
    public void setOthr(UnderlyingInterestRateType3Code value) {
        this.othr = value;
    }

}
