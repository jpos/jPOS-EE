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

package org.jpos.iso20022.catp_007_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransactionAmounts6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransactionAmounts6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="MaxPssblAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinPssblAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMTransactionAmounts7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts6", propOrder = {
    "ccy",
    "maxPssblAmt",
    "minPssblAmt",
    "addtlAmt"
})
public class ATMTransactionAmounts6 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MaxPssblAmt")
    protected BigDecimal maxPssblAmt;
    @XmlElement(name = "MinPssblAmt")
    protected BigDecimal minPssblAmt;
    @XmlElement(name = "AddtlAmt")
    protected List<ATMTransactionAmounts7> addtlAmt;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the maxPssblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPssblAmt() {
        return maxPssblAmt;
    }

    /**
     * Sets the value of the maxPssblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPssblAmt(BigDecimal value) {
        this.maxPssblAmt = value;
    }

    /**
     * Gets the value of the minPssblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPssblAmt() {
        return minPssblAmt;
    }

    /**
     * Sets the value of the minPssblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPssblAmt(BigDecimal value) {
        this.minPssblAmt = value;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts7 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<ATMTransactionAmounts7> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

}
