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

package org.jpos.iso20022.setr_044_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Order23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BizPrcTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}BusinessProcessType2Choice" minOccurs="0"/>
 *         <element name="OrdrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClntOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndryClntOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ListId" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}SecurityIdentification19"/>
 *         <element name="Sd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Side3Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}DeliveryReceiptType2Code" minOccurs="0"/>
 *         <element name="TradTxTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TradeType4Choice" minOccurs="0"/>
 *         <element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TradeTransactionCondition9Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PreAdvc" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}MarketIdentification93" minOccurs="0"/>
 *         <element name="OrdrBookgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ISODate" minOccurs="0"/>
 *         <element name="TradOrgtnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TradeDate7Choice"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TradeDate7Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}SettlementDate16Choice"/>
 *         <element name="NAVDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="PrtlFillDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}PartialFill4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ConfQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Quantity6Choice"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}QuantityBreakdown76" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GrssTradAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}AmountAndDirection29" minOccurs="0"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Price14"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TypeOfPrice47Choice" minOccurs="0"/>
 *         <element name="CshMrgn" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}CashMarginOrder1Code" minOccurs="0"/>
 *         <element name="Comssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Commission25" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max3Number" minOccurs="0"/>
 *         <element name="GvUpNbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max3Number" minOccurs="0"/>
 *         <element name="IntrstTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}InterestType2Code" minOccurs="0"/>
 *         <element name="AcrdIntrstPctg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}PercentageRate" minOccurs="0"/>
 *         <element name="TradRgltryCondsTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TradeRegulatoryConditions1Code" minOccurs="0"/>
 *         <element name="CcyToBuyOrSell" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}CurrencyToBuyOrSell1Choice" minOccurs="0"/>
 *         <element name="OrdrOrgtrElgblty" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Eligibility1Code" minOccurs="0"/>
 *         <element name="PosFct" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}PositionEffect2Code" minOccurs="0"/>
 *         <element name="DerivCvrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="ChrgTaxBsisTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ChargeTaxBasisType2Choice" minOccurs="0"/>
 *         <element name="CptlGnTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}EUCapitalGainType3Choice" minOccurs="0"/>
 *         <element name="MtchSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}MatchingStatus27Choice" minOccurs="0"/>
 *         <element name="CallInTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}CallIn1Code" minOccurs="0"/>
 *         <element name="YldTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}YieldCalculation7" minOccurs="0"/>
 *         <element name="Rptg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Reporting6Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlPhysOrRegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}RegistrationParameters3" minOccurs="0"/>
 *         <element name="AddtlTradInstrPrcgInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Max350Text" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}AmountAndDirection29" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order23", propOrder = {
    "bizPrcTp",
    "ordrId",
    "clntOrdrId",
    "scndryClntOrdrId",
    "listId",
    "finInstrmId",
    "sd",
    "pmt",
    "tradTxTp",
    "tradTxCond",
    "preAdvc",
    "plcOfTrad",
    "ordrBookgDt",
    "tradOrgtnDt",
    "tradDt",
    "prcgDt",
    "sttlmDt",
    "navDt",
    "prtlFillDtls",
    "confQty",
    "qtyBrkdwn",
    "grssTradAmt",
    "dealPric",
    "tpOfPric",
    "cshMrgn",
    "comssn",
    "nbOfDaysAcrd",
    "gvUpNbOfDays",
    "intrstTp",
    "acrdIntrstPctg",
    "tradRgltryCondsTp",
    "ccyToBuyOrSell",
    "ordrOrgtrElgblty",
    "posFct",
    "derivCvrd",
    "chrgTaxBsisTp",
    "cptlGnTp",
    "mtchSts",
    "callInTp",
    "yldTp",
    "rptg",
    "addtlPhysOrRegnDtls",
    "addtlTradInstrPrcgInf",
    "acrdIntrstAmt"
})
public class Order23 {

