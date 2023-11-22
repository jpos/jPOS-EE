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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingBalanceType1Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="CcyTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingCurrencyType1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingBalance1", propOrder = {
    "tp",
    "val",
    "ccyTp"
})
public class BillingBalance1 {

    @XmlElement(name = "Tp", required = true)
    protected BillingBalanceType1Choice tp;
    @XmlElement(name = "Val", required = true)
    protected AmountAndDirection34 val;
    @XmlElement(name = "CcyTp")
    @XmlSchemaType(name = "string")
    protected BillingCurrencyType1Code ccyTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingBalanceType1Choice }
     *     
     */
    public BillingBalanceType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingBalanceType1Choice }
     *     
     */
    public void setTp(BillingBalanceType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setVal(AmountAndDirection34 value) {
        this.val = value;
    }

    /**
     * Gets the value of the ccyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCurrencyType1Code }
     *     
     */
    public BillingCurrencyType1Code getCcyTp() {
        return ccyTp;
    }

    /**
     * Sets the value of the ccyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCurrencyType1Code }
     *     
     */
    public void setCcyTp(BillingCurrencyType1Code value) {
        this.ccyTp = value;
    }

}
