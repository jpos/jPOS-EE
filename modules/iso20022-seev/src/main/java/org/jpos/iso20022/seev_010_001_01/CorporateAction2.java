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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateAction2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtStag" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionEventStage1FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DfltOptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionOption1FormatChoice" minOccurs="0"/>
 *         <element name="DfltOptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Exact3NumericText" minOccurs="0"/>
 *         <element name="ClctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionCalculationMethod1FormatChoice" minOccurs="0"/>
 *         <element name="BckEndOddLotSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmountOrCode1Choice" minOccurs="0"/>
 *         <element name="FrntEndOddLotSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmountOrCode1Choice" minOccurs="0"/>
 *         <element name="MinExrcblSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="MinExrcblMltplSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="IncrmtlDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="NewDnmtnSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="NewBrdLotSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="SctiesQtySght" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmountOrCode1Choice" minOccurs="0"/>
 *         <element name="BaseDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="ChngTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionChangeType1FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OfferTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}OfferType1FormatChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RstrctnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrtlElctnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ElctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ElectionMovementType1FormatChoice" minOccurs="0"/>
 *         <element name="LtryTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}LotteryType1FormatChoice" minOccurs="0"/>
 *         <element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}GenericIdentification13" minOccurs="0"/>
 *         <element name="DvddTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionFrequencyType1FormatChoice" minOccurs="0"/>
 *         <element name="IntrmdtSctiesDstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}IntermediateSecurityDistributionType1FormatChoice" minOccurs="0"/>
 *         <element name="CpnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max3NumericText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstAcrdNbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Number" minOccurs="0"/>
 *         <element name="NewDnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionDate2" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionPrice2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrdDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionPeriod1" minOccurs="0"/>
 *         <element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionRate1" minOccurs="0"/>
 *         <element name="CorpActnAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionNarrative1" minOccurs="0"/>
 *         <element name="CertfctnReqrdInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}BeneficiaryCertificationType1FormatChoice" minOccurs="0"/>
 *         <element name="CptlGn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}EUCapitalGain2Code" minOccurs="0"/>
 *         <element name="TaxblIncmPerShrClctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}TaxableIncomePerShareCalculated2Code" minOccurs="0"/>
 *         <element name="NewPlcOfIncorprtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max70Text" minOccurs="0"/>
 *         <element name="RnncblEntitlmntStsTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}RenounceableStatus1FormatChoice" minOccurs="0"/>
 *         <element name="ConvsTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}ConversionType1FormatChoice" minOccurs="0"/>
 *         <element name="RedChrgsApldInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="DstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DistributionType1FormatChoice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction2", propOrder = {
    "evtStag",
    "dfltOptnTp",
    "dfltOptnNb",
    "clctnMtd",
    "bckEndOddLotSctiesQty",
    "frntEndOddLotSctiesQty",
    "minExrcblSctiesQty",
    "minExrcblMltplSctiesQty",
    "incrmtlDnmtn",
    "newDnmtnSctiesQty",
    "newBrdLotSctiesQty",
    "sctiesQtySght",
    "baseDnmtn",
    "chngTp",
    "offerTp",
    "rstrctnInd",
    "prtlElctnInd",
    "elctnTp",
    "ltryTp",
    "incmTp",
    "dvddTp",
    "intrmdtSctiesDstrbtnTp",
    "cpnNb",
    "intrstAcrdNbOfDays",
    "newDnmtnCcy",
    "dtDtls",
    "pricDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "corpActnAddtlInf",
    "certfctnReqrdInd",
    "certfctnTp",
    "cptlGn",
    "taxblIncmPerShrClctd",
    "newPlcOfIncorprtn",
    "rnncblEntitlmntStsTp",
    "convsTp",
    "redChrgsApldInd",
    "dstrbtnTp"
})
public class CorporateAction2 {

