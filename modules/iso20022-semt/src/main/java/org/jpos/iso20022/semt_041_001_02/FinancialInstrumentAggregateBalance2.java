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

package org.jpos.iso20022.semt_041_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAggregateBalance2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAggregateBalance2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttldBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="TraddBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="BalBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}SubBalanceBreakdown1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance2", propOrder = {
    "sttldBal",
    "traddBal",
    "balBrkdwn"
})
public class FinancialInstrumentAggregateBalance2 {

    @XmlElement(name = "SttldBal")
    protected FinancialInstrumentQuantity1Choice sttldBal;
    @XmlElement(name = "TraddBal")
    protected FinancialInstrumentQuantity1Choice traddBal;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceBreakdown1> balBrkdwn;

    /**
     * Gets the value of the sttldBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getSttldBal() {
        return sttldBal;
    }

    /**
     * Sets the value of the sttldBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setSttldBal(FinancialInstrumentQuantity1Choice value) {
        this.sttldBal = value;
    }

    /**
     * Gets the value of the traddBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTraddBal() {
        return traddBal;
    }

    /**
     * Sets the value of the traddBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setTraddBal(FinancialInstrumentQuantity1Choice value) {
        this.traddBal = value;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceBreakdown1 }
     * 
     * 
     * @return
     *     The value of the balBrkdwn property.
     */
    public List<SubBalanceBreakdown1> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<>();
        }
        return this.balBrkdwn;
    }

}
