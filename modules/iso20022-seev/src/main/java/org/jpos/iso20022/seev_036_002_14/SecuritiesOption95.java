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

package org.jpos.iso20022.seev_036_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOption95 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOption95">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SecurityIdentification20"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CreditDebitCode"/>
 *         <element name="TempFinInstrmInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}TemporaryFinancialInstrumentIndicator4Choice" minOccurs="0"/>
 *         <element name="NewSctiesIssncInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}NewSecuritiesIssuanceType6Code" minOccurs="0"/>
 *         <element name="IssrOfferrTaxbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}IssuerOfferorTaxabilityIndicator1Choice" minOccurs="0"/>
 *         <element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" minOccurs="0"/>
 *         <element name="OthrIncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XmptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtryOfIncmSrc" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CountryCode" minOccurs="0"/>
 *         <element name="PstngQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Quantity54Choice"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SafekeepingPlaceFormat39Choice" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}FractionDispositionType30Choice" minOccurs="0"/>
 *         <element name="CcyOptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SecurityDate22"/>
 *         <element name="RateDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionRate114" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionPrice78" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionAmounts61" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SettlementParties103" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SettlementParties103" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption95", propOrder = {
    "finInstrmId",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "newSctiesIssncInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "pstngQty",
    "sfkpgPlc",
    "frctnDspstn",
    "ccyOptn",
    "dtDtls",
    "rateDtls",
    "pricDtls",
    "amtDtls",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class SecuritiesOption95 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator4Choice tempFinInstrmInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType6Code newSctiesIssncInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification47 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification47> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification47> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity54Choice pstngQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat39Choice sfkpgPlc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType30Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate22 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate114 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice78 pricDtls;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts61 amtDtls;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties103 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties103 dlvrgSttlmPties;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
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
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType6Code }
     *     
     */
    public NewSecuritiesIssuanceType6Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType6Code }
     *     
     */
    public void setNewSctiesIssncInd(NewSecuritiesIssuanceType6Code value) {
        this.newSctiesIssncInd = value;
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
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setPstngQty(Quantity54Choice value) {
        this.pstngQty = value;
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
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public FractionDispositionType30Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType30Choice value) {
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
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate22 }
     *     
     */
    public SecurityDate22 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate22 }
     *     
     */
    public void setDtDtls(SecurityDate22 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate114 }
     *     
     */
    public CorporateActionRate114 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate114 }
     *     
     */
    public void setRateDtls(CorporateActionRate114 value) {
        this.rateDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice78 }
     *     
     */
    public CorporateActionPrice78 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice78 }
     *     
     */
    public void setPricDtls(CorporateActionPrice78 value) {
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

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties103 }
     *     
     */
    public SettlementParties103 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties103 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties103 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties103 }
     *     
     */
    public SettlementParties103 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties103 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties103 value) {
        this.dlvrgSttlmPties = value;
    }

}
