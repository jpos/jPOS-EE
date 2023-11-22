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

package org.jpos.iso20022.sese_034_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingTransactionDetails53 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingTransactionDetails53">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesFincgTradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax52Text" minOccurs="0"/>
 *         <element name="ClsgLegId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}PartyIdentification156" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SafeKeepingPlace4" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}PlaceOfTradeIdentification2" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SecurityIdentification20"/>
 *         <element name="SttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}Quantity54Choice"/>
 *         <element name="OpngSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}AmountAndDirection67" minOccurs="0"/>
 *         <element name="TermntnTxAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}AmountAndDirection59" minOccurs="0"/>
 *         <element name="OpngSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SettlementDate32Choice"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}TerminationDate7Choice" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}TradeDate9Choice" minOccurs="0"/>
 *         <element name="XpctdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="LateDlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="RateChngDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SctiesFincgTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SecuritiesFinancingTransactionType2Code"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}ReceiveDelivery1Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}DeliveryReceiptType2Code"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SettlementDetails173" minOccurs="0"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RateType67Choice" minOccurs="0"/>
 *         <element name="VarblRateSpprt" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RateName2" minOccurs="0"/>
 *         <element name="RpRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}Rate2" minOccurs="0"/>
 *         <element name="StockLnMrgn" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}Rate2" minOccurs="0"/>
 *         <element name="SctiesHrcut" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}Rate2" minOccurs="0"/>
 *         <element name="PricgRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RateOrName2Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}Rate2" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SettlementParties107" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}SettlementParties107" minOccurs="0"/>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}PartyIdentification170" minOccurs="0"/>
 *         <element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingTransactionDetails53", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "poolId",
    "corpActnEvtId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "sfkpgPlc",
    "plcOfTrad",
    "finInstrmId",
    "sttlmQty",
    "opngSttlmAmt",
    "termntnTxAmt",
    "opngSttlmDt",
    "termntnDt",
    "tradDt",
    "xpctdSttlmDt",
    "xpctdValDt",
    "lateDlvryDt",
    "rateChngDt",
    "sctiesFincgTxTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "rateTp",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "pricgRate",
    "sprd",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "invstr",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesFinancingTransactionDetails53 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace4 sfkpgPlc;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification2 plcOfTrad;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity54Choice sttlmQty;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection67 opngSttlmAmt;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection59 termntnTxAmt;
    @XmlElement(name = "OpngSttlmDt", required = true)
    protected SettlementDate32Choice opngSttlmDt;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate7Choice termntnDt;
    @XmlElement(name = "TradDt")
    protected TradeDate9Choice tradDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTime2Choice xpctdSttlmDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTime2Choice xpctdValDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTime2Choice rateChngDt;
    @XmlElement(name = "SctiesFincgTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesFinancingTransactionType2Code sctiesFincgTxTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails173 sttlmParams;
    @XmlElement(name = "RateTp")
    protected RateType67Choice rateTp;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName2 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName2Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties107 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties107 rcvgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification170 invstr;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

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
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification156 }
     *     
     */
    public PartyIdentification156 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification156 }
     *     
     */
    public void setAcctOwnr(PartyIdentification156 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesAccount30 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount30 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public BlockChainAddressWallet7 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet7 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public SafeKeepingPlace4 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace4 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public PlaceOfTradeIdentification2 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification2 value) {
        this.plcOfTrad = value;
    }

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
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setSttlmQty(Quantity54Choice value) {
        this.sttlmQty = value;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection67 }
     *     
     */
    public AmountAndDirection67 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection67 }
     *     
     */
    public void setOpngSttlmAmt(AmountAndDirection67 value) {
        this.opngSttlmAmt = value;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public void setTermntnTxAmt(AmountAndDirection59 value) {
        this.termntnTxAmt = value;
    }

    /**
     * Gets the value of the opngSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate32Choice }
     *     
     */
    public SettlementDate32Choice getOpngSttlmDt() {
        return opngSttlmDt;
    }

    /**
     * Sets the value of the opngSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate32Choice }
     *     
     */
    public void setOpngSttlmDt(SettlementDate32Choice value) {
        this.opngSttlmDt = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate7Choice }
     *     
     */
    public TerminationDate7Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate7Choice }
     *     
     */
    public void setTermntnDt(TerminationDate7Choice value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate9Choice }
     *     
     */
    public TradeDate9Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate9Choice }
     *     
     */
    public void setTradDt(TradeDate9Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the xpctdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdSttlmDt() {
        return xpctdSttlmDt;
    }

    /**
     * Sets the value of the xpctdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpctdSttlmDt(DateAndDateTime2Choice value) {
        this.xpctdSttlmDt = value;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpctdValDt(DateAndDateTime2Choice value) {
        this.xpctdValDt = value;
    }

    /**
     * Gets the value of the lateDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Sets the value of the lateDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLateDlvryDt(DateAndDateTime2Choice value) {
        this.lateDlvryDt = value;
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
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public SecuritiesFinancingTransactionType2Code getSctiesFincgTxTp() {
        return sctiesFincgTxTp;
    }

    /**
     * Sets the value of the sctiesFincgTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public void setSctiesFincgTxTp(SecuritiesFinancingTransactionType2Code value) {
        this.sctiesFincgTxTp = value;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails173 }
     *     
     */
    public SettlementDetails173 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails173 }
     *     
     */
    public void setSttlmParams(SettlementDetails173 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType67Choice }
     *     
     */
    public RateType67Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType67Choice }
     *     
     */
    public void setRateTp(RateType67Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName2 }
     *     
     */
    public RateName2 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName2 }
     *     
     */
    public void setVarblRateSpprt(RateName2 value) {
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
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName2Choice }
     *     
     */
    public RateOrName2Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName2Choice }
     *     
     */
    public void setPricgRate(RateOrName2Choice value) {
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
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties107 }
     *     
     */
    public SettlementParties107 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties107 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties107 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties107 }
     *     
     */
    public SettlementParties107 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties107 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties107 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification170 }
     *     
     */
    public PartyIdentification170 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification170 }
     *     
     */
    public void setInvstr(PartyIdentification170 value) {
        this.invstr = value;
    }

    /**
     * Gets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmInstrPrcgAddtlDtls() {
        return sttlmInstrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmInstrPrcgAddtlDtls(String value) {
        this.sttlmInstrPrcgAddtlDtls = value;
    }

}
