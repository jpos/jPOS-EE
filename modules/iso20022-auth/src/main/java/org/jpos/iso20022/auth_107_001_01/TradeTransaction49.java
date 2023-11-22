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

package org.jpos.iso20022.auth_107_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransaction49 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeTransaction49">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UniqueTransactionIdentifier2Choice" minOccurs="0"/>
 *         <element name="PrrTxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UniqueTransactionIdentifier3Choice" minOccurs="0"/>
 *         <element name="SbsqntTxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UniqueTransactionIdentifier3Choice" minOccurs="0"/>
 *         <element name="CollPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CollateralPortfolioCode5Choice" minOccurs="0"/>
 *         <element name="RptTrckgNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max52Text" minOccurs="0"/>
 *         <element name="PltfmIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="MrrrOrTrggrTx" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PriceData2" minOccurs="0"/>
 *         <element name="NtnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}NotionalAmountLegs5" minOccurs="0"/>
 *         <element name="NtnlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}NotionalQuantityLegs5" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FinancialInstrumentQuantity32Choice" minOccurs="0"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PhysicalTransferType4Code" minOccurs="0"/>
 *         <element name="ExctnTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="EarlyTermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}MasterAgreement8" minOccurs="0"/>
 *         <element name="Cmprssn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PstTradRskRdctnFlg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PstTradRskRdctnEvt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PTRREvent2" minOccurs="0"/>
 *         <element name="DerivEvt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}DerivativeEvent6" minOccurs="0"/>
 *         <element name="TradConf" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TradeConfirmation1Choice" minOccurs="0"/>
 *         <element name="NonStdsdTerm" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TradClr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TradeClearing11" minOccurs="0"/>
 *         <element name="BlckTradElctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="LrgNtnlOffFcltyElctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}InterestRateLegs14" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CurrencyExchange22" minOccurs="0"/>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodity6Choice" minOccurs="0"/>
 *         <element name="Optn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}OptionOrSwaption10" minOccurs="0"/>
 *         <element name="NrgySpcfcAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}EnergySpecificAttribute9" minOccurs="0"/>
 *         <element name="Cdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}CreditDerivative4" minOccurs="0"/>
 *         <element name="OthrPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}OtherPayment5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Packg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Package4" minOccurs="0"/>
 *         <element name="TradAllcnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AllocationIndicator1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransaction49", propOrder = {
    "txId",
    "prrTxId",
    "sbsqntTxId",
    "collPrtflCd",
    "rptTrckgNb",
    "pltfmIdr",
    "mrrrOrTrggrTx",
    "txPric",
    "ntnlAmt",
    "ntnlQty",
    "qty",
    "dlvryTp",
    "exctnTmStmp",
    "fctvDt",
    "xprtnDt",
    "earlyTermntnDt",
    "sttlmDt",
    "mstrAgrmt",
    "cmprssn",
    "pstTradRskRdctnFlg",
    "pstTradRskRdctnEvt",
    "derivEvt",
    "tradConf",
    "nonStdsdTerm",
    "tradClr",
    "blckTradElctn",
    "lrgNtnlOffFcltyElctn",
    "intrstRate",
    "ccy",
    "cmmdty",
    "optn",
    "nrgySpcfcAttrbts",
    "cdt",
    "othrPmt",
    "packg",
    "tradAllcnSts"
})
public class TradeTransaction49 {

