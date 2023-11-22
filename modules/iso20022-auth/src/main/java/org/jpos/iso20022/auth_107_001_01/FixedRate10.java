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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixedRate10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FixedRate10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice14Choice" minOccurs="0"/>
 *         <element name="DayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}InterestComputationMethodFormat7" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}InterestRateFrequency3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRate10", propOrder = {
    "rate",
    "dayCnt",
    "pmtFrqcy"
})
public class FixedRate10 {

    @XmlElement(name = "Rate")
    protected SecuritiesTransactionPrice14Choice rate;
    @XmlElement(name = "DayCnt")
    protected InterestComputationMethodFormat7 dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency3Choice pmtFrqcy;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public SecuritiesTransactionPrice14Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public void setRate(SecuritiesTransactionPrice14Choice value) {
        this.rate = value;
    }

    /**
     * Gets the value of the dayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public InterestComputationMethodFormat7 getDayCnt() {
        return dayCnt;
    }

    /**
     * Sets the value of the dayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public void setDayCnt(InterestComputationMethodFormat7 value) {
        this.dayCnt = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public InterestRateFrequency3Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public void setPmtFrqcy(InterestRateFrequency3Choice value) {
        this.pmtFrqcy = value;
    }

}
