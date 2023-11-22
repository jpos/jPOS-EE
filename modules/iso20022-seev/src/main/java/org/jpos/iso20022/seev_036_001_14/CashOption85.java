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

package org.jpos.iso20022.seev_036_001_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashOption85 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashOption85">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CreditDebitCode"/>
 *         <element name="CtrctlPmtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Payment1Code" minOccurs="0"/>
 *         <element name="IssrOfferrTaxbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}IssuerOfferorTaxabilityIndicator1Choice" minOccurs="0"/>
 *         <element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}GenericIdentification30" minOccurs="0"/>
 *         <element name="OthrIncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XmptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtryOfIncmSrc" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CountryCode" minOccurs="0"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Account8Choice" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CashParties34" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionAmounts56"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}CorporateActionDate87"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ForeignExchangeTerms23" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxVchrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}TaxVoucher4" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}Rate35" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PriceDetails32" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption85", propOrder = {
    "cdtDbtInd",
    "ctrctlPmtInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "acct",
    "cshPties",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "taxVchrDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption85 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment1Code ctrctlPmtInd;
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
    @XmlElement(name = "Acct")
    protected Account8Choice acct;
    @XmlElement(name = "CshPties")
    protected CashParties34 cshPties;
    @XmlElement(name = "AmtDtls", required = true)
    protected CorporateActionAmounts56 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate87 dtDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms23> fxDtls;
    @XmlElement(name = "TaxVchrDtls")
    protected TaxVoucher4 taxVchrDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected Rate35 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails32 pricDtls;

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
     *     {@link Payment1Code }
     *     
     */
    public Payment1Code getCtrctlPmtInd() {
        return ctrctlPmtInd;
    }

    /**
     * Sets the value of the ctrctlPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment1Code }
     *     
     */
    public void setCtrctlPmtInd(Payment1Code value) {
        this.ctrctlPmtInd = value;
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
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account8Choice }
     *     
     */
    public Account8Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account8Choice }
     *     
     */
    public void setAcct(Account8Choice value) {
        this.acct = value;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties34 }
     *     
     */
    public CashParties34 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties34 }
     *     
     */
    public void setCshPties(CashParties34 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts56 }
     *     
     */
    public CorporateActionAmounts56 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts56 }
     *     
     */
    public void setAmtDtls(CorporateActionAmounts56 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate87 }
     *     
     */
    public CorporateActionDate87 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate87 }
     *     
     */
    public void setDtDtls(CorporateActionDate87 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms23 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms23> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the taxVchrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher4 }
     *     
     */
    public TaxVoucher4 getTaxVchrDtls() {
        return taxVchrDtls;
    }

    /**
     * Sets the value of the taxVchrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher4 }
     *     
     */
    public void setTaxVchrDtls(TaxVoucher4 value) {
        this.taxVchrDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Rate35 }
     *     
     */
    public Rate35 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate35 }
     *     
     */
    public void setRateAndAmtDtls(Rate35 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails32 }
     *     
     */
    public PriceDetails32 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails32 }
     *     
     */
    public void setPricDtls(PriceDetails32 value) {
        this.pricDtls = value;
    }

}
