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

package org.jpos.iso20022.auth_034_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPaymentsVAT1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EarlyPaymentsVAT1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PercentageRate"/>
 *         <element name="DscntTaxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max4Text"/>
 *         <element name="DscntTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPaymentsVAT1", propOrder = {
    "taxRate",
    "dscntTaxTp",
    "dscntTaxAmt"
})
public class EarlyPaymentsVAT1 {

    @XmlElement(name = "TaxRate", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "DscntTaxTp", required = true)
    protected String dscntTaxTp;
    @XmlElement(name = "DscntTaxAmt", required = true)
    protected CurrencyAndAmount dscntTaxAmt;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the dscntTaxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscntTaxTp() {
        return dscntTaxTp;
    }

    /**
     * Sets the value of the dscntTaxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscntTaxTp(String value) {
        this.dscntTaxTp = value;
    }

    /**
     * Gets the value of the dscntTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntTaxAmt() {
        return dscntTaxAmt;
    }

    /**
     * Sets the value of the dscntTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDscntTaxAmt(CurrencyAndAmount value) {
        this.dscntTaxAmt = value;
    }

}
