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

package org.jpos.iso20022.seev_035_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOption96 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOption96">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}FinancialInstrumentAttributes115"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}CreditDebitCode"/>
 *         <element name="TempFinInstrmInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}TemporaryFinancialInstrumentIndicator4Choice" minOccurs="0"/>
 *         <element name="NonElgblPrcdsInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}NonEligibleProceedsIndicator4Choice" minOccurs="0"/>
 *         <element name="IssrOfferrTaxbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}IssuerOfferorTaxabilityIndicator1Choice" minOccurs="0"/>
 *         <element name="NewSctiesIssncInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}NewSecuritiesIssuanceType5Code" minOccurs="0"/>
 *         <element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}GenericIdentification47" minOccurs="0"/>
 *         <element name="OthrIncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XmptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EntitldQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Quantity54Choice" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}SafekeepingPlaceFormat39Choice" minOccurs="0"/>
 *         <element name="CtryOfIncmSrc" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}CountryCode" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}FractionDispositionType31Choice" minOccurs="0"/>
 *         <element name="CcyOptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="TradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}SecurityDate23"/>
 *         <element name="RateDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}CorporateActionRate115" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}CorporateActionPrice79" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}CorporateActionAmounts61" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption96", propOrder = {
    "sctyDtls",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "newSctiesIssncInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "entitldQty",
    "sfkpgPlc",
    "ctryOfIncmSrc",
    "frctnDspstn",
    "ccyOptn",
    "tradgPrd",
    "dtDtls",
    "rateDtls",
    "pricDtls",
    "amtDtls"
})
public class SecuritiesOption96 {

    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrumentAttributes115 sctyDtls;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator4Choice tempFinInstrmInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator4Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType5Code newSctiesIssncInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification47 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification47> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification47> xmptnTp;
    @XmlElement(name = "EntitldQty")
    protected Quantity54Choice entitldQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat39Choice sfkpgPlc;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType31Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "TradgPrd")
    protected Period6Choice tradgPrd;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate23 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate115 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice79 pricDtls;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts61 amtDtls;

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes115 }
     *     
     */
    public FinancialInstrumentAttributes115 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes115 }
     *     
     */
    public void setSctyDtls(FinancialInstrumentAttributes115 value) {
        this.sctyDtls = value;
    }

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
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator4Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator4Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator4Choice }
     *     
     */
    public void setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator4Choice value) {
        this.tempFinInstrmInd = value;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator4Choice }
     *     
     */
    public NonEligibleProceedsIndicator4Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator4Choice }
     *     
     */
    public void setNonElgblPrcdsInd(NonEligibleProceedsIndicator4Choice value) {
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
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType5Code }
     *     
     */
    public NewSecuritiesIssuanceType5Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType5Code }
     *     
     */
    public void setNewSctiesIssncInd(NewSecuritiesIssuanceType5Code value) {
        this.newSctiesIssncInd = value;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setIncmTp(GenericIdentification47 value) {
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
     * {@link GenericIdentification47 }
     * 
     * 
     * @return
     *     The value of the othrIncmTp property.
     */
    public List<GenericIdentification47> getOthrIncmTp() {
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
     * {@link GenericIdentification47 }
     * 
     * 
     * @return
     *     The value of the xmptnTp property.
     */
    public List<GenericIdentification47> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setEntitldQty(Quantity54Choice value) {
        this.entitldQty = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat39Choice }
     *     
     */
    public SafekeepingPlaceFormat39Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat39Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat39Choice value) {
        this.sfkpgPlc = value;
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
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType31Choice }
     *     
     */
    public FractionDispositionType31Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType31Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType31Choice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyOptn(String value) {
        this.ccyOptn = value;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setTradgPrd(Period6Choice value) {
        this.tradgPrd = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate23 }
     *     
     */
    public SecurityDate23 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate23 }
     *     
     */
    public void setDtDtls(SecurityDate23 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate115 }
     *     
     */
    public CorporateActionRate115 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate115 }
     *     
     */
    public void setRateDtls(CorporateActionRate115 value) {
        this.rateDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice79 }
     *     
     */
    public CorporateActionPrice79 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice79 }
     *     
     */
    public void setPricDtls(CorporateActionPrice79 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts61 }
     *     
     */
    public CorporateActionAmounts61 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts61 }
     *     
     */
    public void setAmtDtls(CorporateActionAmounts61 value) {
        this.amtDtls = value;
    }

}
