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

package org.jpos.iso20022.setr_012_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformativeTax1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformativeTax1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxblIncmPerDvdd" type="{urn:iso:std:iso:20022:tech:xsd:setr.012.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EUCptlGn" type="{urn:iso:std:iso:20022:tech:xsd:setr.012.001.04}EUCapitalGain3Choice" minOccurs="0"/>
 *         <element name="EUDvddSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.012.001.04}EUDividendStatusType2Choice" minOccurs="0"/>
 *         <element name="PctgOfDebtClm" type="{urn:iso:std:iso:20022:tech:xsd:setr.012.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="IndvTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.012.001.04}Tax32" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformativeTax1", propOrder = {
    "taxblIncmPerDvdd",
    "euCptlGn",
    "euDvddSts",
    "pctgOfDebtClm",
    "indvTax"
})
public class InformativeTax1 {

    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveCurrencyAndAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUCptlGn")
    protected EUCapitalGain3Choice euCptlGn;
    @XmlElement(name = "EUDvddSts")
    protected EUDividendStatusType2Choice euDvddSts;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "IndvTax")
    protected List<Tax32> indvTax;

    /**
     * Gets the value of the taxblIncmPerDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxblIncmPerDvdd() {
        return taxblIncmPerDvdd;
    }

    /**
     * Sets the value of the taxblIncmPerDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxblIncmPerDvdd(ActiveCurrencyAndAmount value) {
        this.taxblIncmPerDvdd = value;
    }

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain3Choice }
     *     
     */
    public EUCapitalGain3Choice getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain3Choice }
     *     
     */
    public void setEUCptlGn(EUCapitalGain3Choice value) {
        this.euCptlGn = value;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatusType2Choice }
     *     
     */
    public EUDividendStatusType2Choice getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatusType2Choice }
     *     
     */
    public void setEUDvddSts(EUDividendStatusType2Choice value) {
        this.euDvddSts = value;
    }

    /**
     * Gets the value of the pctgOfDebtClm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClm() {
        return pctgOfDebtClm;
    }

    /**
     * Sets the value of the pctgOfDebtClm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfDebtClm(BigDecimal value) {
        this.pctgOfDebtClm = value;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax32 }
     * 
     * 
     * @return
     *     The value of the indvTax property.
     */
    public List<Tax32> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<>();
        }
        return this.indvTax;
    }

}
