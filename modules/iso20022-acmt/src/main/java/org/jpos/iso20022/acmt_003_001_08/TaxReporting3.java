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

package org.jpos.iso20022.acmt_003_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReporting3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxReporting3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CountryCode"/>
 *         <element name="TaxRate" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PercentageRate" minOccurs="0"/>
 *         <element name="TaxPyer" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="TaxRcpt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="CshAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CashAccount204" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReporting3", propOrder = {
    "taxtnCtry",
    "taxRate",
    "taxPyer",
    "taxRcpt",
    "cshAcctDtls",
    "desc"
})
public class TaxReporting3 {

    @XmlElement(name = "TaxtnCtry", required = true)
    protected String taxtnCtry;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxPyer")
    protected PartyIdentification125Choice taxPyer;
    @XmlElement(name = "TaxRcpt")
    protected PartyIdentification125Choice taxRcpt;
    @XmlElement(name = "CshAcctDtls")
    protected CashAccount204 cshAcctDtls;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnCtry(String value) {
        this.taxtnCtry = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxPyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getTaxPyer() {
        return taxPyer;
    }

    /**
     * Sets the value of the taxPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setTaxPyer(PartyIdentification125Choice value) {
        this.taxPyer = value;
    }

    /**
     * Gets the value of the taxRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getTaxRcpt() {
        return taxRcpt;
    }

    /**
     * Sets the value of the taxRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setTaxRcpt(PartyIdentification125Choice value) {
        this.taxRcpt = value;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount204 }
     *     
     */
    public CashAccount204 getCshAcctDtls() {
        return cshAcctDtls;
    }

    /**
     * Sets the value of the cshAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount204 }
     *     
     */
    public void setCshAcctDtls(CashAccount204 value) {
        this.cshAcctDtls = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