    @XmlElement(name = "BizPrcTp")
    protected BusinessProcessType2Choice bizPrcTp;
    @XmlElement(name = "OrdrId")
    protected List<String> ordrId;
    @XmlElement(name = "ClntOrdrId")
    protected List<String> clntOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected List<String> scndryClntOrdrId;
    @XmlElement(name = "ListId")
    protected List<String> listId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side3Code sd;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "TradTxTp")
    protected TradeType4Choice tradTxTp;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition9Choice> tradTxCond;
    @XmlElement(name = "PreAdvc")
    protected Boolean preAdvc;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification93 plcOfTrad;
    @XmlElement(name = "OrdrBookgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ordrBookgDt;
    @XmlElement(name = "TradOrgtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradOrgtnDt;
    @XmlElement(name = "TradDt", required = true)
    protected TradeDate7Choice tradDt;
    @XmlElement(name = "PrcgDt")
    protected TradeDate7Choice prcgDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate16Choice sttlmDt;
    @XmlElement(name = "NAVDt")
    protected DateAndDateTime1Choice navDt;
    @XmlElement(name = "PrtlFillDtls")
    protected List<PartialFill4> prtlFillDtls;
    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown76> qtyBrkdwn;
    @XmlElement(name = "GrssTradAmt")
    protected AmountAndDirection29 grssTradAmt;
    @XmlElement(name = "DealPric", required = true)
    protected Price14 dealPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice47Choice tpOfPric;
    @XmlElement(name = "CshMrgn")
    @XmlSchemaType(name = "string")
    protected CashMarginOrder1Code cshMrgn;
    @XmlElement(name = "Comssn")
    protected Commission25 comssn;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "GvUpNbOfDays")
    protected BigDecimal gvUpNbOfDays;
    @XmlElement(name = "IntrstTp")
    @XmlSchemaType(name = "string")
    protected InterestType2Code intrstTp;
    @XmlElement(name = "AcrdIntrstPctg")
    protected BigDecimal acrdIntrstPctg;
    @XmlElement(name = "TradRgltryCondsTp")
    @XmlSchemaType(name = "string")
    protected TradeRegulatoryConditions1Code tradRgltryCondsTp;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "PosFct")
    @XmlSchemaType(name = "string")
    protected PositionEffect2Code posFct;
    @XmlElement(name = "DerivCvrd")
    protected Boolean derivCvrd;
    @XmlElement(name = "ChrgTaxBsisTp")
    protected ChargeTaxBasisType2Choice chrgTaxBsisTp;
    @XmlElement(name = "CptlGnTp")
    protected EUCapitalGainType3Choice cptlGnTp;
    @XmlElement(name = "MtchSts")
    protected MatchingStatus27Choice mtchSts;
    @XmlElement(name = "CallInTp")
    @XmlSchemaType(name = "string")
    protected CallIn1Code callInTp;
    @XmlElement(name = "YldTp")
    protected YieldCalculation7 yldTp;
    @XmlElement(name = "Rptg")
    protected List<Reporting6Choice> rptg;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters3 addtlPhysOrRegnDtls;
    @XmlElement(name = "AddtlTradInstrPrcgInf")
    protected String addtlTradInstrPrcgInf;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection29 acrdIntrstAmt;

    /**
     * Gets the value of the bizPrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessType2Choice }
     *     
     */
    public BusinessProcessType2Choice getBizPrcTp() {
        return bizPrcTp;
    }

    /**
     * Sets the value of the bizPrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessType2Choice }
     *     
     */
    public void setBizPrcTp(BusinessProcessType2Choice value) {
        this.bizPrcTp = value;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ordrId property.
     */
    public List<String> getOrdrId() {
        if (ordrId == null) {
            ordrId = new ArrayList<>();
        }
        return this.ordrId;
    }

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntOrdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clntOrdrId property.
     */
    public List<String> getClntOrdrId() {
        if (clntOrdrId == null) {
            clntOrdrId = new ArrayList<>();
        }
        return this.clntOrdrId;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryClntOrdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryClntOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the scndryClntOrdrId property.
     */
    public List<String> getScndryClntOrdrId() {
        if (scndryClntOrdrId == null) {
            scndryClntOrdrId = new ArrayList<>();
        }
        return this.scndryClntOrdrId;
    }

    /**
     * Gets the value of the listId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the listId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the listId property.
     */
    public List<String> getListId() {
        if (listId == null) {
            listId = new ArrayList<>();
        }
        return this.listId;
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
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side3Code }
     *     
     */
    public Side3Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side3Code }
     *     
     */
    public void setSd(Side3Code value) {
        this.sd = value;
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
     * Gets the value of the tradTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType4Choice }
     *     
     */
    public TradeType4Choice getTradTxTp() {
        return tradTxTp;
    }

    /**
     * Sets the value of the tradTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType4Choice }
     *     
     */
    public void setTradTxTp(TradeType4Choice value) {
        this.tradTxTp = value;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition9Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition9Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the preAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAdvc() {
        return preAdvc;
    }

    /**
     * Sets the value of the preAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAdvc(Boolean value) {
        this.preAdvc = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification93 }
     *     
     */
    public MarketIdentification93 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification93 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification93 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the ordrBookgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrBookgDt() {
        return ordrBookgDt;
    }

    /**
     * Sets the value of the ordrBookgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrBookgDt(XMLGregorianCalendar value) {
        this.ordrBookgDt = value;
    }

    /**
     * Gets the value of the tradOrgtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradOrgtnDt() {
        return tradOrgtnDt;
    }

    /**
     * Sets the value of the tradOrgtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradOrgtnDt(XMLGregorianCalendar value) {
        this.tradOrgtnDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public void setTradDt(TradeDate7Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public void setPrcgDt(TradeDate7Choice value) {
        this.prcgDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate16Choice }
     *     
     */
    public SettlementDate16Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate16Choice }
     *     
     */
    public void setSttlmDt(SettlementDate16Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the navDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getNAVDt() {
        return navDt;
    }

    /**
     * Sets the value of the navDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setNAVDt(DateAndDateTime1Choice value) {
        this.navDt = value;
    }

    /**
     * Gets the value of the prtlFillDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtlFillDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtlFillDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartialFill4 }
     * 
     * 
     * @return
     *     The value of the prtlFillDtls property.
     */
    public List<PartialFill4> getPrtlFillDtls() {
        if (prtlFillDtls == null) {
            prtlFillDtls = new ArrayList<>();
        }
        return this.prtlFillDtls;
    }

    /**
     * Gets the value of the confQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getConfQty() {
        return confQty;
    }

    /**
     * Sets the value of the confQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public void setConfQty(Quantity6Choice value) {
        this.confQty = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown76 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown76> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the grssTradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getGrssTradAmt() {
        return grssTradAmt;
    }

    /**
     * Sets the value of the grssTradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setGrssTradAmt(AmountAndDirection29 value) {
        this.grssTradAmt = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setDealPric(Price14 value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice47Choice }
     *     
     */
    public TypeOfPrice47Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice47Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice47Choice value) {
        this.tpOfPric = value;
    }

    /**
     * Gets the value of the cshMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public CashMarginOrder1Code getCshMrgn() {
        return cshMrgn;
    }

    /**
     * Sets the value of the cshMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public void setCshMrgn(CashMarginOrder1Code value) {
        this.cshMrgn = value;
    }

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link Commission25 }
     *     
     */
    public Commission25 getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission25 }
     *     
     */
    public void setComssn(Commission25 value) {
        this.comssn = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the gvUpNbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGvUpNbOfDays() {
        return gvUpNbOfDays;
    }

    /**
     * Sets the value of the gvUpNbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGvUpNbOfDays(BigDecimal value) {
        this.gvUpNbOfDays = value;
    }

    /**
     * Gets the value of the intrstTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestType2Code }
     *     
     */
    public InterestType2Code getIntrstTp() {
        return intrstTp;
    }

    /**
     * Sets the value of the intrstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType2Code }
     *     
     */
    public void setIntrstTp(InterestType2Code value) {
        this.intrstTp = value;
    }

    /**
     * Gets the value of the acrdIntrstPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntrstPctg() {
        return acrdIntrstPctg;
    }

    /**
     * Sets the value of the acrdIntrstPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntrstPctg(BigDecimal value) {
        this.acrdIntrstPctg = value;
    }

    /**
     * Gets the value of the tradRgltryCondsTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRegulatoryConditions1Code }
     *     
     */
    public TradeRegulatoryConditions1Code getTradRgltryCondsTp() {
        return tradRgltryCondsTp;
    }

    /**
     * Sets the value of the tradRgltryCondsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRegulatoryConditions1Code }
     *     
     */
    public void setTradRgltryCondsTp(TradeRegulatoryConditions1Code value) {
        this.tradRgltryCondsTp = value;
    }

    /**
     * Gets the value of the ccyToBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public CurrencyToBuyOrSell1Choice getCcyToBuyOrSell() {
        return ccyToBuyOrSell;
    }

    /**
     * Sets the value of the ccyToBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public void setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public void setOrdrOrgtrElgblty(Eligibility1Code value) {
        this.ordrOrgtrElgblty = value;
    }

    /**
     * Gets the value of the posFct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect2Code }
     *     
     */
    public PositionEffect2Code getPosFct() {
        return posFct;
    }

    /**
     * Sets the value of the posFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect2Code }
     *     
     */
    public void setPosFct(PositionEffect2Code value) {
        this.posFct = value;
    }

    /**
     * Gets the value of the derivCvrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivCvrd() {
        return derivCvrd;
    }

    /**
     * Sets the value of the derivCvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerivCvrd(Boolean value) {
        this.derivCvrd = value;
    }

    /**
     * Gets the value of the chrgTaxBsisTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTaxBasisType2Choice }
     *     
     */
    public ChargeTaxBasisType2Choice getChrgTaxBsisTp() {
        return chrgTaxBsisTp;
    }

    /**
     * Sets the value of the chrgTaxBsisTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTaxBasisType2Choice }
     *     
     */
    public void setChrgTaxBsisTp(ChargeTaxBasisType2Choice value) {
        this.chrgTaxBsisTp = value;
    }

    /**
     * Gets the value of the cptlGnTp property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGainType3Choice }
     *     
     */
    public EUCapitalGainType3Choice getCptlGnTp() {
        return cptlGnTp;
    }

    /**
     * Sets the value of the cptlGnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGainType3Choice }
     *     
     */
    public void setCptlGnTp(EUCapitalGainType3Choice value) {
        this.cptlGnTp = value;
    }

    /**
     * Gets the value of the mtchSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public MatchingStatus27Choice getMtchSts() {
        return mtchSts;
    }

    /**
     * Sets the value of the mtchSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public void setMtchSts(MatchingStatus27Choice value) {
        this.mtchSts = value;
    }

    /**
     * Gets the value of the callInTp property.
     * 
     * @return
     *     possible object is
     *     {@link CallIn1Code }
     *     
     */
    public CallIn1Code getCallInTp() {
        return callInTp;
    }

    /**
     * Sets the value of the callInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallIn1Code }
     *     
     */
    public void setCallInTp(CallIn1Code value) {
        this.callInTp = value;
    }

    /**
     * Gets the value of the yldTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation7 }
     *     
     */
    public YieldCalculation7 getYldTp() {
        return yldTp;
    }

    /**
     * Sets the value of the yldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation7 }
     *     
     */
    public void setYldTp(YieldCalculation7 value) {
        this.yldTp = value;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reporting6Choice }
     * 
     * 
     * @return
     *     The value of the rptg property.
     */
    public List<Reporting6Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters3 }
     *     
     */
    public RegistrationParameters3 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters3 }
     *     
     */
    public void setAddtlPhysOrRegnDtls(RegistrationParameters3 value) {
        this.addtlPhysOrRegnDtls = value;
    }

    /**
     * Gets the value of the addtlTradInstrPrcgInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTradInstrPrcgInf() {
        return addtlTradInstrPrcgInf;
    }

    /**
     * Sets the value of the addtlTradInstrPrcgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTradInstrPrcgInf(String value) {
        this.addtlTradInstrPrcgInf = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection29 value) {
        this.acrdIntrstAmt = value;
    }

}
