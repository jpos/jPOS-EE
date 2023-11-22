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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompareInterestRate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompareInterestRate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrgnLnAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareAmountAndDirection1" minOccurs="0"/>
 *         <element name="FxdIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareInterestComputationMethod3" minOccurs="0"/>
 *         <element name="FltgIntrstRefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareBenchmarkCurveName3" minOccurs="0"/>
 *         <element name="FltgIntrstRateTermUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRateTermVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="FltgIntrstRatePmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRatePmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="FltgIntrstRateRstFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRateRstFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber6" minOccurs="0"/>
 *         <element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDecimalNumber3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareInterestRate1", propOrder = {
    "mrgnLnAmt",
    "fxdIntrstRate",
    "dayCntBsis",
    "fltgIntrstRefRate",
    "fltgIntrstRateTermUnit",
    "fltgIntrstRateTermVal",
    "fltgIntrstRatePmtFrqcyUnit",
    "fltgIntrstRatePmtFrqcyVal",
    "fltgIntrstRateRstFrqcyUnit",
    "fltgIntrstRateRstFrqcyVal",
    "bsisPtSprd"
})
public class CompareInterestRate1 {

    @XmlElement(name = "MrgnLnAmt")
    protected CompareAmountAndDirection1 mrgnLnAmt;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate3 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareInterestComputationMethod3 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName3 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis3 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber5 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber5 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber6 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "BsisPtSprd")
    protected CompareDecimalNumber3 bsisPtSprd;

    /**
     * Gets the value of the mrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareAmountAndDirection1 getMrgnLnAmt() {
        return mrgnLnAmt;
    }

    /**
     * Sets the value of the mrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public void setMrgnLnAmt(CompareAmountAndDirection1 value) {
        this.mrgnLnAmt = value;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setFxdIntrstRate(ComparePercentageRate3 value) {
        this.fxdIntrstRate = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public CompareInterestComputationMethod3 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public void setDayCntBsis(CompareInterestComputationMethod3 value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public void setFltgIntrstRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgIntrstRefRate = value;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRateTermUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateTermUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setFltgIntrstRateTermVal(CompareNumber5 value) {
        this.fltgIntrstRateTermVal = value;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setFltgIntrstRatePmtFrqcyVal(CompareNumber5 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public void setFltgIntrstRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgIntrstRateRstFrqcyVal = value;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public void setBsisPtSprd(CompareDecimalNumber3 value) {
        this.bsisPtSprd = value;
    }

}
