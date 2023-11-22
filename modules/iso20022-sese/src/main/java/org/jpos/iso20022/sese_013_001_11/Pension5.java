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

package org.jpos.iso20022.sese_013_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pension5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Pension5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PensionPolicy1" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PensionSchemeType3Choice"/>
 *         <element name="TrfScp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PensionTransferScope1Choice" minOccurs="0"/>
 *         <element name="TaxRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}TaxReference1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrwdwnTrchId" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="DrwdwnSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DrawdownStatus1Choice" minOccurs="0"/>
 *         <element name="DrwdwnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DrawdownType2Choice" minOccurs="0"/>
 *         <element name="NbOfDrwdwnTrnchs" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Number" minOccurs="0"/>
 *         <element name="EstmtdVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DateAndAmount2" minOccurs="0"/>
 *         <element name="BlckTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="BlckTrfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="TaxFreeCshPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="TaxFreeCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DateAndAmount2" minOccurs="0"/>
 *         <element name="ValOfPnsnPlcyOrPlanOrSchme" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DateAndAmount2" minOccurs="0"/>
 *         <element name="RtrmntAgePrtcn" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="RtrmntAge" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="Shrg" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="LumpSumTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}LumpSumType1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PnsnOrdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PensionOrder1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RingFncdDrwdwnAssts" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="MnyPurchsAnlAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}MoneyPurchaseAnnualAllowance1" minOccurs="0"/>
 *         <element name="SfgrdBnft" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="NonSfgrddGrntedBnfts" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="LftmAllwncPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClntLftmAllwncPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="BnftCrstllstnEvtOcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="NonWrpprTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pension5", propOrder = {
    "id",
    "tp",
    "trfScp",
    "taxRef",
    "drwdwnTrchId",
    "drwdwnSts",
    "drwdwnTp",
    "nbOfDrwdwnTrnchs",
    "estmtdVal",
    "blckTrf",
    "blckTrfRef",
    "taxFreeCshPrtcn",
    "taxFreeCshAmt",
    "valOfPnsnPlcyOrPlanOrSchme",
    "rtrmntAgePrtcn",
    "rtrmntAge",
    "shrg",
    "lumpSumTp",
    "pnsnOrdr",
    "ringFncdDrwdwnAssts",
    "mnyPurchsAnlAllwnc",
    "sfgrdBnft",
    "nonSfgrddGrntedBnfts",
    "lftmAllwncPrtcn",
    "clntLftmAllwncPrtcn",
    "bnftCrstllstnEvtOcrd",
    "nonWrpprTrf",
    "addtlInf"
})
public class Pension5 {

