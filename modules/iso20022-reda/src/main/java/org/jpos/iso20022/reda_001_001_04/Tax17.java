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

package org.jpos.iso20022.reda_001_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Tax17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Tp" type="{urn:swift:xsd:reda.001.001.04}TaxType12Code"/>
 *           <element name="XtndedTp" type="{urn:swift:xsd:reda.001.001.04}Extended350Code"/>
 *         </choice>
 *         <element name="Amt" type="{urn:swift:xsd:reda.001.001.04}ActiveOrHistoricCurrencyAnd13DecimalAmount" maxOccurs="7" minOccurs="0"/>
 *         <element name="Rate" type="{urn:swift:xsd:reda.001.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:swift:xsd:reda.001.001.04}CountryCode"/>
 *         <element name="TaxClctnDtls" type="{urn:swift:xsd:reda.001.001.04}TaxCalculationInformation4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax17", propOrder = {
    "tp",
    "xtndedTp",
    "amt",
    "rate",
    "ctry",
    "taxClctnDtls"
})
public class Tax17 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TaxType12Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Amt")
    protected List<ActiveOrHistoricCurrencyAnd13DecimalAmount> amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation4 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType12Code }
     *     
     */
    public TaxType12Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType12Code }
     *     
     */
    public void setTp(TaxType12Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedTp(String value) {
        this.xtndedTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * 
     * @return
     *     The value of the amt property.
     */
    public List<ActiveOrHistoricCurrencyAnd13DecimalAmount> getAmt() {
        if (amt == null) {
            amt = new ArrayList<>();
        }
        return this.amt;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation4 }
     *     
     */
    public TaxCalculationInformation4 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation4 }
     *     
     */
    public void setTaxClctnDtls(TaxCalculationInformation4 value) {
        this.taxClctnDtls = value;
    }

}
