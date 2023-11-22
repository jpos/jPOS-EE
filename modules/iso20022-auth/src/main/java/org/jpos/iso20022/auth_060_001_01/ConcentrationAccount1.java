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

package org.jpos.iso20022.auth_060_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConcentrationAccount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConcentrationAccount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InFlow" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}Flows1"/>
 *         <element name="OutFlow" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}Flows1"/>
 *         <element name="EndOfDay" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}AmountAndDirection102"/>
 *         <element name="PeakCdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PeakDbt" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="LatePmtConf" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}Max10NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcentrationAccount1", propOrder = {
    "inFlow",
    "outFlow",
    "endOfDay",
    "peakCdt",
    "peakDbt",
    "latePmtConf"
})
public class ConcentrationAccount1 {

    @XmlElement(name = "InFlow", required = true)
    protected Flows1 inFlow;
    @XmlElement(name = "OutFlow", required = true)
    protected Flows1 outFlow;
    @XmlElement(name = "EndOfDay", required = true)
    protected AmountAndDirection102 endOfDay;
    @XmlElement(name = "PeakCdt", required = true)
    protected ActiveCurrencyAndAmount peakCdt;
    @XmlElement(name = "PeakDbt", required = true)
    protected ActiveCurrencyAndAmount peakDbt;
    @XmlElement(name = "LatePmtConf", required = true)
    protected String latePmtConf;

    /**
     * Gets the value of the inFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Flows1 }
     *     
     */
    public Flows1 getInFlow() {
        return inFlow;
    }

    /**
     * Sets the value of the inFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flows1 }
     *     
     */
    public void setInFlow(Flows1 value) {
        this.inFlow = value;
    }

    /**
     * Gets the value of the outFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Flows1 }
     *     
     */
    public Flows1 getOutFlow() {
        return outFlow;
    }

    /**
     * Sets the value of the outFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flows1 }
     *     
     */
    public void setOutFlow(Flows1 value) {
        this.outFlow = value;
    }

    /**
     * Gets the value of the endOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDay() {
        return endOfDay;
    }

    /**
     * Sets the value of the endOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setEndOfDay(AmountAndDirection102 value) {
        this.endOfDay = value;
    }

    /**
     * Gets the value of the peakCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakCdt() {
        return peakCdt;
    }

    /**
     * Sets the value of the peakCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPeakCdt(ActiveCurrencyAndAmount value) {
        this.peakCdt = value;
    }

    /**
     * Gets the value of the peakDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakDbt() {
        return peakDbt;
    }

    /**
     * Sets the value of the peakDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPeakDbt(ActiveCurrencyAndAmount value) {
        this.peakDbt = value;
    }

    /**
     * Gets the value of the latePmtConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatePmtConf() {
        return latePmtConf;
    }

    /**
     * Sets the value of the latePmtConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatePmtConf(String value) {
        this.latePmtConf = value;
    }

}
