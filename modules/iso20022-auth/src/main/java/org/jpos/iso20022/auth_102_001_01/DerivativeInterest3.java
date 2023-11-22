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

package org.jpos.iso20022.auth_102_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeInterest3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeInterest3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}FloatingInterestRate8"/>
 *         <element name="FrstLegIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}InterestRate8Choice" minOccurs="0"/>
 *         <element name="OthrNtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="OthrLegIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}InterestRate8Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInterest3", propOrder = {
    "intrstRate",
    "frstLegIntrstRate",
    "othrNtnlCcy",
    "othrLegIntrstRate"
})
public class DerivativeInterest3 {

    @XmlElement(name = "IntrstRate", required = true)
    protected FloatingInterestRate8 intrstRate;
    @XmlElement(name = "FrstLegIntrstRate")
    protected InterestRate8Choice frstLegIntrstRate;
    @XmlElement(name = "OthrNtnlCcy")
    protected String othrNtnlCcy;
    @XmlElement(name = "OthrLegIntrstRate")
    protected InterestRate8Choice othrLegIntrstRate;

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public void setIntrstRate(FloatingInterestRate8 value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the frstLegIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice }
     *     
     */
    public InterestRate8Choice getFrstLegIntrstRate() {
        return frstLegIntrstRate;
    }

    /**
     * Sets the value of the frstLegIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice }
     *     
     */
    public void setFrstLegIntrstRate(InterestRate8Choice value) {
        this.frstLegIntrstRate = value;
    }

    /**
     * Gets the value of the othrNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Sets the value of the othrNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
    }

    /**
     * Gets the value of the othrLegIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice }
     *     
     */
    public InterestRate8Choice getOthrLegIntrstRate() {
        return othrLegIntrstRate;
    }

    /**
     * Sets the value of the othrLegIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice }
     *     
     */
    public void setOthrLegIntrstRate(InterestRate8Choice value) {
        this.othrLegIntrstRate = value;
    }

}
