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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction68 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateAction68">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionDate83" minOccurs="0"/>
 *         <element name="PrdDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionPeriod15" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionRate105" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionPrice72" minOccurs="0"/>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionQuantity11" minOccurs="0"/>
 *         <element name="IntrstAcrdNbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Max3Number" minOccurs="0"/>
 *         <element name="CpnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}IdentificationFormat3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CertfctnBrkdwnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="ChrgsApldInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="RstrctnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="AcrdIntrstInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="LttrOfGrntedDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="ShrhldrRghtsDrctvInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator" minOccurs="0"/>
 *         <element name="DvddTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DividendTypeFormat9Choice" minOccurs="0"/>
 *         <element name="EvtSeqTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}EventSequenceTypeFormat1Choice" minOccurs="0"/>
 *         <element name="OcrncTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DistributionTypeFormat7Choice" minOccurs="0"/>
 *         <element name="OfferTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}OfferTypeFormat12Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RnncblEntitlmntStsTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RenounceableEntitlementStatusTypeFormat3Choice" minOccurs="0"/>
 *         <element name="EvtStag" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionEventStageFormat13Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBizPrcInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}AdditionalBusinessProcessFormat17Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChngTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionChangeTypeFormat5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrmdtSctiesDstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}IntermediateSecuritiesDistributionTypeFormat15Choice" minOccurs="0"/>
 *         <element name="CptlGnInOutInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CapitalGainFormat3Choice" minOccurs="0"/>
 *         <element name="TaxblIncmPerShrClctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}TaxableIncomePerShareCalculatedFormat3Choice" minOccurs="0"/>
 *         <element name="ElctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ElectionTypeFormat3Choice" minOccurs="0"/>
 *         <element name="LtryTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}LotteryTypeFormat4Choice" minOccurs="0"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CertificationTypeFormat3Choice" minOccurs="0"/>
 *         <element name="CnsntTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ConsentTypeFormat4Choice" minOccurs="0"/>
 *         <element name="InfTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}InformationTypeFormat4Choice" minOccurs="0"/>
 *         <element name="TaxOnNonDstrbtdPrcdsInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}GenericIdentification30" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NewPlcOfIncorprtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Max350Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionNarrative50" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction68", propOrder = {
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "intrstAcrdNbOfDays",
    "cpnNb",
    "certfctnBrkdwnInd",
    "chrgsApldInd",
    "rstrctnInd",
    "acrdIntrstInd",
    "lttrOfGrntedDlvryInd",
    "shrhldrRghtsDrctvInd",
    "dvddTp",
    "evtSeqTp",
    "ocrncTp",
    "offerTp",
    "rnncblEntitlmntStsTp",
    "evtStag",
    "addtlBizPrcInd",
    "chngTp",
    "intrmdtSctiesDstrbtnTp",
    "cptlGnInOutInd",
    "taxblIncmPerShrClctd",
    "elctnTp",
    "ltryTp",
    "certfctnTp",
    "cnsntTp",
    "infTp",
    "taxOnNonDstrbtdPrcdsInd",
    "newPlcOfIncorprtn",
    "addtlInf"
})
public class CorporateAction68 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate83 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod15 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate105 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice72 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity11 sctiesQty;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "CpnNb")
    protected List<IdentificationFormat3Choice> cpnNb;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "LttrOfGrntedDlvryInd")
    protected Boolean lttrOfGrntedDlvryInd;
    @XmlElement(name = "ShrhldrRghtsDrctvInd")
    protected Boolean shrhldrRghtsDrctvInd;
    @XmlElement(name = "DvddTp")
    protected DividendTypeFormat9Choice dvddTp;
    @XmlElement(name = "EvtSeqTp")
    protected EventSequenceTypeFormat1Choice evtSeqTp;
    @XmlElement(name = "OcrncTp")
    protected DistributionTypeFormat7Choice ocrncTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat12Choice> offerTp;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat3Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStageFormat13Choice> evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat17Choice> addtlBizPrcInd;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat5Choice> chngTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat15Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CptlGnInOutInd")
    protected CapitalGainFormat3Choice cptlGnInOutInd;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculatedFormat3Choice taxblIncmPerShrClctd;
    @XmlElement(name = "ElctnTp")
    protected ElectionTypeFormat3Choice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;
    @XmlElement(name = "CertfctnTp")
    protected CertificationTypeFormat3Choice certfctnTp;
    @XmlElement(name = "CnsntTp")
    protected ConsentTypeFormat4Choice cnsntTp;
    @XmlElement(name = "InfTp")
    protected InformationTypeFormat4Choice infTp;
    @XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
    protected List<GenericIdentification30> taxOnNonDstrbtdPrcdsInd;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative50 addtlInf;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate83 }
     *     
     */
    public CorporateActionDate83 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate83 }
     *     
     */
    public void setDtDtls(CorporateActionDate83 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod15 }
     *     
     */
    public CorporateActionPeriod15 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod15 }
     *     
     */
    public void setPrdDtls(CorporateActionPeriod15 value) {
        this.prdDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate105 }
     *     
     */
    public CorporateActionRate105 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate105 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate105 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice72 }
     *     
     */
    public CorporateActionPrice72 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice72 }
     *     
     */
    public void setPricDtls(CorporateActionPrice72 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity11 }
     *     
     */
    public CorporateActionQuantity11 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity11 }
     *     
     */
    public void setSctiesQty(CorporateActionQuantity11 value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the intrstAcrdNbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstAcrdNbOfDays() {
        return intrstAcrdNbOfDays;
    }

    /**
     * Sets the value of the intrstAcrdNbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstAcrdNbOfDays(BigDecimal value) {
        this.intrstAcrdNbOfDays = value;
    }

    /**
     * Gets the value of the cpnNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cpnNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpnNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationFormat3Choice }
     * 
     * 
     * @return
     *     The value of the cpnNb property.
     */
    public List<IdentificationFormat3Choice> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<>();
        }
        return this.cpnNb;
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
     * Gets the value of the rstrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctnInd() {
        return rstrctnInd;
    }

    /**
     * Sets the value of the rstrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRstrctnInd(Boolean value) {
        this.rstrctnInd = value;
    }

    /**
     * Gets the value of the acrdIntrstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstInd() {
        return acrdIntrstInd;
    }

    /**
     * Sets the value of the acrdIntrstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
    }

    /**
     * Gets the value of the lttrOfGrntedDlvryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLttrOfGrntedDlvryInd() {
        return lttrOfGrntedDlvryInd;
    }

    /**
     * Sets the value of the lttrOfGrntedDlvryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLttrOfGrntedDlvryInd(Boolean value) {
        this.lttrOfGrntedDlvryInd = value;
    }

    /**
     * Gets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrhldrRghtsDrctvInd() {
        return shrhldrRghtsDrctvInd;
    }

    /**
     * Sets the value of the shrhldrRghtsDrctvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrhldrRghtsDrctvInd(Boolean value) {
        this.shrhldrRghtsDrctvInd = value;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link DividendTypeFormat9Choice }
     *     
     */
    public DividendTypeFormat9Choice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendTypeFormat9Choice }
     *     
     */
    public void setDvddTp(DividendTypeFormat9Choice value) {
        this.dvddTp = value;
    }

    /**
     * Gets the value of the evtSeqTp property.
     * 
     * @return
     *     possible object is
     *     {@link EventSequenceTypeFormat1Choice }
     *     
     */
    public EventSequenceTypeFormat1Choice getEvtSeqTp() {
        return evtSeqTp;
    }

    /**
     * Sets the value of the evtSeqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSequenceTypeFormat1Choice }
     *     
     */
    public void setEvtSeqTp(EventSequenceTypeFormat1Choice value) {
        this.evtSeqTp = value;
    }

    /**
     * Gets the value of the ocrncTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeFormat7Choice }
     *     
     */
    public DistributionTypeFormat7Choice getOcrncTp() {
        return ocrncTp;
    }

    /**
     * Sets the value of the ocrncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeFormat7Choice }
     *     
     */
    public void setOcrncTp(DistributionTypeFormat7Choice value) {
        this.ocrncTp = value;
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
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat3Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public void setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat3Choice value) {
        this.rnncblEntitlmntStsTp = value;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtStag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtStag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventStageFormat13Choice }
     * 
     * 
     * @return
     *     The value of the evtStag property.
     */
    public List<CorporateActionEventStageFormat13Choice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<>();
        }
        return this.evtStag;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBizPrcInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBizPrcInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBusinessProcessFormat17Choice }
     * 
     * 
     * @return
     *     The value of the addtlBizPrcInd property.
     */
    public List<AdditionalBusinessProcessFormat17Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chngTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChngTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionChangeTypeFormat5Choice }
     * 
     * 
     * @return
     *     The value of the chngTp property.
     */
    public List<CorporateActionChangeTypeFormat5Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat15Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public void setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat15Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
    }

    /**
     * Gets the value of the cptlGnInOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalGainFormat3Choice }
     *     
     */
    public CapitalGainFormat3Choice getCptlGnInOutInd() {
        return cptlGnInOutInd;
    }

    /**
     * Sets the value of the cptlGnInOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalGainFormat3Choice }
     *     
     */
    public void setCptlGnInOutInd(CapitalGainFormat3Choice value) {
        this.cptlGnInOutInd = value;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculatedFormat3Choice }
     *     
     */
    public TaxableIncomePerShareCalculatedFormat3Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculatedFormat3Choice }
     *     
     */
    public void setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculatedFormat3Choice value) {
        this.taxblIncmPerShrClctd = value;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionTypeFormat3Choice }
     *     
     */
    public ElectionTypeFormat3Choice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionTypeFormat3Choice }
     *     
     */
    public void setElctnTp(ElectionTypeFormat3Choice value) {
        this.elctnTp = value;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public LotteryTypeFormat4Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public void setLtryTp(LotteryTypeFormat4Choice value) {
        this.ltryTp = value;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationTypeFormat3Choice }
     *     
     */
    public CertificationTypeFormat3Choice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationTypeFormat3Choice }
     *     
     */
    public void setCertfctnTp(CertificationTypeFormat3Choice value) {
        this.certfctnTp = value;
    }

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentTypeFormat4Choice }
     *     
     */
    public ConsentTypeFormat4Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentTypeFormat4Choice }
     *     
     */
    public void setCnsntTp(ConsentTypeFormat4Choice value) {
        this.cnsntTp = value;
    }

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeFormat4Choice }
     *     
     */
    public InformationTypeFormat4Choice getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeFormat4Choice }
     *     
     */
    public void setInfTp(InformationTypeFormat4Choice value) {
        this.infTp = value;
    }

    /**
     * Gets the value of the taxOnNonDstrbtdPrcdsInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxOnNonDstrbtdPrcdsInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxOnNonDstrbtdPrcdsInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the taxOnNonDstrbtdPrcdsInd property.
     */
    public List<GenericIdentification30> getTaxOnNonDstrbtdPrcdsInd() {
        if (taxOnNonDstrbtdPrcdsInd == null) {
            taxOnNonDstrbtdPrcdsInd = new ArrayList<>();
        }
        return this.taxOnNonDstrbtdPrcdsInd;
    }

    /**
     * Gets the value of the newPlcOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPlcOfIncorprtn() {
        return newPlcOfIncorprtn;
    }

    /**
     * Sets the value of the newPlcOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPlcOfIncorprtn(String value) {
        this.newPlcOfIncorprtn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative50 }
     *     
     */
    public CorporateActionNarrative50 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative50 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative50 value) {
        this.addtlInf = value;
    }

}
