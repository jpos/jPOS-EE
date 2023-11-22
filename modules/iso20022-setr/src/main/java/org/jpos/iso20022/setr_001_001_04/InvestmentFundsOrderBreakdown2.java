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

package org.jpos.iso20022.setr_001_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundsOrderBreakdown2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentFundsOrderBreakdown2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrBrkdwnTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}OrderBreakdownType1Choice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundsOrderBreakdown2", propOrder = {
    "ordrBrkdwnTp",
    "amt"
})
public class InvestmentFundsOrderBreakdown2 {

    @XmlElement(name = "OrdrBrkdwnTp", required = true)
    protected OrderBreakdownType1Choice ordrBrkdwnTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the ordrBrkdwnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBreakdownType1Choice }
     *     
     */
    public OrderBreakdownType1Choice getOrdrBrkdwnTp() {
        return ordrBrkdwnTp;
    }

    /**
     * Sets the value of the ordrBrkdwnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBreakdownType1Choice }
     *     
     */
    public void setOrdrBrkdwnTp(OrderBreakdownType1Choice value) {
        this.ordrBrkdwnTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

}