    @XmlElement(name = "EvtStag")
    protected List<CorporateActionEventStage1FormatChoice> evtStag;
    @XmlElement(name = "DfltOptnTp")
    protected CorporateActionOption1FormatChoice dfltOptnTp;
    @XmlElement(name = "DfltOptnNb")
    protected String dfltOptnNb;
    @XmlElement(name = "ClctnMtd")
    protected CorporateActionCalculationMethod1FormatChoice clctnMtd;
    @XmlElement(name = "BckEndOddLotSctiesQty")
    protected UnitOrFaceAmountOrCode1Choice bckEndOddLotSctiesQty;
    @XmlElement(name = "FrntEndOddLotSctiesQty")
    protected UnitOrFaceAmountOrCode1Choice frntEndOddLotSctiesQty;
    @XmlElement(name = "MinExrcblSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblSctiesQty;
    @XmlElement(name = "MinExrcblMltplSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblMltplSctiesQty;
    @XmlElement(name = "IncrmtlDnmtn")
    protected UnitOrFaceAmount1Choice incrmtlDnmtn;
    @XmlElement(name = "NewDnmtnSctiesQty")
    protected UnitOrFaceAmount1Choice newDnmtnSctiesQty;
    @XmlElement(name = "NewBrdLotSctiesQty")
    protected UnitOrFaceAmount1Choice newBrdLotSctiesQty;
    @XmlElement(name = "SctiesQtySght")
    protected UnitOrFaceAmountOrCode1Choice sctiesQtySght;
    @XmlElement(name = "BaseDnmtn")
    protected UnitOrFaceAmount1Choice baseDnmtn;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeType1FormatChoice> chngTp;
    @XmlElement(name = "OfferTp")
    protected List<OfferType1FormatChoice> offerTp;
    @XmlElement(name = "RstrctnInd")
    protected Boolean rstrctnInd;
    @XmlElement(name = "PrtlElctnInd")
    protected Boolean prtlElctnInd;
    @XmlElement(name = "ElctnTp")
    protected ElectionMovementType1FormatChoice elctnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryType1FormatChoice ltryTp;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification13 incmTp;
    @XmlElement(name = "DvddTp")
    protected CorporateActionFrequencyType1FormatChoice dvddTp;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecurityDistributionType1FormatChoice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "CpnNb")
    protected List<String> cpnNb;
    @XmlElement(name = "IntrstAcrdNbOfDays")
    protected BigDecimal intrstAcrdNbOfDays;
    @XmlElement(name = "NewDnmtnCcy")
    protected String newDnmtnCcy;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate2 dtDtls;
    @XmlElement(name = "PricDtls")
    protected List<CorporateActionPrice2> pricDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod1 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate1 rateAndAmtDtls;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionNarrative1 corpActnAddtlInf;
    @XmlElement(name = "CertfctnReqrdInd")
    protected Boolean certfctnReqrdInd;
    @XmlElement(name = "CertfctnTp")
    protected BeneficiaryCertificationType1FormatChoice certfctnTp;
    @XmlElement(name = "CptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code cptlGn;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "NewPlcOfIncorprtn")
    protected String newPlcOfIncorprtn;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableStatus1FormatChoice rnncblEntitlmntStsTp;
    @XmlElement(name = "ConvsTp")
    protected ConversionType1FormatChoice convsTp;
    @XmlElement(name = "RedChrgsApldInd")
    protected Boolean redChrgsApldInd;
    @XmlElement(name = "DstrbtnTp")
    protected DistributionType1FormatChoice dstrbtnTp;

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
     * {@link CorporateActionEventStage1FormatChoice }
     * 
     * 
     * @return
     *     The value of the evtStag property.
     */
    public List<CorporateActionEventStage1FormatChoice> getEvtStag() {
        if (evtStag == null) {
            evtStag = new ArrayList<>();
        }
        return this.evtStag;
    }

    /**
     * Gets the value of the dfltOptnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getDfltOptnTp() {
        return dfltOptnTp;
    }

    /**
     * Sets the value of the dfltOptnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setDfltOptnTp(CorporateActionOption1FormatChoice value) {
        this.dfltOptnTp = value;
    }

    /**
     * Gets the value of the dfltOptnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfltOptnNb() {
        return dfltOptnNb;
    }

    /**
     * Sets the value of the dfltOptnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfltOptnNb(String value) {
        this.dfltOptnNb = value;
    }

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCalculationMethod1FormatChoice }
     *     
     */
    public CorporateActionCalculationMethod1FormatChoice getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCalculationMethod1FormatChoice }
     *     
     */
    public void setClctnMtd(CorporateActionCalculationMethod1FormatChoice value) {
        this.clctnMtd = value;
    }

    /**
     * Gets the value of the bckEndOddLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getBckEndOddLotSctiesQty() {
        return bckEndOddLotSctiesQty;
    }

    /**
     * Sets the value of the bckEndOddLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public void setBckEndOddLotSctiesQty(UnitOrFaceAmountOrCode1Choice value) {
        this.bckEndOddLotSctiesQty = value;
    }

    /**
     * Gets the value of the frntEndOddLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getFrntEndOddLotSctiesQty() {
        return frntEndOddLotSctiesQty;
    }

    /**
     * Sets the value of the frntEndOddLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public void setFrntEndOddLotSctiesQty(UnitOrFaceAmountOrCode1Choice value) {
        this.frntEndOddLotSctiesQty = value;
    }

    /**
     * Gets the value of the minExrcblSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblSctiesQty() {
        return minExrcblSctiesQty;
    }

    /**
     * Sets the value of the minExrcblSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMinExrcblSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblSctiesQty = value;
    }

    /**
     * Gets the value of the minExrcblMltplSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblMltplSctiesQty() {
        return minExrcblMltplSctiesQty;
    }

    /**
     * Sets the value of the minExrcblMltplSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setMinExrcblMltplSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblMltplSctiesQty = value;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setIncrmtlDnmtn(UnitOrFaceAmount1Choice value) {
        this.incrmtlDnmtn = value;
    }

    /**
     * Gets the value of the newDnmtnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewDnmtnSctiesQty() {
        return newDnmtnSctiesQty;
    }

    /**
     * Sets the value of the newDnmtnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setNewDnmtnSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newDnmtnSctiesQty = value;
    }

    /**
     * Gets the value of the newBrdLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewBrdLotSctiesQty() {
        return newBrdLotSctiesQty;
    }

    /**
     * Sets the value of the newBrdLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setNewBrdLotSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newBrdLotSctiesQty = value;
    }

    /**
     * Gets the value of the sctiesQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public UnitOrFaceAmountOrCode1Choice getSctiesQtySght() {
        return sctiesQtySght;
    }

    /**
     * Sets the value of the sctiesQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountOrCode1Choice }
     *     
     */
    public void setSctiesQtySght(UnitOrFaceAmountOrCode1Choice value) {
        this.sctiesQtySght = value;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setBaseDnmtn(UnitOrFaceAmount1Choice value) {
        this.baseDnmtn = value;
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
     * {@link CorporateActionChangeType1FormatChoice }
     * 
     * 
     * @return
     *     The value of the chngTp property.
     */
    public List<CorporateActionChangeType1FormatChoice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<>();
        }
        return this.chngTp;
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
     * Gets the value of the prtlElctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlElctnInd() {
        return prtlElctnInd;
    }

    /**
     * Sets the value of the prtlElctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlElctnInd(Boolean value) {
        this.prtlElctnInd = value;
    }

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionMovementType1FormatChoice }
     *     
     */
    public ElectionMovementType1FormatChoice getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionMovementType1FormatChoice }
     *     
     */
    public void setElctnTp(ElectionMovementType1FormatChoice value) {
        this.elctnTp = value;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryType1FormatChoice }
     *     
     */
    public LotteryType1FormatChoice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryType1FormatChoice }
     *     
     */
    public void setLtryTp(LotteryType1FormatChoice value) {
        this.ltryTp = value;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public void setIncmTp(GenericIdentification13 value) {
        this.incmTp = value;
    }

    /**
     * Gets the value of the dvddTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionFrequencyType1FormatChoice }
     *     
     */
    public CorporateActionFrequencyType1FormatChoice getDvddTp() {
        return dvddTp;
    }

    /**
     * Sets the value of the dvddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionFrequencyType1FormatChoice }
     *     
     */
    public void setDvddTp(CorporateActionFrequencyType1FormatChoice value) {
        this.dvddTp = value;
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cpnNb property.
     */
    public List<String> getCpnNb() {
        if (cpnNb == null) {
            cpnNb = new ArrayList<>();
        }
        return this.cpnNb;
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
     * Gets the value of the newDnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDnmtnCcy() {
        return newDnmtnCcy;
    }

    /**
     * Sets the value of the newDnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDnmtnCcy(String value) {
        this.newDnmtnCcy = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate2 }
     *     
     */
    public CorporateActionDate2 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate2 }
     *     
     */
    public void setDtDtls(CorporateActionDate2 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionPrice2 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<CorporateActionPrice2> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod1 }
     *     
     */
    public CorporateActionPeriod1 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod1 }
     *     
     */
    public void setPrdDtls(CorporateActionPeriod1 value) {
        this.prdDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate1 }
     *     
     */
    public CorporateActionRate1 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate1 }
     *     
     */
    public void setRateAndAmtDtls(CorporateActionRate1 value) {
        this.rateAndAmtDtls = value;
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

    /**
     * Gets the value of the certfctnReqrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnReqrdInd() {
        return certfctnReqrdInd;
    }

    /**
     * Sets the value of the certfctnReqrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertfctnReqrdInd(Boolean value) {
        this.certfctnReqrdInd = value;
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
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public void setCptlGn(EUCapitalGain2Code value) {
        this.cptlGn = value;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculated2Code getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public void setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
        this.taxblIncmPerShrClctd = value;
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
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableStatus1FormatChoice }
     *     
     */
    public RenounceableStatus1FormatChoice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableStatus1FormatChoice }
     *     
     */
    public void setRnncblEntitlmntStsTp(RenounceableStatus1FormatChoice value) {
        this.rnncblEntitlmntStsTp = value;
    }

    /**
     * Gets the value of the convsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionType1FormatChoice }
     *     
     */
    public ConversionType1FormatChoice getConvsTp() {
        return convsTp;
    }

    /**
     * Sets the value of the convsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionType1FormatChoice }
     *     
     */
    public void setConvsTp(ConversionType1FormatChoice value) {
        this.convsTp = value;
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
     * Gets the value of the dstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionType1FormatChoice }
     *     
     */
    public DistributionType1FormatChoice getDstrbtnTp() {
        return dstrbtnTp;
    }

    /**
     * Sets the value of the dstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionType1FormatChoice }
     *     
     */
    public void setDstrbtnTp(DistributionType1FormatChoice value) {
        this.dstrbtnTp = value;
    }

}
