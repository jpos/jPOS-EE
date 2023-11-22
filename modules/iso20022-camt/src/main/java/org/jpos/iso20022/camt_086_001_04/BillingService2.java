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
 * <p>Java class for BillingService2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingService2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcDtl" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceParameters3"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingPrice1" minOccurs="0"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ServicePaymentMethod1Code"/>
 *         <element name="OrgnlChrgPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="OrgnlChrgSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="BalReqrdAcctAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="TaxDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ServiceTaxDesignation1"/>
 *         <element name="TaxClctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingMethod1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingService2", propOrder = {
    "svcDtl",
    "pric",
    "pmtMtd",
    "orgnlChrgPric",
    "orgnlChrgSttlmAmt",
    "balReqrdAcctAmt",
    "taxDsgnt",
    "taxClctn"
})
public class BillingService2 {

    @XmlElement(name = "SvcDtl", required = true)
    protected BillingServiceParameters3 svcDtl;
    @XmlElement(name = "Pric")
    protected BillingPrice1 pric;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ServicePaymentMethod1Code pmtMtd;
    @XmlElement(name = "OrgnlChrgPric", required = true)
    protected AmountAndDirection34 orgnlChrgPric;
    @XmlElement(name = "OrgnlChrgSttlmAmt")
    protected AmountAndDirection34 orgnlChrgSttlmAmt;
    @XmlElement(name = "BalReqrdAcctAmt")
    protected AmountAndDirection34 balReqrdAcctAmt;
    @XmlElement(name = "TaxDsgnt", required = true)
    protected ServiceTaxDesignation1 taxDsgnt;
    @XmlElement(name = "TaxClctn")
    protected BillingMethod1Choice taxClctn;

    /**
     * Gets the value of the svcDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceParameters3 }
     *     
     */
    public BillingServiceParameters3 getSvcDtl() {
        return svcDtl;
    }

    /**
     * Sets the value of the svcDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceParameters3 }
     *     
     */
    public void setSvcDtl(BillingServiceParameters3 value) {
        this.svcDtl = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPrice1 }
     *     
     */
    public BillingPrice1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPrice1 }
     *     
     */
    public void setPric(BillingPrice1 value) {
        this.pric = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePaymentMethod1Code }
     *     
     */
    public ServicePaymentMethod1Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePaymentMethod1Code }
     *     
     */
    public void setPmtMtd(ServicePaymentMethod1Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the orgnlChrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgPric() {
        return orgnlChrgPric;
    }

    /**
     * Sets the value of the orgnlChrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setOrgnlChrgPric(AmountAndDirection34 value) {
        this.orgnlChrgPric = value;
    }

    /**
     * Gets the value of the orgnlChrgSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgSttlmAmt() {
        return orgnlChrgSttlmAmt;
    }

    /**
     * Sets the value of the orgnlChrgSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setOrgnlChrgSttlmAmt(AmountAndDirection34 value) {
        this.orgnlChrgSttlmAmt = value;
    }

    /**
     * Gets the value of the balReqrdAcctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalReqrdAcctAmt() {
        return balReqrdAcctAmt;
    }

    /**
     * Sets the value of the balReqrdAcctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setBalReqrdAcctAmt(AmountAndDirection34 value) {
        this.balReqrdAcctAmt = value;
    }

    /**
     * Gets the value of the taxDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaxDesignation1 }
     *     
     */
    public ServiceTaxDesignation1 getTaxDsgnt() {
        return taxDsgnt;
    }

    /**
     * Sets the value of the taxDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaxDesignation1 }
     *     
     */
    public void setTaxDsgnt(ServiceTaxDesignation1 value) {
        this.taxDsgnt = value;
    }

    /**
     * Gets the value of the taxClctn property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod1Choice }
     *     
     */
    public BillingMethod1Choice getTaxClctn() {
        return taxClctn;
    }

    /**
     * Sets the value of the taxClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod1Choice }
     *     
     */
    public void setTaxClctn(BillingMethod1Choice value) {
        this.taxClctn = value;
    }

}
