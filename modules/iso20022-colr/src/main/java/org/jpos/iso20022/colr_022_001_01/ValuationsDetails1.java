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

package org.jpos.iso20022.colr_022_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationsDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValuationsDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MktPric" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Price7" minOccurs="0"/>
 *         <element name="SrcOfPric" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}MarketIdentification89" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="ValtnDtlsAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralAmount4"/>
 *         <element name="AcrdIntrst" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CleanPric" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValtnFctrBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ValuationFactorBreakdown1"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Number" minOccurs="0"/>
 *         <element name="QtnAge" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationsDetails1", propOrder = {
    "mktPric",
    "srcOfPric",
    "sttlmDt",
    "valtnDtlsAmt",
    "acrdIntrst",
    "cleanPric",
    "valtnFctrBrkdwn",
    "nbOfDaysAcrd",
    "qtnAge"
})
public class ValuationsDetails1 {

    @XmlElement(name = "MktPric")
    protected Price7 mktPric;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification89 srcOfPric;
    @XmlElement(name = "SttlmDt")
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "ValtnDtlsAmt", required = true)
    protected CollateralAmount4 valtnDtlsAmt;
    @XmlElement(name = "AcrdIntrst")
    protected ActiveOrHistoricCurrencyAndAmount acrdIntrst;
    @XmlElement(name = "CleanPric")
    protected ActiveOrHistoricCurrencyAndAmount cleanPric;
    @XmlElement(name = "ValtnFctrBrkdwn", required = true)
    protected ValuationFactorBreakdown1 valtnFctrBrkdwn;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "QtnAge")
    protected BigDecimal qtnAge;

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setMktPric(Price7 value) {
        this.mktPric = value;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification89 }
     *     
     */
    public MarketIdentification89 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification89 }
     *     
     */
    public void setSrcOfPric(MarketIdentification89 value) {
        this.srcOfPric = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the valtnDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount4 }
     *     
     */
    public CollateralAmount4 getValtnDtlsAmt() {
        return valtnDtlsAmt;
    }

    /**
     * Sets the value of the valtnDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount4 }
     *     
     */
    public void setValtnDtlsAmt(CollateralAmount4 value) {
        this.valtnDtlsAmt = value;
    }

    /**
     * Gets the value of the acrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAcrdIntrst() {
        return acrdIntrst;
    }

    /**
     * Sets the value of the acrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAcrdIntrst(ActiveOrHistoricCurrencyAndAmount value) {
        this.acrdIntrst = value;
    }

    /**
     * Gets the value of the cleanPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCleanPric() {
        return cleanPric;
    }

    /**
     * Sets the value of the cleanPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setCleanPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.cleanPric = value;
    }

    /**
     * Gets the value of the valtnFctrBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationFactorBreakdown1 }
     *     
     */
    public ValuationFactorBreakdown1 getValtnFctrBrkdwn() {
        return valtnFctrBrkdwn;
    }

    /**
     * Sets the value of the valtnFctrBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationFactorBreakdown1 }
     *     
     */
    public void setValtnFctrBrkdwn(ValuationFactorBreakdown1 value) {
        this.valtnFctrBrkdwn = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the qtnAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtnAge() {
        return qtnAge;
    }

    /**
     * Sets the value of the qtnAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtnAge(BigDecimal value) {
        this.qtnAge = value;
    }

}
