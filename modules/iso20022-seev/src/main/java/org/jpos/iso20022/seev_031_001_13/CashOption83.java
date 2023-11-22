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

package org.jpos.iso20022.seev_031_001_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashOption83 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashOption83">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CreditDebitCode"/>
 *         <element name="CtrctlPmtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Payment2Code" minOccurs="0"/>
 *         <element name="NonElgblPrcdsInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}NonEligibleProceedsIndicator3Choice" minOccurs="0"/>
 *         <element name="IssrOfferrTaxbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}IssuerOfferorTaxabilityIndicator1Choice" minOccurs="0"/>
 *         <element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}GenericIdentification30" minOccurs="0"/>
 *         <element name="OthrIncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XmptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtryOfIncmSrc" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CountryCode" minOccurs="0"/>
 *         <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionAmounts54" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionDate84"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ForeignExchangeTerms24" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Rate36" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceDetails31" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption83", propOrder = {
    "cdtDbtInd",
    "ctrctlPmtInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "cshAcctId",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption83 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment2Code ctrctlPmtInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator3Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification30 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification30> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification30> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification5Choice cshAcctId;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts54 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate84 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms24 fxDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected Rate36 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails31 pricDtls;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the ctrctlPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Payment2Code }
     *     
     */
    public Payment2Code getCtrctlPmtInd() {
        return ctrctlPmtInd;
    }

    /**
     * Sets the value of the ctrctlPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment2Code }
     *     
     */
    public void setCtrctlPmtInd(Payment2Code value) {
        this.ctrctlPmtInd = value;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator3Choice }
     *     
     */
    public NonEligibleProceedsIndicator3Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator3Choice }
     *     
     */
    public void setNonElgblPrcdsInd(NonEligibleProceedsIndicator3Choice value) {
        this.nonElgblPrcdsInd = value;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public IssuerOfferorTaxabilityIndicator1Choice getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public void setIssrOfferrTaxbltyInd(IssuerOfferorTaxabilityIndicator1Choice value) {
        this.issrOfferrTaxbltyInd = value;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setIncmTp(GenericIdentification30 value) {
        this.incmTp = value;
    }

    /**
     * Gets the value of the othrIncmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrIncmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIncmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the othrIncmTp property.
     */
    public List<GenericIdentification30> getOthrIncmTp() {
        if (othrIncmTp == null) {
            othrIncmTp = new ArrayList<>();
        }
        return this.othrIncmTp;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xmptnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the xmptnTp property.
     */
    public List<GenericIdentification30> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the ctryOfIncmSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncmSrc() {
        return ctryOfIncmSrc;
    }

    /**
     * Sets the value of the ctryOfIncmSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcctId(CashAccountIdentification5Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts54 }
     *     
     */
    public CorporateActionAmounts54 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts54 }
     *     
     */
    public void setAmtDtls(CorporateActionAmounts54 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate84 }
     *     
     */
    public CorporateActionDate84 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate84 }
     *     
     */
    public void setDtDtls(CorporateActionDate84 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms24 }
     *     
     */
    public ForeignExchangeTerms24 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms24 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms24 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Rate36 }
     *     
     */
    public Rate36 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate36 }
     *     
     */
    public void setRateAndAmtDtls(Rate36 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails31 }
     *     
     */
    public PriceDetails31 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails31 }
     *     
     */
    public void setPricDtls(PriceDetails31 value) {
        this.pricDtls = value;
    }

}
