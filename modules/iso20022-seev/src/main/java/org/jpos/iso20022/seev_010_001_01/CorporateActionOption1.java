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

package org.jpos.iso20022.seev_010_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Exact3NumericText"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionOption1FormatChoice"/>
 *         <element name="OptnAvlbtySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionEventStatus2FormatChoice"/>
 *         <element name="CertfctnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}BeneficiaryCertificationType1FormatChoice" minOccurs="0"/>
 *         <element name="AssntdLineSctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}SecurityIdentification7" minOccurs="0"/>
 *         <element name="AgtSctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AgtCshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}AccountIdentification2Choice" minOccurs="0"/>
 *         <element name="OfferTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}OfferType1FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrmdtSctiesDstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}IntermediateSecurityDistributionType1FormatChoice" minOccurs="0"/>
 *         <element name="WdrwlAllwdInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator"/>
 *         <element name="ChngAllwdInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionDate4" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionRate2" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionPrice1" minOccurs="0"/>
 *         <element name="PrdDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionPeriod2" minOccurs="0"/>
 *         <element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}SecurityOption1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CashOption1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnOthrAgtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionAgent1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}FractionDispositionType1FormatChoice" minOccurs="0"/>
 *         <element name="RedChrgsApldInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}OptionFeatures1FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpActnAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionNarrative1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption1", propOrder = {
    "optnNb",
    "optnTp",
    "optnAvlbtySts",
    "certfctnInd",
    "certfctnTp",
    "assntdLineSctyId",
    "agtSctiesAcctId",
    "agtCshAcctId",
    "offerTp",
    "intrmdtSctiesDstrbtnTp",
    "wdrwlAllwdInd",
    "chngAllwdInd",
    "dtDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "prdDtls",
    "sctiesMvmntDtls",
    "cshMvmntDtls",
    "corpActnOthrAgtDtls",
    "frctnDspstn",
    "redChrgsApldInd",
    "optnFeatrs",
    "corpActnAddtlInf"
})
public class CorporateActionOption1 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnAvlbtySts", required = true)
    protected CorporateActionEventStatus2FormatChoice optnAvlbtySts;
    @XmlElement(name = "CertfctnInd")
    protected Boolean certfctnInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "AssntdLineSctyId")
    protected SecurityIdentification7 assntdLineSctyId;
    @XmlElement(name = "AgtSctiesAcctId")
    protected String agtSctiesAcctId;
    @XmlElement(name = "AgtCshAcctId")
    protected AccountIdentification2Choice agtCshAcctId;
    @XmlElement(name = "OfferTp")
    protected List<OfferType1FormatChoice> offerTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecurityDistributionType1FormatChoice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "WdrwlAllwdInd")
    protected boolean wdrwlAllwdInd;
    @XmlElement(name = "ChngAllwdInd")
    protected boolean chngAllwdInd;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate4 dtDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate2 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice1 pricDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod2 prdDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecurityOption1> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption1> cshMvmntDtls;
    @XmlElement(name = "CorpActnOthrAgtDtls")
    protected List<CorporateActionAgent1> corpActnOthrAgtDtls;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType1FormatChoice frctnDspstn;
    @XmlElement(name = "RedChrgsApldInd")
    protected Boolean redChrgsApldInd;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeatures1FormatChoice> optnFeatrs;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionNarrative1 corpActnAddtlInf;

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
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnAvlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStatus2FormatChoice }
     *     
     */
    public CorporateActionEventStatus2FormatChoice getOptnAvlbtySts() {
        return optnAvlbtySts;
    }

    /**
     * Sets the value of the optnAvlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStatus2FormatChoice }
     *     
     */
    public void setOptnAvlbtySts(CorporateActionEventStatus2FormatChoice value) {
        this.optnAvlbtySts = value;
    }

    /**
     * Gets the value of the certfctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnInd(Boolean value) {
        this.certfctnInd = value;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public BeneficiaryCertificationType1FormatChoice getCertfctnTp() {
        return certfctnTp;
    }

    /**
     * Sets the value of the certfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationType1FormatChoice }
     *     
     */
    public void setCertfctnTp(BeneficiaryCertificationType1FormatChoice value) {
        this.certfctnTp = value;
    }

    /**
     * Gets the value of the assntdLineSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getAssntdLineSctyId() {
        return assntdLineSctyId;
    }

    /**
     * Sets the value of the assntdLineSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public void setAssntdLineSctyId(SecurityIdentification7 value) {
        this.assntdLineSctyId = value;
    }

    /**
     * Gets the value of the agtSctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtSctiesAcctId() {
        return agtSctiesAcctId;
    }

    /**
     * Sets the value of the agtSctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgtSctiesAcctId(String value) {
        this.agtSctiesAcctId = value;
    }

    /**
     * Gets the value of the agtCshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification2Choice }
     *     
     */
    public AccountIdentification2Choice getAgtCshAcctId() {
        return agtCshAcctId;
    }

    /**
     * Sets the value of the agtCshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification2Choice }
     *     
     */
    public void setAgtCshAcctId(AccountIdentification2Choice value) {
        this.agtCshAcctId = value;
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
     * {@link OfferType1FormatChoice }
     * 
     * 
     * @return
     *     The value of the offerTp property.
     */
    public List<OfferType1FormatChoice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecurityDistributionType1FormatChoice }
     *     
     */
    public IntermediateSecurityDistributionType1FormatChoice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecurityDistributionType1FormatChoice }
     *     
     */
    public void setIntrmdtSctiesDstrbtnTp(IntermediateSecurityDistributionType1FormatChoice value) {
        this.intrmdtSctiesDstrbtnTp = value;
    }

    /**
     * Gets the value of the wdrwlAllwdInd property.
     * 
     */
    public boolean isWdrwlAllwdInd() {
        return wdrwlAllwdInd;
    }

    /**
     * Sets the value of the wdrwlAllwdInd property.
     * 
     */
    public void setWdrwlAllwdInd(boolean value) {
        this.wdrwlAllwdInd = value;
    }

    /**
     * Gets the value of the chngAllwdInd property.
     * 
     */
    public boolean isChngAllwdInd() {
        return chngAllwdInd;
    }

    /**
     * Sets the value of the chngAllwdInd property.
     * 
     */
    public void setChngAllwdInd(boolean value) {
        this.chngAllwdInd = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate4 }
     *     
     */
    public CorporateActionDate4 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate4 }
     *     
     */
    public void setDtDtls(CorporateActionDate4 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate2 }
     *     
     */
    public CorporateActionRate2 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate2 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate2 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice1 }
     *     
     */
    public CorporateActionPrice1 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice1 }
     *     
     */
    public void setPricDtls(CorporateActionPrice1 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod2 }
     *     
     */
    public CorporateActionPeriod2 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod2 }
     *     
     */
    public void setPrdDtls(CorporateActionPeriod2 value) {
        this.prdDtls = value;
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
     * {@link SecurityOption1 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecurityOption1> getSctiesMvmntDtls() {
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
     * {@link CashOption1 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOption1> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the corpActnOthrAgtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnOthrAgtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOthrAgtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionAgent1 }
     * 
     * 
     * @return
     *     The value of the corpActnOthrAgtDtls property.
     */
    public List<CorporateActionAgent1> getCorpActnOthrAgtDtls() {
        if (corpActnOthrAgtDtls == null) {
            corpActnOthrAgtDtls = new ArrayList<>();
        }
        return this.corpActnOthrAgtDtls;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public FractionDispositionType1FormatChoice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType1FormatChoice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the redChrgsApldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedChrgsApldInd() {
        return redChrgsApldInd;
    }

    /**
     * Sets the value of the redChrgsApldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedChrgsApldInd(Boolean value) {
        this.redChrgsApldInd = value;
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
     * {@link OptionFeatures1FormatChoice }
     * 
     * 
     * @return
     *     The value of the optnFeatrs property.
     */
    public List<OptionFeatures1FormatChoice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the corpActnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative1 }
     *     
     */
    public CorporateActionNarrative1 getCorpActnAddtlInf() {
        return corpActnAddtlInf;
    }

    /**
     * Sets the value of the corpActnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative1 }
     *     
     */
    public void setCorpActnAddtlInf(CorporateActionNarrative1 value) {
        this.corpActnAddtlInf = value;
    }

}
