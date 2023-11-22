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

package org.jpos.iso20022.fxtr_031_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumQuote1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PremiumQuote1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PctgOfCallAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}PercentageRate"/>
 *         <element name="PctgOfPutAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}PercentageRate"/>
 *         <element name="PtsOfCallAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}BaseOneRate"/>
 *         <element name="PtsOfPutAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}BaseOneRate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumQuote1Choice", propOrder = {
    "pctgOfCallAmt",
    "pctgOfPutAmt",
    "ptsOfCallAmt",
    "ptsOfPutAmt"
})
public class PremiumQuote1Choice {

    @XmlElement(name = "PctgOfCallAmt")
    protected BigDecimal pctgOfCallAmt;
    @XmlElement(name = "PctgOfPutAmt")
    protected BigDecimal pctgOfPutAmt;
    @XmlElement(name = "PtsOfCallAmt")
    protected BigDecimal ptsOfCallAmt;
    @XmlElement(name = "PtsOfPutAmt")
    protected BigDecimal ptsOfPutAmt;

    /**
     * Gets the value of the pctgOfCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfCallAmt() {
        return pctgOfCallAmt;
    }

    /**
     * Sets the value of the pctgOfCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfCallAmt(BigDecimal value) {
        this.pctgOfCallAmt = value;
    }

    /**
     * Gets the value of the pctgOfPutAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfPutAmt() {
        return pctgOfPutAmt;
    }

    /**
     * Sets the value of the pctgOfPutAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfPutAmt(BigDecimal value) {
        this.pctgOfPutAmt = value;
    }

    /**
     * Gets the value of the ptsOfCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtsOfCallAmt() {
        return ptsOfCallAmt;
    }

    /**
     * Sets the value of the ptsOfCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtsOfCallAmt(BigDecimal value) {
        this.ptsOfCallAmt = value;
    }

    /**
     * Gets the value of the ptsOfPutAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtsOfPutAmt() {
        return ptsOfPutAmt;
    }

    /**
     * Sets the value of the ptsOfPutAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtsOfPutAmt(BigDecimal value) {
        this.ptsOfPutAmt = value;
    }

}
