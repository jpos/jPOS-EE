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

package org.jpos.iso20022.auth_059_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomeStatement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IncomeStatement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrFees" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="OthrOprgRvn" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="OprgExpnss" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="OprgPrftOrLoss" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}AmountAndDirection102"/>
 *         <element name="NetIntrstIncm" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="OthrNonOprgRvn" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="NonOprgExpnss" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PreTaxPrftOrLoss" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}AmountAndDirection102"/>
 *         <element name="PstTaxPrftOrLoss" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}AmountAndDirection102"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeStatement1", propOrder = {
    "clrFees",
    "othrOprgRvn",
    "oprgExpnss",
    "oprgPrftOrLoss",
    "netIntrstIncm",
    "othrNonOprgRvn",
    "nonOprgExpnss",
    "preTaxPrftOrLoss",
    "pstTaxPrftOrLoss"
})
public class IncomeStatement1 {

    @XmlElement(name = "ClrFees", required = true)
    protected ActiveCurrencyAndAmount clrFees;
    @XmlElement(name = "OthrOprgRvn", required = true)
    protected ActiveCurrencyAndAmount othrOprgRvn;
    @XmlElement(name = "OprgExpnss", required = true)
    protected ActiveCurrencyAndAmount oprgExpnss;
    @XmlElement(name = "OprgPrftOrLoss", required = true)
    protected AmountAndDirection102 oprgPrftOrLoss;
    @XmlElement(name = "NetIntrstIncm", required = true)
    protected ActiveCurrencyAndAmount netIntrstIncm;
    @XmlElement(name = "OthrNonOprgRvn", required = true)
    protected ActiveCurrencyAndAmount othrNonOprgRvn;
    @XmlElement(name = "NonOprgExpnss", required = true)
    protected ActiveCurrencyAndAmount nonOprgExpnss;
    @XmlElement(name = "PreTaxPrftOrLoss", required = true)
    protected AmountAndDirection102 preTaxPrftOrLoss;
    @XmlElement(name = "PstTaxPrftOrLoss", required = true)
    protected AmountAndDirection102 pstTaxPrftOrLoss;

    /**
     * Gets the value of the clrFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getClrFees() {
        return clrFees;
    }

    /**
     * Sets the value of the clrFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setClrFees(ActiveCurrencyAndAmount value) {
        this.clrFees = value;
    }

    /**
     * Gets the value of the othrOprgRvn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrOprgRvn() {
        return othrOprgRvn;
    }

    /**
     * Sets the value of the othrOprgRvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOthrOprgRvn(ActiveCurrencyAndAmount value) {
        this.othrOprgRvn = value;
    }

    /**
     * Gets the value of the oprgExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOprgExpnss() {
        return oprgExpnss;
    }

    /**
     * Sets the value of the oprgExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOprgExpnss(ActiveCurrencyAndAmount value) {
        this.oprgExpnss = value;
    }

    /**
     * Gets the value of the oprgPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOprgPrftOrLoss() {
        return oprgPrftOrLoss;
    }

    /**
     * Sets the value of the oprgPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setOprgPrftOrLoss(AmountAndDirection102 value) {
        this.oprgPrftOrLoss = value;
    }

    /**
     * Gets the value of the netIntrstIncm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetIntrstIncm() {
        return netIntrstIncm;
    }

    /**
     * Sets the value of the netIntrstIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetIntrstIncm(ActiveCurrencyAndAmount value) {
        this.netIntrstIncm = value;
    }

    /**
     * Gets the value of the othrNonOprgRvn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrNonOprgRvn() {
        return othrNonOprgRvn;
    }

    /**
     * Sets the value of the othrNonOprgRvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOthrNonOprgRvn(ActiveCurrencyAndAmount value) {
        this.othrNonOprgRvn = value;
    }

    /**
     * Gets the value of the nonOprgExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonOprgExpnss() {
        return nonOprgExpnss;
    }

    /**
     * Sets the value of the nonOprgExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNonOprgExpnss(ActiveCurrencyAndAmount value) {
        this.nonOprgExpnss = value;
    }

    /**
     * Gets the value of the preTaxPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPreTaxPrftOrLoss() {
        return preTaxPrftOrLoss;
    }

    /**
     * Sets the value of the preTaxPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setPreTaxPrftOrLoss(AmountAndDirection102 value) {
        this.preTaxPrftOrLoss = value;
    }

    /**
     * Gets the value of the pstTaxPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPstTaxPrftOrLoss() {
        return pstTaxPrftOrLoss;
    }

    /**
     * Sets the value of the pstTaxPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setPstTaxPrftOrLoss(AmountAndDirection102 value) {
        this.pstTaxPrftOrLoss = value;
    }

}
