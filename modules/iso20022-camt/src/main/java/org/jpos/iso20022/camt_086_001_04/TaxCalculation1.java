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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxCalculation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxCalculation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HstCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ActiveOrHistoricCurrencyCode"/>
 *         <element name="TaxblSvcChrgConvs" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServicesAmount3" maxOccurs="unbounded"/>
 *         <element name="TtlTaxblSvcChrgHstAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="TaxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServicesTax3" maxOccurs="3"/>
 *         <element name="TtlTax" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculation1", propOrder = {
    "hstCcy",
    "taxblSvcChrgConvs",
    "ttlTaxblSvcChrgHstAmt",
    "taxId",
    "ttlTax"
})
public class TaxCalculation1 {

    @XmlElement(name = "HstCcy", required = true)
    protected String hstCcy;
    @XmlElement(name = "TaxblSvcChrgConvs", required = true)
    protected List<BillingServicesAmount3> taxblSvcChrgConvs;
    @XmlElement(name = "TtlTaxblSvcChrgHstAmt", required = true)
    protected AmountAndDirection34 ttlTaxblSvcChrgHstAmt;
    @XmlElement(name = "TaxId", required = true)
    protected List<BillingServicesTax3> taxId;
    @XmlElement(name = "TtlTax", required = true)
    protected AmountAndDirection34 ttlTax;

    /**
     * Gets the value of the hstCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCcy() {
        return hstCcy;
    }

    /**
     * Sets the value of the hstCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstCcy(String value) {
        this.hstCcy = value;
    }

    /**
     * Gets the value of the taxblSvcChrgConvs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxblSvcChrgConvs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxblSvcChrgConvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServicesAmount3 }
     * 
     * 
     * @return
     *     The value of the taxblSvcChrgConvs property.
     */
    public List<BillingServicesAmount3> getTaxblSvcChrgConvs() {
        if (taxblSvcChrgConvs == null) {
            taxblSvcChrgConvs = new ArrayList<>();
        }
        return this.taxblSvcChrgConvs;
    }

    /**
     * Gets the value of the ttlTaxblSvcChrgHstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTtlTaxblSvcChrgHstAmt() {
        return ttlTaxblSvcChrgHstAmt;
    }

    /**
     * Sets the value of the ttlTaxblSvcChrgHstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setTtlTaxblSvcChrgHstAmt(AmountAndDirection34 value) {
        this.ttlTaxblSvcChrgHstAmt = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServicesTax3 }
     * 
     * 
     * @return
     *     The value of the taxId property.
     */
    public List<BillingServicesTax3> getTaxId() {
        if (taxId == null) {
            taxId = new ArrayList<>();
        }
        return this.taxId;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getTtlTax() {
        return ttlTax;
    }

    /**
     * Sets the value of the ttlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setTtlTax(AmountAndDirection34 value) {
        this.ttlTax = value;
    }

}
