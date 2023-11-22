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
 * <p>Java class for BillingCompensation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingCompensation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingCompensationType1Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="CcyTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingCurrencyType2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCompensation1", propOrder = {
    "tp",
    "val",
    "ccyTp"
})
public class BillingCompensation1 {

    @XmlElement(name = "Tp", required = true)
    protected BillingCompensationType1Choice tp;
    @XmlElement(name = "Val", required = true)
    protected AmountAndDirection34 val;
    @XmlElement(name = "CcyTp")
    @XmlSchemaType(name = "string")
    protected BillingCurrencyType2Code ccyTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCompensationType1Choice }
     *     
     */
    public BillingCompensationType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCompensationType1Choice }
     *     
     */
    public void setTp(BillingCompensationType1Choice value) {
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
     *     {@link BillingCurrencyType2Code }
     *     
     */
    public BillingCurrencyType2Code getCcyTp() {
        return ccyTp;
    }

    /**
     * Sets the value of the ccyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCurrencyType2Code }
     *     
     */
    public void setCcyTp(BillingCurrencyType2Code value) {
        this.ccyTp = value;
    }

}
