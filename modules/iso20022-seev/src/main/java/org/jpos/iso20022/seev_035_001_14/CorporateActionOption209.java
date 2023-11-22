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

package org.jpos.iso20022.seev_035_001_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption209 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption209">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}Exact3NumericText"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionOption37Choice"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}FractionDispositionType26Choice" minOccurs="0"/>
 *         <element name="OfferTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}OfferTypeFormat12Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}OptionFeaturesFormat24Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OptnAvlbtySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}OptionAvailabilityStatus3Choice" minOccurs="0"/>
 *         <element name="CertfctnBrkdwnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}BeneficiaryCertificationType9Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NonDmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VldDmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcyOptn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="DfltPrcgOrStgInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DefaultProcessingOrStandingInstruction1Choice"/>
 *         <element name="ChrgsApldInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertfctnBrkdwnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}YesNoIndicator" minOccurs="0"/>
 *         <element name="WdrwlAllwdInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}YesNoIndicator" minOccurs="0"/>
 *         <element name="ChngAllwdInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}YesNoIndicator" minOccurs="0"/>
 *         <element name="ApldOptnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}SecurityIdentification19" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionDate78" minOccurs="0"/>
 *         <element name="PrdDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionPeriod12" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionRate106" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionPrice68" minOccurs="0"/>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}SecuritiesOption81" minOccurs="0"/>
 *         <element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}SecuritiesOption92" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CashOption84" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionNarrative29" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption209", propOrder = {
    "optnNb",
    "optnTp",
    "frctnDspstn",
    "offerTp",
    "optnFeatrs",
    "optnAvlbtySts",
    "certfctnBrkdwnTp",
    "nonDmclCtry",
    "vldDmclCtry",
    "ccyOptn",
    "dfltPrcgOrStgInstr",
    "chrgsApldInd",
    "certfctnBrkdwnInd",
    "wdrwlAllwdInd",
    "chngAllwdInd",
    "apldOptnInd",
    "sctyId",
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "sctiesMvmntDtls",
    "cshMvmntDtls",
    "addtlInf"
})
public class CorporateActionOption209 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption37Choice optnTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType26Choice frctnDspstn;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat12Choice> offerTp;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeaturesFormat24Choice> optnFeatrs;
    @XmlElement(name = "OptnAvlbtySts")
    protected OptionAvailabilityStatus3Choice optnAvlbtySts;
    @XmlElement(name = "CertfctnBrkdwnTp")
    protected List<BeneficiaryCertificationType9Choice> certfctnBrkdwnTp;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "VldDmclCtry")
    protected List<String> vldDmclCtry;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DfltPrcgOrStgInstr", required = true)
    protected DefaultProcessingOrStandingInstruction1Choice dfltPrcgOrStgInstr;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "WdrwlAllwdInd")
    protected Boolean wdrwlAllwdInd;
    @XmlElement(name = "ChngAllwdInd")
    protected Boolean chngAllwdInd;
    @XmlElement(name = "ApldOptnInd")
    protected Boolean apldOptnInd;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate78 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod12 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate106 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice68 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected SecuritiesOption81 sctiesQty;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption92> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption84> cshMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative29 addtlInf;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption37Choice }
     *     
     */
    public CorporateActionOption37Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption37Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption37Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public FractionDispositionType26Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType26Choice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the offerTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTypeFormat12Choice }
     * 
     * 
     * @return
     *     The value of the offerTp property.
     */
    public List<OfferTypeFormat12Choice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionFeaturesFormat24Choice }
     * 
     * 
     * @return
     *     The value of the optnFeatrs property.
     */
    public List<OptionFeaturesFormat24Choice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the optnAvlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public OptionAvailabilityStatus3Choice getOptnAvlbtySts() {
        return optnAvlbtySts;
    }

    /**
     * Sets the value of the optnAvlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public void setOptnAvlbtySts(OptionAvailabilityStatus3Choice value) {
        this.optnAvlbtySts = value;
    }

    /**
     * Gets the value of the certfctnBrkdwnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryCertificationType9Choice }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwnTp property.
     */
    public List<BeneficiaryCertificationType9Choice> getCertfctnBrkdwnTp() {
        if (certfctnBrkdwnTp == null) {
            certfctnBrkdwnTp = new ArrayList<>();
        }
        return this.certfctnBrkdwnTp;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the nonDmclCtry property.
     */
    public List<String> getNonDmclCtry() {
        if (nonDmclCtry == null) {
            nonDmclCtry = new ArrayList<>();
        }
        return this.nonDmclCtry;
    }

    /**
     * Gets the value of the vldDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vldDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVldDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the vldDmclCtry property.
     */
    public List<String> getVldDmclCtry() {
        if (vldDmclCtry == null) {
            vldDmclCtry = new ArrayList<>();
        }
        return this.vldDmclCtry;
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
     * Gets the value of the dfltPrcgOrStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice getDfltPrcgOrStgInstr() {
        return dfltPrcgOrStgInstr;
    }

    /**
     * Sets the value of the dfltPrcgOrStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public void setDfltPrcgOrStgInstr(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltPrcgOrStgInstr = value;
    }

    /**
     * Gets the value of the chrgsApldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgsApldInd() {
        return chrgsApldInd;
    }

    /**
     * Sets the value of the chrgsApldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChrgsApldInd(Boolean value) {
        this.chrgsApldInd = value;
    }

    /**
     * Gets the value of the certfctnBrkdwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnBrkdwnInd() {
        return certfctnBrkdwnInd;
    }

    /**
     * Sets the value of the certfctnBrkdwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnBrkdwnInd(Boolean value) {
        this.certfctnBrkdwnInd = value;
    }

    /**
     * Gets the value of the wdrwlAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWdrwlAllwdInd() {
        return wdrwlAllwdInd;
    }

    /**
     * Sets the value of the wdrwlAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWdrwlAllwdInd(Boolean value) {
        this.wdrwlAllwdInd = value;
    }

    /**
     * Gets the value of the chngAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChngAllwdInd() {
        return chngAllwdInd;
    }

    /**
     * Sets the value of the chngAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChngAllwdInd(Boolean value) {
        this.chngAllwdInd = value;
    }

    /**
     * Gets the value of the apldOptnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldOptnInd() {
        return apldOptnInd;
    }

    /**
     * Sets the value of the apldOptnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApldOptnInd(Boolean value) {
        this.apldOptnInd = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setSctyId(SecurityIdentification19 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate78 }
     *     
     */
    public CorporateActionDate78 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate78 }
     *     
     */
    public void setDtDtls(CorporateActionDate78 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public CorporateActionPeriod12 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public void setPrdDtls(CorporateActionPeriod12 value) {
        this.prdDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate106 }
     *     
     */
    public CorporateActionRate106 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate106 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate106 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice68 }
     *     
     */
    public CorporateActionPrice68 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice68 }
     *     
     */
    public void setPricDtls(CorporateActionPrice68 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption81 }
     *     
     */
    public SecuritiesOption81 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption81 }
     *     
     */
    public void setSctiesQty(SecuritiesOption81 value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption92 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecuritiesOption92> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption84 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOption84> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative29 }
     *     
     */
    public CorporateActionNarrative29 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative29 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative29 value) {
        this.addtlInf = value;
    }

}