    @XmlElement(name = "Id")
    protected PensionPolicy1 id;
    @XmlElement(name = "Tp", required = true)
    protected PensionSchemeType3Choice tp;
    @XmlElement(name = "TrfScp")
    protected PensionTransferScope1Choice trfScp;
    @XmlElement(name = "TaxRef")
    protected List<TaxReference1> taxRef;
    @XmlElement(name = "DrwdwnTrchId")
    protected String drwdwnTrchId;
    @XmlElement(name = "DrwdwnSts")
    protected DrawdownStatus1Choice drwdwnSts;
    @XmlElement(name = "DrwdwnTp")
    protected DrawdownType2Choice drwdwnTp;
    @XmlElement(name = "NbOfDrwdwnTrnchs")
    protected BigDecimal nbOfDrwdwnTrnchs;
    @XmlElement(name = "EstmtdVal")
    protected DateAndAmount2 estmtdVal;
    @XmlElement(name = "BlckTrf")
    protected Boolean blckTrf;
    @XmlElement(name = "BlckTrfRef")
    protected String blckTrfRef;
    @XmlElement(name = "TaxFreeCshPrtcn")
    protected Boolean taxFreeCshPrtcn;
    @XmlElement(name = "TaxFreeCshAmt")
    protected DateAndAmount2 taxFreeCshAmt;
    @XmlElement(name = "ValOfPnsnPlcyOrPlanOrSchme")
    protected DateAndAmount2 valOfPnsnPlcyOrPlanOrSchme;
    @XmlElement(name = "RtrmntAgePrtcn")
    protected Boolean rtrmntAgePrtcn;
    @XmlElement(name = "RtrmntAge")
    protected BigDecimal rtrmntAge;
    @XmlElement(name = "Shrg")
    protected Boolean shrg;
    @XmlElement(name = "LumpSumTp")
    protected List<LumpSumType1Choice> lumpSumTp;
    @XmlElement(name = "PnsnOrdr")
    protected List<PensionOrder1> pnsnOrdr;
    @XmlElement(name = "RingFncdDrwdwnAssts")
    protected Boolean ringFncdDrwdwnAssts;
    @XmlElement(name = "MnyPurchsAnlAllwnc")
    protected MoneyPurchaseAnnualAllowance1 mnyPurchsAnlAllwnc;
    @XmlElement(name = "SfgrdBnft")
    protected Boolean sfgrdBnft;
    @XmlElement(name = "NonSfgrddGrntedBnfts")
    protected Boolean nonSfgrddGrntedBnfts;
    @XmlElement(name = "LftmAllwncPrtcn")
    protected Boolean lftmAllwncPrtcn;
    @XmlElement(name = "ClntLftmAllwncPrtcn")
    protected Boolean clntLftmAllwncPrtcn;
    @XmlElement(name = "BnftCrstllstnEvtOcrd")
    protected Boolean bnftCrstllstnEvtOcrd;
    @XmlElement(name = "NonWrpprTrf")
    protected Boolean nonWrpprTrf;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PensionPolicy1 }
     *     
     */
    public PensionPolicy1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionPolicy1 }
     *     
     */
    public void setId(PensionPolicy1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionSchemeType3Choice }
     *     
     */
    public PensionSchemeType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionSchemeType3Choice }
     *     
     */
    public void setTp(PensionSchemeType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the trfScp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public PensionTransferScope1Choice getTrfScp() {
        return trfScp;
    }

    /**
     * Sets the value of the trfScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public void setTrfScp(PensionTransferScope1Choice value) {
        this.trfScp = value;
    }

    /**
     * Gets the value of the taxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReference1 }
     * 
     * 
     * @return
     *     The value of the taxRef property.
     */
    public List<TaxReference1> getTaxRef() {
        if (taxRef == null) {
            taxRef = new ArrayList<>();
        }
        return this.taxRef;
    }

    /**
     * Gets the value of the drwdwnTrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrwdwnTrchId() {
        return drwdwnTrchId;
    }

    /**
     * Sets the value of the drwdwnTrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrwdwnTrchId(String value) {
        this.drwdwnTrchId = value;
    }

    /**
     * Gets the value of the drwdwnSts property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownStatus1Choice }
     *     
     */
    public DrawdownStatus1Choice getDrwdwnSts() {
        return drwdwnSts;
    }

    /**
     * Sets the value of the drwdwnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownStatus1Choice }
     *     
     */
    public void setDrwdwnSts(DrawdownStatus1Choice value) {
        this.drwdwnSts = value;
    }

    /**
     * Gets the value of the drwdwnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public DrawdownType2Choice getDrwdwnTp() {
        return drwdwnTp;
    }

    /**
     * Sets the value of the drwdwnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public void setDrwdwnTp(DrawdownType2Choice value) {
        this.drwdwnTp = value;
    }

    /**
     * Gets the value of the nbOfDrwdwnTrnchs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDrwdwnTrnchs() {
        return nbOfDrwdwnTrnchs;
    }

    /**
     * Sets the value of the nbOfDrwdwnTrnchs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDrwdwnTrnchs(BigDecimal value) {
        this.nbOfDrwdwnTrnchs = value;
    }

    /**
     * Gets the value of the estmtdVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getEstmtdVal() {
        return estmtdVal;
    }

    /**
     * Sets the value of the estmtdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setEstmtdVal(DateAndAmount2 value) {
        this.estmtdVal = value;
    }

    /**
     * Gets the value of the blckTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckTrf() {
        return blckTrf;
    }

    /**
     * Sets the value of the blckTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlckTrf(Boolean value) {
        this.blckTrf = value;
    }

    /**
     * Gets the value of the blckTrfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckTrfRef() {
        return blckTrfRef;
    }

    /**
     * Sets the value of the blckTrfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlckTrfRef(String value) {
        this.blckTrfRef = value;
    }

    /**
     * Gets the value of the taxFreeCshPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxFreeCshPrtcn() {
        return taxFreeCshPrtcn;
    }

    /**
     * Sets the value of the taxFreeCshPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxFreeCshPrtcn(Boolean value) {
        this.taxFreeCshPrtcn = value;
    }

    /**
     * Gets the value of the taxFreeCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getTaxFreeCshAmt() {
        return taxFreeCshAmt;
    }

    /**
     * Sets the value of the taxFreeCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setTaxFreeCshAmt(DateAndAmount2 value) {
        this.taxFreeCshAmt = value;
    }

    /**
     * Gets the value of the valOfPnsnPlcyOrPlanOrSchme property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getValOfPnsnPlcyOrPlanOrSchme() {
        return valOfPnsnPlcyOrPlanOrSchme;
    }

    /**
     * Sets the value of the valOfPnsnPlcyOrPlanOrSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setValOfPnsnPlcyOrPlanOrSchme(DateAndAmount2 value) {
        this.valOfPnsnPlcyOrPlanOrSchme = value;
    }

    /**
     * Gets the value of the rtrmntAgePrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrmntAgePrtcn() {
        return rtrmntAgePrtcn;
    }

    /**
     * Sets the value of the rtrmntAgePrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtrmntAgePrtcn(Boolean value) {
        this.rtrmntAgePrtcn = value;
    }

    /**
     * Gets the value of the rtrmntAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrmntAge() {
        return rtrmntAge;
    }

    /**
     * Sets the value of the rtrmntAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtrmntAge(BigDecimal value) {
        this.rtrmntAge = value;
    }

    /**
     * Gets the value of the shrg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrg() {
        return shrg;
    }

    /**
     * Sets the value of the shrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrg(Boolean value) {
        this.shrg = value;
    }

    /**
     * Gets the value of the lumpSumTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lumpSumTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLumpSumTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LumpSumType1Choice }
     * 
     * 
     * @return
     *     The value of the lumpSumTp property.
     */
    public List<LumpSumType1Choice> getLumpSumTp() {
        if (lumpSumTp == null) {
            lumpSumTp = new ArrayList<>();
        }
        return this.lumpSumTp;
    }

    /**
     * Gets the value of the pnsnOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pnsnOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnsnOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PensionOrder1 }
     * 
     * 
     * @return
     *     The value of the pnsnOrdr property.
     */
    public List<PensionOrder1> getPnsnOrdr() {
        if (pnsnOrdr == null) {
            pnsnOrdr = new ArrayList<>();
        }
        return this.pnsnOrdr;
    }

    /**
     * Gets the value of the ringFncdDrwdwnAssts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingFncdDrwdwnAssts() {
        return ringFncdDrwdwnAssts;
    }

    /**
     * Sets the value of the ringFncdDrwdwnAssts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingFncdDrwdwnAssts(Boolean value) {
        this.ringFncdDrwdwnAssts = value;
    }

    /**
     * Gets the value of the mnyPurchsAnlAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyPurchaseAnnualAllowance1 }
     *     
     */
    public MoneyPurchaseAnnualAllowance1 getMnyPurchsAnlAllwnc() {
        return mnyPurchsAnlAllwnc;
    }

    /**
     * Sets the value of the mnyPurchsAnlAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyPurchaseAnnualAllowance1 }
     *     
     */
    public void setMnyPurchsAnlAllwnc(MoneyPurchaseAnnualAllowance1 value) {
        this.mnyPurchsAnlAllwnc = value;
    }

    /**
     * Gets the value of the sfgrdBnft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSfgrdBnft() {
        return sfgrdBnft;
    }

    /**
     * Sets the value of the sfgrdBnft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSfgrdBnft(Boolean value) {
        this.sfgrdBnft = value;
    }

    /**
     * Gets the value of the nonSfgrddGrntedBnfts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSfgrddGrntedBnfts() {
        return nonSfgrddGrntedBnfts;
    }

    /**
     * Sets the value of the nonSfgrddGrntedBnfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSfgrddGrntedBnfts(Boolean value) {
        this.nonSfgrddGrntedBnfts = value;
    }

    /**
     * Gets the value of the lftmAllwncPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLftmAllwncPrtcn() {
        return lftmAllwncPrtcn;
    }

    /**
     * Sets the value of the lftmAllwncPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLftmAllwncPrtcn(Boolean value) {
        this.lftmAllwncPrtcn = value;
    }

    /**
     * Gets the value of the clntLftmAllwncPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClntLftmAllwncPrtcn() {
        return clntLftmAllwncPrtcn;
    }

    /**
     * Sets the value of the clntLftmAllwncPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClntLftmAllwncPrtcn(Boolean value) {
        this.clntLftmAllwncPrtcn = value;
    }

    /**
     * Gets the value of the bnftCrstllstnEvtOcrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnftCrstllstnEvtOcrd() {
        return bnftCrstllstnEvtOcrd;
    }

    /**
     * Sets the value of the bnftCrstllstnEvtOcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBnftCrstllstnEvtOcrd(Boolean value) {
        this.bnftCrstllstnEvtOcrd = value;
    }

    /**
     * Gets the value of the nonWrpprTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonWrpprTrf() {
        return nonWrpprTrf;
    }

    /**
     * Sets the value of the nonWrpprTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonWrpprTrf(Boolean value) {
        this.nonWrpprTrf = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
