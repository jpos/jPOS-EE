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

package org.jpos.iso20022.sese_024_001_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDetails148 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionDetails148">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max35Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}PartyIdentification144" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SafeKeepingPlace3" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}PlaceOfTradeIdentification1" minOccurs="0"/>
 *         <element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SecurityIdentification19"/>
 *         <element name="SttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Quantity51Choice"/>
 *         <element name="PrtlyRlsdQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Quantity51Choice" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}AmountAndDirection51" minOccurs="0"/>
 *         <element name="LateDlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="XpctdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SettlementDate19Choice"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}TradeDate8Choice" minOccurs="0"/>
 *         <element name="AckdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}ISODateTime" minOccurs="0"/>
 *         <element name="MtchdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}ISODateTime" minOccurs="0"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}ReceiveDelivery1Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}DeliveryReceiptType2Code"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SettlementDetails202"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SettlementParties97" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SettlementParties97" minOccurs="0"/>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}PartyIdentification149" minOccurs="0"/>
 *         <element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}PartyIdentification136" minOccurs="0"/>
 *         <element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails148", propOrder = {
    "tradId",
    "poolId",
    "corpActnEvtId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId",
    "clntCollInstrId",
    "trptyAgtSvcPrvdrCollInstrId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "sfkpgPlc",
    "plcOfTrad",
    "plcOfClr",
    "finInstrmId",
    "sttlmQty",
    "prtlyRlsdQty",
    "sttlmAmt",
    "lateDlvryDt",
    "xpctdSttlmDt",
    "xpctdValDt",
    "sttlmDt",
    "tradDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "invstr",
    "qlfdFrgnIntrmy",
    "sttlmInstrPrcgAddtlDtls"
})
public class TransactionDetails148 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity51Choice sttlmQty;
    @XmlElement(name = "PrtlyRlsdQty")
    protected Quantity51Choice prtlyRlsdQty;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection51 sttlmAmt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTime2Choice xpctdSttlmDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTime2Choice xpctdValDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate19Choice sttlmDt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "AckdStsTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtchdStsTmStmp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails202 sttlmParams;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties97 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties97 dlvrgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification149 invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentification136 qlfdFrgnIntrmy;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

    /**
     * Gets the value of the tradId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tradId property.
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<>();
        }
        return this.tradId;
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
     * Gets the value of the clntCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Sets the value of the clntCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public void setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
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

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public void setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
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
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public void setSttlmQty(Quantity51Choice value) {
        this.sttlmQty = value;
    }

    /**
     * Gets the value of the prtlyRlsdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getPrtlyRlsdQty() {
        return prtlyRlsdQty;
    }

    /**
     * Sets the value of the prtlyRlsdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public void setPrtlyRlsdQty(Quantity51Choice value) {
        this.prtlyRlsdQty = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public AmountAndDirection51 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection51 value) {
        this.sttlmAmt = value;
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
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public SettlementDate19Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public void setSttlmDt(SettlementDate19Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public void setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the ackdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Sets the value of the ackdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckdStsTmStmp(XMLGregorianCalendar value) {
        this.ackdStsTmStmp = value;
    }

    /**
     * Gets the value of the mtchdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtchdStsTmStmp() {
        return mtchdStsTmStmp;
    }

    /**
     * Sets the value of the mtchdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtchdStsTmStmp(XMLGregorianCalendar value) {
        this.mtchdStsTmStmp = value;
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
     *     {@link SettlementDetails202 }
     *     
     */
    public SettlementDetails202 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails202 }
     *     
     */
    public void setSttlmParams(SettlementDetails202 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties97 }
     *     
     */
    public SettlementParties97 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties97 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties97 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties97 }
     *     
     */
    public SettlementParties97 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties97 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties97 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification149 }
     *     
     */
    public PartyIdentification149 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification149 }
     *     
     */
    public void setInvstr(PartyIdentification149 value) {
        this.invstr = value;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentification136 value) {
        this.qlfdFrgnIntrmy = value;
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
