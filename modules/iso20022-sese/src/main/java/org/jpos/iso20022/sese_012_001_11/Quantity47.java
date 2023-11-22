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

package org.jpos.iso20022.sese_012_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity47 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity47">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="PctgRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PercentageRate" minOccurs="0"/>
 *         <element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AmtsdVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="OthrAsst" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity47", propOrder = {
    "unit",
    "pctgRate",
    "faceAmt",
    "amtsdVal",
    "cshAmt",
    "othrAsst"
})
public class Quantity47 {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "PctgRate")
    protected BigDecimal pctgRate;
    @XmlElement(name = "FaceAmt")
    protected BigDecimal faceAmt;
    @XmlElement(name = "AmtsdVal")
    protected BigDecimal amtsdVal;
    @XmlElement(name = "CshAmt")
    protected ActiveCurrencyAnd13DecimalAmount cshAmt;
    @XmlElement(name = "OthrAsst")
    protected String othrAsst;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Gets the value of the pctgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgRate() {
        return pctgRate;
    }

    /**
     * Sets the value of the pctgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgRate(BigDecimal value) {
        this.pctgRate = value;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCshAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.cshAmt = value;
    }

    /**
     * Gets the value of the othrAsst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAsst() {
        return othrAsst;
    }

    /**
     * Sets the value of the othrAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAsst(String value) {
        this.othrAsst = value;
    }

}
