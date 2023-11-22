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

package org.jpos.iso20022.acmt_031_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTransfer4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceTransfer4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BalTrfRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}BalanceTransferReference1" minOccurs="0"/>
 *         <element name="BalTrfMtd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}SettlementMethod4Choice" minOccurs="0"/>
 *         <element name="BalTrfFndgLmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}BalanceTransferFundingLimit1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceTransfer4", propOrder = {
    "balTrfRef",
    "balTrfMtd",
    "balTrfFndgLmt"
})
public class BalanceTransfer4 {

    @XmlElement(name = "BalTrfRef")
    protected BalanceTransferReference1 balTrfRef;
    @XmlElement(name = "BalTrfMtd")
    protected SettlementMethod4Choice balTrfMtd;
    @XmlElement(name = "BalTrfFndgLmt")
    protected BalanceTransferFundingLimit1 balTrfFndgLmt;

    /**
     * Gets the value of the balTrfRef property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferReference1 }
     *     
     */
    public BalanceTransferReference1 getBalTrfRef() {
        return balTrfRef;
    }

    /**
     * Sets the value of the balTrfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferReference1 }
     *     
     */
    public void setBalTrfRef(BalanceTransferReference1 value) {
        this.balTrfRef = value;
    }

    /**
     * Gets the value of the balTrfMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethod4Choice }
     *     
     */
    public SettlementMethod4Choice getBalTrfMtd() {
        return balTrfMtd;
    }

    /**
     * Sets the value of the balTrfMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethod4Choice }
     *     
     */
    public void setBalTrfMtd(SettlementMethod4Choice value) {
        this.balTrfMtd = value;
    }

    /**
     * Gets the value of the balTrfFndgLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferFundingLimit1 }
     *     
     */
    public BalanceTransferFundingLimit1 getBalTrfFndgLmt() {
        return balTrfFndgLmt;
    }

    /**
     * Sets the value of the balTrfFndgLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferFundingLimit1 }
     *     
     */
    public void setBalTrfFndgLmt(BalanceTransferFundingLimit1 value) {
        this.balTrfFndgLmt = value;
    }

}
