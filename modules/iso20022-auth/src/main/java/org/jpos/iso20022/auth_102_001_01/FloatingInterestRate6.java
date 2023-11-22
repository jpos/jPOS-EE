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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingInterestRate6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FloatingInterestRate6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}BenchmarkCurveName6Choice"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}InterestRateContractTerm2"/>
 *         <element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}Max5Number"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate6", propOrder = {
    "refRate",
    "term",
    "bsisPtSprd"
})
public class FloatingInterestRate6 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName6Choice refRate;
    @XmlElement(name = "Term", required = true)
    protected InterestRateContractTerm2 term;
    @XmlElement(name = "BsisPtSprd", required = true)
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the refRate property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName6Choice }
     *     
     */
    public BenchmarkCurveName6Choice getRefRate() {
        return refRate;
    }

    /**
     * Sets the value of the refRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName6Choice }
     *     
     */
    public void setRefRate(BenchmarkCurveName6Choice value) {
        this.refRate = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public void setTerm(InterestRateContractTerm2 value) {
        this.term = value;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
    }

}
