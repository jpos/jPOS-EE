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

package org.jpos.iso20022.secl_005_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlCcyAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RptgAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}ImpliedCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount2", propOrder = {
    "orgnlCcyAmt",
    "rptgAmt"
})
public class Amount2 {

    @XmlElement(name = "OrgnlCcyAmt")
    protected ActiveCurrencyAndAmount orgnlCcyAmt;
    @XmlElement(name = "RptgAmt", required = true)
    protected BigDecimal rptgAmt;

    /**
     * Gets the value of the orgnlCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlCcyAmt() {
        return orgnlCcyAmt;
    }

    /**
     * Sets the value of the orgnlCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlCcyAmt(ActiveCurrencyAndAmount value) {
        this.orgnlCcyAmt = value;
    }

    /**
     * Gets the value of the rptgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptgAmt() {
        return rptgAmt;
    }

    /**
     * Sets the value of the rptgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptgAmt(BigDecimal value) {
        this.rptgAmt = value;
    }

}
