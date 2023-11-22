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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementSubTotalCalculatedTax2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementSubTotalCalculatedTax2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max4Text" minOccurs="0"/>
 *         <element name="ClctdRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="BsisAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClctdAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XmptnRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max4Text" minOccurs="0"/>
 *         <element name="XmptnRsnTxt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max500Text" minOccurs="0"/>
 *         <element name="TaxCcyXchg" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyReference3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementSubTotalCalculatedTax2", propOrder = {
    "tpCd",
    "clctdRate",
    "bsisAmt",
    "clctdAmt",
    "xmptnRsnCd",
    "xmptnRsnTxt",
    "taxCcyXchg"
})
public class SettlementSubTotalCalculatedTax2 {

    @XmlElement(name = "TpCd")
    protected String tpCd;
    @XmlElement(name = "ClctdRate")
    protected BigDecimal clctdRate;
    @XmlElement(name = "BsisAmt")
    protected List<CurrencyAndAmount> bsisAmt;
    @XmlElement(name = "ClctdAmt")
    protected List<CurrencyAndAmount> clctdAmt;
    @XmlElement(name = "XmptnRsnCd")
    protected String xmptnRsnCd;
    @XmlElement(name = "XmptnRsnTxt")
    protected String xmptnRsnTxt;
    @XmlElement(name = "TaxCcyXchg")
    protected CurrencyReference3 taxCcyXchg;

    /**
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpCd(String value) {
        this.tpCd = value;
    }

    /**
     * Gets the value of the clctdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctdRate() {
        return clctdRate;
    }

    /**
     * Sets the value of the clctdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClctdRate(BigDecimal value) {
        this.clctdRate = value;
    }

    /**
     * Gets the value of the bsisAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bsisAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBsisAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the bsisAmt property.
     */
    public List<CurrencyAndAmount> getBsisAmt() {
        if (bsisAmt == null) {
            bsisAmt = new ArrayList<>();
        }
        return this.bsisAmt;
    }

    /**
     * Gets the value of the clctdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clctdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClctdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the clctdAmt property.
     */
    public List<CurrencyAndAmount> getClctdAmt() {
        if (clctdAmt == null) {
            clctdAmt = new ArrayList<>();
        }
        return this.clctdAmt;
    }

    /**
     * Gets the value of the xmptnRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsnCd() {
        return xmptnRsnCd;
    }

    /**
     * Sets the value of the xmptnRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmptnRsnCd(String value) {
        this.xmptnRsnCd = value;
    }

    /**
     * Gets the value of the xmptnRsnTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsnTxt() {
        return xmptnRsnTxt;
    }

    /**
     * Sets the value of the xmptnRsnTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmptnRsnTxt(String value) {
        this.xmptnRsnTxt = value;
    }

    /**
     * Gets the value of the taxCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference3 }
     *     
     */
    public CurrencyReference3 getTaxCcyXchg() {
        return taxCcyXchg;
    }

    /**
     * Sets the value of the taxCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference3 }
     *     
     */
    public void setTaxCcyXchg(CurrencyReference3 value) {
        this.taxCcyXchg = value;
    }

}