    @XmlElement(name = "TxId")
    protected UniqueTransactionIdentifier2Choice txId;
    @XmlElement(name = "PrrTxId")
    protected UniqueTransactionIdentifier3Choice prrTxId;
    @XmlElement(name = "SbsqntTxId")
    protected UniqueTransactionIdentifier3Choice sbsqntTxId;
    @XmlElement(name = "CollPrtflCd")
    protected CollateralPortfolioCode5Choice collPrtflCd;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "PltfmIdr")
    protected String pltfmIdr;
    @XmlElement(name = "MrrrOrTrggrTx")
    protected Boolean mrrrOrTrggrTx;
    @XmlElement(name = "TxPric")
    protected PriceData2 txPric;
    @XmlElement(name = "NtnlAmt")
    protected NotionalAmountLegs5 ntnlAmt;
    @XmlElement(name = "NtnlQty")
    protected NotionalQuantityLegs5 ntnlQty;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity32Choice qty;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "ExctnTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnTmStmp;
    @XmlElement(name = "FctvDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "EarlyTermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlyTermntnDt;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> sttlmDt;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "Cmprssn")
    protected Boolean cmprssn;
    @XmlElement(name = "PstTradRskRdctnFlg")
    protected Boolean pstTradRskRdctnFlg;
    @XmlElement(name = "PstTradRskRdctnEvt")
    protected PTRREvent2 pstTradRskRdctnEvt;
    @XmlElement(name = "DerivEvt")
    protected DerivativeEvent6 derivEvt;
    @XmlElement(name = "TradConf")
    protected TradeConfirmation1Choice tradConf;
    @XmlElement(name = "NonStdsdTerm")
    protected Boolean nonStdsdTerm;
    @XmlElement(name = "TradClr")
    protected TradeClearing11 tradClr;
    @XmlElement(name = "BlckTradElctn")
    protected Boolean blckTradElctn;
    @XmlElement(name = "LrgNtnlOffFcltyElctn")
    protected Boolean lrgNtnlOffFcltyElctn;
    @XmlElement(name = "IntrstRate")
    protected InterestRateLegs14 intrstRate;
    @XmlElement(name = "Ccy")
    protected CurrencyExchange22 ccy;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity6Choice cmmdty;
    @XmlElement(name = "Optn")
    protected OptionOrSwaption10 optn;
    @XmlElement(name = "NrgySpcfcAttrbts")
    protected EnergySpecificAttribute9 nrgySpcfcAttrbts;
    @XmlElement(name = "Cdt")
    protected CreditDerivative4 cdt;
    @XmlElement(name = "OthrPmt")
    protected List<OtherPayment5> othrPmt;
    @XmlElement(name = "Packg")
    protected Package4 packg;
    @XmlElement(name = "TradAllcnSts")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code tradAllcnSts;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public void setTxId(UniqueTransactionIdentifier2Choice value) {
        this.txId = value;
    }

    /**
     * Gets the value of the prrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public UniqueTransactionIdentifier3Choice getPrrTxId() {
        return prrTxId;
    }

    /**
     * Sets the value of the prrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public void setPrrTxId(UniqueTransactionIdentifier3Choice value) {
        this.prrTxId = value;
    }

    /**
     * Gets the value of the sbsqntTxId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public UniqueTransactionIdentifier3Choice getSbsqntTxId() {
        return sbsqntTxId;
    }

    /**
     * Sets the value of the sbsqntTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier3Choice }
     *     
     */
    public void setSbsqntTxId(UniqueTransactionIdentifier3Choice value) {
        this.sbsqntTxId = value;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public void setCollPrtflCd(CollateralPortfolioCode5Choice value) {
        this.collPrtflCd = value;
    }

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptTrckgNb(String value) {
        this.rptTrckgNb = value;
    }

    /**
     * Gets the value of the pltfmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltfmIdr() {
        return pltfmIdr;
    }

    /**
     * Sets the value of the pltfmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltfmIdr(String value) {
        this.pltfmIdr = value;
    }

    /**
     * Gets the value of the mrrrOrTrggrTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrrrOrTrggrTx() {
        return mrrrOrTrggrTx;
    }

    /**
     * Sets the value of the mrrrOrTrggrTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMrrrOrTrggrTx(Boolean value) {
        this.mrrrOrTrggrTx = value;
    }

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceData2 }
     *     
     */
    public PriceData2 getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceData2 }
     *     
     */
    public void setTxPric(PriceData2 value) {
        this.txPric = value;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public NotionalAmountLegs5 getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public void setNtnlAmt(NotionalAmountLegs5 value) {
        this.ntnlAmt = value;
    }

    /**
     * Gets the value of the ntnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public NotionalQuantityLegs5 getNtnlQty() {
        return ntnlQty;
    }

    /**
     * Sets the value of the ntnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public void setNtnlQty(NotionalQuantityLegs5 value) {
        this.ntnlQty = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity32Choice }
     *     
     */
    public FinancialInstrumentQuantity32Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity32Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity32Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public void setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the exctnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExctnTmStmp() {
        return exctnTmStmp;
    }

    /**
     * Sets the value of the exctnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExctnTmStmp(XMLGregorianCalendar value) {
        this.exctnTmStmp = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlyTermntnDt(XMLGregorianCalendar value) {
        this.earlyTermntnDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the sttlmDt property.
     */
    public List<XMLGregorianCalendar> getSttlmDt() {
        if (sttlmDt == null) {
            sttlmDt = new ArrayList<>();
        }
        return this.sttlmDt;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmprssn(Boolean value) {
        this.cmprssn = value;
    }

    /**
     * Gets the value of the pstTradRskRdctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPstTradRskRdctnFlg() {
        return pstTradRskRdctnFlg;
    }

    /**
     * Sets the value of the pstTradRskRdctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPstTradRskRdctnFlg(Boolean value) {
        this.pstTradRskRdctnFlg = value;
    }

    /**
     * Gets the value of the pstTradRskRdctnEvt property.
     * 
     * @return
     *     possible object is
     *     {@link PTRREvent2 }
     *     
     */
    public PTRREvent2 getPstTradRskRdctnEvt() {
        return pstTradRskRdctnEvt;
    }

    /**
     * Sets the value of the pstTradRskRdctnEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTRREvent2 }
     *     
     */
    public void setPstTradRskRdctnEvt(PTRREvent2 value) {
        this.pstTradRskRdctnEvt = value;
    }

    /**
     * Gets the value of the derivEvt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeEvent6 }
     *     
     */
    public DerivativeEvent6 getDerivEvt() {
        return derivEvt;
    }

    /**
     * Sets the value of the derivEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeEvent6 }
     *     
     */
    public void setDerivEvt(DerivativeEvent6 value) {
        this.derivEvt = value;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmation1Choice }
     *     
     */
    public TradeConfirmation1Choice getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmation1Choice }
     *     
     */
    public void setTradConf(TradeConfirmation1Choice value) {
        this.tradConf = value;
    }

    /**
     * Gets the value of the nonStdsdTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdsdTerm() {
        return nonStdsdTerm;
    }

    /**
     * Sets the value of the nonStdsdTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStdsdTerm(Boolean value) {
        this.nonStdsdTerm = value;
    }

    /**
     * Gets the value of the tradClr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeClearing11 }
     *     
     */
    public TradeClearing11 getTradClr() {
        return tradClr;
    }

    /**
     * Sets the value of the tradClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeClearing11 }
     *     
     */
    public void setTradClr(TradeClearing11 value) {
        this.tradClr = value;
    }

    /**
     * Gets the value of the blckTradElctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckTradElctn() {
        return blckTradElctn;
    }

    /**
     * Sets the value of the blckTradElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlckTradElctn(Boolean value) {
        this.blckTradElctn = value;
    }

    /**
     * Gets the value of the lrgNtnlOffFcltyElctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLrgNtnlOffFcltyElctn() {
        return lrgNtnlOffFcltyElctn;
    }

    /**
     * Sets the value of the lrgNtnlOffFcltyElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLrgNtnlOffFcltyElctn(Boolean value) {
        this.lrgNtnlOffFcltyElctn = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateLegs14 }
     *     
     */
    public InterestRateLegs14 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateLegs14 }
     *     
     */
    public void setIntrstRate(InterestRateLegs14 value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange22 }
     *     
     */
    public CurrencyExchange22 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange22 }
     *     
     */
    public void setCcy(CurrencyExchange22 value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public AssetClassCommodity6Choice getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public void setCmmdty(AssetClassCommodity6Choice value) {
        this.cmmdty = value;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link OptionOrSwaption10 }
     *     
     */
    public OptionOrSwaption10 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionOrSwaption10 }
     *     
     */
    public void setOptn(OptionOrSwaption10 value) {
        this.optn = value;
    }

    /**
     * Gets the value of the nrgySpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySpecificAttribute9 }
     *     
     */
    public EnergySpecificAttribute9 getNrgySpcfcAttrbts() {
        return nrgySpcfcAttrbts;
    }

    /**
     * Sets the value of the nrgySpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySpecificAttribute9 }
     *     
     */
    public void setNrgySpcfcAttrbts(EnergySpecificAttribute9 value) {
        this.nrgySpcfcAttrbts = value;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDerivative4 }
     *     
     */
    public CreditDerivative4 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDerivative4 }
     *     
     */
    public void setCdt(CreditDerivative4 value) {
        this.cdt = value;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPayment5 }
     * 
     * 
     * @return
     *     The value of the othrPmt property.
     */
    public List<OtherPayment5> getOthrPmt() {
        if (othrPmt == null) {
            othrPmt = new ArrayList<>();
        }
        return this.othrPmt;
    }

    /**
     * Gets the value of the packg property.
     * 
     * @return
     *     possible object is
     *     {@link Package4 }
     *     
     */
    public Package4 getPackg() {
        return packg;
    }

    /**
     * Sets the value of the packg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package4 }
     *     
     */
    public void setPackg(Package4 value) {
        this.packg = value;
    }

    /**
     * Gets the value of the tradAllcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public AllocationIndicator1Code getTradAllcnSts() {
        return tradAllcnSts;
    }

    /**
     * Sets the value of the tradAllcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public void setTradAllcnSts(AllocationIndicator1Code value) {
        this.tradAllcnSts = value;
    }

}
