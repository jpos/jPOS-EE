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

package org.jpos.iso20022.auth_052_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingInterestRate22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FloatingInterestRate22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}BenchmarkCurveName10Choice" minOccurs="0"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}InterestRateContractTerm2" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}InterestRateContractTerm2" minOccurs="0"/>
 *         <element name="RstFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}InterestRateContractTerm2" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}SecuritiesTransactionPrice18Choice" minOccurs="0"/>
 *         <element name="RateAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}RateAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}InterestComputationMethodFormat6Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate22", propOrder = {
    "refRate",
    "term",
    "pmtFrqcy",
    "rstFrqcy",
    "sprd",
    "rateAdjstmnt",
    "dayCntBsis"
})
public class FloatingInterestRate22 {

    @XmlElement(name = "RefRate")
    protected BenchmarkCurveName10Choice refRate;
    @XmlElement(name = "Term")
    protected InterestRateContractTerm2 term;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateContractTerm2 pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateContractTerm2 rstFrqcy;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice18Choice sprd;
    @XmlElement(name = "RateAdjstmnt")
    protected List<RateAdjustment1> rateAdjstmnt;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat6Choice dayCntBsis;

    /**
     * Gets the value of the refRate property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public BenchmarkCurveName10Choice getRefRate() {
        return refRate;
    }

    /**
     * Sets the value of the refRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName10Choice }
     *     
     */
    public void setRefRate(BenchmarkCurveName10Choice value) {
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
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public void setPmtFrqcy(InterestRateContractTerm2 value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the rstFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getRstFrqcy() {
        return rstFrqcy;
    }

    /**
     * Sets the value of the rstFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public void setRstFrqcy(InterestRateContractTerm2 value) {
        this.rstFrqcy = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice18Choice }
     *     
     */
    public SecuritiesTransactionPrice18Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice18Choice }
     *     
     */
    public void setSprd(SecuritiesTransactionPrice18Choice value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the rateAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rateAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAdjustment1 }
     * 
     * 
     * @return
     *     The value of the rateAdjstmnt property.
     */
    public List<RateAdjustment1> getRateAdjstmnt() {
        if (rateAdjstmnt == null) {
            rateAdjstmnt = new ArrayList<>();
        }
        return this.rateAdjstmnt;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public InterestComputationMethodFormat6Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat6Choice value) {
        this.dayCntBsis = value;
    }

}
