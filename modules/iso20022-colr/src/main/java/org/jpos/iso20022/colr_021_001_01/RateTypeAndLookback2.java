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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeAndLookback2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateTypeAndLookback2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}BenchmarkCurveName13Choice"/>
 *         <element name="LookBckDays" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max3NumericText" minOccurs="0"/>
 *         <element name="CrstllstnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CrystallisationDay1" minOccurs="0"/>
 *         <element name="Tnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}InterestRateIndexTenor2Code" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndLookback2", propOrder = {
    "tp",
    "lookBckDays",
    "crstllstnDt",
    "tnr",
    "ccy"
})
public class RateTypeAndLookback2 {

    @XmlElement(name = "Tp", required = true)
    protected BenchmarkCurveName13Choice tp;
    @XmlElement(name = "LookBckDays")
    protected String lookBckDays;
    @XmlElement(name = "CrstllstnDt")
    protected CrystallisationDay1 crstllstnDt;
    @XmlElement(name = "Tnr")
    @XmlSchemaType(name = "string")
    protected InterestRateIndexTenor2Code tnr;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName13Choice }
     *     
     */
    public BenchmarkCurveName13Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName13Choice }
     *     
     */
    public void setTp(BenchmarkCurveName13Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the lookBckDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookBckDays() {
        return lookBckDays;
    }

    /**
     * Sets the value of the lookBckDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookBckDays(String value) {
        this.lookBckDays = value;
    }

    /**
     * Gets the value of the crstllstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrystallisationDay1 }
     *     
     */
    public CrystallisationDay1 getCrstllstnDt() {
        return crstllstnDt;
    }

    /**
     * Sets the value of the crstllstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrystallisationDay1 }
     *     
     */
    public void setCrstllstnDt(CrystallisationDay1 value) {
        this.crstllstnDt = value;
    }

    /**
     * Gets the value of the tnr property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateIndexTenor2Code }
     *     
     */
    public InterestRateIndexTenor2Code getTnr() {
        return tnr;
    }

    /**
     * Sets the value of the tnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateIndexTenor2Code }
     *     
     */
    public void setTnr(InterestRateIndexTenor2Code value) {
        this.tnr = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
