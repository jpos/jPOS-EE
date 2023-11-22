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

package org.jpos.iso20022.catp_012_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedAmount16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedAmount16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Number" minOccurs="0"/>
 *         <element name="AmtToDpst" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CshBckAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}DetailedAmount13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dontn" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}DetailedAmount13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount16", propOrder = {
    "acctSeqNb",
    "amtToDpst",
    "ccy",
    "cshBckAmt",
    "fees",
    "dontn"
})
public class DetailedAmount16 {

    @XmlElement(name = "AcctSeqNb")
    protected BigDecimal acctSeqNb;
    @XmlElement(name = "AmtToDpst")
    protected BigDecimal amtToDpst;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CshBckAmt")
    protected BigDecimal cshBckAmt;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount13> fees;
    @XmlElement(name = "Dontn")
    protected List<DetailedAmount13> dontn;

    /**
     * Gets the value of the acctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSeqNb() {
        return acctSeqNb;
    }

    /**
     * Sets the value of the acctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctSeqNb(BigDecimal value) {
        this.acctSeqNb = value;
    }

    /**
     * Gets the value of the amtToDpst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtToDpst() {
        return amtToDpst;
    }

    /**
     * Sets the value of the amtToDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtToDpst(BigDecimal value) {
        this.amtToDpst = value;
    }

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
     * Gets the value of the cshBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshBckAmt() {
        return cshBckAmt;
    }

    /**
     * Sets the value of the cshBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshBckAmt(BigDecimal value) {
        this.cshBckAmt = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<DetailedAmount13> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the dontn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dontn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the dontn property.
     */
    public List<DetailedAmount13> getDontn() {
        if (dontn == null) {
            dontn = new ArrayList<>();
        }
        return this.dontn;
    }

}
