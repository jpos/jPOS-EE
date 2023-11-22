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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Repartition6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Repartition6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}UnitsOrAmountOrPercentage1Choice"/>
 *         <element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FinancialInstrument87"/>
 *         <element name="CcyOfPlan" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repartition6", propOrder = {
    "qty",
    "finInstrm",
    "ccyOfPlan"
})
public class Repartition6 {

    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmountOrPercentage1Choice qty;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrument87 finInstrm;
    @XmlElement(name = "CcyOfPlan")
    protected String ccyOfPlan;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOrAmountOrPercentage1Choice }
     *     
     */
    public UnitsOrAmountOrPercentage1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOrAmountOrPercentage1Choice }
     *     
     */
    public void setQty(UnitsOrAmountOrPercentage1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public FinancialInstrument87 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public void setFinInstrm(FinancialInstrument87 value) {
        this.finInstrm = value;
    }

    /**
     * Gets the value of the ccyOfPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOfPlan() {
        return ccyOfPlan;
    }

    /**
     * Sets the value of the ccyOfPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyOfPlan(String value) {
        this.ccyOfPlan = value;
    }

}
