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

package org.jpos.iso20022.sese_035_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingTransactionDetails43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingTransactionDetails43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesFincgTradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Max52Text" minOccurs="0"/>
 *         <element name="ClsgLegId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Max35Text" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}TerminationDate6Choice" minOccurs="0"/>
 *         <element name="RateChngDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="EarlstCallBckDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="ComssnClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}RateType35Choice" minOccurs="0"/>
 *         <element name="Rvaltn" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}RevaluationIndicator3Choice" minOccurs="0"/>
 *         <element name="LglFrmwk" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}LegalFramework3Choice" minOccurs="0"/>
 *         <element name="IntrstCmptnMtd" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         <element name="MtrtyDtMod" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="IntrstPmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="VarblRateSpprt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}RateName1" minOccurs="0"/>
 *         <element name="RpRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Rate2" minOccurs="0"/>
 *         <element name="StockLnMrgn" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Rate2" minOccurs="0"/>
 *         <element name="SctiesHrcut" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Rate2" minOccurs="0"/>
 *         <element name="ChrgsRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Rate2" minOccurs="0"/>
 *         <element name="PricgRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}RateOrName1Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Rate2" minOccurs="0"/>
 *         <element name="TxCallDely" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Exact3NumericText" minOccurs="0"/>
 *         <element name="TtlNbOfCollInstrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Exact3NumericText" minOccurs="0"/>
 *         <element name="DealAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="FrftAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="PrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="TermntnAmtPerPcOfColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="TermntnTxAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}AmountAndDirection21" minOccurs="0"/>
 *         <element name="ScndLegNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingTransactionDetails43", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "termntnDt",
    "rateChngDt",
    "earlstCallBckDt",
    "comssnClctnDt",
    "rateTp",
    "rvaltn",
    "lglFrmwk",
    "intrstCmptnMtd",
    "mtrtyDtMod",
    "intrstPmt",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "chrgsRate",
    "pricgRate",
    "sprd",
    "txCallDely",
    "ttlNbOfCollInstrs",
    "dealAmt",
    "acrdIntrstAmt",
    "frftAmt",
    "prmAmt",
    "termntnAmtPerPcOfColl",
    "termntnTxAmt",
    "scndLegNrrtv"
})
public class SecuritiesFinancingTransactionDetails43 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate6Choice termntnDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTime2Choice rateChngDt;
    @XmlElement(name = "EarlstCallBckDt")
    protected DateAndDateTime2Choice earlstCallBckDt;
    @XmlElement(name = "ComssnClctnDt")
    protected DateAndDateTime2Choice comssnClctnDt;
    @XmlElement(name = "RateTp")
    protected RateType35Choice rateTp;
    @XmlElement(name = "Rvaltn")
    protected RevaluationIndicator3Choice rvaltn;
    @XmlElement(name = "LglFrmwk")
    protected LegalFramework3Choice lglFrmwk;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethodFormat4Choice intrstCmptnMtd;
    @XmlElement(name = "MtrtyDtMod")
    protected Boolean mtrtyDtMod;
    @XmlElement(name = "IntrstPmt")
    protected Boolean intrstPmt;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "ChrgsRate")
    protected Rate2 chrgsRate;
    @XmlElement(name = "PricgRate")
    protected RateOrName1Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "DealAmt")
    protected AmountAndDirection21 dealAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection21 frftAmt;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection21 prmAmt;
    @XmlElement(name = "TermntnAmtPerPcOfColl")
    protected AmountAndDirection21 termntnAmtPerPcOfColl;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection21 termntnTxAmt;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;

    /**
     * Gets the value of the sctiesFincgTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesFincgTradId() {
        return sctiesFincgTradId;
    }

    /**
     * Sets the value of the sctiesFincgTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesFincgTradId(String value) {
        this.sctiesFincgTradId = value;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsgLegId(String value) {
        this.clsgLegId = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public TerminationDate6Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public void setTermntnDt(TerminationDate6Choice value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setRateChngDt(DateAndDateTime2Choice value) {
        this.rateChngDt = value;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setEarlstCallBckDt(DateAndDateTime2Choice value) {
        this.earlstCallBckDt = value;
    }

    /**
     * Gets the value of the comssnClctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getComssnClctnDt() {
        return comssnClctnDt;
    }

    /**
     * Sets the value of the comssnClctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setComssnClctnDt(DateAndDateTime2Choice value) {
        this.comssnClctnDt = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType35Choice }
     *     
     */
    public RateType35Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType35Choice }
     *     
     */
    public void setRateTp(RateType35Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the rvaltn property.
     * 
     * @return
     *     possible object is
     *     {@link RevaluationIndicator3Choice }
     *     
     */
    public RevaluationIndicator3Choice getRvaltn() {
        return rvaltn;
    }

    /**
     * Sets the value of the rvaltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevaluationIndicator3Choice }
     *     
     */
    public void setRvaltn(RevaluationIndicator3Choice value) {
        this.rvaltn = value;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework3Choice }
     *     
     */
    public LegalFramework3Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework3Choice }
     *     
     */
    public void setLglFrmwk(LegalFramework3Choice value) {
        this.lglFrmwk = value;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public void setIntrstCmptnMtd(InterestComputationMethodFormat4Choice value) {
        this.intrstCmptnMtd = value;
    }

    /**
     * Gets the value of the mtrtyDtMod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMtrtyDtMod() {
        return mtrtyDtMod;
    }

    /**
     * Sets the value of the mtrtyDtMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMtrtyDtMod(Boolean value) {
        this.mtrtyDtMod = value;
    }

    /**
     * Gets the value of the intrstPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrstPmt() {
        return intrstPmt;
    }

    /**
     * Sets the value of the intrstPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrstPmt(Boolean value) {
        this.intrstPmt = value;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public void setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setRpRate(Rate2 value) {
        this.rpRate = value;
    }

    /**
     * Gets the value of the stockLnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStockLnMrgn() {
        return stockLnMrgn;
    }

    /**
     * Sets the value of the stockLnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
    }

    /**
     * Gets the value of the sctiesHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSctiesHrcut() {
        return sctiesHrcut;
    }

    /**
     * Sets the value of the sctiesHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
    }

    /**
     * Gets the value of the chrgsRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getChrgsRate() {
        return chrgsRate;
    }

    /**
     * Sets the value of the chrgsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setChrgsRate(Rate2 value) {
        this.chrgsRate = value;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public void setPricgRate(RateOrName1Choice value) {
        this.pricgRate = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setSprd(Rate2 value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the txCallDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCallDely() {
        return txCallDely;
    }

    /**
     * Sets the value of the txCallDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCallDely(String value) {
        this.txCallDely = value;
    }

    /**
     * Gets the value of the ttlNbOfCollInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfCollInstrs() {
        return ttlNbOfCollInstrs;
    }

    /**
     * Sets the value of the ttlNbOfCollInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
    }

    /**
     * Gets the value of the dealAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getDealAmt() {
        return dealAmt;
    }

    /**
     * Sets the value of the dealAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setDealAmt(AmountAndDirection21 value) {
        this.dealAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection21 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the frftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getFrftAmt() {
        return frftAmt;
    }

    /**
     * Sets the value of the frftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setFrftAmt(AmountAndDirection21 value) {
        this.frftAmt = value;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setPrmAmt(AmountAndDirection21 value) {
        this.prmAmt = value;
    }

    /**
     * Gets the value of the termntnAmtPerPcOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getTermntnAmtPerPcOfColl() {
        return termntnAmtPerPcOfColl;
    }

    /**
     * Sets the value of the termntnAmtPerPcOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setTermntnAmtPerPcOfColl(AmountAndDirection21 value) {
        this.termntnAmtPerPcOfColl = value;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setTermntnTxAmt(AmountAndDirection21 value) {
        this.termntnTxAmt = value;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
    }

}
