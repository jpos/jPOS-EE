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

package org.jpos.iso20022.secl_002_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeLeg8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeLeg8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradLegId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text"/>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TradExctnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text"/>
 *         <element name="OrdrId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="AllcnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Status5Code" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}ISODateTime"/>
 *         <element name="TxDtTm" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}DateFormat15Choice" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SecurityIdentification14"/>
 *         <element name="TradgCcy" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}CurrencyCode" minOccurs="0"/>
 *         <element name="BuySellInd" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Side1Code"/>
 *         <element name="TradQty" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Price4"/>
 *         <element name="GrssAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}AmountAndDirection21" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}AmountAndDirection21" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}MarketIdentification84"/>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}MarketIdentification85" minOccurs="0"/>
 *         <element name="TradTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}TradeType1Code"/>
 *         <element name="DerivRltdTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}PartyIdentificationAndAccount100" minOccurs="0"/>
 *         <element name="TradgPty" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}PartyIdentification35Choice"/>
 *         <element name="TradRegnOrgn" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TradgPtyAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}TradingCapacity5Code"/>
 *         <element name="TradPstngCd" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}TradePosting1Code" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SafekeepingPlaceFormat7Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SecuritiesAccount19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLeg8", propOrder = {
    "tradLegId",
    "tradId",
    "tradExctnId",
    "ordrId",
    "allcnId",
    "sts",
    "tradDt",
    "txDtTm",
    "sttlmDt",
    "finInstrmId",
    "tradgCcy",
    "buySellInd",
    "tradQty",
    "dealPric",
    "grssAmt",
    "acrdIntrstAmt",
    "plcOfTrad",
    "plcOfListg",
    "tradTp",
    "derivRltdTrad",
    "brkr",
    "tradgPty",
    "tradRegnOrgn",
    "tradgPtyAcct",
    "tradgCpcty",
    "tradPstngCd",
    "sfkpgPlc",
    "sfkpgAcct"
})
public class TradeLeg8 {

    @XmlElement(name = "TradLegId", required = true)
    protected String tradLegId;
    @XmlElement(name = "TradId")
    protected String tradId;
    @XmlElement(name = "TradExctnId", required = true)
    protected String tradExctnId;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "AllcnId")
    protected String allcnId;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected Status5Code sts;
    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "TxDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDtTm;
    @XmlElement(name = "SttlmDt")
    protected DateFormat15Choice sttlmDt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "BuySellInd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code buySellInd;
    @XmlElement(name = "TradQty", required = true)
    protected FinancialInstrumentQuantity1Choice tradQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price4 dealPric;
    @XmlElement(name = "GrssAmt")
    protected AmountAndDirection21 grssAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification85 plcOfListg;
    @XmlElement(name = "TradTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeType1Code tradTp;
    @XmlElement(name = "DerivRltdTrad")
    protected Boolean derivRltdTrad;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount100 brkr;
    @XmlElement(name = "TradgPty", required = true)
    protected PartyIdentification35Choice tradgPty;
    @XmlElement(name = "TradRegnOrgn")
    protected String tradRegnOrgn;
    @XmlElement(name = "TradgPtyAcct")
    protected SecuritiesAccount19 tradgPtyAcct;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "TradPstngCd")
    @XmlSchemaType(name = "string")
    protected TradePosting1Code tradPstngCd;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat7Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;

    /**
     * Gets the value of the tradLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradLegId() {
        return tradLegId;
    }

    /**
     * Sets the value of the tradLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradLegId(String value) {
        this.tradLegId = value;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradId(String value) {
        this.tradId = value;
    }

    /**
     * Gets the value of the tradExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradExctnId() {
        return tradExctnId;
    }

    /**
     * Sets the value of the tradExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradExctnId(String value) {
        this.tradExctnId = value;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrId(String value) {
        this.ordrId = value;
    }

    /**
     * Gets the value of the allcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllcnId() {
        return allcnId;
    }

    /**
     * Sets the value of the allcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllcnId(String value) {
        this.allcnId = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status5Code }
     *     
     */
    public Status5Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status5Code }
     *     
     */
    public void setSts(Status5Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the txDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDtTm() {
        return txDtTm;
    }

    /**
     * Sets the value of the txDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDtTm(XMLGregorianCalendar value) {
        this.txDtTm = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public void setSttlmDt(DateFormat15Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgCcy(String value) {
        this.tradgCcy = value;
    }

    /**
     * Gets the value of the buySellInd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getBuySellInd() {
        return buySellInd;
    }

    /**
     * Sets the value of the buySellInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public void setBuySellInd(Side1Code value) {
        this.buySellInd = value;
    }

    /**
     * Gets the value of the tradQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTradQty() {
        return tradQty;
    }

    /**
     * Sets the value of the tradQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setTradQty(FinancialInstrumentQuantity1Choice value) {
        this.tradQty = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setDealPric(Price4 value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setGrssAmt(AmountAndDirection21 value) {
        this.grssAmt = value;
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
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification84 }
     *     
     */
    public MarketIdentification84 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification84 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification85 }
     *     
     */
    public MarketIdentification85 getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification85 }
     *     
     */
    public void setPlcOfListg(MarketIdentification85 value) {
        this.plcOfListg = value;
    }

    /**
     * Gets the value of the tradTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType1Code }
     *     
     */
    public TradeType1Code getTradTp() {
        return tradTp;
    }

    /**
     * Sets the value of the tradTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType1Code }
     *     
     */
    public void setTradTp(TradeType1Code value) {
        this.tradTp = value;
    }

    /**
     * Gets the value of the derivRltdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivRltdTrad() {
        return derivRltdTrad;
    }

    /**
     * Sets the value of the derivRltdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerivRltdTrad(Boolean value) {
        this.derivRltdTrad = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount100 }
     *     
     */
    public PartyIdentificationAndAccount100 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount100 }
     *     
     */
    public void setBrkr(PartyIdentificationAndAccount100 value) {
        this.brkr = value;
    }

    /**
     * Gets the value of the tradgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradgPty() {
        return tradgPty;
    }

    /**
     * Sets the value of the tradgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setTradgPty(PartyIdentification35Choice value) {
        this.tradgPty = value;
    }

    /**
     * Gets the value of the tradRegnOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRegnOrgn() {
        return tradRegnOrgn;
    }

    /**
     * Sets the value of the tradRegnOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradRegnOrgn(String value) {
        this.tradRegnOrgn = value;
    }

    /**
     * Gets the value of the tradgPtyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getTradgPtyAcct() {
        return tradgPtyAcct;
    }

    /**
     * Sets the value of the tradgPtyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setTradgPtyAcct(SecuritiesAccount19 value) {
        this.tradgPtyAcct = value;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public void setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the tradPstngCd property.
     * 
     * @return
     *     possible object is
     *     {@link TradePosting1Code }
     *     
     */
    public TradePosting1Code getTradPstngCd() {
        return tradPstngCd;
    }

    /**
     * Sets the value of the tradPstngCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePosting1Code }
     *     
     */
    public void setTradPstngCd(TradePosting1Code value) {
        this.tradPstngCd = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public SafekeepingPlaceFormat7Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat7Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

}
