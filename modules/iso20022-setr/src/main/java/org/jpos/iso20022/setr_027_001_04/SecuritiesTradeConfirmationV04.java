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

package org.jpos.iso20022.setr_027_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeConfirmationV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeConfirmationV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TransactiontIdentification4"/>
 *         <element name="NbCnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}NumberCount1Choice" minOccurs="0"/>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Linkages52" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Order24"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SecurityIdentification19"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentAttributes124" minOccurs="0"/>
 *         <element name="UndrlygFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}UnderlyingFinancialInstrument7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Stiptns" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentStipulations4" minOccurs="0"/>
 *         <element name="ConfPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ConfirmationParties6" maxOccurs="unbounded"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementDetails213" minOccurs="0"/>
 *         <element name="StgSttlmInstr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}StandingSettlementInstruction13" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementParties59" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementParties59" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}CashParties33" minOccurs="0"/>
 *         <element name="ClrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Clearing5" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection28" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OtherAmounts16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrPrics" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OtherPrices5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OtherParties32" minOccurs="0"/>
 *         <element name="TwoLegTxDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TwoLegTransactionDetails5" minOccurs="0"/>
 *         <element name="RgltryStiptns" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}RegulatoryStipulations1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationV04", propOrder = {
    "id",
    "nbCnt",
    "refs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "undrlygFinInstrm",
    "stiptns",
    "confPties",
    "sttlmParams",
    "stgSttlmInstr",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "clrDtls",
    "sttlmAmt",
    "othrAmts",
    "othrPrics",
    "othrBizPties",
    "twoLegTxDtls",
    "rgltryStiptns",
    "splmtryData"
})
public class SecuritiesTradeConfirmationV04 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "NbCnt")
    protected NumberCount1Choice nbCnt;
    @XmlElement(name = "Refs")
    protected List<Linkages52> refs;
    @XmlElement(name = "TradDtls", required = true)
    protected Order24 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes124 finInstrmAttrbts;
    @XmlElement(name = "UndrlygFinInstrm")
    protected List<UnderlyingFinancialInstrument7> undrlygFinInstrm;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations4 stiptns;
    @XmlElement(name = "ConfPties", required = true)
    protected List<ConfirmationParties6> confPties;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails213 sttlmParams;
    @XmlElement(name = "StgSttlmInstr")
    protected StandingSettlementInstruction13 stgSttlmInstr;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties59 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties59 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties33 cshPties;
    @XmlElement(name = "ClrDtls")
    protected Clearing5 clrDtls;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection28 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected List<OtherAmounts16> othrAmts;
    @XmlElement(name = "OthrPrics")
    protected List<OtherPrices5> othrPrics;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties32 othrBizPties;
    @XmlElement(name = "TwoLegTxDtls")
    protected TwoLegTransactionDetails5 twoLegTxDtls;
    @XmlElement(name = "RgltryStiptns")
    protected RegulatoryStipulations1 rgltryStiptns;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public void setId(TransactiontIdentification4 value) {
        this.id = value;
    }

    /**
     * Gets the value of the nbCnt property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCnt() {
        return nbCnt;
    }

    /**
     * Sets the value of the nbCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public void setNbCnt(NumberCount1Choice value) {
        this.nbCnt = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages52 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<Linkages52> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order24 }
     *     
     */
    public Order24 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order24 }
     *     
     */
    public void setTradDtls(Order24 value) {
        this.tradDtls = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes124 }
     *     
     */
    public FinancialInstrumentAttributes124 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes124 }
     *     
     */
    public void setFinInstrmAttrbts(FinancialInstrumentAttributes124 value) {
        this.finInstrmAttrbts = value;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingFinancialInstrument7 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrm property.
     */
    public List<UnderlyingFinancialInstrument7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<>();
        }
        return this.undrlygFinInstrm;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations4 }
     *     
     */
    public FinancialInstrumentStipulations4 getStiptns() {
        return stiptns;
    }

    /**
     * Sets the value of the stiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations4 }
     *     
     */
    public void setStiptns(FinancialInstrumentStipulations4 value) {
        this.stiptns = value;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties6 }
     * 
     * 
     * @return
     *     The value of the confPties property.
     */
    public List<ConfirmationParties6> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails213 }
     *     
     */
    public SettlementDetails213 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails213 }
     *     
     */
    public void setSttlmParams(SettlementDetails213 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the stgSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction13 }
     *     
     */
    public StandingSettlementInstruction13 getStgSttlmInstr() {
        return stgSttlmInstr;
    }

    /**
     * Sets the value of the stgSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction13 }
     *     
     */
    public void setStgSttlmInstr(StandingSettlementInstruction13 value) {
        this.stgSttlmInstr = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties59 }
     *     
     */
    public SettlementParties59 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties59 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties59 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties59 }
     *     
     */
    public SettlementParties59 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties59 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties59 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties33 }
     *     
     */
    public CashParties33 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties33 }
     *     
     */
    public void setCshPties(CashParties33 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing5 }
     *     
     */
    public Clearing5 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing5 }
     *     
     */
    public void setClrDtls(Clearing5 value) {
        this.clrDtls = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection28 }
     *     
     */
    public AmountAndDirection28 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection28 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection28 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts16 }
     * 
     * 
     * @return
     *     The value of the othrAmts property.
     */
    public List<OtherAmounts16> getOthrAmts() {
        if (othrAmts == null) {
            othrAmts = new ArrayList<>();
        }
        return this.othrAmts;
    }

    /**
     * Gets the value of the othrPrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPrices5 }
     * 
     * 
     * @return
     *     The value of the othrPrics property.
     */
    public List<OtherPrices5> getOthrPrics() {
        if (othrPrics == null) {
            othrPrics = new ArrayList<>();
        }
        return this.othrPrics;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties32 }
     *     
     */
    public OtherParties32 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties32 }
     *     
     */
    public void setOthrBizPties(OtherParties32 value) {
        this.othrBizPties = value;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TwoLegTransactionDetails5 }
     *     
     */
    public TwoLegTransactionDetails5 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoLegTransactionDetails5 }
     *     
     */
    public void setTwoLegTxDtls(TwoLegTransactionDetails5 value) {
        this.twoLegTxDtls = value;
    }

    /**
     * Gets the value of the rgltryStiptns property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryStipulations1 }
     *     
     */
    public RegulatoryStipulations1 getRgltryStiptns() {
        return rgltryStiptns;
    }

    /**
     * Sets the value of the rgltryStiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryStipulations1 }
     *     
     */
    public void setRgltryStiptns(RegulatoryStipulations1 value) {
        this.rgltryStiptns = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
